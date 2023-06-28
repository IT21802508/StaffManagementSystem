package com.Userprofile;

public class permenantStaff extends Staff {
	
	
	
	
	
	private String position;
	
	

			public permenantStaff(int id, String name, String address, String email, String contactno, String emergencyno, String doj,
					String jobtitle, String status, String department,String position) {
				super(id,name,address,email,contactno,emergencyno,doj,jobtitle,status,department);
				this.id = id;
				this.name = name;
				this.address = address;
				this.email = email;
				this.contactno = contactno;
				this.emergencyno = emergencyno;
				this.doj = doj;
				this.jobtitle = jobtitle;
				this.status = status;
				this.department = department;
				
				
				 
				
			}

}
