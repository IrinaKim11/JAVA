package HomeWork;
import java.util.Scanner;
public class HW_Task_1 {
    static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
    return sum;
    }

    static int factorial(int number) {
        if(number==1)return 1;
    return number * factorial(number-1);
    }

    public static void main(String[] args) {
        Scanner iScann = new Scanner(System.in);
            System.out.printf("Input n: ");
            int n = iScann.nextInt();
            int triangle_number = sum(n);
            int factorial_number = factorial(n);
        System.out.printf("Сумма чисел от 1 до n = %d\n", triangle_number);
        System.out.printf("Факториал n = %d\n", factorial_number);
}
}