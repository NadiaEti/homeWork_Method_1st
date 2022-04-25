package operators;

public class While_Loop {
    //
    public static void main(String[] args) {
//while loop always do pre-condition check. this is only different with for loop and while loop.
        int num = 15;  // First it check the outside initialized loop value with inside value.

        while (num >10) {
            System.out.println("While is the true value");
        num--;
        }
    }
}