package com.animals;

import com.animals.Animals;

public class Dog extends Animals {
    @Override
    public void play() {
        rootLogger.info("Dog's playing");
    }

    @Override
    public void voice() {
        rootLogger.info("Bark!");
    }
}
