

/**
 * Class Evaluaciones
 */
public class Evaluaciones extends Actividad {

    //
    // Fields
    //

    private String tipo;
    private Curso cursoAsociado;

    //
    // Constructors
    //


    /**
     * Constructor of the class
     * @param nombre
     * @param tipo
     * @param horaInicio
     * @param horaFinal
     * @param dia
     * @param cursoAsociado
     */
    public Evaluaciones(String nombre, String tipo, byte horaInicio, byte horaFinal, byte dia, Curso cursoAsociado) {
        super(nombre, horaInicio, horaFinal, dia);
        this.cursoAsociado = cursoAsociado;
        this.tipo = tipo;
    }



    //
    // Accessor methods
    //

    /**
     * Set the value of tipo
     *
     * @param newVar the new value of tipo
     */
    public void setTipo(String newVar) {
        tipo = newVar;
    }

    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Get the value of  cursoAsociado
     * @return cursoAsociado
     */

    public Curso getCursoAsociado() {
        return cursoAsociado;
    }

    /**
     * Set the new value of cursoAsociado
     * @param cursoAsociado cursoAsociado
     */
    public void setCursoAsociado(Curso cursoAsociado) {
        this.cursoAsociado = cursoAsociado;
    }


}
