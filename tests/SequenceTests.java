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

    @Before
    public void createSequence(){
        sequence = new Sequence();
    }

    @Test
    public void checkingForNull() throws Exception {
        assertThat(sequence.findSequence(), is(new ArrayList<Integer>()));
    }


}
