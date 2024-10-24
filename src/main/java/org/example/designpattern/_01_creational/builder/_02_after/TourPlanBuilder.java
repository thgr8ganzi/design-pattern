package org.example.designpattern._01_creational.builder._02_after;

import org.example.designpattern._01_creational.builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder newInstance();

    TourPlanBuilder nightAndDays(int night, int days);
    TourPlanBuilder title(String title);
    TourPlanBuilder startDate(LocalDate startDate);
    TourPlanBuilder whereToStay(String whereToStay);
    TourPlanBuilder addPlan(int day, String plan);
    TourPlan getPlan();
}
