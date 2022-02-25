package qaace22training;

public class ReturnMultipleValues {
	
	final class Person



	{

	    public String name;
	    public int age;
	    public char gender;

	    public Person(String name, int age, char gender)


	    {



	        this.name = name;
	        this.age = age;
	     this.gender = gender;

	    }



	}
	public class ReturnMultipleValue {


	   public  Person getDetails()

	   {	      

	                String name = "Tzuyu";

	        int age = 22;
	        char gender = 'F';
	        return new Person(name, age, gender);


	    }

	    public void main(String[] args)



	    {
	        Person person = getDetails();

	        System.out.println("Name is " + person.name);
	        System.out.println("Age is " + person.age);
	        System.out.println("Gender is " + person.gender);



	    }
	    
	}
	}



	