//Importing from library
import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup {
	protected ArrayList<User> M_userList;
	//Constructor to initalise the ArrayList
	public UserGroup() {
		M_userList = new ArrayList<User>();
	}
	//Function to add Sample Data
	public void addSampleData() {
		for(int i = 0; i<10; i++) {
			addUser("username" + Integer.toString(i),"user","name");
		}
	}
  //Function to add user
	public void addUser(String P_username, String P_userType, String P_name) {
		User user = new User(P_username, P_userType, P_name);
		M_userList.add(user);

	}
//Overloaded function to add user according to parameters provided
	public void addUser(User P_user) {
		M_userList.add(P_user);

	}
	//Function to return the size of the user list
	public int getUserCount () {
    		return M_userList.size() - 1;
	}
	//Function to get a perticular user from the user list
	public User getUser(int P_position) {
		return M_userList.get(P_position);
	}
//Function to print the name of all the users
	public void printUsernames() {
		for(User i : M_userList)
			System.out.println(i.getUsername() + " " + i.getUserType());
	}
//Function to pop the 1st user from the array list
	public void removeFirstUser() {
		M_userList.remove(0);
	}
//Function to pop the last user from the array list
	public void removeLastUser() {
		M_userList.remove(M_userList.size()-1);
	}
//Function to iterate through the array list to remove a perticular user
	public void removeUser(String P_username) {
		Iterator<User> users = M_userList.iterator();

		while(users.hasNext())
			if(users.next().getUsername().equals(P_username))
				users.remove();
	}
//Function to initalise the iterator
	public Iterator getUserIterator() {
		return M_userList.iterator();
	}


}
