package HomeWork_4;
import java.util.LinkedList;
import java.util.Scanner;
public class Task_1 {
    public static int inputNumber(Scanner iScanner) {             
        System.out.printf("Введите число элементов в списке: ");
        String number = iScanner.nextLine();
        return Integer.parseInt(number);
        }

    public static LinkedList<Integer> fillList(int size, LinkedList<Integer> lList) {             
        for (int i = 0; i < size; i++){
            lList.addFirst((int)(Math.random()*100));
        }
        return lList;
        }
    public static LinkedList<Integer> turnedList(LinkedList<Integer> lListFirst, int size) {             
        LinkedList<Integer> lListSecond = new LinkedList<>();
        for (int i = 0; i < size; i++){
            lListSecond.addFirst(lListFirst.pollFirst());
        }
        return lListSecond;
        } 
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
    
            int size = inputNumber(iScanner);
    
            LinkedList<Integer> myLinkedList = new LinkedList<>();
            myLinkedList = fillList(size, myLinkedList);
    
            System.out.println(myLinkedList);
            System.out.println(turnedList(myLinkedList, size));
    
            iScanner.close();
            
        }
}
