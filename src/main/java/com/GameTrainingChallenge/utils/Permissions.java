package com.GameTrainingChallenge.utils;

import javax.persistence.*;

@Entity
@Table(name = "Permissions")
@TableGenerator(name = "sequenceOfPermissions", initialValue = 0, allocationSize = 50)
public class Permissions {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "sequenceOfPermissions")
    private int id;

    private String userName;

    private String permissions;

    public Permissions() {
    }

    public Permissions(String userName, String permissions) {
        this.userName = userName;
        this.permissions = permissions;
    }
}
