package qaace22training;

public class largestandsmallestelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			  //numbers array
			  int numbers[] = new int[]{55,32,45,98,100,82,2,11,9,39,50};

			  //assign first element of an array to largest and smallest
			  int smallest = numbers[0];
			  int largetst = numbers[0];

			  for (int i = 0; i < numbers.length; i++) {
			   if (numbers[i] > largetst)
			    largetst = numbers[i];
			   else if (numbers[i] < smallest)
			    smallest = numbers[i];
			  }

			  System.out.println("Largest Number is : " + largetst);
			  System.out.println("Smallest Number is : " + smallest);
			 }
			

	}


