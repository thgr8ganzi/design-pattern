package org.example.designpattern._01_creational.singleton._01_before;

public enum SyncSettings5Enums {
    INSTNACE;

    SyncSettings5Enums() {
        System.out.println("Enum constructor");
    }
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
