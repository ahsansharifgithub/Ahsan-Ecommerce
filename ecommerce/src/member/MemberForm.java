package member;
/*Java Bean = Java Bean is a simple Java Class with an empty Constructor, And public getter&setter methods()
------------ 	of all the private Instance Variables.
				This is a UI Class, and it will have Instance Variables according to (Fields in JSP Page).
																						----------------
*/
public class MemberForm 
{
		private String uname,password,email,phone,dd,mm,yy;

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

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getDd() {
			return dd;
		}

		public void setDd(String dd) {
			this.dd = dd;
		}

		public String getMm() {
			return mm;
		}

		public void setMm(String mm) {
			this.mm = mm;
		}

		public String getYy() {
			return yy;
		}

		public void setYy(String yy) {
			this.yy = yy;
		}
		
		
}
