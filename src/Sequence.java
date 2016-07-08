import java.util.ArrayList;

/**
 * Created by employee on 7/8/16.
 */
public class Sequence {
    private ArrayList<Integer> result = new ArrayList<>();
    int sum = Integer.MIN_VALUE;

    public ArrayList<Integer> findSequence(ArrayList<Integer> numbers) {
        if (numbers == null)
            return new ArrayList<>();
        if (numbers.size() == 1)
            return numbers;
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        for (int number : numbers) {
            if (number > 0) {
                result.add(number);
                sum += number;
            }
        }
        if (sum > this.sum)
            this.result = result;


        return this.result;
    }
}
