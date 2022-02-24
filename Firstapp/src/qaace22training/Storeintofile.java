package qaace22training;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Storeintofile {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String v;
		Scanner TH = new Scanner(System.in);
		System.out.println("String is Entered : ");
		v = TH.nextLine();
		
		try
		
		{
			File file = new File("/Users/francisbell.ajay/Documents/Java/j.txt");
			FileWriter k=new FileWriter(file);
            k.write(v);
            k.close();
        } 
		catch (IOException e)
        {
        e.printStackTrace();
        }
		
		
		TH.close();





	}

}
