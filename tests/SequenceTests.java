import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/8/16.
 */
public class SequenceTests {
    private Sequence sequence;
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> expectedResult;

    @Before
    public void createSequence() {
        sequence = new Sequence();
        numbers = new ArrayList<Integer>();
        expectedResult = new ArrayList<Integer>();
    }

    @Test
    public void checkingForNull() throws Exception {
        assertThat(sequence.findSequence(null), is(new ArrayList<Integer>()));
    }

    @Test
    public void checkingForEmptyArray() throws Exception {
        assertThat(sequence.findSequence(new ArrayList<Integer>()), is(new ArrayList<Integer>()));
    }

    @Test
    public void checkingOneElement() throws Exception {
        numbers.add(-1);
        expectedResult.add(-1);

        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }

    @Test
    public void checkingTwoPositiveElements() throws Exception {
        numbers.add(1);
        numbers.add(5);
        expectedResult.add(1);
        expectedResult.add(5);
        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }

    @Test
    public void checkingForOnePositiveAndOneNegativeElements() throws Exception {
        numbers.add(-1);
        numbers.add(5);
        expectedResult.add(5);
        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }


}
