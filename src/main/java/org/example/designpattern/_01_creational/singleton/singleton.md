## SingleTon

* 인스턴스를 오직 한개만 제공하는 클래스
* 시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개일때 문제가 생길수 있는 경우가 있다
* 인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다.
* 멀티스레딩 환경에서 안전하게 인스턴스를 만들어 제공하려면 synchronized 키워드를 사용해야 한다.
* 이른 초기화로 인스턴스를 만들어 제공하면, 클래스 로딩시점에 인스턴스를 만들어 제공하므로, 멀티스레딩 환경에서도 안전하다.
* double-checked locking을 사용하면, 인스턴스를 만들어 제공하는 메소드에 synchronized 키워드를 사용하지 않아도 된다.
```
public class SyncSettings3 {
    private SyncSettings3() {}

    private static volatile SyncSettings3 INSTANCE;

    public static SyncSettings3 getInstance() {
        if (INSTANCE == null) {
            synchronized (SyncSettings3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SyncSettings3();
                }
            }
        }
        return INSTANCE;
    }
}
```
* Static inner class를 사용하면, 클래스 로딩시점에 인스턴스를 만들어 제공하므로, 멀티스레딩 환경에서도 안전하다.
  * 이 방법은 가장 많이 사용되는 방법이다.
```
public class SyncSettings4Holder implements Serializable {
    private SyncSettings4Holder() {}

    private static class SettingsHolderHelper {
        private static final SyncSettings4Holder INSTANCE = new SyncSettings4Holder();
    }

    public static SyncSettings4Holder getInstance() {
        return SettingsHolderHelper.INSTANCE;
    }
    protected Object readResolve() {
        return getInstance();
    }
}

```
* readResolve() 메소드를 사용하면, 직렬화된 인스턴스를 역직렬화할때, 새로운 인스턴스를 만들지 않고, 기존 인스턴스를 반환할 수 있다.
  * 이 메소드를 사용하면, 직렬화된 인스턴스를 역직렬화할때, 새로운 인스턴스를 만들지 않고, 기존 인스턴스를 반환할 수 있다.
* Enum을 사용하면, 멀티스레딩 환경에서도 안전하게 인스턴스를 만들어 제공할 수 있다.
  * 미리 만들어지고, 상속을 사용하지 못함
```
package org.example.designpattern._01_creational.singleton._01_before;

public enum SyncSettings5Enums {
    INSTNACE;

    SyncSettings5Enums() {
        System.out.println("Enum constructor");
    }
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
```

### 실무에서

* 스프링 빈 스코프 중 하나로 싱근톤 스코프
* 자바 java.lang.Runtime 클래스
* 다른 디자인 패턴 구현체의 일부로 쓰이기도한다.