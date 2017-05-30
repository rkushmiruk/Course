package com.romankushmiruk.model;

import com.romankushmiruk.util.GlobalConstants;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Reflection {
    private Class clazz;
    private Object object;

    public Reflection(Object object) {
        clazz = object.getClass();
        this.object = object;
    }

    public String getSimpleName() {
        return clazz.getPackage() + " " + clazz.getSimpleName();
    }

    public Constructor[] getConstructors() {
        Constructor[] constructors = clazz.getConstructors();
        return constructors;
    }

    public List<String> getModifier() {
        int mods = clazz.getModifiers();
        List<String> modifiers = new ArrayList<>();
        if (Modifier.isPublic(mods)) {
            modifiers.add(GlobalConstants.MODIFIER_PUBLIC);
        }
        if (Modifier.isProtected(mods)) {
            modifiers.add(GlobalConstants.MODIFIER_PROTECTED);
        }
        if (Modifier.isPrivate(mods)) {
            modifiers.add(GlobalConstants.MODIFIER_PRIVATE);
        }
        if (modifiers.isEmpty()) {
            modifiers.add(GlobalConstants.MODIFIER_DEFAULT_PACKAGE);
        }
        if (Modifier.isFinal(mods)) {
            modifiers.add(GlobalConstants.MODIFIER_FINAL);
        }
        if (Modifier.isStatic(mods)) {
            modifiers.add(GlobalConstants.MODIFIER_STATIC);
        }
        if (Modifier.isAbstract(mods)) {
            modifiers.add(GlobalConstants.MODIFIER_ABSTRACT);
        }

        return modifiers;
    }

    public Method[] getMethods() {
        return clazz.getDeclaredMethods();
    }

    public Annotation[][] getAnnotations() {
        Method[] methods = getMethods();
        Annotation[] annotations;
        Annotation[][] list = new Annotation[methods.length][];

        for (int i = 0; i < methods.length; i++) {
            annotations = methods[i].getAnnotations();
            list[i] = annotations;
        }
        return list;
    }

    public Class getSuperClass() {
        return clazz.getSuperclass();
    }

    public Field[] getFields() {
        return clazz.getDeclaredFields();
    }

    public Class[] getInterfaces() {
        return clazz.getInterfaces();
    }
}
