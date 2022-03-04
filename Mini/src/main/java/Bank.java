import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bank {
	
	 Admin admin;
	 String BankName;
	 List<Customers> Customers;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public List<Customers> getCustomers() {
		return Customers;
	}
	public void setCustomers(List<Customers> customers) {
		Customers = customers;
	}
	
	
	
	
	
	
	
	

}
