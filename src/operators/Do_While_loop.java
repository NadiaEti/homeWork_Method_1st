package operators;

public class Do_While_loop {
  //while loop check the condition before but do while loop check the condition after
//syntax: do {  code and iterator/ increment/decrement  }  while ( condition );

    public static void main(String[] args) {
//first one time it will execute then it will check the condition
        //if condition is true then execute the block of loop

int age = 20;
do {        //execute this block of loop/code first
    System.out.println("Hi everyone");
    age--;      //it is control the loop
} while ( age >15 );       // After execute one time then it is check with this condition
        // if this condition is true then it will execute again
}
}