package org.example.designpattern._01_creational.builder._01_before;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("Trip to Jeju Island");
        tourPlan.setDays(3);
        tourPlan.setDays(4);
        tourPlan.setStartDate(LocalDate.of(2021, 5, 1));
        tourPlan.setWhereToStay("Hotel");
        tourPlan.addPlan(0, "check-in");
        tourPlan.addPlan(1, "Jeju Island Tour");
        tourPlan.addPlan(2, "check-out");
    }
}
