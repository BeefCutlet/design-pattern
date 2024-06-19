package factorymethod;

import factorymethod.concrete.HpCreator;
import factorymethod.concrete.MpCreator;
import factorymethod.framework.Item;
import factorymethod.framework.ItemCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
