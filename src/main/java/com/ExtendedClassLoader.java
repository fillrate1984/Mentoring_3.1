package com;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ExtendedClassLoader extends ClassLoader {
    
    private ArrayList<Animals> animals = new ArrayList<>();

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class clazz = Class.forName(name);
        try {
            animals.add((Animals) clazz.getConstructor().newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clazz;
    }

    public void demonstrateAnimals() {
        for (Animals animal : animals) {
            animal.play();
            animal.voice();
        }
    }
}
