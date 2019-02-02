package com.GameTrainingChallenge.components;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
//using scope as request to injection in every query (in session scope there is only one)
public class Time {

    private LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    //using format to show date better reading

    String currentTime = now.format(formatter);
    //formatting my time and date

    public String getCurrentTime() {
        return currentTime;
    }
}
