import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number");
        int num1 = sc.nextInt();

        System.out.println("Enter your Second number");
        int num2 = sc.nextInt();
        sum(num1, num2);
   //     isSum(int num1, int num2);
    }


        static int sum(int num1, int num2){
            int sum = 0;
            sum = num1 + num2;
            System.out.println(sum);
        
        return sum;
    }
    
}
