import java.util.*;

public class Exercise3 {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int totalSheeps = 0;
        for (Boolean sheep: arrayOfSheeps) {
            if (sheep == null) {
                continue;
            } else if (sheep) {
                totalSheeps++;
            }
        }
        return totalSheeps;
    }
    public static void main(String[] args) {
        Boolean[] array1 = {
            true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true 
        };
        System.out.println(new Exercise3().countSheeps(array1));
    }
}