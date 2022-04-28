

/**
 * Class ActividadRecreativa
 */
public class ActividadRecreativa extends Actividad {

    //
    // Fields
    //


    private byte horas;
    private String descripcion;


    /**
     * Constructor of the class
     *
     * @param nombre      new name
     * @param horaInicio  the value of new horaInicio
     * @param horaFinal   the value of new horaFinal
     * @param horasAc     the value of new horasAc
     * @param dia         the value of new dia
     * @param descripcion the value of new description
     */


    public ActividadRecreativa(String nombre, byte horaInicio, byte horaFinal, byte horasAc, byte dia, String descripcion) {
        super(nombre, horaInicio, horaFinal, dia);
        this.horas = horasAc;
        this.descripcion = descripcion;
    }


    //
    // Accessor methods
    //

    /**
     * Get the value of horas
     *
     * @return the value of horas
     */
    public Byte getHoras() {
        return horas;
    }


    /**
     * Set the new value of horas
     *
     * @param horas
     */
    public void setHoras(byte horas) {
        this.horas = horas;
    }

    /**
     * Method to get the description of actividad
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the new descripcion
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
