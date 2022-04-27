

/**
 * Class ActividadRecreativa
 */
public class ActividadRecreativa extends Actividad{

  //
  // Fields
  //

  private byte horaInicio;
  private byte horaFinal;
  private byte dia;
  private byte horas;
  private String descripcion;

  
  //
  // Constructors
  //

  public ActividadRecreativa(String nombre, byte horaInicio, byte horaFinal, byte horas, byte dia, String descripcion) {
    super(nombre);
    this.horaInicio = horaInicio;
    this.horaFinal = horaFinal;
    this.horas = horas;
    this.dia = dia;
    this.descripcion = descripcion;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //


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

  public void setHoras(byte horas) {
    this.horas = horas;
  }

  public byte getDia() {
    return dia;
  }

  public void setDia(byte dia) {
    this.dia = dia;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


}
