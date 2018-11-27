package com;

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
