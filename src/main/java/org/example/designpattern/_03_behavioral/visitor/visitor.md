## Visitor

* 기존 코드를 수정하지 않고 새로운 기능을 추가할 수 있게 해주는 패턴
* 더블 디스패치를(다형성, 메소드를 위임하는 과정) 활용할수 있다.
* element
  * 본연의 기능을 가지고 변하지 않는 객체
  * accept(visitor) 메소드를 가지고 있다.
  * 각각 element 는 accept(this) 를 호출하면 각 타입을 지원하는 메소드를 사용, concrete visitor 를 호출한다.
* visitor
  * 추가하고 싶은 로직을 담고있다
  * visitor.visit(element) 으로 자신의 타입을 넘겨주고 overloading 된 visit 메소드를 호출한다.

### 장점

* 기존 코드를 수정하지 않고 새로운 기능을 추가할 수 있다.

### 단점

* element 를 추가, 삭제시 많은 변화가 일어난다.

### use case

* FileVisitor
* BeanDefinitionVisitor