

/**
 * Class Evaluaciones
 */
public class Evaluaciones extends Actividad {

  //
  // Fields
  //

  private String tipo;
  private Curso cursoAsociado;
  
  //
  // Constructors
  //Evaluaciones(nombreEvaluacion, tipo, hrInicio, hrFin,diaEv,cursoAsociado);


  public Evaluaciones(String nombre, String tipo,byte horaInicio, byte horaFinal, byte dia,Curso cursoAsociado) {
    super(nombre, horaInicio, horaFinal, dia);
    this.cursoAsociado = cursoAsociado;
    this.tipo = tipo;
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



}
