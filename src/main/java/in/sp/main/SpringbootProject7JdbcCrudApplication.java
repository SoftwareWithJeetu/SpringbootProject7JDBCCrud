package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import in.sp.main.dao.UserDao;

@SpringBootApplication
public class SpringbootProject7JdbcCrudApplication implements CommandLineRunner {
	
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject7JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("keep","keep@gmail.com","male","bihar");
		boolean status = userDao.insertUser(user1);
		if(status) {
			System.out.println("User inserted successfully");
		}else {
			System.out.println("User not inserted due to some error");
		}
	}
	}
	

