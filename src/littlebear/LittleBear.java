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
        speak( add(x, y) );
//        subtract(9, 3);
//        multiply(2, 3);
//        divide(9, 0);
        squareroot(x);
        
        // 7-23-15 first arrays
        //arrays
        //david made me do this
        
        int numbers[] = new int [10];
        
        for (int i=0; i <= 9; i++)
            numbers[i]=scanner.nextInt();
        
        numbers[0]=1;
        
        for (int i=0; i <= 9; i++)
            speak(numbers[i]);
        boolean isAlive = false;
        if (!isAlive)
            isAlive=false;
        speak(isAlive);
       
        
    }

    // I don't know
    public static void speak(String asd) {
        System.out.println(asd);
    }
    
    public static void speak(int asd) {
        System.out.println(asd);
    }
    
    public static void speak(boolean asd) {
        System.out.println(asd);
    }
    
    public static int add(int a, int b) {
        System.out.println("The sum of "+ a + " and " + b + " is " + (a + b));
        return a + b;
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
