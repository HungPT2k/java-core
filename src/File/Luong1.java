package File;

import java.io.*;

public class Luong1{

    public static void main(String[] args) {
        BufferedReader b=null;
        try{
            b=new BufferedReader(new FileReader("src/File/In1.txt"));
            String file = "src/File/Out1.txt";
            PrintWriter p = new PrintWriter(file);
            String line=null;
            while((line=b.readLine())!=null){
                String w[]=line.split("[;]");
                int x=0,y=0;
                float z=0;
                w[2]=w[2].trim();
                w[3]=w[3].trim();
                w[4]=w[4].trim();
                x=Integer.valueOf(w[2]);
                y=Integer.valueOf(w[3]);
                z=Float.valueOf(w[4]);
                Float s;
                s=(x*y)*(1-z);
                p.println(w[0]+"; "+w[1]+"; "+s);
            }
            b.close();
            p.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);}

    }
}
