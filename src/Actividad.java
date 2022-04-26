

/**
 * Class Actividad
 */
abstract public class Actividad {

  //
  // Fields
  //

  private String nombre;
  
  //
  // Constructors
  //
  public Actividad () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  //
  // Other methods
  //

  /**
   */
  public void validarRegistroActividades()
  {
  }


  /**
   */
  public void validarTiemposTotales()
  {
  }


  /**
   */
  public void validarChoquesHorario()
  {
  }


  /**
   */
  public void porcentajeEjecutadoActividad()
  {
  }


}
