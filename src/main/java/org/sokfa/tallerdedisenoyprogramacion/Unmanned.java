package org.sokfa.tallerdedisenoyprogramacion;

/**
 * Cración de la clase Unmanned con la cual se crean las naves no tripuladas.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Unmanned extends Spacecrafts implements IPreparationUnmanned {

    /**
     * Contructor que permite intanciar a la clase Unmanned.
     */
    public Unmanned() {
    }

    /**
     * Método exclusivo de las naves no tripuladas que prepara a la nave antes
     * del despegue.
     */
    @Override
    public void preparation() {
        System.out.println("* La nave no tripulada está preparada");
    }

    /**
     * Método para lanzar al espacio la nave no tripulada.
     */
    @Override
    protected void lunch() {
        System.out.println("Proceso de despegue de la nave:");
        System.out.println("");
        recommendedFuel(power);
        refuel();
        preparation();
        System.out.println("* La nave " + name + " ha despegado exitosamente.");
    }

    /**
     * Método que establece el combustible recomendado para la nave no
     * tripulada.
     *
     * @param power
     */
    @Override
    protected void recommendedFuel(String power) {
        if (power.equals("Alta")) {
            System.out.println("* Combustible recomendado: MMH + NO");
        } else {
            System.out.println("* Combustible recomendado: PuO2");
        }
    }

}
