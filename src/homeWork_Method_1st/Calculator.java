package homeWork_Method_1st;

import java.util.Scanner;
public class Calculator {

    public int doSummation(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter my house rent here : ");
        int num = scan.nextInt();
        System.out.println("Enter electricity bill : ");
        int num2 = scan.nextInt();
        System.out.println("Enter credit card bill : ");
        int num3 = scan.nextInt();
        System.out.println("Enter mobile bill here that will be added : ");
        int num4 = scan.nextInt();
        int summation = num + num2 + num3 + num4;
        System.out.println("The total summation is :" + summation);
        return summation;
    }

    public int doSubtraction(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter my total saving money : ");
        int num = scan.nextInt();
        System.out.println("Enter my apple watch cost : ");
        int num1 = scan.nextInt();
        System.out.println("Enter my shopping bill that will be added :");
        int num3 = scan.nextInt();
        int Sub = num - num1 - num3;
        System.out.println("My Total cost here :" + Sub);
        return Sub ;
    }
    public int doMultiplication() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter dress num1 here : ");
        int num = scan.nextInt();
        System.out.println("Enter shoes num2 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter bag num3 : ");
        int num3 = scan.nextInt();
        int Multi = num * num1 * num3 ;
        System.out.println("Total Number is :" + Multi);
        return Multi;
    }

    public double doDivision(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter my yearly Income : ");
        double num = scan.nextInt();
        System.out.println("Enter my yearly expanses: ");
        double num1 = scan.nextInt();
        double Division = num/ num1 ;
        System.out.println("My Net Income is :" + Division);
        return Division ;
    }

    public static void main(String[] args) {
        Calculator abc = new Calculator();
        abc.doSummation();

        Calculator xyz = new Calculator();
        xyz.doSubtraction();

        Calculator Nadia = new Calculator();
        Nadia.doMultiplication();

        Calculator NadiaEti = new Calculator();
        NadiaEti.doDivision();


    }
}
