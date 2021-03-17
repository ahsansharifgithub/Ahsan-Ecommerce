package member;

import java.sql.Connection;

import javax.servlet.ServletContext;

import db.DatabaseManager;



/*
							BO= "Business-Login Class": 
						--------------------------------------
 			---> This is an entry point from Jsp Page:
 */
public class MemberBo {
	 
		private ServletContext context;

		
	public ServletContext getContext() {
			return context;
		}

		public void setContext(ServletContext context) {
			this.context = context;
		}

	public String insert(MemberForm mForm) {
		// We need to convert the [MemberForm Object TO MemberDto Object]
			
		MemberDto mDto=formToDto(mForm);
		
		MemberDao mDao=new MemberDaoImpl(getConnection()); //Animal a=new Dog(); //Advantage: Code de-coupling
		String result=mDao.insert(mDto);    //  a.eat();
											//  a.new Cat();
											//	a.eat();
		
		return result;
	}

	public MemberDto formToDto(MemberForm mForm)

	/*
	 * --->The above Function is taking MemberForm Object as parameter and returning
	 * MemberDto Type Object.
	 */

	{

		java.sql.Date dob = null;
		java.sql.Date dor = null;

		MemberDto mDto = new MemberDto(mForm.getUname(), mForm.getPassword(), mForm.getEmail(),
				Long.parseLong(mForm.getPhone()), dob, dor, "m1");
		return mDto;

	}
	
	public Connection getConnection()
	{
		String dburl=(String)context.getAttribute("dburl");
		String dbuname=(String)context.getAttribute("dbuname");
		String dbpassword=(String)context.getAttribute("dbpassword");
		
		Connection con=DatabaseManager.getConnection(dburl, dbuname, dbpassword);
		
		return con;
		
	}
}