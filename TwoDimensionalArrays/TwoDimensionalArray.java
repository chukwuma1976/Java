package TwoDimensionalArrays;

import java.util.*;

public class TwoDimensionalArray {

    static int largestSum(List<List<Integer>> matrix){
        int sum = 0;
        List<List<Integer>> columns = new ArrayList<>();
        for (int i=0; i<matrix.size(); i++){
            Collections.sort(matrix.get(i));
            Collections.reverse(matrix.get(i));
        }

        for (int i=0; i<matrix.size(); i++){
            List<Integer> column = new ArrayList<>();
            for (int j=0; j < matrix.size(); j++){
                column.add(matrix.get(j).get(i));
            }
            Collections.sort(column);
            Collections.reverse(column);
            columns.add(column);
        }
        
        for (int i = 0; i<matrix.size()/2; i++){
            for (int j = 0; j<matrix.size()/2; j++){
                sum = sum + columns.get(i).get(j);
            }
        }

        return sum;
    }
}
