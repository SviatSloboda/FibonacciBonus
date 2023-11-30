import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{
    @Test
    public void FibonacciTest_when1_then0(){
        //GIVEN
        int num = 1;
        //WHEN
        int actual = Fibonacci.fibonacci(num);
        //THEN
        assertEquals(0,actual);
    }
    @Test
    public void FibonacciTest_when2_then1(){
        //GIVEN
        int num = 2;
        //WHEN
        int actual = Fibonacci.fibonacci(num);
        //THEN
        assertEquals(1,actual);
    }
}