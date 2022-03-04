import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomerActions {

	public static void main(String[] args) throws Exception {

		Scanner f = new Scanner(System.in);
		System.out.println("Hey/annyeong customer");
		for (int i = 1; i <= 5;) {
			System.out.println("1. check balance \n2. deposit \n3. withdraw \n4. block debit cards");
			int ch;
			ch = f.nextInt();
			switch (ch) {
			case 1:
				ObjectMapper f2 = new ObjectMapper();
				Bank The = f2.readValue(new File("Data/bank.json"), Bank.class);
				for (Customers c1 : The.getCustomers()) {
					for (Cards d : c1.getCards()) {
						int cardNum;
						int pin;
						int balance;
						cardNum = f.nextInt();
						pin = f.nextInt();
						balance = f.nextInt();
						System.out.println("Card Number: " + d.getCardNum());
						System.out.println("Enter Pin " + d.getPin());
						System.out.println("View Balance " + d.getBalance());

					}
				}

				break;
			case 2:
				ObjectMapper f3 = new ObjectMapper();
				Bank The4 = f3.readValue(new File("Data/bank.json"), Bank.class);
				for (Customers c1 : The4.getCustomers()) {
					for (Cards d : c1.getCards()) {
						System.out.println("Deposited Money");
						int deposit;
						deposit = f.nextInt();
						System.out.println("Successfully Deposited");
						System.out.println("View Balance " + d.getBalance());
					}

				}
				break;
			case 3:
				ObjectMapper f4 = new ObjectMapper();
				Bank The5 = f4.readValue(new File("Data/bank.json"), Bank.class);
				for (Customers c1 : The5.getCustomers()) {
					for (Cards d : c1.getCards()) {
						System.out.println("Withdraw Money");
						int withdraw;
						withdraw = f.nextInt();
						if (d.getBalance() >= withdraw) {
						} else {
							System.out.println("Invalid Amount");
						}

					}
				}
				break;

			case 4:
				ObjectMapper f5 = new ObjectMapper();
				Bank The1 = f5.readValue(new File("data/bank.json"), Bank.class);
				for (Customers c1 : The1.getCustomers()) {
					for (Cards d : c1.getCards()) {
						if (d.isActive() == false) {
							System.out.println(d.getCardNum());
							System.out.println(d.getPin());
							System.out.println(d.getBalance());
						}
					}
				}
				break;

			}
			i++;

		}
		f.close();
	}

}
