public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int depositAmount = 2000;
        int bonus;
        if (depositAmount>1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = amount + depositAmount + bonus;
        System.out.println(totalAmount);
    }


}
