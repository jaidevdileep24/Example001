package Arraylist;
import java.util.*;

public class ExampleProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine()); // Now correctly reads input strings
        }

        int i = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline before reading the string

        String ele = sc.nextLine();
        
        impli(arr, i, ele);
        sc.close(); 
    }
    
    public static void impli(ArrayList<String> arr, int i, String ele) {
        arr.add(i, ele);
        System.out.println(arr);
    }
}
