import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
             {12, 34, 43,},
             {45, 33},
             {43, 43,234,53}
        };
        int key = 53;
        int[] ans = search(arr, key);
        System.out.print(Arrays.toString(ans));
        
    }
    static int[] search(int[][] arr, int key ){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == key){
                return new int[]{row, col};

            }
        }
    }
    
        return new int[]{-1, -1};

        }    
    }
    

