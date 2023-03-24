
import java.util.Scanner;

public class NewClass {

    public static int menue() {
        Scanner in = new Scanner(System.in);
        System.out.println("**** Calculator **** ");
        System.out.println("-1 BINARY OPERATIONS:");
        System.out.println("-2 UNIARY OPERATIONS:");
        System.out.println("Enter A NUMBER FOR YOUR CHOICE FROM THE MENU ABOVE!");
        int x = in.nextInt();
        return x;}

    public static int binaryoperations() {
        Scanner in = new Scanner(System.in);
        System.out.println("1-addition:");
        System.out.println("2-subtraction:");
        System.out.println("3-multiplication:");
        System.out.println("4-division:");
        System.out.println("5-remainder:");
        System.out.println("enter number of your binary operation choice");
        int y = in.nextInt();
        return y;
    }

    public static void binary2() {
        int t = binaryoperations();
        switch (t) {
            case 1:
               addition();
                break;
            case 2:
                System.out.println("result=" + subtraction());
                break;
            case 3:
                System.out.println("result=" + multiplication());
                break;
            case 4:
                System.out.println("result=" + division());
                break;
            case 5:
                System.out.println("result=" + remainder());
                break;}}

    public static int uniaryoperations() {
        Scanner in = new Scanner(System.in);
        System.out.println("1-square-root");
        System.out.println("2-number squared");
        System.out.println("3-number increment");
        System.out.println("4-number decerement");
        System.out.println("enter number of your uniary operation choice");
        int g = in.nextInt();
        return g;
    }

    public static void uniary2() {
        int z = uniaryoperations();
        switch (z) {
            case 1:
                System.out.println("result=" + squareroot());
                break;
            case 2:
                System.out.println("result=" + numbersquared());
                break;
            case 3:
                System.out.println("result=" + increment());
                break;
            case 4:
                System.out.println("result=" + decrement());
break;}}

    public static void matrices(){
         Scanner in = new Scanner(System.in);
         System.out.println("enter size of the 2D array you want to add");
        int rows= in.nextInt();
        int columns= in.nextInt();
       int array[][]= new int[rows][columns];
       int array2[][]= new int[rows][columns];
       int array3[][]= new int [rows][columns];
          for(int i=0; i<rows; i++){
                for(int f=0; f<columns; f++){ 
                    System.out.println(" enter values of your first 2D array");
                    array[i][f] = in.nextInt();
                    System.out.println(" enter values of your second 2D array");
                    array2[i][f]=in.nextInt();
                    array3[i][f]=array[i][f]+array2[i][f];}}
            for(int p=0; p<rows; p++){
                for(int o=0; o<columns; o++){
                    System.out.println("matrices of first array =  " + array[p][o] );
                    System.out.println("matrices of second array =  " + array2[p][o] );
                   System.out.println("matrices of their sum =  " + array3[p][o] );}}
   
   }
             
           
            
    public static void addition() {
        Scanner in = new Scanner(System.in);
        System.out.println("addition operation ");
        System.out.println("for adding numbers press 1 , for adding matrices press 2 ");
        int x = in.nextInt();
        
        if (x==2) { matrices(); 
        } 
        else { System.out.println("result = " + addingnumbs() );
       
        }
    }
        
       
    
    
   
    public static int addingnumbs(){
         Scanner in = new Scanner(System.in);
        System.out.println(" enter numbers you want to add");
        System.out.println("enter first number");
        int n1 = in.nextInt();
        System.out.println("enter second number");
        int n2 = in.nextInt();
      int sum = n1 + n2;
        return sum;
    }
    
    

    public static int subtraction() {
        Scanner in = new Scanner(System.in);
        System.out.println("subtraction operation ");
        System.out.println(" enter numbers you want to subtract");
        System.out.println("enter first number");
        int n1 = in.nextInt();
        System.out.println("enter second number");
        int n2 = in.nextInt();
        int answer = n1 - n2;
        return answer;
    }

    public static double multiplication() {
        Scanner in = new Scanner(System.in);
        System.out.println("multiplication operation ");
        System.out.println(" enter numbers you want to duplicate");
        System.out.println("enter first number");
        double n1 = in.nextInt();
        System.out.println("enter second number");
        double n2 = in.nextInt();
        double answer = n1 * n2;
        return answer;
    }

    public static double division() {
        Scanner in = new Scanner(System.in);
        System.out.println("division operation");
        System.out.println(" enter numbers you want to divide");
        System.out.println("enter first number");
        int n1 = in.nextInt();
        System.out.println("enter second number");
        int n2 = in.nextInt();
        double answer = n1 / n2;
        return answer;
    }

    public static double remainder() {
        Scanner in = new Scanner(System.in);
        System.out.println("remainder operation");
        System.out.println(" enter numbers you want to calculate their remainder");
        System.out.println("enter first number");
        int n1 = in.nextInt();
        System.out.println("enter second number");
        int n2 = in.nextInt();
        double answer = n1 % n2;
        return answer;
    }

    public static double squareroot() {
        Scanner in = new Scanner(System.in);
        System.out.println("this is square root operation ");
        System.out.println(" enter number you want to calculate its square root");
        int n1 = in.nextInt();
        double answer = Math.sqrt(n1);
        return answer;
    }

    public static double numbersquared() {
        Scanner in = new Scanner(System.in);
        System.out.println("this is number squared operation ");
        System.out.println(" enter number you want to calculate its value squared");
        int n1 = in.nextInt();
        double answer = Math.pow(n1, 2);
        return answer;
    }

    public static double increment() {
        Scanner in = new Scanner(System.in);
        System.out.println("this is increment operation ");
        System.out.println(" enter number you want to calculate its increment ");
        int n1 = in.nextInt();
        double answer = n1 + 1;
        return answer;
    }

    public static double decrement() {
        Scanner in = new Scanner(System.in);
        System.out.println("this is deccrement operation ");
        System.out.println(" enter number you want to calculate its deccrement ");
        int n1 = in.nextInt();
        double answer = n1 - 1;
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("to start write 1 , to shutdown write -1");
            int o = in.nextInt();
            if (o==-1) {
                System.out.println("shuted down");
                break loop;
            }
          int x = menue();
            if (x == 1) { System.out.println("Binary Operations ");binary2();
            } else if (x == 2) { System.out.println(" Uniary Operations ");uniary2();
            }
        }
    }

}
