// import java.util.Scanner;
// multiplication of two numbers
// public class function {
//     public static int multiply(int a, int b){
//         return a*b;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int b= sc.nextInt();
//         System.out.println("Result is:"+ multiply(a,b));

//     }
    
// }

// import java.util.Scanner;

// factorial function
// public class function{

//     public static void printFactorial(int n){
//         if(n<0){
//             System.out.println("Invalid number");
//             return;
//         }
//         int factorial = 1;
//         for(int i=n; i>=1; i--){
//             factorial =factorial*i;
//         }
//         System.out.println(factorial);
//         return;

//     }


// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter number:");
//     int a = sc.nextInt();
//     printFactorial(a);


// }
// }


// import java.util.Scanner;
// product function
// public class function{
//     public static int product(int a, int b){
//         return a*b;
//     }


// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter 1st num:");
// int m = sc.nextInt();
// System.out.print("Enter 2nd num: ");
// int n= sc.nextInt();
// System.out.println("The product is: "+product(m, n));


// }
// }


// import java.util.Scanner;
// prime number function
// public class function{
//     public static void primeCheck(int a){
//         int count =0;
//         if(a==2){
//             count++;
//         }
        
//         for(int i=2; i<=a/2; i++){
//             if(a%i ==0){
//                 count++;
//             }
//         }
//         if(count ==1){
//             System.out.println("This is not prime");
//         }
       
       
//         else{
//             System.out.println("This is prime");
//         }
//         return;
//     }

// public static void main(String args[]){
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter your number:");
//     int n= sc.nextInt();
//     primeCheck(n);

// }
// }


// import java.util.Scanner;
// even odd function
// public class function{
//     public static void check(int n){
//         if(n%2==0){
//             System.out.println("Even Number");
//         }
//         else{
//             System.out.println("Odd Number");
//         }
//         return;

//     }

// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter num:");
// int n = sc.nextInt();
// check(n);

// }
// }



// import java.util.Scanner;
// print table function
// public class function{
// public static void tableOf(int num){
//     for(int i=1;i<=10; i++){
//         System.out.println(num +"x"+ i+ " = "+(num*i));
//     }
//     return;


// }

// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter num:");
// int n = sc.nextInt();
// tableOf(n);

// }
// }

// average of 3 numbers from user
// import java.util.Scanner;
// public class function{

//     public static int prtavg(int a, int b, int c ){
//         int avg = (a+b+c)/2;
//         return avg;
//     }

// public static void main(String args[]){
//     int m=2; 
//     int n=3;
//     int k= 4;
    
//     System.out.println(prtavg(m,n,k));


// }
// }

// sum of odd number upto n
// import java.util.Scanner;
// public class function{

//     public static void sumofodds(int c ){
//         int sum = 0;
//         for(int i=1; i<=c; i++){
//             if(i%2 != 0){
//                 sum +=i;
//             }
//         }
//         System.out.println(sum);
        
//     }

// public static void main(String args[]){
//     int n = 9;
//     sumofodds(n);

// }

// }

// greatest of two numbers
// import java.util.Scanner;
// public class function{

//     public static void got(int a, int b ){
//         if(a>b){
//             System.out.println(a);
        
//         }
//         else{System.out.println(b);}
//     }

// public static void main(String args[]){
// int a = 5; int b= 3;
// got(a,b);

// }

// }

// circumference of circle
// import java.util.Scanner;
// public class function{
//     public static double coc(double n){
//         return 2* 3.14 *n;
//     }
//     public static void main(String args[]){
//         double a =5;
//         double v= coc(a);
//         System.out.println(v);
//     }
// }


// import java.util.Scanner;
// public class function{
//     public static void ifvote(int n){
//         if (n>18){
//             System.out.println("You are eligible");
//         }
//         else if(n==18){
//             System.out.println("Come after one year");
//         }
//         else{System.out.println("Not eligible");}
//         return;
//     }
//     public static void main(String args[]){
//         int a =100;
//         ifvote(a);
//     }
// }

// program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
// import java.util.*;
// import java.util.Scanner;
// public class function{
//     public static void main(String args[]){
//         int positive =0;
//         int negative = 0;
//         int zeros = 0;
//         Scanner sc = new Scanner(System.in);
        
//             // Scanner sc = new Scanner(System.in);
//             System.out.println("If you wanna enter a number, press 1 else press 0");
//             int number = sc.nextInt();
//             while(number ==1){
//                 System.out.println("Enter number:");
//                 int input = sc.nextInt();
//                 if(input <0){
//                     negative++;
//                 }
//                 else if(input >0){
//                     positive++;
//                 }
//                 else{zeros++;}
//             System.out.println("If you wanna enter a number, press 1 else press 0");
//             number =sc.nextInt();
//         }
//         System.out.println("positive: "+positive +"    negative: "+ negative +"      zeros: " + zeros);
//     }

//     }


// function to find the value of one number raised to the power of another i.e. x power n
// public class function{
//     public static void power(int n, int m){
//         int result=1;
//         for(int i=1; i<=m; i++){
//             result*=n;
//         }
//         System.out.println(result);
//         return;
//     }
//     public static void main(String args[]){
//         int n=2;
//         int m = 5;
//         power(n,m);
//     }
// }

// function that calculates the Greatest Common Divisor of 2 numbers
// import java.util.Scanner;
// public class function{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
  
//         while(n1 != n2) { 
//             if(n1>n2) {
//                 n1 = n1 - n2;
//             } else {
//                 n2 = n2 - n1;
//             }
//         }
//         System.out.println("GCD is : "+ n2);
//     }   
 
    
// }

// program to print Fibonacci series of n terms where n is input by user
import java.util.Scanner;
public class function{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many terms in fibonacci series u want:");
        int terms = sc.nextInt();
        int a = 0;
        int b=1;
        for(int i=0; i<terms; i++){
            int temp =a;
            a=b;
            b=temp;
            System.out.println(b);
            a=a+b;
        }


    }
}
