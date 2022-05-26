import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        User user = new User();
        User[] userList = new User[]{};





    }

    public static void welcomeUser(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        User[] currentUsersList = new User[]{};

        User[] userList = new User[]{};


        while (true) {
            System.out.println("Press\n1.Register\n2.Sign in \n3.To write post\n4. Exit");
            int temp = scanner.nextInt();
            switch (temp) {
                case 1:
                    User.userAddToArray();
                    break;
                case 2:

                    break;
                case 3:

                case 5:
                    return;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choic");
            }
        }
    }
}
