import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        numbers = new ArrayList<Integer>(Collections.singletonList(-1));
        expectedResult = new ArrayList<Integer>(Collections.singletonList(-1));

        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }

    @Test
    public void checkingTwoPositiveElements() throws Exception {
        numbers = new ArrayList<Integer>(Arrays.asList(1, 5));
        expectedResult = new ArrayList<Integer>(Arrays.asList(1, 5));
        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }


    @Test
    public void checkingForOnePositiveAndOneNegativeElements() throws Exception {
        numbers = new ArrayList<Integer>(Arrays.asList(-1, 5));
        expectedResult = new ArrayList<Integer>(Collections.singletonList(5));
        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }

    @Test
    public void checkingForNegativeElements() throws Exception {
        numbers = new ArrayList<Integer>(Arrays.asList(-10, -9, -8, -7, -6));
        expectedResult = new ArrayList<Integer>(Collections.singletonList(-6));
        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }

    @Test
    public void checkingForPositiveElements() throws Exception {
        numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        expectedResult = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }

    @Test
    public void checkingForMixedPositiveAndNegativeElements() throws Exception {
        numbers = new ArrayList<Integer>(Arrays.asList(1, 2, -4, 4, 5));
        expectedResult = new ArrayList<Integer>(Arrays.asList(4, 5));
        assertThat(sequence.findSequence(numbers), is(expectedResult));
    }
}
