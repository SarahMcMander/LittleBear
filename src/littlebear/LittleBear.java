package littlebear;

import java.util.Scanner;
import javax.swing.JPanel;

public class LittleBear {

    public static void main(String[] args) {
        
        String salutation = "Hello";
        String farewell = "Goodbye";
        int x;
        int y;
       speak("give me two numbers"); 
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
//
        speak("results:");
//        speak(salutation);
//        speak(farewell);
        add(x, y);
//        subtract(9, 3);
//        multiply(2, 3);
//        divide(9, 0);
        squareroot(x);
        
        
    }

    // I don't know
    public static void speak(String asd) {
        System.out.println(asd);
    }

    public static void add(int a, int b) {
        System.out.println("The sum of "+ a + " and " + b + " is " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println("The difference of "+ a + " and " + b + " is " + (a - b));
    }

    @SuppressWarnings("empty-statement")
    public static void multiply(int a, int b) {
            System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (java.lang.ArithmeticException e) {
//            e.printStackTrace();
            speak("Sorry.  I can't divide by zero!");
        };
    }
    
    // 
    public static void squareroot(int a){
        
        if(String.valueOf(Math.sqrt(a)).equals("NaN") )
            speak("The square root of " + a + " is " + (Math.sqrt(-a))+"i");
        else
            System.out.println("The square root of " + a + " is " + (Math.sqrt(a)));

    }
    
}
