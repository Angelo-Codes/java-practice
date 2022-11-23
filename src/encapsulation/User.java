package encapsulation;

public class User {
    
    private int userID;
    private String userName;
    private String firstName, lastName;

    User(int userID, String userName, String firstName, String lastName){
        this.userID = userID;
        this.userName = userName;
        this.firstName = userName;
        this.lastName = lastName;
    }

    // setters
    void setUserID(int userID){
        this.userID = userID;
    }

    int getUserId(){
        return userID;
    }
}
