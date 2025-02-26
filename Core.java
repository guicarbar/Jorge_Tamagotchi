// import de bibliotecas
import java.util.Scanner;

//import of resorces
import static Tamagotchi.resorces.JorgeFace.*;


public class Core {
    // main function/start tomagotchi
    public static void main(String[] args) {
        // abre o scanner
        Scanner sc = new Scanner(System.in);

        //start btn
        boolean reload = true;
        do {
            System.out.println("Press ENTER para começar!");
            String inputStart = sc.nextLine();

            // start analaser
            if (inputStart.isEmpty()) {
                reload = false;
            } else {
                System.out.println("\n");
            }
        } while (reload);

        // Rosto do tomagotchi
        System.out.println(jorgeFace());
    }
}
