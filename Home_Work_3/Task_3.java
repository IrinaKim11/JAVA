package Home_Work_3;
import java.util.ArrayList;
import java.util.*;
public class Task_3 {
    public static ArrayList<Integer> CreateRandomList(int s) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        
            for (int i = 0; i < s; i++) {
                myList.add(((int)(Math.random()*100)));
            }
        
        return myList;
    }

    public static double FindAverage(ArrayList<Integer> l) {
        
        double sum = 0;
        for (Integer iter : l) {
            sum += iter;
        }
        double av = sum/l.size();
        return av;
    }

    public static int FindMin(ArrayList<Integer> l) {
        
        int min = l.get(0);
        for (Integer iter : l) {
            if(iter < min) min = iter;
        }
        return min;
    }

    public static int FindMax(ArrayList<Integer> l) {
        
        int max = l.get(0);
        for (Integer iter : l) {
            if(iter > max) max = iter;
        }
        return max;
    }
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Укажите количество элементов в списке: ");
        int size = iScanner.nextInt();
        ArrayList<Integer> randomList = CreateRandomList(size);
        double average = FindAverage(randomList);
        int minimum = FindMin(randomList);
        int maximum = FindMax(randomList);
        System.out.println(randomList.toString());
        System.out.println("Минимальный элемент в списке = " + minimum);
        System.out.println("Максимальный элемент в списке = " + maximum);
        System.out.println("Среднее арифметическое эелементов списка = " + average);
        iScanner.close();
    }
}
