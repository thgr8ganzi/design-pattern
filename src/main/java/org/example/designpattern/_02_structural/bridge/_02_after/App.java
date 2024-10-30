package org.example.designpattern._02_structural.bridge._02_after;

import org.example.designpattern._02_structural.bridge._01_before.Champion;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillE();
        kda아리.skillQ();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillE();
        poolParty아리.skillQ();
    }
}
