package school.mjc.stage0.loops.task3;

import java.util.ArrayList;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int first = 25;
        int second = 30;
        ArrayList<Integer> arrayList1 = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        ArrayList<Integer> arrayList3 = new ArrayList();
        if (first>second){
            for (int i=1; i<=first; i++){
                if (first%i==0){
                    arrayList1.add(i);
                }
                if (second%i==0){
                    arrayList2.add(i);
                }
            }
        }
        else {
            for (int i=1; i<=second; i++){
                if (first%i==0){
                    arrayList1.add(i);
                }
                if (second%i==0){
                    arrayList2.add(i);
                }
            }
        }
        for (int i=1; i<=arrayList1.size(); i++){
            if (arrayList1.get(i)==arrayList2.get(i)){
                arrayList3.add(arrayList1.get(i));

            }
        }
        for (int i=1; i<=arrayList3.size(); i++){
            int max=arrayList1.get(1);
            if (max>arrayList3.get(i)){
                max=arrayList3.get(i);
                System.out.println(max);
            }
        }

    }
}
