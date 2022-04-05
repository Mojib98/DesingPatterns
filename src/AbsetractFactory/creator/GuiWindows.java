package AbsetractFactory.creator;

import AbsetractFactory.Product.Button1;
import AbsetractFactory.Product.CheckBux;
import AbsetractFactory.Product.WindowsButton1;
import AbsetractFactory.Product.WindowsCheckBox;

public class GuiWindows implements GuieeButton{
    @Override
    public Button1 button() {
        return new WindowsButton1();
    }

    @Override
    public CheckBux checkBox() {
        return new WindowsCheckBox();
    }
}
