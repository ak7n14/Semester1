import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main (String[] args) {
		int value;
		int i;

		Toolbox myToolbox = new Toolbox();



		System.out.println("Please enter the times table that you want.");
		value = myToolbox.readIntegerFromCmd();

		for (i = 1; i<21; i++)
			System.out.println(i + " x " + value + " = " + i*value);


		value = 0;
		i = 0;
		while(value<501) {
			i++;
			value = value + i;
		}
		System.out.println(i + " iterations were made.");


		UserGroup group = new UserGroup();
		System.out.println("Created user group - group");

		group.addSampleData();
		System.out.println("Sample data added to user group - group");

		System.out.println("*** User group - group ***");
		group.printUsernames();
		System.out.println("**************************");


		// Testing UserGroup
		System.out.println();
		group.removeFirstUser();
		System.out.println("First user removed from user group - group");
		group.removeLastUser();
		System.out.println("Last user removed from user group - group");

		group.removeUser("username5");
		System.out.println("User 'username5' removed from user group - group");

		System.out.println("*** User group - group ***");
		group.printUsernames();
		System.out.println("**************************");

		//Making user 2 and 8 admin
		System.out.println("Making 'username2' and 'username8' admins");
		group.getUser(1).setUserType("admin");
		group.getUser(6).setUserType("admin");

		
		System.out.println();
		UserGroup administrators = new UserGroup();
		System.out.println("Created user group - administrators");

		Iterator<User> users = group.getUserIterator();

		while(users.hasNext()){
			User tempUser = new User(users.next());
			if(tempUser.getUserType().equals("admin"))
				administrators.addUser(tempUser);
		}
		administrators.addUser(group.getUser(3));
		administrators.getUser(2).setUserType("admin");
		System.out.println("Added administrator users from 'group' to 'administrators'");

		System.out.println("*** User group - group ***");
		administrators.printUsernames();
		System.out.println("**************************");

		System.out.println();
		System.out.println("Demoting 'username8' to 'user'");
		administrators.getUser(administrators.getUserCount()).setUserType("user");

		//inconsistency cause due to user ‘username8’ becoming user in administrator group but still admin in other group

		//solved by passing reference and not the instance

		System.out.println("group --");
		group.printUsernames();
		System.out.println();
		System.out.println("administrators --");
		administrators.printUsernames();
	}
}
