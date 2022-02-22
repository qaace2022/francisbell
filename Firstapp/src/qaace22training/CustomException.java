package qaace22training;



class maxlimitreached extends Exception{

	public maxlimitreached(String str) {

		super(str);

	}

}

public class CustomException {

	static int count;

	public CustomException()   

	{

		count++;

	}

	static void Maximum(int count) throws maxlimitreached{

		if(count>3) {

			throw new maxlimitreached("More than maximum limit");

		}

		else {

			System.out.println("Total Number of Objects:" + count);

		}

	}



	public static void main(String[] args) {

		CustomException ob1 = new CustomException();

		CustomException ob2 = new CustomException();

		CustomException ob3 = new CustomException();

		CustomException ob4 = new CustomException();

		CustomException ob5 = new CustomException();

		CustomException ob6 = new CustomException();

		CustomException ob7 = new CustomException();

		try {

			Maximum(count);

		}

		catch(maxlimitreached ex) {

			System.out.println(ex.getMessage());

		}

	}

}


