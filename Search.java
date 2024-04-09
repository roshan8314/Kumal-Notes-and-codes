public class Search {
    public static void main(String[] args) {
        int[] arr = { 18, 12, 9, 14, 77, 50 };
        int key = 50;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == key) {
            System.out.println("Key found: " + i);
            return;
            }
            

        }
        System.out.println("Key not found: " + key);
    }
}
