package AbsetractFactory.creator;

import AbsetractFactory.creator.GuieeButton;
import AbsetractFactory.creator.MacGui;

public class MainFactory {

    public static void main(String[] args) {
        GuieeButton g = new GuiWindows();

        g.button().button();
        g.checkBox().checkBox();
    }
}
