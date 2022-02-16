package qaace22training;

import java.util.Arrays;

public class sumandproductofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {22,33,44,55,66,77};
        int sum = 0, product = 1;
        for(int x: arr){
        sum += x;
        product *= x;



		}
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);



		}

	}


