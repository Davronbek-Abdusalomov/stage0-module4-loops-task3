package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum =0;
        if (firstBoarder==secondBoarder){
            System.out.println(firstBoarder);
        }
        else {
        for (int i=firstBoarder; i<secondBoarder+1; i++){
            sum=sum+i;
            System.out.println(sum);
         }
        }
    }
}
