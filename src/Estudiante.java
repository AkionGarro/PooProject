
import java.util.*;


/**
 * Class Estudiante
 */
public class Estudiante {

  //
  // Fields
  //

  private String nombreCompleto;
  private String usuario;
  private String contrasena;
  
  //
  // Constructors
  //
  public Estudiante () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombreCompleto
   * @param newVar the new value of nombreCompleto
   */
  public void setNombreCompleto (String newVar) {
    nombreCompleto = newVar;
  }

  /**
   * Get the value of nombreCompleto
   * @return the value of nombreCompleto
   */
  public String getNombreCompleto () {
    return nombreCompleto;
  }

  /**
   * Set the value of usuario
   * @param newVar the new value of usuario
   */
  public void setUsuario (String newVar) {
    usuario = newVar;
  }

  /**
   * Get the value of usuario
   * @return the value of usuario
   */
  public String getUsuario () {
    return usuario;
  }

  /**
   * Set the value of contrasena
   * @param newVar the new value of contrasena
   */
  public void setContrasena (String newVar) {
    contrasena = newVar;
  }

  /**
   * Get the value of contrasena
   * @return the value of contrasena
   */
  public String getContrasena () {
    return contrasena;
  }

  //
  // Other methods
  //

  /**
   * @param        carrera
   */
  public void cambiarCarrera(Carrera carrera)
  {
  }


  /**
   * @param        curso
   */
  public void matricularCurso(Curso curso)
  {
  }


  /**
   * @param        actividad
   */
  public void agregarActividad(Actividad actividad)
  {
  }


  /**
   * @param        semestre
   * @param        anio
   */
  public void mostrarCursos(Byte semestre, Short anio)
  {
  }


  /**
   * @param        curso
   * @param        estado
   */
  public void asignarEstado(Curso curso, boolean estado)
  {
  }


  /**
   */
  public void mostrarSemestreActual()
  {
  }


  /**
   * @return       Boolean
   * @param        curso
   */
  public Boolean validarCursoCarrera(Curso curso)
  {
    return false;
  }


  /**
   * @param        curso
   */
  public void registrarHorarioCurso(Curso curso)
  {
  }


  /**
   */
  public void calcularDedicacionSemanal()
  {
  }


  /**
   * @param        fecha
   */
  public void reporteDiario(String fecha)
  {
  }


  /**
   * @param        fecha
   */
  public void reporteSemanal(String fecha)
  {
  }


  /**
   * @param        fecha
   */
  public void porcentajeEjecutadoSemanal(String fecha)
  {
  }


  /**
   * @param        fecha
   */
  public void reporteTiempoDisponible(String fecha)
  {
  }


  /**
   * @return       String
   * @param        curso
   */
  public String EstadoCurso(Curso curso)
  {
    return "";
  }


}
