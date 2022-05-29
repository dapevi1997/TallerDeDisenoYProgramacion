package org.sokfa.tallerdedisenoyprogramacion;

/**
 * Creación de la clase Thrower que representa a un vehículo lanzadera.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Thrower extends Spacecrafts implements IPreparationThrower {

    /**
     * Contructor que permite instanciar la clase Thrower.
     */
    public Thrower() {

    }

    /**
     * Método exclusivo de Vehículo Lanzadera para poner la carga útil en la
     * nave.
     */
    @Override
    public void addUsefulLoad() {
        System.out.println("* Carga útil en la nave.");
    }

    /**
     * Método para lanzar el Vehículo Lanzadera al espacio.
     */
    @Override
    protected void lunch() {
        System.out.println("Proceso de despegue de la nave:");
        System.out.println("");
        recommendedFuel(power);
        refuel();
        addUsefulLoad();
        System.out.println("* La nave " + name + " ha despegado exitosamente.");

    }

    /**
     * Método para encontrar el combustible ideal para el Vehículo Lanzadera.
     *
     * @param power Tipo de potencia deseada por el usuario.
     */
    @Override
    protected void recommendedFuel(String power) {
        /**
         * Estructura condicional para escoger el combustible del Vehículo
         * Lanzadera.
         */
        if (power.equals("Alta")) {
            System.out.println("* Combustible recomendado: H(liq) + O(liq)");
        } else {
            System.out.println("* Combustible recomendado: Queroseno + O(liq)");
        }

    }

}
