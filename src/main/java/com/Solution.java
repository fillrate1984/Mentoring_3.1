package com;

public class Solution {
    public static void main(String[] args) throws Exception {
            ExtendedClassLoader classLoader = new ExtendedClassLoader();
            Class.forName("com.Cat", true, classLoader);
            Class.forName("com.Dog", true, classLoader);
            classLoader.demonstrateAnimals();
    }
}
