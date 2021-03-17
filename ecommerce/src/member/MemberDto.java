package member;

import java.sql.Date;

/*
 	Dto = "Data Transfer Object":
 	----------------------------
 -->	This Class will have Instance Variables according to columns in Database Table.
 --->									AND
 --->			Overloaded Constructor & Empty Constructor.
 	
 */
public class MemberDto {
	private String uname, password, email;
	private long phone;
	private java.sql.Date  dob, dor;
	private String  mlevel;

	public MemberDto() {
		super();
	}

	public MemberDto(String uname, String password, String email, long phone, Date dob, Date dor, String mlevel) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.dor = dor;
		this.mlevel = mlevel;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public java.sql.Date getDob() {
		return dob;
	}

	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}

	public java.sql.Date getDor() {
		return dor;
	}

	public void setDor(java.sql.Date dor) {
		this.dor = dor;
	}

	public String getMlevel() {
		return mlevel;
	}

	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}
	

}