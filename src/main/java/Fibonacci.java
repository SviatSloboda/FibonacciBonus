public class Fibonacci {

    public static int fibonacci(int num) {
        int firstFibonacci = 0;
        int secondFibonacci = 1;
        int resultFibonacci = 0;
        for(int i = 0; i < num; i++){
            resultFibonacci = firstFibonacci + secondFibonacci;
            firstFibonacci = secondFibonacci;
            secondFibonacci = resultFibonacci;
        }
        return resultFibonacci;
    }
}