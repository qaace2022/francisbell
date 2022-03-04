import java.io.File;

import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AdminActions {

	public static void main(String[] args) throws Exception {
		Scanner f = new Scanner(System.in);
		System.out.println("Hey/annyeong admin");
		for (int i = 1; i <= 5;) {
			System.out.println(
					"1. view all customer data \n 2. add new customer \n 3. new debitcard issue \n 4. view blocked debit cards \n 5. blocked debitcards");
			int ch;
			ch = f.nextInt();
			switch (ch) {
			case 1:
				ObjectMapper f1 = new ObjectMapper();
				Bank The = f1.readValue(new File("data/bank.json"), Bank.class);

				for (Customers c : The.getCustomers()) {
					System.out.println("Customer Id: " + c.getId());

					System.out.println("Customer Name: " + c.getName());

					System.out.println("Customer Cards Count: " + c.getCards().size());
					for (Cards d : c.getCards()) {
						System.out.println(d.getCardNum());
						System.out.println(d.getBalance());
						System.out.println(d.isActive());
						break;

					}

				}

			case 2:
				ObjectMapper f3 = new ObjectMapper();
				Bank The2 = f3.readValue(new File("data/bank.json"), Bank.class);
				for (Customers RM : The2.getCustomers()) {
					Customers RM1 = new Customers();
					System.out.println("New Customer Id");
					RM1.setId(f.nextInt());
					System.out.println("New Customer Name");
					RM1.setName(f.next());
					Customers.add(RM);
				}
				break;

			case 3:
				break;
			case 4:
				ObjectMapper f2 = new ObjectMapper();
				Bank The1 = f2.readValue(new File("data/bank.json"), Bank.class);

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
			case 5:
				ObjectMapper f4 = new ObjectMapper();
				Bank The3 = f4.readValue(new File("data/bank.json"), Bank.class);
				for (Customers J : The3.getCustomers()) {
					for (Cards SG : J.getCards()) {
						System.out.println(SG.isActive());
					}
				}

				break;

			}
			i++;

		}
		f.close();

	}
}
