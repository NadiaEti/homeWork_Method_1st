package methods;

public class Return_without {
// AccessModifier DataType/class/object methodName() { return; }
    public void getDisplay(){    // non-return type
    System.out.println("This is a display method");
    }


    // AccessModifier DataType/class/object methodName() { return; }
    public int DoSummation() {
        System.out.println("This is DoSummation method");
        int num1 = 30;      // It's called declare value
        int num2 = 50;
        int Total = num1 + num2;
        System.out.println("Total value is " + Total );
        return Total;
    }
    public int DoSummation1() {
        System.out.println("This is DoSummation method again");
        int num3 = 100;
        int num4 = 50;
        double Total = num3 + num4;
        System.out.println("Total value is " + Total );
        return (int) Total;
    }
    public double DoMultiplication(){
        double num1 = 35;
        int num2 = 25;
        double multi = num1 * num2;
        System.out.println("Multiplication value is " + multi);
        return multi;
    }
    public String getStuInfo(){
        String fname = "Nadia";
        String lname = "Eti";
        String fullname = fname +" " + lname;    //This + sign is for concatenation between fname and laname
        System.out.println("Fullname is " + fullname);
        return fullname;
    }

    public boolean isPizzaAvailable(){
        boolean isAvailable = true;
        System.out.println("This pizza is available " + isAvailable);
        return isAvailable;
    }

    public static void main(String[] args) {
        Return_without xyz = new Return_without();
        xyz.getDisplay();

        Return_without abc = new Return_without();
        abc.DoSummation();

        Return_without XXX = new Return_without();
        XXX.DoSummation1();

        Return_without XXXX = new Return_without();
        XXXX.DoMultiplication();

        Return_without XXYY = new Return_without();
        XXYY.getStuInfo();

        Return_without AAAA = new Return_without();
        AAAA.isPizzaAvailable();
    }
}


