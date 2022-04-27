

/**
 * Class Actividad
 */
abstract public class Actividad {

  //
  // Fields
  //

  private String nombre;
  private byte horaInicio;
  private byte horaFinal;
  private byte dia;
  //
  // Constructors
  //
  public Actividad () { };

  public Actividad(String nombre) {
    this.nombre = nombre;
  }

  public Actividad(String nombre, byte horaInicio, byte horaFinal, byte dia) {
    this.nombre = nombre;
    this.horaInicio = horaInicio;
    this.horaFinal = horaFinal;
    this.dia = dia;
  }
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
}
