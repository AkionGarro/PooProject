
import java.util.*;


/**
 * Class Estudiante
 */
public class Estudiante {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  //
  // Fields
  //

  private String nombreCompleto;
  private String usuario;
  private String contrasena;


  private ArrayList<Carrera> carreras = new ArrayList<Carrera>();
  private ArrayList<Curso> cursosActuales = new ArrayList<Curso>();
  private ArrayList<Actividad> actividades = new ArrayList<Actividad>();
  private ArrayList< ArrayList<Curso>> semestre = new ArrayList<ArrayList<Curso>>();
  private String [][] semana = new String [12][7];
  //
  // Constructors
  //

  public Estudiante(String nombreCompleto, String usuario, String contrasena, ArrayList<Carrera> carreras) {
    this.nombreCompleto = nombreCompleto;
    this.usuario = usuario;
    this.contrasena = contrasena;
    this.carreras = carreras;
  }


  public Estudiante() {
  }

//
  // Methods
  //

  public ArrayList<ArrayList<Curso>> getSemestre() {
    return semestre;
  }


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
    Scanner sctemp = new Scanner(System.in);
    int temp =0;
    for (int i = 0; i < this.carreras.size(); i++) {
      System.out.println("i: " + i + " Nombre:" + this.carreras.get(i).getNombre());
    }
    System.out.println("Digite la carrera que desea cambiar: ");
    temp = sctemp.nextInt();
    sctemp.nextLine();
    this.carreras.set(temp,carrera);

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
    boolean flag= false;
    ArrayList<Carrera> carrerasCurso = curso.getCarrerasList();

    for(int i=0;i<carrerasCurso.size();i++){
      for(int j=0;j<this.carreras.size();j++){
        if(carrerasCurso.get(i).getNombre().toLowerCase().equals(this.carreras.get(j).getNombre().toLowerCase())){
          System.out.println("Si pertenece");
          flag=true;
        }
      }
    }
    return flag;
  }

  public Boolean validarCursoActivo(Curso curso)
  {
    boolean flag= false;
    if(curso.getEstado().toLowerCase()=="encurso"){
      flag=true;
    }

    return flag;
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



  public void addCursoSemestre(ArrayList<Curso> curso) {
    this.semestre.add(curso);
  }

  public void getCursosSemestre(int semestre){

    for(int i=0;i<this.semestre.get(semestre).size();i++){
      System.out.println(this.semestre.get(semestre).get(i).getNombre());
    }

  }

  public ArrayList<Actividad> getActividades() {
    return actividades;
  }

  public void addActividades(Actividad actividad){
    this.actividades.add(actividad);
  }


  public  void setCursosSemestreActual() {

    int actual = this.getSemestre().size() - 1;

    this.cursosActuales = getSemestre().get(actual);

  }

  public void crearHorario(){
    setCursosSemestreActual();


    //Bucle para llenar la matriz con los cursos
    for(int i=0;i<this.cursosActuales.size();i++){
      Curso temp = this.cursosActuales.get(i);
      byte posActual=temp.getHoraInicio();
      byte posFinal = temp.getHoraFinal();
      byte dia =temp.getDia();
      for(byte j=posActual;j<posFinal;j++){
        if(this.semana[j][dia]==null){
          this.semana[j][dia] = "Clases "+temp.getNombre();
        }else{
          System.out.println("Se presenta un choque de horario");
        }
      }


    }

    //Bucle para llenar la matriz con actividades.
    for(int i=0;i<this.actividades.size();i++) {
      Actividad tempAct = this.actividades.get(i);
      byte posActual = tempAct.getHoraInicio();
      byte posFinal = tempAct.getHoraFinal();
      byte dia = tempAct.getDia();
      for (byte j = posActual; j < posFinal; j++) {
        if (this.semana[j][dia] == null) {
          this.semana[j][dia] = "Actividad " + tempAct.getNombre();

        } else {
          System.out.println("Se presenta un choque de horario");
        }
      }
    }

  }


  public void reporteSemanal(){
    crearHorario();
    int cont=0;
    for(int i=0;i<7;i++){
      System.out.println("Dia numero: "+(i+1));
      for(int j=0;j<12;j++){
        if(semana[j][i]!=null){
          cont++;
          System.out.print(ANSI_GREEN+ "Hora: "+(j+1) +" "+ semana[j][i]+"  "+ANSI_RESET);
        }else{
          System.out.print("Hora: "+(j+1) + " Vacio  ");
        }
      }
      System.out.println("");
      System.out.println("");
    }
    System.out.println("Porcentaje semanal: "+ (((cont*100))/72)+"%");
  }

  public void reporteDia(){
    Scanner sctemp = new Scanner(System.in);
    int diaReporte = 0;
    System.out.println("Digite el dia que desea generar el reporte: ");
    if(diaReporte>0 && diaReporte<7){
      diaReporte = sctemp.nextInt();
    }else{
      System.out.println("Ha digitado un dia incorrecto");
    }

    sctemp.nextLine();

    crearHorario();
    int cont=0;
      System.out.println("Dia numero: "+(diaReporte+1));

      for(int j=0;j<12;j++){
        if(semana[j][diaReporte]!=null){
          cont++;
          System.out.print(ANSI_GREEN+ "Hora: "+(j+1) +" "+ semana[j][diaReporte]+"  "+ANSI_RESET);
        }else{
          System.out.print("Hora: "+(j+1) + " Vacio  ");
        }
      }


    System.out.println("Porcentaje dia: "+ (((cont*100))/12)+"%");
  }












}
