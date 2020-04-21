import org.junit.Assert;
import org.junit.Test;

public class TestMatrix {
    @Test
    public void TestMultiply() {
        double [][] first = {{1, 2}, {3, 4}};
        double [][] second = {{1, 2}, {3, 4}};
        double [][] res = {{7, 10}, {15, 22}};
        Matrix a = new Matrix();
        double [][] actual_res = a.multiply(first, second);
        Assert.assertArrayEquals(res, actual_res);
    }

    @Test
    public void TestAddition() throws Exception {
        double [][] first = {{1, 2}, {3, 4}};
        double [][] second = {{1, 2}, {3, 4}};
        double [][] res = {{2, 4}, {6, 8}};
        Matrix a = new Matrix();
        double [][] actual_res = a.addition(first, second);
        Assert.assertArrayEquals(res, actual_res);
    }

    @Test(expected = Exception.class)
    public void TestAdditionWithException() throws Exception {
        double [][] first = {{1, 2}, {3, 4}};
        double [][] second = {{1, 2}, {3, 4}, {5, 6}};
        double [][] res = {{2, 4}, {6, 8}};
        Matrix a = new Matrix();
        double [][] actual_res = a.addition(first, second);
    }

    @Test(expected = Exception.class)
    public void TestAdditionWithException2() throws Exception {
        double [][] first = {{1, 2, 3}, {3, 4, 5}};
        double [][] second = {{1, 2}, {3, 4},};
        double [][] res = {{2, 4}, {6, 8}};
        Matrix a = new Matrix();
        double [][] actual_res = a.addition(first, second);
    }

    @Test
    public void TestSubstraction() throws Exception {
        double [][] first = {{1, 2}, {3, 4}};
        double [][] second = {{1, 2}, {3, 4}};
        double [][] res = {{0, 0}, {0, 0}};
        Matrix a = new Matrix();
        double [][] actual_res = a.substraction(first, second);
        Assert.assertArrayEquals(res, actual_res);
    }
    @Test(expected = Exception.class)
    public void TestSubstractionWithException() throws Exception {
        double [][] first = {{1, 2}, {3, 4}};
        double [][] second = {{1, 2}, {3, 4}, {5, 6}};
        double [][] res = {{2, 4}, {6, 8}};
        Matrix a = new Matrix();
        double [][] actual_res = a.substraction(first, second);
    }

    @Test(expected = Exception.class)
    public void TestSubstractionWithException2() throws Exception {
        double [][] first = {{1, 2, 3}, {3, 4, 5}};
        double [][] second = {{1, 2}, {3, 4},};
        double [][] res = {{2, 4}, {6, 8}};
        Matrix a = new Matrix();
        double [][] actual_res = a.substraction(first, second);
    }
    @Test
    public void TestAddValue0() {
        double [][] first = {{1, 2}, {3, 4}};
        int val = 0;
        Matrix a = new Matrix();
        double [][] actual_res = a.addValue(first, val);
        Assert.assertArrayEquals(first, actual_res);
    }
    @Test
    public void TestAddValue() {
        double [][] first = {{1, 2}, {3, 4}};
        int val = 10;
        double [][] res = {{11, 12}, {13, 14}};
        Matrix a = new Matrix();
        double [][] actual_res = a.addValue(first, val);
        Assert.assertArrayEquals(res, actual_res);
    }
}
