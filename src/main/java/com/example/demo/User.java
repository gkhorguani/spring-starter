package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;

/**
 * User
 */

@Entity
@Data
public class User {

    private String name;
    private String address;
}