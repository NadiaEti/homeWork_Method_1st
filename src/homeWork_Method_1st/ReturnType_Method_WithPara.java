package homeWork_Method_1st;

public class ReturnType_Method_WithPara {

    public String getStudInfo(String fname, String mname, String lname) {
        System.out.println("Student Information " + fname + " " + mname + " " + lname);
        return (fname + mname + lname);
    }

    public double doSummation(double num1, double num2, double num3) {
        System.out.println(" Total number of sum " + (num1 + num2 + num3));
        return num1 + num2 + num3;
    }

    public int getMultiplication(int num, int num2, int num3) {
        return num * num2 * num3;
    }

    public int getDivision ( int num3, int num2 ){
        return num3/num2;
    }

    public double doSubtraction (double salary2, double salary1){
        System.out.println("Average Salary " + (salary2 - salary1));
        return salary2 - salary1;
    }

    public static void main(String[] args) {
        ReturnType_Method_WithPara X = new ReturnType_Method_WithPara();
        X.getStudInfo("Nibeen", "Bin Motiur", "Emti");

        ReturnType_Method_WithPara Y = new ReturnType_Method_WithPara();
        Y.doSummation(10, 20, 100);

        ReturnType_Method_WithPara Z = new ReturnType_Method_WithPara();
        System.out.println("Total value " + Z.getMultiplication(100, 200, 300));

        ReturnType_Method_WithPara Emti = new ReturnType_Method_WithPara();
        System.out.println("Total Division value " + Emti.getDivision(1000,50));

        ReturnType_Method_WithPara Eti = new ReturnType_Method_WithPara();
        Eti.doSubtraction(50000.50, 10000);

        int num5 = 500;
        int total = num5 + num5;
        System.out.println("Total value " + total);


    }


}

