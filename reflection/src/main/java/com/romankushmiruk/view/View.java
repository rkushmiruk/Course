package com.romankushmiruk.view;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class View {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printArray(Method[] methods) {
        arrayScan(methods);
    }

    public static void printArray(Constructor[] constructors) {
        arrayScan(constructors);
    }
    public static void printArray(Annotation[] annotations) {
        arrayScan(annotations);
    }
    public static void printArray(Field[] fields) {
        arrayScan(fields);
    }
    public static void printArray(Class[] classes) {
        arrayScan(classes);
    }

    public static void printTwoDimensionalArray(Annotation[][] annotations) {
        for (Annotation[] annotation : annotations) {
            arrayScan(annotation);
        }
    }

    private static void arrayScan(Object[] objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
