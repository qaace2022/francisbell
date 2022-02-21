package qaace22training;

	class Addition{
	    int c;
	    Addition(int a,int b){
	        c=a+b;
	    }
	}
	class Sub{
	    int c;

	    Sub(int a,int b){

	        c=a-b;

	    }

	}

	class Mult
	{

	    int c;

	    Mult(int a,int b){

	        c=a*b;

	    }

	}

	class Div{

	    int c;

	    Div(int a,int b){

	        c=a/b;

	    }

	}

	public class calculator {

	    public static void main(String[] args) 
	    {

	      

	        Addition add = new Addition(20,30);

	        System.out.println("Addition = "+add.c);

	        Sub sub = new Sub(40,50);

	        System.out.println("Subtraction ="+sub.c);

	        Mult mult = new Mult(60,70);

	        System.out.println("Multiplication ="+mult.c);

	        Div div = new Div(80,90);

	        System.out.println("Division ="+div.c);

	    }

	}


