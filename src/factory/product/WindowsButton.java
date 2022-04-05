package factory.product;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Windows click Button");

    }

    @Override
    public void clickUp() {
        System.out.println("Windows clickUp button");
    }
}
