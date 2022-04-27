

/**
 * Class ActividadCurso
 */
public class ActividadCurso extends Actividad{

  //
  // Fields
  //

  private String descripcion;
  private Curso cursoAsociado;
  private byte horaInicio;
  private byte horaFinal;
  private byte dia;



  public ActividadCurso(String nombre, String descripcion, Curso cursoAsociado, byte fechaInicio, byte fechaFinal,byte dia) {
    super(nombre);
    this.descripcion = descripcion;
    this.cursoAsociado = cursoAsociado;
    this.horaInicio = fechaInicio;
    this.horaFinal = fechaFinal;
    this.dia = dia;
  }

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

  public byte getHoraInicio() {
    return horaInicio;
  }

  public void setHoraInicio(byte horaInicio) {
    this.horaInicio = horaInicio;
  }

  public byte getHoraFinal() {
    return horaFinal;
  }

  public void setHoraFinal(byte horaFinal) {
    this.horaFinal = horaFinal;
  }

  public byte getDia() {
    return dia;
  }

  public void setDia(byte dia) {
    this.dia = dia;
  }




  //
  // Other methods
  //

}
