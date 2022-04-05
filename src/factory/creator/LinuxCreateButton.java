package factory.creator;

import factory.product.Button;
import factory.product.HtmlButton;

public class LinuxCreateButton implements ButtonCreator {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
