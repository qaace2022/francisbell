import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customers {
	int id;
	String name;
	List<Cards> cards;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Cards> getCards() {
		return cards;
	}
	public void setCards(List<Cards> cards) {
		this.cards = cards;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void f(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	public static void add(Customers rM) {
		// TODO Auto-generated method stub
		
	}
	

}
