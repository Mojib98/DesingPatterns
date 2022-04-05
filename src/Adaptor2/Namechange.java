package Adaptor2;

public class Namechange  extends Name implements showName {
    public Namechange(String name) {
        super(name);
    }

    public Namechange() {

    }

    @Override
    public void showWithStar() {
        System.out.println("name="+ "**********"+ getName());
    }
}
