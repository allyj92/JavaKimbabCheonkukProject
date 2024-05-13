public class Menu {
    int number;
    int count;


    public Menu(int number, int count) {
        this.number = number;
        if (count > 99) {
            System.out.println("수량 99개를 넘어갈 수 없습니다.");
        } else {
            this.count = count;
        }
    }

    public String totalPrice() {
        int total = 0;
        if (number == 1) {
            total = 1000 * this.count;
        } else if (number == 2) {
            total = 1500 * this.count;
        } else if (number == 3) {
            total = 1000 * this.count;
        } else if (number == 4) {
            total = 2000 * this.count;
        } else {
            return "Error!!";
        }
        return "[안내] 주문하신 메뉴의 총 금액은 " + total + "원 입니다.\n"+"[안내]이용해 주셔서 감사합니다.";
    }

    @Override
    public String toString() {
        return "Menu{" +
                "number=" + number +
                ", count=" + count +
                '}';
    }
}