package singleTon;

public class SingleTon_Pizza {
// pizza class is public class, create an object we need to create a constructor

    // without constructor we can not create object. but this is not public
    // But we have to keep it private we can not change it here for the rules
    //1st step:,
    private SingleTon_Pizza() {   //How we use it from another class ?
    }

    private static SingleTon_Pizza chicken = new SingleTon_Pizza();


    //2nd step:
    String pizzaName;
    double cheesePizzaPrice;

    //3rd step:
    public SingleTon_Pizza(String pizzaName) {  //We can use the same name but we have to change the pattern.
        // we did default to single parameterized (2:51 min)
        this.pizzaName = pizzaName;  // on the pizza class still has error that's why we need another public constructor.
    }

    //4th step:
    public SingleTon_Pizza(String pizzaName, double cheesePizzaPrice) {
        this.pizzaName = pizzaName;
        this.cheesePizzaPrice = cheesePizzaPrice;
    }
}