package DependanciesPro.DevlopePro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class User 
{
	private static List<User> users = new ArrayList<>();

	private static int usersCount = 3;

	static 
	{
		users.add(new User(1, "Atchu", new Date()));
		users.add(new User(2, "Ishu", new Date()));
		users.add(new User(3, "Iniya", new Date()));
	}

	public User(int i, String string, Date date) {
		// TODO Auto-generated constructor stub
	}

	public List<User> findAll() 
	{
		return users;
	}

	public User save(User user) 
	{
		if (user.getId() == null) 
		{
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	

	private void setId(int i) {
		// TODO Auto-generated method stub
		
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findOne(Object id) 
	{
		for (User user : users) 
		{
			if (user.getId() == id) 
			{
				return user;
			}
		}
		return null;
	}

	

}



