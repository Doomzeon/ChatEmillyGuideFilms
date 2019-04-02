package com.example.doomzeon.chatemily;

/**
 * Created by doomzeon on 24.03.2019.
 */

public class Masseges {
    private String massege;
    private boolean hoowSent;


    public Masseges(String massege,boolean hoowSent) {
        this.massege = massege;
        this.hoowSent = hoowSent;
    }

    public String getMassege() {
        return massege;
    }

    public boolean isHoowSent() {
        return hoowSent;
    }
}
