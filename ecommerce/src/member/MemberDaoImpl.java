package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DatabaseManager;

/* 								"We write JDBC code here":
 							---------------------------------

 */

public class MemberDaoImpl implements MemberDao
{
	private Connection con;
	
	
	public MemberDaoImpl() {
		super();
		
	}

	public MemberDaoImpl(Connection con) {
		super();
		this.con = con;
	}


	@Override
	public String insert(MemberDto mDto) 
	{
		String result="Data Entered Successfully";
		
		//will contain the jdbc code
		String sql="insert into member values(?,?,?,?,?,?,?)";
		
		PreparedStatement ps=DatabaseManager.getPreparedStatement(con, sql);
		
		try {
			ps.setString(1, mDto.getUname());
			
			ps.setString(2,mDto.getPassword());
			
			ps.setString(3, mDto.getEmail());
			
			ps.setLong(4, mDto.getPhone());
			
			ps.setDate(5, mDto.getDob());
			
			ps.setDate(6, mDto.getDor());
			
			ps.setString(7,mDto.getMlevel());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
		
			result="Data not entered Successfully";
			
			e.printStackTrace();
			
		}
		
		
		
		
		return result;
	}

}
