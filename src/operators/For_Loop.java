package operators;

public class For_Loop {
    public static void main(String[] args) {
        // for loop has a syntax
        // for ( start point;  condition/end point;  increment++/ decrement--(iterator) )   { block of code}
        //start point: it means from where it will start
        //condition/endpoint: means we need to put the condition sothat code will determine how many times it will execute.

//        for (int i = 2; i <= 4; i++) {
//            // I put 2 is the value that means 2 is i value,
//            // 4 is the condition so now 2<4 that means it is true
//            System.out.println("Nadia");  //until the condition will false it will execute
//        }


        //Step 2:
        //here i want to decrement operator
    for (int ab = 15; ab >= 9; ab-- ) {
        System.out.println("Nadia");
        ab--;   // i wanna decrement 2 times so it will decrease -2 because 1 from top
    }


        //Step 3:
        For_Loop ob = new For_Loop();  // Here i create a object using constructor
        ob.Mentoring();  // now it will execute 1 time but i want to execute multiple times

        //I want to put this mentoring method inside the loop
        for (int x = 5; x <10; x++ ) {
            System.out.println("This is true " + x);  // I would like to concatenation here
        }


        //Step 4:
        //Debug: debug is finding problem and resolving the problem
        //How to do debug? mark the debug first then right click in debug
        //see the debug window then click step over
        for (int A = 8; A > 5; A--) {
            System.out.println("Debug is running");
        }

    }

    //Step 5:
    // I am creating a method out side of the method and i want to call it from the main methos
    //now i call this mentoring method inside the loop now i will create object over there
    public void Mentoring(){
        System.out.println("Mentoring is runnig");
    }
}