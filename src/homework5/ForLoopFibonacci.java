package homework5;

public class ForLoopFibonacci {

    public static void main(String[] args) {

        int[] fibonacciNumber = new int[10];

        for(int index = 0; index < 10; index++)
        {
            if( index == 0)
            {
                fibonacciNumber[index] = 0;
            } else if (index == 1) {
                fibonacciNumber[index] = 1;
            } else
            {fibonacciNumber[index] = fibonacciNumber[index-1]+fibonacciNumber[index-2];}
            System.out.print(fibonacciNumber[index] + " ");
        }





    }
}

