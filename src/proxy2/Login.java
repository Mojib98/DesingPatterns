package proxy2;

public class Login implements Access{
    private String name;

    public Login(String name) {
        this.name = name;
    }

    @Override
    public void getAccess() {
        System.out.println("\t\tWelcome: "+name+"\n\t\t you can Access");
    }
}
