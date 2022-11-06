package school.mjc.stage0.loops.task3;

import java.util.ArrayList;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n1=0;
        int n2=1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i=2; i<lastFibonacci; ++i){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            if (n3==lastFibonacci){
                break;
            }
        }
    }
}
