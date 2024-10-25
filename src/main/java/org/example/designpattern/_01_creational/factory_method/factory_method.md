## factory method

* 구체적으로 어떤 인스턴스를 만들지는 서브클래스가 정한다.
* 다양한 구현체가 있고 그중에서 특정한 구현체를 만들수 있는 다양한 팩토리를 제공할수 있다.

### 장점

* 기존 코드를 건드지 않아서 기존 코드가 안정적인 상태에서 새로운 기능을 추가할수 있다.

### 단점

* 새로운 기능을 추가할때마다 새로운 팩토리를 만들어야 한다.

### use case

* java.util.Calendar
* NumberFormat.getInstance()
* BeanFactory.getBean()