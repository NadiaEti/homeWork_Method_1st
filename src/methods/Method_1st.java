package methods;

public class Method_1st {

    public void Rose(){    //1. non-static method
        System.out.println("Hi Nadia");
    }






    public static void main(String[] args) {        // void is mention non-return type
        Method_1st ABC = new Method_1st();
        ABC.Rose();     //1. non-static method called by object
    }
}
