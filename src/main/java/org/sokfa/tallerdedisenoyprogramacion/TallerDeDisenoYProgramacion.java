package org.sokfa.tallerdedisenoyprogramacion;

/**
 * Creación de la clase principal en donde se crearán las naves espaciales.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class TallerDeDisenoYProgramacion {

    /**
     * Método Main
     *
     * @param args Cadenas de texto.
     */
    public static void main(String[] args) {
        /**
         * Variable para hacer bucle infinito.
         */
        boolean loop = true;
        /**
         * Intancia de la clase Factory
         */
        Factory factory = new Factory();
        /**
         * Estructura condicional para hacer el bucle infinito y terminar el
         * programa solo si el usuario así lo determina.
         */
        while (loop) {
            /**
             * Muestra el mensaje al usuario de bienvenida a la fábrica.
             */
            factory.showWelcomeMessage();
            /**
             * Muestra las diferentes opciones de naves que se pueden crear en
             * la fábrica.
             */
            factory.showShipSpacialOption();
            /**
             * Crea la nave espacial y poteriormente la prepara para el
             * lanzamiento al espacio.
             */
            factory.toCreateShipSpacial();
        }

    }
}
