package factory.creator;

import factory.product.Button;
import factory.product.WindowsButton;

public class WindowsCreateButton implements ButtonCreator {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
