package singleTon;

public class SingleTon_01 {

    //we can call default private constructor from another class
    //Also we can print this

//step : 1st
    private SingleTon_01 (){
        System.out.println("nadia");
    }

//step : 2nd
    //For this default private constructor first we have to create an object
    //Now we have to create an instance variable on another variable
    private static  SingleTon_01 abc = new SingleTon_01();


//step : 3rd
    // now I create a return type method without parameter
    public static SingleTon_01 xyz ( ){

        return abc;
    }

    //step : 4th
    // Here I will create some global class variable
    String pizzaName;
    double cheesePizzaPrice;

    //Step : 5th
    // Then we have to create a public constructor here for default private constructor
    //We can use the same name but we have to change the pattern.
    // we did default to single parameterized (2:51 min)

    public SingleTon_01(String pizzaName) {
        this.pizzaName = pizzaName;
    }       // Now I have to create a syntax on another class and we need to sysout / assign there


    //Step: 6th

    public SingleTon_01(String pizzaName,double cheesePizzaPrice) {
        this.pizzaName = pizzaName;
        this.cheesePizzaPrice = cheesePizzaPrice;
    }

}

