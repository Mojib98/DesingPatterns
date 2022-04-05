package AbsetractFactory.creator;

import AbsetractFactory.Product.Button1;
import AbsetractFactory.Product.CheckBux;
import AbsetractFactory.Product.MacButton;
import AbsetractFactory.Product.MacCheckBox;

public class MacGui implements GuieeButton{
    @Override
    public Button1 button() {
        return new MacButton();
    }

    @Override
    public CheckBux checkBox() {
        return new MacCheckBox();
    }
}
