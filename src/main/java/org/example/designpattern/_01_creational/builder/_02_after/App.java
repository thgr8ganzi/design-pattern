package org.example.designpattern._01_creational.builder._02_after;

import org.example.designpattern._01_creational.builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder().newInstance());
        TourPlan shortTrip = tourDirector.constructShortTrip();
        System.out.println(shortTrip);
        TourPlan longTrip = tourDirector.construct();
        System.out.println(longTrip);
    }
}
