package qaace22training;

public class reversethedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 99887766;
		String str = String.valueOf(number);
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		number = Integer.parseInt(builder.toString());
		System.out.println(number);

	}

}
