package templatemethod.template;

public abstract class AbstGameConnectHelper  {
    protected abstract String doSecurity(String str);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String username);
    protected abstract String connection(String info);

    public String requestConnection(String str) {
        //보안 과정 -> 암호화된 문자열을 복호화
        String decodedInfo = doSecurity(str);
        //인증 과정 -> 반환된 것을 가지고 아이디, 암호를 할당한다.
        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        //권한 과정
        String username = "";
        int i = authorization(username);
        switch (i) {
            case -1:
                throw new Error("셧다운");
            case 0:
                //게임 매니저
                break;
            case 1:
                //유료회원
                break;
            case 2:
                //무료회원
                break;
            case 3:
                //권한없음
                break;
            default:
                //기타 상황
                break;
        }

        //접속 과정
        return connection(decodedInfo);
    }
}
