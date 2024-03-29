package HomeWork_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Laptops laptop1 = new Laptops(2, 200, "Windows", "black", 19.2);
        Laptops laptop2 = new Laptops(4, 100, "Mac", "blue", 14.2);
        Laptops laptop3 = new Laptops(2, 500, "Linux", "red", 20.3);
        Laptops laptop4 = new Laptops(8, 100, "Windows", "green", 16.2);
        List<Laptops> listLaptops = new ArrayList<>();
        listLaptops.add(laptop1);
        listLaptops.add(laptop2);
        listLaptops.add(laptop3);
        listLaptops.add(laptop4);
        
        Scanner inputword = new Scanner(System.in);
        
        System.out.println("Input you wished values. 1. RAM: ");
        int ram = inputword.nextInt();
        System.out.println("2. HDD: ");
        int hdd = inputword.nextInt();
        System.out.println("3. OS: ");
        String userOS = inputword.next();
        System.out.println("4. Colour: ");
        String colour = inputword.next();
        System.out.println("5. Size: ");
        double size = inputword.nextDouble();
        inputword.close();

        List<Laptops> outputLaptops = new ArrayList<>();

        for (int i = 0; i < listLaptops.size(); i++) {
            Laptops Laptop = listLaptops.get(i);
            if ((Laptop.getRam() >= ram) | (Laptop.getHdd() >= hdd) | (Laptop.getSize() >= size)) {
                outputLaptops.add(Laptop);
            } else if ((Laptop.getOs().equals(userOS) | Laptop.getColour().equals(colour))) {
                outputLaptops.add(Laptop);
            }
        }

        for (int i = 0; i < outputLaptops.size(); i++) {
            Laptops laptop = outputLaptops.get(i);
            System.out.println(laptop.getRam() + " " + laptop.getHdd() + " " + laptop.getOs() + " " + laptop.getColour() + " " + laptop.getSize());
        }
    } 
}
