
package tubesentahapa;


public class User {
    static String userId;
    static String password;
    static Boolean statuslogin;
    
    public void setUserid(String input){
        userId = input;
    }
    public void setPassword(String input){
        password = input;
    }
    public void setstatuslogin(Boolean input){
        statuslogin = input;
    }
    public String getUserid(){
        return userId;
    }
    public String getPassword(){
        return password;
    }
    public Boolean getstatusLogin(){
        return statuslogin;
    }
    public User(String user, String password, Boolean login){
        setUserid(user);
        setPassword(password);
        setstatuslogin(login);
    }
}
