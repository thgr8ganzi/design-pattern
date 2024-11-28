## memento

* 객체내부의 상태를 객체외부에 저장하고 저장된 상태를 사용, 캡슐화를 지키면서 객체의 상태를 저장하고 복원하는 패턴
* originator: 상태를 저장하고 복원할 데이터를 가지고 있는 객체
  * createMemento(): originator 의 내부정보를 memento 형태로 추상화하여 반환
  * restore(memento): 외부에서 전달받은 memento 정보를 가지고 자신의 정보 복원
* memento: originator의 내부정보를 caretaker가 가지고와서 저장하고있다, imuutable
  * memento(state): caretaker 에게 전달받은 originator 의 내부정보를 저장
* caretaker: originator 의 내부정보를 memento 형태로 추상화하여 갖고있음

### 장점

* 객체를 외부에 노출시키지 않고 스냅샷을 만들수 있다.

### 단점

* memento 를 생성하는데 비용이 많이 들수 있다.