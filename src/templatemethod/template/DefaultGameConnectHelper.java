package templatemethod.template;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(final String str) {
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return str;
    }

    @Override
    protected boolean authentication(final String id, final String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(final String username) {
        System.out.println("권한 확인");
        //서버에서 유저이름과 유저 나이를 알 수 있다.
        //나이를 확인하고 시간을 확인하고 성인이 아니고 10시가 지났다면 권한이 없는 것으로 판단
        return 0;
    }

    @Override
    protected String connection(final String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }
}
