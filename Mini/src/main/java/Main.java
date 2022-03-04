import java.io.File;
import java.util.*;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner f = new Scanner(System.in);
		System.out.println("Select user type");
		System.out.println("1. Admin\n2. Customer");
		int ch;
		ch = f.nextInt();
		switch (ch) {
		case 1:
			ObjectMapper om = new ObjectMapper();
			Bank f1 = om.readValue(new File("Data/bank.json"), Bank.class);
			String ad1, ad2, ad3, ad4;
			ad3 = f1.getAdmin().username;
			ad4 = f1.getAdmin().password;
			System.out.println("username");
			ad1 = f.next();
			System.out.println("password");
			ad2 = f.next();
			if (ad1.contentEquals(ad3) && ad2.contentEquals(ad4)) {
				AdminActions.main(args);
			} else {
				System.out.println("enter valid data");

			}

			break;
		case 2:

			CustomerActions.main(args);

			break;
		default:
			System.out.println("valid data");
			break;
		}

	}

}
