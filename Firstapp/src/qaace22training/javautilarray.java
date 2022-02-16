package qaace22training;

import java.util.Arrays;

public class javautilarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str[] = {"Rm", "Jin", "Suga", "Jhope", "Jimin", "V", "Jungkook"};
          System.out.println("Original String Array: " + Arrays.toString(str));
          System.out.println("Copied Array: " + Arrays.toString(Arrays.copyOf(str, 4)));
          System.out.println("Copied Range of Array: " + Arrays.toString(Arrays.copyOfRange(str,4,7)));
          System.out.println("The array converted to list:" + Arrays.asList(str) );
          Arrays.sort(str);
          System.out.println("Sorted Array:" + Arrays.toString(str));
          Arrays.fill(str,"Borahae");
          System.out.println("Array after call to fill:" + Arrays.toString(str));

	    }

	}


