package driver;
import java.io.*;
import java.util.Scanner;
import util.*;

public class Test {
	public static void main(String[] args) throws IOException {  
        
		String content = new String();
		int n = 0;
		File file = new File("input.txt");
		List cl = new List();
		 try {
		Scanner sc = new Scanner(new FileInputStream(file));
		while (!sc.hasNextInt()){
		content = sc.next();
		List.add(cl,content);
		}
		n = sc.nextInt();
		sc.close();
		}catch(FileNotFoundException fnf){
		fnf.printStackTrace();
		}
		catch (Exception e) {
		e.printStackTrace();
		System.out.println("\nProgram terminated Safely...");
		}

		System.out.println("Welcome to Hot Potato!");
		System.out.println("First Person in the list has the Hot Potato!");
		System.out.println("Number of Passes: " + n);
        cl.game(n);
      
    }  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
