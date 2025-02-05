package bsp.task1;

import lombok.Builder;

enum Gender {
    MALE, FEMALE
}

@Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}