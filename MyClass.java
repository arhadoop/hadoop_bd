
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MyClass {

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
       while (dis.available() != 0) {


        String linesalary = dis.readLine();


        department= linesalary.substring(0,2);



        switch (department) {
               case "D1":
                   System.out.println(department);
                   System.out.println("min=" + linesalary.lastIndexOf(patternString));
                   min= linesalary.lastIndexOf(patternString);
                   System.out.println("max=" + linesalary.lastIndexOf(endOfLine));
                   max= linesalary.lastIndexOf(endOfLine);
                   System.out.println(linesalary.substring(min,max));
                   String value= linesalary.substring(min,max);
                 //  sumD1= ((Integer)value).intValue() + sumD1;

                   break;
               case "D2":
                   break;
               case  "D3":
                   break;
               case  "D4":
                   break;
               case  "D5":
                   break;
               case  "D6":
                   break;
               case  "D7":
                   break;

           }



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

    System.out.println("Sum D1" +  sumD1);
    }
}
