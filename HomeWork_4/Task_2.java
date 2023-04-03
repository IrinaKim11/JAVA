package HomeWork_4;
import java.util.LinkedList;
public class Task_2 {
    public static LinkedList<Integer> createRandomList(int s) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
            
            for (int i = 0; i < s; i++) {
                myList.add(((int)(Math.random()*100)));
            }
        
        return myList;
    }
    
        public static void enqueue(LinkedList<Integer> ll, int i) {
            ll.addLast(i);
            System.out.println("Item added successfully");
        }        
        
        public static int dequeue(LinkedList<Integer> ll) {
            return ll.pollFirst();
        }   
    
        public static Integer first(LinkedList<Integer> ll) {
            return ll.getFirst();
        }   
        public static void main(String[] args) {
            LinkedList<Integer> deqList = createRandomList(8);
            System.out.println("Первоначальная очередь выглядит так: " + deqList);
            enqueue(deqList, 135);
            System.out.println("Очередь после добавления элемента в конец: " + deqList);
            int item1 = dequeue(deqList);
            System.out.println("Первый элемент в очереди - " + item1);
            System.out.println("Очередь после извлечения первого элемента: " + deqList);
            int item2 = first(deqList);
            System.out.println("Текущий первый элемент в очереди: " + item2);
            System.out.println("Состоянии очереди на текущий момент" + deqList);
    
        }
}
