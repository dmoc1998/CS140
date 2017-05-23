import java.util.*;
import java.io.*;

public class lab5b2 {

    public static void main(String[] args) {
		
		//Scanner
		Scanner kb = new Scanner(System.in);
		
        int rows = kb.nextInt(), i = 1, j = 1;

        while (i <= rows) {
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
            j = 1;
        }
    }
}