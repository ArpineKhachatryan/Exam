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


}



