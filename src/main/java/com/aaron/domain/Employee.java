package com.aaron.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Created by yangwj5 on 2017/3/26 at 22:28.
 */
@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firstName,lastName,description;

    private Employee(){}

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
