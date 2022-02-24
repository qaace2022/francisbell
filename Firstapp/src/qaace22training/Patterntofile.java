package qaace22training;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Patterntofile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 try {
			 FileWriter TH = new FileWriter("/Users/francisbell.ajay/Documents/Java/k.txt");
			 PrintWriter SU = new PrintWriter(TH);
			     int i, j,n=4;
			     for(i=0; i<n; i++)
			     
			 {
			    	 for(j=0; j<=i; j++)

	                {
			    		 SU.print("* ");

	                }
			    	 SU.println();

	            }
			     SU.close();

	        }
		       catch (IOException R) {
		    	   R.printStackTrace();

	        }

	    }

	}


