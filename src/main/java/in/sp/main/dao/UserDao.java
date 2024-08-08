package in.sp.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.User;





@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertUser(User user)
	{
		boolean status = false;
		
		try {
			String INSERT_SQL_QUERY = "INSERT INTO users(name, email, gender,city) VALUES(?,?,?)";
			int count = jdbcTemplate.update(INSERT_SQL_QUERY, user.getUsername(), user.getEmail(),user.getGender(), user.getLocation());
			if(count>0)
			{
				status  = true;
			}
			else 
			{
				status = false;
			}
			
		} catch (Exception e) {
			status= false;
			e.printStackTrace();
		}
		return status;
	}
	
	
	
	

}
