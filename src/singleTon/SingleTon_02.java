package singleTon;

public class SingleTon_02 {

    public static void main(String[] args) {

        //Step : 1st
        SingleTon_01  chicken = SingleTon_01.xyz();

        //Step
        SingleTon_01 beef = new SingleTon_01("DoubleCheese",19.50);

        System.out.println("This is my favourite flavour " + beef.pizzaName);

        System.out.println("My favourite pizza is " + beef.pizzaName + " and price is " + beef.cheesePizzaPrice );

    }
}
