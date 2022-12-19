package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private String name;
	private String email;
	private Date birthDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String birthDate = formatter.format(this.birthDate);
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
