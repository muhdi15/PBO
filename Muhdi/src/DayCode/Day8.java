package DayCode;

import java.util.Scanner;
import java.util.Arrays;

public class Day8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] con = new String[10];
        
        for (int i = 0; i < con.length; i++) {
            
            con[i] = sc.nextLine();
            
        }
        System.out.println(Arrays.toString(con));
      
    }
    
}
