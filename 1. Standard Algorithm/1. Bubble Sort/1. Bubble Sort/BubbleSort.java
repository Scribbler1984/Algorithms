public class BubbleSort {
    public static int[] numbers;

    BubbleSort(int[] array){
        numbers = array;
    }

    public int[] sort(){
        int n;

        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] < numbers[i + 1]){
                continue;
            }

            n = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = n;
            sort();
        }

        return numbers;
    }

}
