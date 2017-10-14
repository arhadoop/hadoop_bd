
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TheirClass {

    public static void main (String args[]){
        File file = new File("C:\\emp_salary.dat");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        int sumD1=0;
        int sumD2, sumD3, sumD4, sumD5, sumD6, sumD7, min,max=0;
        String patternString = "|";
        String endOfLine="";
        String department="";
        try {

            fis = new FileInputStream(file);
            // Here BufferedInputStream is added for fast reading.
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            // dis.available() returns 0 if the file does not have more lines.
            String[] fields;
            while (dis.available() != 0) {


                String linesalary = dis.readLine();
                fields = linesalary.split("\\|")  ;
                System.out.println("key:" + fields[0] + "value:" + fields[2]);

            }

            // dispose all the resources after using them.
            fis.close();
            bis.close();
            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
