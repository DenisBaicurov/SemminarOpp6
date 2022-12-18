public class NameOutput {

    private User user;

    public NameOutput(User user) {
        this.user = user;
    }

    public void report(){
        System.out.println("Имя пользователя " + user.getName());
    }


}
