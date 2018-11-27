package com;

import com.classloader.ExtendedClassLoader;

public class Solution {
    public static void main(String[] args) throws Exception {
            ExtendedClassLoader classLoader = new ExtendedClassLoader();
            Class.forName("com.animals.Cat", true, classLoader);
            Class.forName("com.animals.Dog", true, classLoader);
            classLoader.demonstrateAnimals();
    }
}
