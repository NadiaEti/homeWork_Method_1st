package homeWork_Method_1st;

public class ReturnType_Method_WithoutPara {

    public int doSummation() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 50;
        int total = num1 + num2 + num3;
        System.out.println("Total number is " + total);
        return total;
    }
public int Subtraction(){
        int num3 = 100;
        int num1 = 60;
        int total = num3-num1;
    System.out.println("My Total Subtraction is "+ total);
        return total;
}
    public double DoMultiplication(){
        int numx = 50;
        int numy = 50;
        int multi = (numx * numy);
        System.out.println("Total Multiplication value is "+ multi);
        return multi;
    }
    public String getStuInfo(){
        String fname = "Nadia";
        String lname = "Eti";
        String address = "NY,USA";
        String PhoneNum = "9299901067";
        String Information= (fname +" "+ lname +" "+ address + " " + PhoneNum);
        System.out.println("Students Information " + Information);
        return Information ;
    }
    public boolean isPastryAvailable(){
        boolean isAvailable = true;
        System.out.println("The Pastry is Available " + isAvailable);
       return isAvailable ;
    }


    public static void main(String[] args) {
        ReturnType_Method_WithoutPara A = new ReturnType_Method_WithoutPara();
        A.doSummation();

        ReturnType_Method_WithoutPara B = new ReturnType_Method_WithoutPara();
        B.Subtraction();

        ReturnType_Method_WithoutPara C = new ReturnType_Method_WithoutPara();
        C.DoMultiplication();

        A.getStuInfo();
        A.isPastryAvailable();


    }
}
