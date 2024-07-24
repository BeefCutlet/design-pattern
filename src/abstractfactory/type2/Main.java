package abstractfactory.type2;

import abstractfactory.type2.abst.Button;
import abstractfactory.type2.abst.GuiFactory;
import abstractfactory.type2.abst.TextArea;
import abstractfactory.type2.concreate.FactoryInstance;

public class Main {

    public static void main(String[] args) {
        GuiFactory factory = FactoryInstance.getGuiFactory();
        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        button.click();
        System.out.println(textArea.getText());
    }
}
