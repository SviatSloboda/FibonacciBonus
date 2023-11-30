import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{
    @Test
    public void FibonacciTest_when1_then1(){
        //GIVEN
        int num = 1;
        //WHEN
        int actual = Fibonacci.fibonacci(num);
        //THEN
        assertEquals(1,actual);
    }
    @Test
    public void FibonacciTest_when2_then2(){
        //GIVEN
        int num = 2;
        //WHEN
        int actual = Fibonacci.fibonacci(num);
        //THEN
        assertEquals(2,actual);
    }
    @Test
    public void FibonacciTest_when3_then3(){
        //GIVEN
        int num = 3;
        //WHEN
        int actual = Fibonacci.fibonacci(num);
        //THEN
        assertEquals(3,actual);
    }

    @Test
    public void FibonacciTest_when4_then5(){
        //GIVEN
        int num = 4;
        //WHEN
        int actual = Fibonacci.fibonacci(num);
        //THEN
        assertEquals(5,actual);
    }

    @Test
    public void FibonacciTest_when5_then8(){
        //GIVEN
        int num = 5;
        //WHEN
        int actual = Fibonacci.fibonacci(num);
        //THEN
        assertEquals(8,actual);
    }

    @Test
    public void FibonacciTest_when6_then13(){
        //GIVEN
        int num = 6;
        //WHEN
        int actual = Fibonacci.fibonacci(num);
        //THEN
        assertEquals(13,actual);
    }
}