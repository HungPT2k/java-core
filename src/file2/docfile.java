package file2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class docfile{

    public static void main(String[] args) {
        BufferedReader b=null;

        List<String> list=new ArrayList<>();
        try{
            b=new BufferedReader(new FileReader("src/file2/In.txt"));
           // String file = "src/File/Out1.txt";
          //  PrintWriter p = new PrintWriter(file);
          //  ArrayList<String> list=new ArrayList<>();
            String line=null,st,li=null;
            while((line=b.readLine())!=null){
                line=line.trim().toLowerCase();
                line = line.replaceAll("\\s+", " ");
                String[] temp= line.split(" ");

                st="";
                for(int i=0;i<temp.length;i++) {
                    st+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                    if(i<temp.length-1)
                        st+=" ";
                }
                list.add(st);
            }
            b.close();
           // p.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);}
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                String[] ten1=o1.split("\\s+");
                String[] ten2=o2.split("\\s+");
                if(o1.equalsIgnoreCase(o2))
                    return o1.compareToIgnoreCase(o2);
                else
                    return ten1[ten1.length-1].compareTo(ten2[ten2.length-1]);
            }
        });
        for(String i:list){
            System.out.println(i);
        }
    }

}

