package daily_coding_challenges;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Prob150_GetKNearestPointsTest {

    @Test
    void getKNearestPoints() {
        Prob150_GetKNearestPoints testObj = new Prob150_GetKNearestPoints();
        List<Prob150_GetKNearestPoints.Point> inputPoints = new ArrayList<>();
        inputPoints.add(new Prob150_GetKNearestPoints.Point(0,0));
        inputPoints.add(new Prob150_GetKNearestPoints.Point(5,4));
        inputPoints.add(new Prob150_GetKNearestPoints.Point(3,1));

        List<Prob150_GetKNearestPoints.Point> expectedOutput = new ArrayList<>();
        expectedOutput.add(inputPoints.get(0));
        expectedOutput.add(inputPoints.get(2));

        Prob150_GetKNearestPoints.Point centralPoint = new Prob150_GetKNearestPoints.Point(1,2);
        int k = 2;

        Assert.assertArrayEquals(expectedOutput.toArray(),testObj.getKNearestPoints(inputPoints,centralPoint,k).toArray());
    }
}