package qaace22training;




class display implements Runnable {

	public void run() {

		for(int i=1;i<=6;i++) {

			System.out.println("fantastic5 neomu neomu chuvahaeyo");

			try {

				Thread.sleep(3500);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}




		}

	}

}



class view extends Thread {


	public void run() {

		String[] s = {"Jeon","KV","Ajith","GC","brilliant"};

		for(int i=0;i<5;i++) {

			System.out.println(" Name :"+s[i]);

			try {

				Thread.sleep(3500);

			} catch (InterruptedException e) {


				e.printStackTrace();


			}

		}

	}

}

public class runablethreadexample {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Thread v = new view();

		v.start();

		Runnable d = new display();

		Thread t1 = new Thread(d);

		t1.start();

	}

}


