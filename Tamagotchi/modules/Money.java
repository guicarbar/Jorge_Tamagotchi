package Tamagotchi.modules;

public class Money {
    // money
    private static double wallet = 100;

    //getter money
    public static double getWallet() {return wallet;}


    // add money
    public static addMoney(double cash) {
        wallet += cash;
        System.out.println("Foi adcionado a sua carteira: RS" + cash);
    }

    // remove money
    public static removeMoney(double cash) {
        wallet -= cash;
        System.out.println("Foi removido de sua carteira: RS" + cash);
    }
}
