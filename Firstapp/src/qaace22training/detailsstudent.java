package qaace22training;

import java.util.Scanner;

public class detailsstudent {
	
	public class StudentDetails {



		public void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name of student: ");
		String n = in.nextLine();
		System.out.print("Enter roll no of student: ");
		int r = in.nextInt();
		System.out.print("Enter marks in 1st subject: ");
		int m1 = in.nextInt();
		System.out.print("Enter marks in 2nd subject: ");
		int m2 = in.nextInt();
		System.out.print("Enter marks in 3rd subject: ");
		int m3 = in.nextInt();
		System.out.print("Enter marks in 4th subject: ");
		int m4 = in.nextInt();
		System.out.print("Enter marks in 5th subject: ");
		int m5 = in.nextInt();
		int t= m1+m2+m3+m4+m5;
		double p = t /500.0*100.0;
		System.out.println("name= "+n);
		System.out.println("roll num="+r);
		System.out.println("Total Marks = "+t);
		System.out.println("Percentage = "+p);
		in.close();
		}



		}

}
