package Tamagotchi.resorces;

public class Others {
    // verifica se é ou nn inteiro
    public static boolean isInteger(String numberTest) {
        try {
            Integer.parseInt(numberTest);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void casesMenu(int option) {
        switch (option) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:
                System.out.println("Opção invalida! Apenas dentro das opçoes disponiveis.");
                break;
        }
    }
}
