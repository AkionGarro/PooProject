

/**
 * Class Evaluaciones
 */
public class Evaluaciones extends Actividad {

  //
  // Fields
  //

  private String tipo;
  private int tiempo;
  private Curso cursoAsociado;
  
  //
  // Constructors
  //

  public Evaluaciones(String nombre, String tipo, int tiempo, Curso cursoAsociado) {
    super(nombre);
    this.tipo = tipo;
    this.tiempo = tiempo;
    this.cursoAsociado = cursoAsociado;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of tipo
   * @param newVar the new value of tipo
   */
  public void setTipo (String newVar) {
    tipo = newVar;
  }

  /**
   * Get the value of tipo
   * @return the value of tipo
   */
  public String getTipo () {
    return tipo;
  }

  /**
   * Set the value of tiempo
   * @param newVar the new value of tiempo
   */
  public void setTiempo (Integer newVar) {
    tiempo = newVar;
  }

  /**
   * Get the value of tiempo
   * @return the value of tiempo
   */
  public Integer getTiempo () {
    return tiempo;
  }

  //
  // Other methods
  //


  public Curso getCursoAsociado() {
    return cursoAsociado;
  }

  public void setCursoAsociado(Curso cursoAsociado) {
    this.cursoAsociado = cursoAsociado;
  }
}
