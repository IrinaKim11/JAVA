package HomeWork_2;
	
import java.io.*;
import java.util.ArrayList;
public class HW_Task_2 {


    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("MyFile.txt"));
        strParsing(br);

    }

    static void  strParsing ( BufferedReader br)throws Exception {

        String str;
        StringBuilder str2 = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            String arr[] = list.toArray(str.split("\""));
            for (String item : arr) {
            }
            str2.append("Студент " + arr[3] + " получил " + arr[7] + " по предмету " + arr[11] + ".\n");
        }
        System.out.println(str2);
    }
}

