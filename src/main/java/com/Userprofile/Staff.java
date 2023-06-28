package com.Userprofile;



public class Staff {
	
	
	
	protected int id ;
	protected String name;
	protected String address;
	protected String email;
	protected String contactno;
	protected String emergencyno; 
	protected String doj;
	protected String jobtitle;
	protected String status;
	protected String department;
	
	
	
	
	
	public Staff(int id, String name, String address, String email, String contactno, String emergencyno, String doj,
			String jobtitle, String status, String department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactno = contactno;
		this.emergencyno = emergencyno;
		this.doj = doj;
		this.jobtitle = jobtitle;
		this.status = status;
		this.department = department;   //initializing the staff's attributes
		
		
		 
		
		
		
	}





	public int getId() {
		return id;           //set getters
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;                   //set mutators
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getContactno() {
		return contactno;
	}





	public void setContactno(String contactno) {
		this.contactno = contactno;
	}





	public String getEmergencyno() {
		return emergencyno;
	}





	public void setEmergencyno(String emergencyno) {
		this.emergencyno = emergencyno;
	}





	public String getDoj() {
		return doj;
	}





	public void setDoj(String doj) {
		this.doj = doj;
	}





	public String getJobtitle() {
		return jobtitle;
	}





	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}





	public String getDepartment() {
		return department;
	}





	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
