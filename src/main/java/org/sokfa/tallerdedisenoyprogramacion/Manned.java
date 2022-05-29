package org.sokfa.tallerdedisenoyprogramacion;

import java.util.Scanner;

/**
 * Creación de la clase Manned que permite la creación de naves tripuldas.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Manned extends Spacecrafts implements IPreparationManned {

    /**
     * Representa el nombre del primer tripulante de la nave.
     */
    private String firstCrewman;
    /**
     * Representa el nombre del segundo tripulante de la nave.
     */
    private String secondCrewman;
    /**
     * Representa el número de tripulantes que pueden ir en la nave.
     */
    private int numberOfCrewman;

    /**
     * Constructor que permite instanciar a la clase Manned.
     *
     * @param numberOfCrewman Número de tripulantes de la nave.
     */
    public Manned(int numberOfCrewman) {
        this.numberOfCrewman = numberOfCrewman;

    }

    /**
     * Método para guardar los nombre del o los tripulantes de la nave,
     * dependiendo de la elección del usuario.
     */
    @Override
    public void crewMan() {
        Scanner in = new Scanner(System.in);
        /**
         * Estructura condicional que guarda los nombres escritos por el
         * usuario.
         */
        if (numberOfCrewman == 1) {
            System.out.print("Inserte el nombre del tripulante: ");
            firstCrewman = in.nextLine();
        } else if (numberOfCrewman == 2) {
            System.out.print("Inserte el nombre del primer tripulante: ");
            firstCrewman = in.nextLine();
            System.out.print("Inserte el nombre del segundo tripulante: ");
            secondCrewman = in.nextLine();
        }

    }

    /**
     * Método para verificar que los tripulantes estés montados en la nave.
     */
    @Override
    public void showCrewman() {
        /**
         * Estructura condicional que establece cuántos tripulantes montar en la
         * nave.
         */
        if (numberOfCrewman == 1) {
            System.out.println("* Tripulante " + firstCrewman + " en la nave.");

        } else if (numberOfCrewman == 2) {
            System.out.println("* Tripulante " + firstCrewman + " en la nave.");

            System.out.println("* Tripulante " + secondCrewman + " en la nave.");

        }
    }

    /**
     * Método para la lanzar la nave tripulada.
     */
    @Override
    protected void lunch() {
        /**
         * Estructura condicional para mostrar el proceso de despegue de la nave
         * tripulada.
         */
        if (numberOfCrewman == 1) {
            crewMan();
            System.out.println("----------------------------------------------------------");
            System.out.println("Proceso de despegue de la nave:");
            System.out.println("");
            recommendedFuel(power, 1);
            refuel();

            showCrewman();
            System.out.println("* La nave " + name + " ha despegado exitosamente.");
        } else if (numberOfCrewman == 2) {

            crewMan();
            System.out.println("----------------------------------------------------------");
            System.out.println("Proceso de despegue de la nave:");
            System.out.println("");
            recommendedFuel(power, 2);
            refuel();
            showCrewman();
            System.out.println("* La nave " + name + " ha despegado exitosamente.");
        }

    }

    @Override
    protected void recommendedFuel(String power) {

    }

    /**
     * Método para establecer el combustible recomendado de acuerdo a la
     * potencia y número de tripulantes.
     *
     * @param power Potencia requerida por el usuario
     * @param numberOfCrewman Número de tripulantes que puede tener la nave.
     */
    public void recommendedFuel(String power, int numberOfCrewman) {
        /**
         * Estrucura para seleccionar el combustible adecuado para la nave
         * tripulada.
         */
        if (power.equals("Alta") && numberOfCrewman == 2) {
            System.out.println("* Combustible recomendado: Sólido");
        } else if (power.equals("Moderada") || numberOfCrewman == 1) {
            System.out.println("* Combustible recomendado: NO + Amina");
        }

    }

}
