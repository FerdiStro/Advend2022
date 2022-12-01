import reader.Reader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_01_12 {

    public static void main(String[] args) {
        Reader reader = new Reader(new File("rsc/01-12.txt"));
        String input = reader.getInput();
        String[] split = input.split("\n\n");
        List<Integer> rankingCal = new ArrayList<>();
        for(String elf : split){
            String[] cals = elf.split("\n");
            int totalCals = 0;
            for(String cal:cals){
                int calInt = Integer.parseInt(cal);
                totalCals = totalCals + calInt;
            }
            rankingCal.add(totalCals);
        }
        rankingCal.sort(Collections.reverseOrder());
        System.out.println("Solution 1 is: " + rankingCal.get(0));
        int solutionTwo = 0 ;
        for(int i = 0; i != 3; i++){
            solutionTwo = solutionTwo  + rankingCal.get(i);
        }
        System.out.println("Solution 2 is: " + solutionTwo);
    }
}
