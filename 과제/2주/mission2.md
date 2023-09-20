# 2주차 과제는 클래스 생성하기 입니다



메인에서 아래와 같은 코드를 실행시켰을 때 정상적으로 동작하는 코드를 만들어주세요

```
 public static void main(String[] args) {
        Store store = new Store();

        store.name = "가게1";
        store.item = "상품1";
        store.totalMoney = 1000;

        System.out.println("store.name = " + store.name);
        System.out.println("store.item = " + store.item);
        System.out.println("store.totalMoney = " + store.totalMoney);

        store.buy();
    }
```