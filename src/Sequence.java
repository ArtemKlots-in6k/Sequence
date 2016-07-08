import java.util.ArrayList;

/**
 * Created by employee on 7/8/16.
 */
public class Sequence {
    private ArrayList<Integer> result = new ArrayList<>();
    int sum = Integer.MIN_VALUE;

    public int countSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public ArrayList<Integer> findSequence(ArrayList<Integer> numbers) {
        if (numbers == null)
            return new ArrayList<>();
        if (numbers.size() == 1)
            return numbers;

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                ArrayList<Integer> result = new ArrayList<>();
                int localSum;

                for (int k = i; k <= j; k++) {
                    result.add(numbers.get(k));
                    localSum = countSum(result);
                    if (localSum > this.sum) {
                        this.sum = localSum;
                        this.result = result;
                    }
                }

            }
        }
        return this.result;
    }
}
