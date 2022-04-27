

/**
 * Class ActividadRecreativa
 */
public class ActividadRecreativa extends Actividad{

  //
  // Fields
  //

  private String tiempoEjecucion;
  private Byte horas;
  
  //
  // Constructors
  //

  public ActividadRecreativa(String nombre, String tiempoEjecucion, Byte horas) {
    super(nombre);
    this.tiempoEjecucion = tiempoEjecucion;
    this.horas = horas;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of tiempoEjecuci�n
   * @param newVar the new value of tiempoEjecuci�n
   */
  public void setTiempoEjecucion (String newVar) {
    tiempoEjecucion = newVar;
  }

  /**
   * Get the value of tiempoEjecuci�n
   * @return the value of tiempoEjecuci�n
   */
  public String getTiempoEjecucion () {
    return tiempoEjecucion;
  }

  /**
   * Set the value of horas
   * @param newVar the new value of horas
   */
  public void setHoras (Byte newVar) {
    horas = newVar;
  }

  /**
   * Get the value of horas
   * @return the value of horas
   */
  public Byte getHoras () {
    return horas;
  }

  //
  // Other methods
  //

}
