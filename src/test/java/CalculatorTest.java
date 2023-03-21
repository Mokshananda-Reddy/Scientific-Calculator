import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    private final Scientific_Calculator calculator = new Scientific_Calculator();
    @Test
    public void  test_Square_root(){
        var result = calculator.sq_root(4);

        Assertions.assertEquals(2,result,0.0f);
    }
    @Test
    public void  test_Square_root2(){
        var result = calculator.sq_root(-4);

        Assertions.assertEquals(-1,result,0.0f);
    }
    @Test
    public void  test_Square_root3(){
        var result = calculator.sq_root(4);

        Assertions.assertNotEquals(1,result,0.0f);
    }
    @Test
    public void  test_Factorial(){
        var result = calculator.fact(5);

        Assertions.assertEquals(120,result,0.0f);
    }
    @Test
    public void  test_Factorial2(){
        var result = calculator.fact(-5);

        Assertions.assertEquals(-1,result,0.0f);
    }
    @Test
    public void  test_Factorial3(){
        var result = calculator.fact(5);

        Assertions.assertNotEquals(100,result,0.0f);
    }
    @Test
    public void  test_Natural_Log(){
        var result = calculator.nlog(3);

        Assertions.assertEquals(1.098,result,0.2f);
    }
    @Test
    public void  test_Natural_Log2(){
        var result = calculator.nlog(-3);

        Assertions.assertEquals(-1,result,0.0f);
    }
    @Test
    public void  test_Natural_Log3(){
        var result = calculator.nlog(3);

        Assertions.assertNotEquals(3,result,0.2f);
    }
    @Test
    public void  test_Power(){
        var result = calculator.power(5,2);

        Assertions.assertEquals(25,result,0.0f);
    }
    @Test
    public void  test_Power2(){
        var result = calculator.power(2,-1);

        Assertions.assertEquals(0.5,result,0.0f);
    }
    @Test
    public void  test_Power3(){
        var result = calculator.power(6,2);

        Assertions.assertNotEquals(10,result,0.0f);
    }
}
