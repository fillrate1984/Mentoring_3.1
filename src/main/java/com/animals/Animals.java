package com.animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Animals {

    @SuppressWarnings("all")
    protected Logger rootLogger = LogManager.getRootLogger();

    public abstract void play();
    public abstract void voice();
}
