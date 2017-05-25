package com.romankushmiruk.model.entity.institute;

public class InstituteFactory {
    public static Institute createMathInstitute() {
        return new MathInstitute();
    }
    public static Institute createRandomInstitute() {
        return new RandomInstitute();
    }
    public static Institute createBiologyInstitute() {
        return new BiologyInstitute();
    }
}