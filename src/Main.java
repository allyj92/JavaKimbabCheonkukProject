import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)\n");
        System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
        Scanner s = new Scanner(System.in);
        int menuNumber  = Integer.parseInt(s.nextLine());

        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.(※ 최대 주문 가능 수량 : 99)");
        int menuCount = Integer.parseInt(s.nextLine());

        Menu menu = new Menu(menuNumber, menuCount);
        String totalPriceMessage = menu.totalPrice(); // totalPrice 메서드의 반환값을 변수에 저장
        System.out.println(totalPriceMessage); // 반환된 메시지를 출력
    }
}