package store.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String readItem() {
        System.out.println("구매하실 상품명과 수량을 입력해 주세요. (예: [사이다-2],[감자칩-1])");
        return Console.readLine();
    }

    public boolean confirmMembershipDiscount() {
        System.out.println("멤버십 할인을 적용하시겠습니까? (Y/N)");
        String input = Console.readLine().trim().toUpperCase();
        return input.equals("Y");
    }
}
