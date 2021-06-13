package org.EaseMyTrip.StrategicDesignPattern;

public class Test {
    public static void main(String[] args) {


        Context context = new Context(new Addition());
       int num3= context.executestrategy(3,4);
       System.out.println(num3);

       int num4= context.runstrategy("Addition").doOperations(56, 34);
       System.out.println(num4);
        System.out.println(num4+num4);

    }
}
