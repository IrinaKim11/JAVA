package HomeWork;
import java.util.Scanner;

public class HW_Task_3 {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.printf("Результат операции: %d",result);
}

public static int getInt(){
    System.out.println("Введите число:");
    int num;
    num = scanner.nextInt();
    return num;
}


public static char getOperation(){
    System.out.println("Выберите операцию и введите ее (+ - / *):");
    char operation;
    operation = scanner.next().charAt(0);
    return operation;
}

public static int calc(int num1, int num2, char operation){
    int result;
    switch (operation){
        case '+':
            result = num1+num2;
            break;
        case '-':
            result = num1-num2;
            break;
        case '*':
            result = num1*num2;
            break;
        case '/':
            result = num1/num2;
            break;
        default:
            System.out.println("Ошибка. Повторите ввод.");
            result = calc(num1, num2, getOperation());//рекурсия
    }
    return result;
}
}

