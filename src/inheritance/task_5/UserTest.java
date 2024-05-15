package inheritance.task_5;

    public class UserTest {
        public static void main(String[] args) {
            User user = new User("12", "34");
            System.out.println(user.getLogin());
            System.out.println(user.getPassword());
            user.setPassword("gfghf");
        }
    }
