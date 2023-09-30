import java.util.Arrays;

class MainExercises {
    static public void main (String[] args){
        System.out.println("Hello");
        int[] numbers = new int[10];
        for (int i=0; i < numbers.length; i++){
            numbers[i] = (int) Math.pow(i, i);
        }
        System.out.println(Arrays.toString(numbers));
        int[] numbers2 = new int[15];
        System.out.println(Arrays.toString(numbers2));
        //Use of System.arraycopy() method
        System.arraycopy(numbers, 0, numbers2, 0, numbers.length);

        //Use of toString() method
        System.out.println(Arrays.toString(numbers2));

        //Use of binarySearch() method
        System.out.println(Arrays.binarySearch(numbers, 0, numbers.length, 27));

        //Use of equals() method
        System.out.println(Arrays.equals(numbers, numbers2));

        //Use of fill() method
        String[] theseNuts = new String[12];
        Arrays.fill(theseNuts, "These Nuts!");
        System.out.println(Arrays.toString(theseNuts));

        //Use of sort method
        int[] randomNumbers = {9,3,6,2,6,3,7,2,7,8,9};
        Arrays.sort(randomNumbers);

        //Use of stream(array) method
        System.out.println(Arrays.toString(randomNumbers));
        Arrays.stream(randomNumbers).map(number->number*2).forEach(System.out::println);


    }
}