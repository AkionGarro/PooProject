

/**
 * Class Evaluaciones
 */
public class Evaluaciones extends Actividad {

  //
  // Fields
  //

  private String tipo;
  private byte horaInicio;
  private byte horaFinal;
  private int dia;
  private Curso cursoAsociado;
  
  //
  // Constructors
  //

  public Evaluaciones(String nombre, String tipo, byte horaInicio, byte horaFinal, int dia, Curso cursoAsociado) {
    super(nombre);
    this.tipo = tipo;
    this.horaInicio = horaInicio;
    this.horaFinal = horaFinal;
    this.dia = dia;
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



  //
  // Other methods
  //


  public Curso getCursoAsociado() {
    return cursoAsociado;
  }

  public void setCursoAsociado(Curso cursoAsociado) {
    this.cursoAsociado = cursoAsociado;
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

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }
}
