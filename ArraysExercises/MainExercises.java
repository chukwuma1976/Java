class MainExercises {
    static public void main (String[] args){
        System.out.println("Hello");
        int[] numbers = new int[10];
        for (int i=0; i < numbers.length; i++){
            numbers[i] = (int) Math.pow(i, i);
            System.out.println(numbers[i]);
        }
    }
}