import org.junit.Test;
import org.junit.Assert;

/**
 * Created by gsuhocki on 11/20/15.
 */
public class StridesTest {

    //test the number of strides for 15 stairs.
    @Test
    public void testStridesTaken(){
        StairClimb stairClimb = new StairClimb();
        Integer[] stepsArray = {15};
        int stridesAmount = stairClimb.stridesTaken(stepsArray,2);
        Assert.assertEquals("Total strides equals 8.", 8, stridesAmount);
    }
}
