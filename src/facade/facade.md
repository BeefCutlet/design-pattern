# Facade Pattern
Facade 클래스는 다양한 패키지에서 여러 클래스들을 제공받고,\
클라이언트들이 특정 기능을 쉽게 이용할 수 있도록 간단한 인터페이스 형식으로 제공한다.

### 구현
1. 여러 기능을 가진 클래스들(HelpSystem01, HelpSystem02, HelpSystem03)를 생성한다.
2. 위 클래스들을 이용하여 특정 기능을 제공하는 인터페이스 클래스를 만든다. (Facade)
3. 클라이언트(Application)는 Facade 클래스를 이용하여 기능을 사용한다.