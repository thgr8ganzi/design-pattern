package org.example.designpattern._01_creational.builder._02_after;

import org.example.designpattern._01_creational.builder._01_before.DetailPlan;
import org.example.designpattern._01_creational.builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {
    private TourPlan tourPlan;
    public TourPlanBuilder newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }
    @Override
    public TourPlanBuilder nightAndDays(int night, int days) {
        this.tourPlan.setNights(night);
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.tourPlan.getPlans() == null) {
            this.tourPlan.setPlans(new ArrayList<>());
        }
        this.tourPlan.getPlans().add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return this.tourPlan;
    }
}
