package constructor;

public class Constructor_Basic {
    //AccessModifier classname/constructorName () {}

    int age= 32;
    String name = "Eti";
    String address = "NY,USA";

    //Step 1:   //default constructor: without any parameter
    public Constructor_Basic() {
        System.out.println("Emti");
    }

    //Step 2:   Single parameterized constructor
    public Constructor_Basic( String name ) {
    this.name=  name;
        System.out.println(name);
    }


//    public Constructor_Basic( String name, int age ) {
//    this.name = name;
//    this.age = age;
//        System.out.println("Student name is " + this.name + " "+"Student age "+ this.age);
//    }

    //Step 3:   Multi parameterized constructor
    public Constructor_Basic( String name, int age , String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Student name is " + this.name + " "+"Student age "+ this.age+" "+ "address " + this.address);
    }

    public static void main(String[] args) {

        Constructor_Basic xyz = new Constructor_Basic();
        System.out.println(xyz.age);    // for global variable

        Constructor_Basic abc = new Constructor_Basic( "Eti");      //when you pass any value that is argument.
        Constructor_Basic Emti = new Constructor_Basic( "Nibeen");                                                              // Argument passing inside the constructor

        //Constructor_Basic Eti = new Constructor_Basic("Motiur",30);                                                              // Argument passing inside the constructor
        Constructor_Basic jemy = new Constructor_Basic("Rahman", 30,  "NY,USA");

    }

}


