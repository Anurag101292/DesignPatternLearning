package org.EaseMyTrip.StrategicDesignPattern;

public class Context {

    IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy=strategy;
    }

    public int executestrategy(int num1 , int num2){

        return strategy.doOperations(num1, num2);
    }

    public IStrategy runstrategy(String runtype){

        if (runtype.equalsIgnoreCase("Addition")){ return new Addition();}
        if (runtype.equalsIgnoreCase("Subtraction")){return new Subtraction();}
        if (runtype.equalsIgnoreCase("Multiply")){return new Multiply();}
        return  null;
    }
}
