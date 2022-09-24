import java.net.HttpRetryException;
import java.util.Scanner;
public class loops {
    public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
        
//         int fact =1;
//         System.out.println("Enter the number : ");
//         int num = sc.nextInt();

//         for(int i=1;i<=num;i++){
//             fact = fact * i;
//         }
// System.out.println("factorial of given number  : " + fact);


//         int i =1;
//         do{
//             System.out.println("rohan aditya");

//             i++;
//         }

// while(i<=10);
// for(int i =0; i<=5;i++){
//     if(i==3){
//         continue;

//     }
//     System.out.println(i);
// }

// for(int i =0;i<5;i++){
//     System.out.println("rohan");
//     i+=2;
// }

// THE FACTORIAL FOR THE GIVEN NUMBER WILL BE : //
// multiplication table //
// System.out.println("multiplication of 3 is : ");
// int number = 3;
// for(int i =1;i <=10;i++){
//      System.out.println(number + " * " + i + " = " + number * i);
// }

// Scanner input = new Scanner(System.in);
//     int num;
//     int i;
//     int x = 0;
//     int y = 0;
//     System.out.print("How many numbers you want to input: ");
//     i = input.nextInt();
//     for (;;) {
//         i--;
//         System.out.print("Please input a number : ");
//         num = input.nextInt();
//         if (num % 2 == 0) {
//             x = x + num;
//         } else {
//             y = y + num;
//         }
//         if (num < 0) {
//             System.out.print("Inivald input");
//             System.exit(0);
//         }
//         if (i == 0) {
//             System.out.println("Sum of even numbers is : " + x);
//             System.out.println("Sum of odd numbers is : " + y);
//             System.exit(0);
//         }
//     }

// for printing downward star pattern we will write the code //

// int n =4;
// for(int i =1; i<=4;i++){
// for(int j=1;j<=n-i+1;j++){
//     System.out.print(" * ");
// }
// System.out.println();
// }

// half pyramid patten//
int n =5;
char ch ='A';
for(int i=1; i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}

      }
    
}
Scanner input = new Scanner(System.in);
    int num;
    int i;
    int x = 0;
    int y = 0;
    System.out.print("How many numbers you want to input: ");
    i = input.nextInt();
    for (;;) {
        i--;
        System.out.print("Please input a number : ");
        num = input.nextInt();
        if (num % 2 == 0) {
            x = x + num;
        } else {
            y = y + num;
        }
        if (num < 0) {
            System.out.print("Inivald input");
            System.exit(0);
        }
        if (i == 0) {
            System.out.println("Sum of even numbers is : " + x);
            System.out.println("Sum of odd numbers is : " + y);
            System.exit(0);
            system.out.println(the major value is this)
\sys        }
    }
