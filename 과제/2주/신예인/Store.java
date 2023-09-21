public class Store {
    String name;
    String item;
    int totalMoney;
    void name(String name){
        this.name=name;
    }
    void item(String item){
        this.item=item;
    }
    void TotalMoney(int totalMoney){
        this.totalMoney=totalMoney;
    }
    void buy(){
        System.out.println(("구매하셨습니다"));
    }
}
