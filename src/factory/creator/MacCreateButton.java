package factory.creator;

import factory.product.Button;
import factory.product.MacButton;

public class MacCreateButton implements ButtonCreator {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
