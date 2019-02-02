package com.GameTrainingChallenge.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    @Autowired
    DataSource dataSource;

    @Override
    public void configure(HttpSecurity security) throws Exception{
        //setting security rules using HttpSecurity object

        //in local database
//        security.authorizeRequests()
//                .antMatchers("/h2-console/**").hasAnyRole("ADMIN")//.permitAll()
//                .antMatchers("/players").hasAnyRole("USER","ADMIN")
//                .antMatchers("/player/id**").hasAnyRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .defaultSuccessUrl("/players");

        //in hibernate database
        security.authorizeRequests()
                .antMatchers("/h2-console/**").hasAnyAuthority("ADMIN")
                //to selected address only ADMIN can access
                .antMatchers("/players").hasAnyAuthority("USER,ADMIN")
                //to "players" USER and ADMIN
                .antMatchers("/player/id**").hasAnyAuthority("ADMIN")
                .anyRequest().authenticated()
                //enable requirement to authenticate each query
                .and()
                .formLogin()
                //turning on redirection to login page
                .defaultSuccessUrl("/players");
        //adds a redirect to selected page after correct login
    }

    @Autowired
    public void securityUsers(AuthenticationManagerBuilder auth) throws Exception{
        //in local database
//        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser("user")
//                .password("user")
//                .roles("USER")
//                .and()
//                .withUser("admin")
//                .password("pass")
//                .roles("ADMIN");

        //in hibernate database
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT user_name,password,enable " +
                        "FROM login_users " +
                        "WHERE user_name = ?")
                .authoritiesByUsernameQuery("SELECT user_name,permissions " +
                        "FROM permissions " +
                        "WHERE user_name = ?");
    }
}
