package Home_Work_3;
import java.util.ArrayList;
import java.util.*;
public class Task_2 {
    public static ArrayList<Integer> CreateRandomList(int s) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        
            for (int i = 0; i < s; i++) {
                myList.add(((int)(Math.random()*100)));
            }
        
        return myList;
    }

    public static ArrayList<Integer> RemoveEvenNum(ArrayList<Integer> l) {
        Iterator<Integer> iter = l.iterator();
        while(iter.hasNext()) {
            if(iter.next()%2 == 0) iter.remove();
        }
        return l;
    }

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Укажите количество элементов в списке: ");
        int size = iScanner.nextInt();
        ArrayList<Integer> randomList = CreateRandomList(size);
        System.out.println(randomList.toString());
        ArrayList<Integer> newList = RemoveEvenNum(randomList);
        System.out.println(newList.toString());
        iScanner.close();
    }
}
