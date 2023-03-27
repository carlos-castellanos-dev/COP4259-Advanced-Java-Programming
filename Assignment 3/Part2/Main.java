import java.io.*;
import java.util.*;

public class Main	{

    public static void diff(String filename1, String filename2){
        HashSet<String> set1 = new HashSet<String>();   
        HashSet<String> set2 = new HashSet<String>();   
        HashSet<String> set3 = new HashSet<String>();   
        
        try{                                        
            Scanner sc1 = new Scanner(new File(filename1)); 
            Scanner sc2 = new Scanner(new File(filename2)); 
            while(sc1.hasNext()){               
                set1.add(sc1.next().toLowerCase()); 
            }
            while(sc2.hasNext()){             
                set2.add(sc2.next().toLowerCase()); 
            }
            set3.addAll(set1);              
            set3.removeAll(set2);        
            PrintWriter pw = new PrintWriter("out.txt");    
            for(String s: set3){        
                pw.println(s);      
            }
            pw.close();               
        }catch(Exception e){      
            System.out.println(e);  
        }
    }

    public static void main(String[] args) 	{ 
        diff("input.txt", "out.txt"); 
    }
}
