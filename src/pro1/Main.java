package pro1;

public class Main {
    public static void main(String args []){
        Decolar decolar = new Decolar();

        decolar = new Aviao();
        decolar.levantarVoo();
        System.out.println();

        decolar = new Helicoptero();
        decolar.levantarVoo();
        System.out.println();

        decolar = new Lancha();
        decolar.levantarVoo();

    }
}
