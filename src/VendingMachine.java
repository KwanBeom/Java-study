public class VendingMachine {
    public String pushProductButton(int menuId) {
        String[] products = {"콜라","사이다"};
        System.out.println(menuId +"를 전달받았습니다.");
        return products[menuId];
    }
}
