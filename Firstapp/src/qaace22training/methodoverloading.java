package qaace22training;


		// TODO Auto-generated method stub
		import java.util.Scanner;
		
		public class methodoverloading {



		 
		    private void display(int a,int b,int c,int d,int e,int f){
		        int sum=a+b+c+d+e+f;
		        System.out.println("Sum of 6 numbers: " + sum);



		    }
		    private void display(String name){
		        System.out.println("Student Name: " + name);
	 
		    }
		    public void main(String[] args) {



		      
		        methodoverloading overload=new methodoverloading();




		        overload.display(70,90,40, 10, 30, 20);
		        overload.display("Lee Jong Suk");



		    }







		}

	}

}
