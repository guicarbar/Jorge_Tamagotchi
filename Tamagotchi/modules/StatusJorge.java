// packeges
package Tamagotchi.modules;


// import modules
import static Tamagotchi.modules.Money.getWallet;
import static Tamagotchi.resorces.JorgeFace.mainFace;


public class StatusJorge {
    // init vars of status
    protected static int hungry = 100;
    protected static int felicidade = 100;
    protected static int sono =  100;


    // show status
    public static String getStatus() {
        return  "\n" + mainFace() + "\n" +
                "\nFome: " + getHungry() +
                "\nFelicidade: " + getFelicidade() +
                "\nSono: " + getSono() +
                "\nCarteira: R$" + getWallet() + "\n";
    }


    // getters of status
    public static int getHungry() {return hungry;}

    public static int getFelicidade() {return felicidade;}

    public static int getSono() {return sono;}
}
