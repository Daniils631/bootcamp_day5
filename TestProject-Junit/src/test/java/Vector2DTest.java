import org.example.Vector2D;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    public final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector(){
        v1 = new Vector2D();
    }
    @Test
    public void newVectorShouldHaveZeroLength(){
        //assertion
        // 1e-9=0000000001
        Assert.assertEquals(0, v1.lenght(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, v1.getX(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, v1.getY(), EPS);
    }





}
