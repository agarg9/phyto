package spring;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {
	private static List users;
	{
	users=new ArrayList();
	users.add(new User("Anki@ca.c","pass"));
	users.add(new User("Ank@nc.su","pa"));
	users.add(new User("Ankit@ncsu.edu","password"));
	}

}
