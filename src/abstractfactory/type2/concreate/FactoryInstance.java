package abstractfactory.type2.concreate;

import abstractfactory.type2.abst.Button;
import abstractfactory.type2.abst.GuiFactory;
import abstractfactory.type2.abst.TextArea;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {
        return switch (getOsCode()) {
            case 0 -> new MacGuiFactory();
            case 1 -> new LinuxGuiFactory();
            case 2 -> new WindowsGuiFactory();
            default -> null;
        };
    }

    private static int getOsCode() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            return 2;
        }
        return 0;
    }

    static class MacGuiFactory implements GuiFactory {
        @Override
        public Button createButton() {
            return new MacButton();
        }

        @Override
        public TextArea createTextArea() {
            return new MacTextArea();
        }
    }

    static class MacButton implements Button {

        @Override
        public void click() {
            System.out.println("맥 버튼");
        }
    }

    static class MacTextArea implements TextArea {

        @Override
        public String getText() {
            return "맥 텍스트 에어리어";
        }
    }

    static class LinuxGuiFactory implements GuiFactory {
        @Override
        public Button createButton() {
            return new LinuxButton();
        }

        @Override
        public TextArea createTextArea() {
            return new LinuxTextArea();
        }
    }

    static class LinuxButton implements Button {
        @Override
        public void click() {
            System.out.println("리눅스 버튼");
        }
    }

    static class LinuxTextArea implements TextArea {
        @Override
        public String getText() {
            return "리눅스 텍스트 에어리어";
        }
    }

    static class WindowsGuiFactory implements GuiFactory {

        @Override
        public Button createButton() {
            return new WindowsButton();
        }

        @Override
        public TextArea createTextArea() {
            return new WindowsTextArea();
        }
    }

    static class WindowsButton implements Button {

        @Override
        public void click() {
            System.out.println("윈도우 클릭");
        }
    }

    static class WindowsTextArea implements TextArea {

        @Override
        public String getText() {
            return "윈도우 텍스트 에어리어";
        }
    }
}

