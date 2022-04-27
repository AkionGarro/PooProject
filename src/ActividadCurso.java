

/**
 * Class ActividadCurso
 */
public class ActividadCurso extends Actividad{

  //
  // Fields
  //

  private String descripcion;
  private Curso cursoAsociado;


  //
  // Constructors
  //

  public ActividadCurso(String nombre,String descripcion,Curso cursoAsociado, byte horaInicio, byte horaFinal, byte dia) {
    super(nombre, horaInicio, horaFinal, dia);
    this.descripcion = descripcion;
    this.cursoAsociado = cursoAsociado;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion;
  }

  /**
   * Set the value of cursoAsociado
   * @param newVar the new value of cursoAsociado
   */
  public void setCursoAsociado (Curso newVar) {
    cursoAsociado = newVar;
  }

  /**
   * Get the value of cursoAsociado
   * @return the value of cursoAsociado
   */
  public Curso getCursoAsociado () {
    return cursoAsociado;
  }





  //
  // Other methods
  //

}
