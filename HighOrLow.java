import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        

    }
    static int guessNumber(int low, int high){
        while( low <= high){
            int mid = low + (high - low)/2;
            int pick = guess(mid);
            if(pick > 0) low = mid + 1;
            else if(pick < 0) high = mid + 1;
            else return mid;
        }
        return -1
    }
    
}
