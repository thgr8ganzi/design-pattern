package org.example.designpattern._01_creational.builder._02_after;

import org.example.designpattern._01_creational.builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder) {
        this.builder = builder;
    }
    public TourPlan construct() {
        return builder.title("Trip to Jeju Island")
                .nightAndDays(3, 4)
                .startDate(LocalDate.of(2021, 5, 1))
                .whereToStay("Hotel")
                .addPlan(0, "check-in")
                .addPlan(1, "Jeju Island Tour")
                .addPlan(2, "check-out")
                .getPlan();
    }
    public TourPlan constructShortTrip() {
        return builder.title("오레곤 롱비치 여행")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }
}
