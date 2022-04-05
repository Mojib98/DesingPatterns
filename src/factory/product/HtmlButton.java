package factory.product;

public class HtmlButton implements Button {
    @Override
    public void click() {
        System.out.println("Html button click");
    }

    @Override
    public void clickUp() {
        System.out.println("html button clickUp");
    }
}
