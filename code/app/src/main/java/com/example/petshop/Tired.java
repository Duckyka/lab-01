package com.example.petshop;

import java.util.Date;

public class Tired extends Mood{

    public Tired() {
        super();
    }
    public Tired(Date moodDate) {
        super(moodDate);
    }

    @Override
    public String mood() {
        return "Tired, Yawn!";
    }
}
