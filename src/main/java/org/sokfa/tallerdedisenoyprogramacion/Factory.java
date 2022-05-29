package org.sokfa.tallerdedisenoyprogramacion;

import java.util.Scanner;

/**
 * Creación de la clase Factory en donde se crean las naves espaciales.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Factory {

    /**
     * Representa la opción escogida por el usuario sobre el tipo de nave que
     * desea crear.
     */
    private int ShipSpacialSelection;
    /**
     * Intacia de la clase Scanner para manejar las entradas del usuario.
     */
    Scanner in = new Scanner(System.in);

    /**
     * Contructor que permite intanciar a la clase Factory.
     */
    public Factory() {
    }

    /**
     * Método para obtener la opción escogida por el usuario.
     *
     * @return Opción escogida por el usuario.
     */
    public int getShipSpacialSelection() {
        return ShipSpacialSelection;
    }

    /**
     * Método para mostrar el mensaje de bienvenida a la fábrica.
     */
    public void showWelcomeMessage() {
        System.out.println("----------------------------------------------------------");
        System.out.println("BIENVENIDO A LA FÁBRICA DE NAVES ESPACIALES.");
        System.out.println("Escoja el tipo de nave:");
        System.out.println("");

    }

    /**
     * Método para mostrar en consola las opciones disponibles al usuario.
     */
    public void showShipSpacialOption() {

        System.out.println(" 1. Vehículo lanzadera.");
        System.out.println(" 2. Nave no tripulada.");
        System.out.println(" 3. Nave tripulada (1 ocupante).");
        System.out.println(" 4. Nave tripulada (2 ocupantes).");
        System.out.println(" 5. Salir de la fábrica.");
        System.out.println("----------------------------------------------------------\n");
        ShipSpacialSelection = in.nextInt();

    }

    /**
     * Método que crea la nave espacial y la alista para el despegue.
     */
    public void toCreateShipSpacial() {
        /**
         * Variable objet de la clase Spacecrafs para aplicar polimorfismo.
         */
        Spacecrafts spacesShip = null;
        /**
         * Estructura condicional que crea el tipo de nave, dependiendo la
         * opción escogida por el usuario.
         */
        if (1 <= ShipSpacialSelection && ShipSpacialSelection <= 5) {
            switch (ShipSpacialSelection) {
                case 1:
                    spacesShip = new Thrower();
                    spacesShip.putName();
                    spacesShip.countryOfOrigin();
                    spacesShip.typePower();
                    spacesShip.spaceShipCreated();
                    spacesShip.lunch();

                    break;
                case 2:
                    spacesShip = new Unmanned();
                    spacesShip.putName();
                    spacesShip.countryOfOrigin();
                    spacesShip.typePower();
                    spacesShip.spaceShipCreated();
                    spacesShip.lunch();
                    break;
                case 3:
                    spacesShip = new Manned(1);
                    spacesShip.putName();
                    spacesShip.countryOfOrigin();
                    spacesShip.typePower();
                    spacesShip.spaceShipCreated();
                    spacesShip.lunch();
                    break;
                case 4:

                    spacesShip = new Manned(2);
                    spacesShip.putName();
                    spacesShip.countryOfOrigin();
                    spacesShip.typePower();
                    spacesShip.spaceShipCreated();
                    spacesShip.lunch();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Opción no válida. Vuelva a intentar.");
        }

    }

}
