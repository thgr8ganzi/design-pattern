package org.example.designpattern._01_creational.builder._01_before;

import lombok.Data;

@Data
public class DetailPlan {
    private int day;
    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }
}
