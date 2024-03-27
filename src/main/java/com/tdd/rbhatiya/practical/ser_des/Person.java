package com.tdd.rbhatiya.practical.ser_des;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    public int age;
    public String name;
}
