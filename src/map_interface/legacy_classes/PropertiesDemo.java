package map_interface.legacy_classes;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {


    public static void main(String[] args)  {

        try {


            Properties p = new Properties();
            /*FileWriter f=new FileWriter("myfile.properties");
            BufferedWriter bf=new BufferedWriter(f);
            System.out.println(bf);*/

            FileReader fr=new FileReader("myfile.properties");
            BufferedReader bw=new BufferedReader(fr);
            System.out.println(bw);

            p.load(bw);
            System.out.println(p); // {password=saketkumar, user=saket}

            String s=p.getProperty("user");
            System.out.println(s); // saket

            System.out.println(p.setProperty("user","kumar"));
            System.out.println();

            Enumeration e=p.propertyNames();
            while (e.hasMoreElements()){
                String s1=(String) e.nextElement();
                System.out.println(s1);
            }

            FileWriter fw=new FileWriter("myfile.properties");
            BufferedWriter bw2=new BufferedWriter(fw);

            p.store(bw2,"this change is done by saket kumar keshri");






        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
