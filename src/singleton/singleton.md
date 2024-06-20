# Singleton Pattern
하나의 인스턴스만 생성하도록 구현하는 패턴
### 구현
- 생성자를 private으로 구현한다.
- private 멤버 변수인 instance를 getInstance() 메소드를 통해서 가져온다.
- 생성된 인스턴스가 없으면 getInstance()에서 체크하여 한번만 생성한다.