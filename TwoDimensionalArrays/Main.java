package TwoDimensionalArrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<Integer>());
        matrix.get(0).add(5500);
        matrix.get(0).add(9000);
        matrix.get(0).add(3567);
        matrix.get(0).add(4890);

        matrix.add(new ArrayList<Integer>());
        matrix.get(1).add(3453);
        matrix.get(1).add(4124);
        matrix.get(1).add(5318);
        matrix.get(1).add(4658);

        matrix.add(new ArrayList<Integer>());
        matrix.get(2).add(5311);
        matrix.get(2).add(6532);
        matrix.get(2).add(7572);
        matrix.get(2).add(2574);

        matrix.add(new ArrayList<Integer>());
        matrix.get(3).add(5980);
        matrix.get(3).add(1346);
        matrix.get(3).add(7687);
        matrix.get(3).add(4125);

        System.out.println("Here is the array below: ");
        for (List<Integer> array : matrix){
            System.out.println(array);
        }
        System.out.println();
        System.out.println("The largest sum from this matrix is: "+TwoDimensionalArray.largestSum(matrix));
    }
}
