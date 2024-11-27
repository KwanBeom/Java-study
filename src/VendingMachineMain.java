public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        String product = vm.pushProductButton(1);
        System.out.println(product);
    }
}
