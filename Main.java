/**
 * Clase Main
 *
 * @autor Angel Castineira
 * @version 23/11/2022
 */
public class Main {

    public static void main(String[] args) {

        final String MENSAJE_MAX_INTENTOS = "Tienes 10 intentos";
        final String MENSAJE_INTRODUCIR_NUM = "Introduce un numero del 1 al 50";

        Metodos obx = new Metodos();
        System.out.println(MENSAJE_MAX_INTENTOS);
        int i = 0;
        int numeroMaxIntentos = 10;
        int numeroCorrecto = 3;

        do {
            i++;
            obx.pedirEnteros(MENSAJE_INTRODUCIR_NUM);

            //si esta fuera del rango entra en este bucle
            obx.merterEnRango();

        } while (i <= numeroMaxIntentos && obx.numeroIntroducido != numeroCorrecto);

        obx.salirPrograma(numeroCorrecto);
    }

}
