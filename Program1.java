/*Create an interface called "User" that defines the basic properties of a user such as the name, email, and password.
Create two classes that implement the "User" interface: "RegularUser" and "AdminUser". "RegularUser" should have basic access to the social media platform while "AdminUser" should have additional privileges such as managing user accounts and posts.
Create a class called "Profile" that stores the user profiles and handles the creation and deletion of profiles.
Implement methods in the "Profile" class to search for profiles by name or email, and to update profile information.
Create a class called "Post" that stores the user posts and handles the creation and deletion of posts.
Implement methods in the "Post" class to search for posts by user or content, and to update post information.
Use custom exceptions to handle cases such as duplicate user profiles or invalid user information.*/
    public interface User {
    public String getName();
    public String getEmail();
    public String getPassword();
}

public class RegularUser implements User {
    private String name;
    private String email;
    private String password;

    public RegularUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

public class AdminUser implements User {
    private String name;
    private String email;
    private String password;

    public AdminUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
}
public class Profile{
  private List<User> p;
  public Profile(){
    p=new ArrayList<User>();
  }
  public void createProfile(User u)
    throws DuplicateProfileException{
      if(p.contains(u)){
        throw new DuplicateProfileException();
      }
      else{
        p.add(u);
      }
    }
  public void deleteProfile(User u){
    p.remove(u);
  }
  public List<User>searchByName(String name){
    List<User> r=new ArrayL
  }
  }
}