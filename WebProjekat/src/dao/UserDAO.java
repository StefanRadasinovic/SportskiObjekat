package dao;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.URL;
import javax.ws.rs.Path;

import com.google.gson.Gson;

import beans.User;
import enums.Gender;
import enums.Role;

public class UserDAO {
    
    private List<User> users=new ArrayList<User>();
    private Gson gson=new Gson();
    private String putanja;

    public UserDAO() {}
    
    public UserDAO(String contextPath) {
      //  loadUsers(contextPath);
        users.add(new User("stefan11","stefan11","Stefan","Radasinovic",Gender.MALE,"",Role.ADMINISTRATOR));
        users.add(new User("andrej11","andrej11","Andrej","Ruzic",Gender.MALE,"",Role.ADMINISTRATOR));
        putanja=contextPath;
        
    }
    public List<User> findAll() {
        return users;
    }
  
    public User findUser(String username, String password) {
        System.out.println("usao sam u fin user");
        for(User user :users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("nasao sam usera");
                return user;
            }
        }
        System.out.println("nisam nasao usera");
        return null;
    }
    public User getUserById(String id) {
        for(User user :users) {
            if(user.getUsername().equals(id)) 
                return user;
        }
        return null;
    }
  

	public void saveUser(User newUser)  {
		users.add(newUser);
		BufferedWriter writer=null;
		
		 Gson gson = new Gson();
		   String json = gson.toJson(users);  
		   System.out.println(json);
		   
		 try {
			 String s=new File("").getAbsolutePath();
			 File file = new File(s+"\\C:\\Users\\User\\Desktop\\WebProjekat\\buyers.json");
			
			
			writer = new BufferedWriter(new FileWriter(file));
			  writer.write(json);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	  
	

		
	}
}
