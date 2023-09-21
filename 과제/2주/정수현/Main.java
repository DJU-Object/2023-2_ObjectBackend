public class Main {
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
}