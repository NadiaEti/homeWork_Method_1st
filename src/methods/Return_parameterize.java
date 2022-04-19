package methods;

public class Return_parameterize {
// AccessModifier DataType/class/object methodName( parameter ) { return; }
// Dynamic parameterized method because this method will accept any kind of value.

    public String getStuInfo(String name) {    //(3:41 min)
        System.out.println("Student name is " + name);
        return name;
    }

    public double doSummation(double num1, double num2) {
// I don't want to system,out,println() here, I want to put in the bottom
        return num1 + num2;
    }

    public double doSummation(double num1, double num2, double num3) {
        System.out.println("Total Summation value of three " + (num1 + num2 + num3));
        return num1 + num2 + num3;
    }

    public int getMulti(int num1, int num2, int num3) {
        System.out.println("Total Multiplication is " + (num1 * num2 * num3));
        return (num1 * num2 * num3);
    }

    public int getMulti(int num1, int num2) {
        return (num1 * num2);    // don't want to sysout here
    }

    //    public boolean isPizzaAvailable(String pizzaName, char pizzaSize, int price){
//
//        return ;
//    }

    public boolean isPizzaAvailable(String PizzaName, char Size, int Price) {
        char PizzaSize = Size;         //if large size pizza is available then say yes, elsa say no
        double pizzaPrice = Price;
        if (PizzaSize == 'L') {
            System.out.println(" Yes L size pizza is available");
        } else {
            System.out.println("No L sise pizza is no available");
        }
        return PizzaSize == 'L';
    }

    public boolean isPizzaAvailable(String PizzaName, char Size) {
        char PizzaSize = Size;         //if large size pizza is available then say yes, elsa say no

        if (PizzaSize == 'M') {
            System.out.println(" Yes M size pizza is available");
        } else {
            System.out.println( PizzaSize +" size pizza is no available");
        }
        return PizzaSize == 'M';
    }


    public static void main(String[] args) {
        Return_parameterize abc = new Return_parameterize();
        abc.getStuInfo("Nibeen");
        abc.getStuInfo("Emti");
        abc.getStuInfo("Nadia");
        abc.getStuInfo("Eti");

        Return_parameterize xyz = new Return_parameterize();
        System.out.println("Total summation value is " + xyz.doSummation(20, 30));

        Return_parameterize xyab = new Return_parameterize();
        xyab.doSummation(10, 20, 30);

        Return_parameterize xyzabc = new Return_parameterize();
        xyzabc.getMulti(5, 5, 5);

        int num3 = xyzabc.getMulti(10, 30);
        System.out.println("Value of " + num3);

        xyzabc.isPizzaAvailable("Margarita", 'M', 20);

        xyzabc.isPizzaAvailable("Margarita", 'M');
    }
}
