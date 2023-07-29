package demo.notification.domain;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String name;
	private String email;
	private String mobile;
	private String PAN;
	private String AADHAR;
	private int residentialStatus;
	private Date creationDate;
	private Date modificationDate;
	//private Address address;
	
	
}
