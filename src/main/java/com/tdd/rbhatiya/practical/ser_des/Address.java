package com.tdd.rbhatiya.practical.ser_des;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Integer houseNumber;
    public String city;
    public String state;
    public String country;
}
