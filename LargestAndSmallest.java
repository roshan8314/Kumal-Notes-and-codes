import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the largest and the smallest of the three number");

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the first number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the first number: ");
        int num3 = sc.nextInt();

        int largest = Largest(num1, num2, num3);
        int smallest = Smallest (num1, num2, num3);

        System.out.println("The Smalles number is: " + smallest);
        System.out.println("The Largest number is : " + largest);
    }
        static int Largest(int num1, int num2, int num3){
            int max = num1;
            if (num2 > max ){
                max = num2;
            }
            if(num3 > max){
                max = num3;
            }
           return max;
        }
        static int Smallest(int num1, int num2, int num3){
            int min = num1;
            if (num2 < min ){
                min = num2;
            }
            if(num3 < min){
                min = num3;
            }
           return min;

    }
}