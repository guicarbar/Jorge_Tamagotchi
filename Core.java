// import de bibliotecas
import java.util.Scanner;

//import of resorces
import static Tamagotchi.resorces.JorgeFace.happyFace;
import static Tamagotchi.resorces.TextResorces.*;
import static Tamagotchi.resorces.GeneralFuncs.*;


public class Core {
    // main function/start tomagotchi
    public static void main(String[] args) {
        // abre o scanner
        Scanner sc = new Scanner(System.in);


        // start btn
        boolean reload = true;
        do {
            System.out.println(happyFace() + "\n\nPress ENTER para começar!");
            String inputStart = sc.nextLine();

            // start analaser
            if (inputStart.isEmpty()) {
                reload = false;
            } else {
                System.out.println("\n");
            }
        } while (reload);


        // loop até exit
        boolean system = true;
        do {
            // show jorge
            // ...

            // catch options todo
            System.out.println(quest());
            String inputOptions = sc.nextLine();

            // garante ser um numero inteiro e entra no casesMenu
            if (isInteger(inputOptions)) {
                // confere se é uma saida ou passa pro casesMenu
                if (Integer.parseInt(inputOptions) == 6) {
                    System.out.println("Fechando ...");
                    system = false;
                } else {
                    casesMenu(Integer.parseInt(inputOptions));
                }
            } else {
                System.out.println("Opção invalida!");
            }
        } while (system);

        // fecha o scanner
        sc.close();
    }
}