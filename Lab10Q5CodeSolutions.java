import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class Lab10Q5CodeSolutions{
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        Collections.addAll(list, 8, 6, 7, 5, 3, 0, 9);
        
        Collections.sort(list);
        System.out.println(list);
        
        Collections.reverse(list);
        System.out.println(list);
        

        System.out.println("end of program");
    }
}
