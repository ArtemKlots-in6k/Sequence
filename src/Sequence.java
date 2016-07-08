import java.util.ArrayList;

/**
 * Created by employee on 7/8/16.
 */
public class Sequence {
    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> findSequence(ArrayList<Integer> numbers) {
        if (numbers == null)
            return new ArrayList<>();

        result = numbers;
        return result;
    }
}
