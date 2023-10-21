package DayCode;

/**
 *
 * @author LENOVO
 */
public class day11 {
    
    
    
    public static void main(String[] args) {
        double[] k = {91.35,4.72,26.0,3.5,8.0,61.0,65.36,12.0,5.6,7.11};
        Object min = 0;
        for (int i = 0; i < k.length; i++) {
            for (int j = 1; j < k.length; j++) {
                if(j < i){
                    min = j;
                }
                
                
            }
            
        }
        System.out.println("nilai min adalah ="+min);
    }
    
    
}
