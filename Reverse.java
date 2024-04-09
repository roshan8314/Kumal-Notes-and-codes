public class Reverse {
    public static void main(String[] args){
        int n = 23597;

        int temp = 0;
        while (n > 0){
            int rem = n % 10;
            n /=  10; 
           
           temp = temp * 10 + rem;
    }

    System.out.println(temp);
    }
}