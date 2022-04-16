import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestJunit {
    private static TestMethod testMethod;

    @BeforeAll
    public static void init(){
        testMethod = new TestMethod();
    }

    @Test
    public void test1ArrayBefore4(){
        Assertions.assertArrayEquals(new int[]{7,6,7,8},testMethod.arrayBefore4(new int[]{1,2,4,2,5,4,7,6,7,8}));
    }

    @Test
    public void test2ArrayBefore4(){
        Assertions.assertArrayEquals(new int[]{7,8},testMethod.arrayBefore4(new int[]{4,2,4,2,4,4,7,4,7,8}));
    }

    @Test
    public void test3ArrayBefore4(){
        Assertions.assertArrayEquals(new int[]{5,6,7,8,1},testMethod.arrayBefore4(new int[]{4,5,3,4,5,6,7,8,1}));
    }

    @Test
    public void test4ArrayBefore4(){
        Assertions.assertArrayEquals(new int[]{6,1},testMethod.arrayBefore4(new int[]{1,2,6,4,2,1,4,6,1}));
    }

    @Test
    public void test1expectedOneAndFour(){
        Assertions.assertTrue(testMethod.expectedOneAndFour(new int[]{1,2,4,4,3}));
    }

    @Test
    public void test2expectedOneAndFour(){
        Assertions.assertTrue(testMethod.expectedOneAndFour(new int[]{1,2,4,3,2}));
    }

    @Test
    public void test3expectedOneAndFour(){
        Assertions.assertFalse(testMethod.expectedOneAndFour(new int[]{1,2,1,3,2}));
    }
    @Test
    public void test4expectedOneAndFour(){
        Assertions.assertFalse(testMethod.expectedOneAndFour(new int[]{6,2,4,3,2}));
    }
}
