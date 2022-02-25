package qaace22training;


		
		interface ROI {

		    public void IOB();

		    public void StateBank();

		    public void IndianBank();

		}

		public class bank implements ROI{

		    public void IOB() {

		        double INFO=5.5;

		        System.out.println("IOB Bank Rate Of Interest is "+INFO);

		    }

		    public void StateBank() {

		        double INFO=9.5;

		        System.out.println("StateBank Bank Rate Of Interest is "+INFO);

		    }

		    public void IndianBank() {

		        double INFO=10.25;

		        System.out.println("IndianBank Bank Rate Of Interest is "+INFO);

		    }

		    public static void main(String[]args) {

		        ROI obj = new bank();

		        obj.IOB();

		        obj.StateBank();

		        obj.IndianBank();

		    }

		

	}


