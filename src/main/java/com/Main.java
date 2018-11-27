/*
package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Main {
    private final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //BigArrayList.feelHeap();
        //ManyClass.feelMemoryWithObject();
        //BigMetaspace.feelMetaspace();
        //Stackkiller.killStack();
        //Cyclestackkiller.fullSteck();
        try {
            new Main().go();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
    private void go() throws IllegalAccessException, InstantiationException{
        CustomClassLoader classLoader = new CustomClassLoader();

        Class<?> dogClass = classLoader.findClass("com.epam.homework4.animal.Dog");
        Class<?> catClass = classLoader.findClass("com.epam.homework4.animal.Cat");

        List<Animals> animals = new ArrayList<>();
        animals.add((Animals) dogClass.newInstance());
        animals.add((Animals) catClass.newInstance());

        for (Animals animal:animals){
            animal.play();
            animal.voice();
            logger.info(animal.getClass().getClassLoader().getClass().getName());
        }
    }

}
public class CustomClassLoader extends ClassLoader {
    private Map<String, Class<?>> mapOfClasses;

    public CustomClassLoader() {
        mapOfClasses = new HashMap<>();
        mapOfClasses.put("com.epam.homework4.animal.Dog", Dog.class);
        mapOfClasses.put("com.epam.homework4.animal.Cat", Cat.class);
    }

    @Override
    public Class<?> findClass(String name) {
        return mapOfClasses.get(name);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }
}


*/
