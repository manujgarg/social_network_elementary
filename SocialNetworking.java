import java.util.*;
import java.io.*; 
class SocialNetworkFactory{
	public static SocialNetwork getSocialNetwork(String socialNetworkName){
		SocialNetwork socialNetwork=null;
		if(socialNetworkName.equals("facebook")){
			socialNetwork=new Facebook();
			return socialNetwork;	
		}
		else if(socialNetworkName.equals("google")){
			socialNetwork=new Google();
			return socialNetwork;
		}
		else if(socialNetworkName.equals("twitter")){
			socialNetwork=new Twitter();
			return socialNetwork;
		}
		else if(socialNetworkName.equals("linkedin")){
			socialNetwork=new Linkedin();
			return socialNetwork;
		}
		else{
			return socialNetwork;
		}
	}
}
abstract class SocialNetwork{
	public String registeredUsername;
	public String registeredPassword;
	String username;
	String password;
	Scanner read=new Scanner(System.in);
	public String getUsername(){
		System.out.println("Input your username:");
		return read.nextLine();
	}
	public String getPassword(){
		System.out.println("Input your password:");
		return read.nextLine();
	}
	public abstract void logIn();
}
class Facebook extends SocialNetwork{
	public Facebook(){
		registeredUsername="facebookUsername";
		registeredPassword="facebookPassword";
	}
	public void logIn(){
		if(getUsername().equals(registeredUsername) && getPassword().equals(registeredPassword)){
			System.out.println("Dear "+registeredUsername+", you have successfully logged into facebook");
		}
		else{
			System.out.println("Please check your username and password");
		}
	}
}
class Google extends SocialNetwork{
	public Google(){
		registeredUsername="googleUsername";
		registeredPassword="googlePassword";
	}
	public void logIn(){
		if(getUsername().equals(registeredUsername) && getPassword().equals(registeredPassword)){
			System.out.println("Dear "+registeredUsername+", you have successfully logged into google");
		}
		else{
			System.out.println("Please check your username and password");
		}
	}
}
class Twitter extends SocialNetwork{
	public Twitter(){
		registeredUsername="twitterUsername";
		registeredPassword="twitterPassword";
	}
	public void logIn(){
		if(getUsername().equals(registeredUsername) && getPassword().equals(registeredPassword)){
			System.out.println("Dear "+registeredUsername+", you have successfully logged into twitter");
		}
		else{
			System.out.println("Please check your username and password");
		}
	}
}
class Linkedin extends SocialNetwork{
	public Linkedin(){
		registeredUsername="linkedinUsername";
		registeredPassword="linkedinPassword";
	}
	public void logIn(){
		if(getUsername().equals(registeredUsername) && getPassword().equals(registeredPassword)){
			System.out.println("Dear "+registeredUsername+", you have successfully logged into linkedin");
		}
		else{
			System.out.println("Please check your username and password");
		}
	}
}

public class SocialNetworking {
	public static SocialNetwork login(String social_network_name){
		SocialNetwork newSocialNetwork=SocialNetworkFactory.getSocialNetwork(social_network_name);
		return newSocialNetwork;
	}
	public static void main (String args[]) {
		SocialNetwork fb=login("google");
		fb.logIn();
	}
}

