package templatemethod;

import templatemethod.template.AbstGameConnectHelper;
import templatemethod.template.DefaultGameConnectHelper;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper connectHelper = new DefaultGameConnectHelper();
        connectHelper.requestConnection("아이디 암호 등 접속 정보");
    }
}
