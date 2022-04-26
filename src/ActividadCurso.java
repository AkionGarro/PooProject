

/**
 * Class ActividadCurso
 */
public class ActividadCurso extends Actividad{

  //
  // Fields
  //

  private String descripcion;
  private Curso cursoAsociado;
  private String fechaInicio;
  private String fechaFinal;
  
  //
  // Constructors
  //
  public ActividadCurso () { };
  
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

  /**
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (String newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public String getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFinal
   * @param newVar the new value of fechaFinal
   */
  public void setFechaFinal (String newVar) {
    fechaFinal = newVar;
  }

  /**
   * Get the value of fechaFinal
   * @return the value of fechaFinal
   */
  public String getFechaFinal () {
    return fechaFinal;
  }

  //
  // Other methods
  //

}
