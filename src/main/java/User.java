import java.util.Scanner;

public class User {
    private String userName;
    private String userSurname;
    private String userPass;
    private String userPost;

    public User(String userName, String userSurname, String userPass, String userPost) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userPass = userPass;
        this.userPost = userPost;
    }
    User[] userList = new User[]{};


    public User() {

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    public static User[] registerUser(User[]usersList) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Please type your username");
        user.setUserName(scanner.next());
        System.out.println("Pleas type yor Surname");
        user.setUserSurname(scanner.next());
        System.out.println("Please set your password");
        user.setUserPass(scanner.next());


        return userAddToArray(user, usersList);
    }

    public static User[] userAddToArray(User userToAdd, User[] currentUsersList) {
        int lastElement = currentUsersList.length - 1;
        User[] output = new User[currentUsersList.length + 1];
        for (int i = 0; i < currentUsersList.length; i++) {
            output[i] = currentUsersList[i];
        }
        output[lastElement + 1] = userToAdd;
        return output;
    }



}



