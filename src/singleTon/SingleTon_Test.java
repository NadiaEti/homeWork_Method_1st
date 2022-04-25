package singleTon;

public class SingleTon_Test {
    public static void main(String[] args) {



         // call from pizza class also here I pass the argument.
// Syn
        SingleTon_Pizza chicken = new SingleTon_Pizza("DoubleCheese",19.50);

        System.out.println("This is my favourite flavour " + chicken.pizzaName);

        System.out.println("My favourite pizza is " + chicken.pizzaName + " and price is " + chicken.cheesePizzaPrice );



    }
}
