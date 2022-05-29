package org.sokfa.tallerdedisenoyprogramacion;

import java.util.Scanner;

/**
 * Creación de la clase padre para los tipos de naves espaciales.
 *
 * @author DANIEL PEREZ VITOLA
 */
public abstract class Spacecrafts {

    /**
     * Representa el nombre que se le va asignar a la nave.
     */
    protected String name;
    /**
     * Representa el país en donde se va a crear la nave.
     */
    protected String countryOfOrigin;
    /**
     * Representa el nivel de potencia con el que se construirá la nave.
     */
    protected String power;
    /**
     * Intancia de la clase Scanner para manejar las entradas del usuario.
     */
    Scanner in = new Scanner(System.in);

    /**
     * Contructor de la clase Spacecrafs.
     */
    public Spacecrafts() {
    }

    /**
     * Método para asignar el nombre a la nave.
     */
    protected void putName() {
        System.out.print("Escriba un nombre para la nave: ");
        name = in.nextLine();
        System.out.println("----------------------------------------------------------");
    }

    /**
     * Método para asignar el país en donde se creará la nave.
     */
    protected void countryOfOrigin() {

        System.out.print("Escriba el país donde se va a crear la nave: ");
        countryOfOrigin = in.nextLine();
        System.out.println("----------------------------------------------------------");
    }

    /**
     * Método para determinar el tipo de potencia que desea el usuario.
     */
    protected void typePower() {
        /**
         * Variable para almacenar la opción tomada por el usuario.
         */
        int powerPick;
        System.out.println("Potencia que espera de la nave: ");
        System.out.println(" 1. Alta");
        System.out.println(" 2. Moderada");
        powerPick = in.nextInt();
        /**
         * Estructura condicional para guardar la opción del usuario en modo de
         * cadena.
         */
        if (powerPick == 1) {
            power = "Alta";
        } else if (powerPick == 2) {
            power = "Moderada";
        } else {
            System.out.println("Opción no válida");
            System.out.println("----------------------------------------------------------");
            typePower();
        }

        System.out.println("----------------------------------------------------------");
    }

    /**
     * Método para mostrar en consola los principales atributos de la nave
     * creada.
     */
    protected void spaceShipCreated() {

        System.out.println("Nave creada y lista para el despegue:");
        System.out.println("");
        System.out.println("Nombre: " + name);
        System.out.println("País de creación: " + countryOfOrigin);
        System.out.println("Potencia deseada: " + power);
        System.out.println("----------------------------------------------------------");

    }

    /**
     * Método para cargar de combustible a la nave.
     */
    protected void refuel() {

        System.out.println("* Combustible cargado.");

    }

    /**
     * Método abstracto que lanza la nave al espacio.
     */
    protected abstract void lunch();

    /**
     * Método que establece el combustible más conveniente para la nave.
     *
     * @param power Tipo de potencia deseada: "Alta" o "Moderada".
     */
    protected abstract void recommendedFuel(String power);

}
