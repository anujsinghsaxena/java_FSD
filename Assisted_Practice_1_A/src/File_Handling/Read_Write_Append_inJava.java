package File_Handling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Read_Write_Append_inJava
{
    public static void main(String args[]) throws FileNotFoundException, IOException {
        System.out.println("Select One Of The Following Below Option");
        System.out.println(" w for write ");
        System.out.println(" r for read ");
        System.out.println(" a for append ");
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        if(s.equalsIgnoreCase("r"))
        {
            new FReading();
        }
        else if(s.equalsIgnoreCase("w")||s.equalsIgnoreCase("a"))
        {
            writingToFile(s);     
        }
        else
        {
            System.out.println("Sorry you try to do unexpected ,betterluck next time ");
        }
        in.close();   
    }
    public static void writingToFile(String s)
    {
        Scanner in=null;
        try
        {
            String source = "";
            File f=new File("file1.txt");
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            FileWriter f0 =null;
            if(s.equalsIgnoreCase("w"))
            {
                f0 = new FileWriter(f,false);
                System.out.println("Write you text below ");
                in=new Scanner(System.in);
                String s1=in.nextLine();
                if(s1.equals("no"))
                System.exit(0);
                System.out.println("Write 'stop' when you finish writing file ");
                f.delete();
                f.createNewFile();
                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.write(source + System.getProperty("line.separator"));   
                }
                in.close();
            }
            //For appending the content
            else
            {  f0 = new FileWriter(f,true);
                System.out.println("Write 'stop' when you finish appending file ");
                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.append(source+ System.getProperty("line.separator"));
                }
            }
            f0.close();  
        }
        catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
        }   
    }   
}
class FReading {
    public static String str="";
    public FReading() {
        try{
            File f5=new File("file1.txt");
            if(! f5.exists())
            f5.createNewFile();
            FileReader fl=new FileReader(f5);
            BufferedReader bf=new BufferedReader(fl);
            while((str=bf.readLine())!=null){
                System.out.println(str);
            }
            fl.close();
            }catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
        }
    }
}
