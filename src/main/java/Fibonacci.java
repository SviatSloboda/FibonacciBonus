public class Fibonacci {

    public static int fibonacci(int num) {
        int firstFibonacci = 0;
        int secondFibonacci = 0;
        int resultFibonacci = 0;
        for(int i = 0; i < num; i++){
            secondFibonacci = firstFibonacci;
            firstFibonacci = i;
            resultFibonacci = firstFibonacci + secondFibonacci;
        }
        return resultFibonacci;
    }
}