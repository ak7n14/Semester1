public class User {
	protected String M_username;
	protected String M_userType;	//To declare type user editor or an admin
	protected String M_name;
	//Constructor to initialise the values
	public User (String P_username, String P_userType, String P_name) {
		M_username = P_username;
		M_userType = P_userType;
		M_name 	   = P_name;
	}
	//Overloaded Constructor to get values from users and initalise it
	public User (User P_user) {
		M_username = P_user.getUsername();
		M_userType = P_user.getUserType();
		M_name 	   = P_user.getName();
	}
	//Function to Get the Username
	public String getUsername() {
		return M_username;
	}
 //Function to get the user Type
	public String getUserType() {
		return M_userType;
	}
//Function to get the name
	public String getName() {
		return M_name;
	}
//Function to set the user type
	public void setUserType(String P_userType) {
		M_userType = P_userType;
	}
}
