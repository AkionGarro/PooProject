

/**
 * Class ActividadRecreativa
 */
public class ActividadRecreativa extends Actividad{

  //
  // Fields
  //


  private byte horas;
  private String descripcion;

  
  //
  // Constructors
  //


  public ActividadRecreativa(String nombre, byte horaInicio, byte horaFinal,byte horasAc, byte dia,String descripcion) {
    super(nombre, horaInicio, horaFinal, dia);
    this.horas = horasAc;
    this.descripcion=descripcion;
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


  public void setHoras(byte horas) {
    this.horas = horas;
  }


  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


}
