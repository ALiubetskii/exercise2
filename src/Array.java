import javax.sound.midi.Soundbank;

public class Array {

    public int[] initializationArray() {

        int[] numbers = new int[20];

        for (int i = 1; i < 20; i++) {
            numbers[i] = i;
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i]);
            }
            else
                System.out.print(", ");
            }
            return numbers;
        }

    public int higestValue() {

        int [] bigNumber = {1, 5, 7, 10, 25, 45};
        int max = 0;

        for(int i = 0; i< bigNumber.length; i++){
            if(max < bigNumber[i]) {
                max = bigNumber[i];
            }
        }
        System.out.println("Max: " + max);
            return max;
        }

    public double average() {

        int [] numbers2 = {1, 5, 7, 10, 25, 45};
        double average;

            double sum = 0;
            for (int j = 0; j < numbers2.length; j++) {
                sum += numbers2[j];
            }
            average = sum / numbers2.length;
          System.out.print("Среднее: " + average);

        return average;
    }

}


