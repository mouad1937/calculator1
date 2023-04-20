import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    //red, green refactor

    @Test
    public void addTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val1 + val2;
        //When
        int actual = calculator.add(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest(){

        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val2 + val1;
        int actual = calculator.subtract(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void multiply(){

        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val2 * val1;
        int actual = calculator.subtract(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);
}
    @Test
    public void divide(){

        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val2 / val1;
        int actual = calculator.subtract(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void square(){

        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = val1;
        int expected = val1*val2 ;
        int actual = calculator.subtract(val1,val2);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareRoot(){

        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = val1;
        int expected = val1/val2 ;
        int actual = calculator.subtract(val1,val2);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void exponent(){

        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 3;
        double expected = Math.pow( val1, val2);
        int actual = calculator.subtract(val1,val2);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
