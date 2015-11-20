/**
 * Created by gsuhocki on 11/18/15.
 */
public class StairClimb {

    public Integer stridesTaken(Integer[] flights, Integer stairsPerStride) {
        int landing = 2;
        int steps = 0;
        int strides = 0;



        //Loop through the total number of strides
        for (int g = 0; g < flights.length; g++) {


            //Test to see if the stride is an divisible by stairsPerStride evenly.  If so it sets the result to steps.
            //If not, an additional stride is taken into account and added to the result.
            if (flights[g] % stairsPerStride == 0) {
                steps = (flights[g] / stairsPerStride);
            } else if(flights[g]% stairsPerStride!=0){
                steps = (flights[g]/stairsPerStride) + 1;
            }

            //Iterate through the steps to find landings.  If landing is found, 2 strides are added to the total strides.
            while (g > 0 && g < flights.length) {
                steps += landing;
                break;
            }
             strides += steps;
        }
        return strides;
    }
}