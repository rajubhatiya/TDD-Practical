package com.tdd.rbhatiya.practical.utility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public final class Company {
    private int compId;
    private String compName;
    private Employee employee;
}
