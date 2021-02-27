package com.example.reactive.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private String id;
    private String name;
    private String occupation;
    private int age;
    private String address;
}
