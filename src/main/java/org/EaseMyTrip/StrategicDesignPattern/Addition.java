package org.EaseMyTrip.StrategicDesignPattern;

public class Addition implements IStrategy{
    @Override
    public int doOperations(int num1, int num2) {
        return num1+num2;
    }
}
