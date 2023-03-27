package HomeWork_2;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
public class HW_Task_1 {
    public static void main(String[] args) {
        int [] mas = {20, 1, 114, 65, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
                
            }
            Logo(mas);
        }
        
        System.out.println(Arrays.toString(mas));
    }
    public static void Logo(int[] arr){     // Записываем логи
        try{
            Logger logger = Logger.getLogger(HW_Task_1.class.getName());
            logger.setLevel(Level.INFO);
            FileHandler fh = new FileHandler("log.xml", true);
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);

            logger.info(Arrays.toString(arr));
            fh.close();

            } catch (Exception e) {
            System.out.println("Ошибка!");
            } finally {
            
            System.out.println("__________________________________");
           }
    }
}
