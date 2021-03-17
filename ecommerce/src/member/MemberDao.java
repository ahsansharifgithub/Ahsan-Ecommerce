package member;
/*
	Dao = "Data Access Object":
	---------------------------
---> It contains just "Function Declarations" for Database.
						
---> Generally all "Queries" for DataBase is Declared here"
 */
public interface MemberDao
{
	
	public String insert(MemberDto mDto);
	
	
}
