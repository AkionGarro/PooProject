
import java.util.*;


/**
 * Class Estudiante
 */
public class Estudiante {


    //
    // Fields
    //
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private String nombreCompleto;
    private String usuario;
    private String contrasena;
    int clases = 0;
    int recreativa = 0;
    int actCurso = 0;
    int evaluaciones = 0;
    private ArrayList<Carrera> carreras = new ArrayList<Carrera>();
    private ArrayList<Curso> cursosActuales = new ArrayList<Curso>();
    private ArrayList<Actividad> actividades = new ArrayList<Actividad>();
    private ArrayList<ArrayList<Curso>> semestre = new ArrayList<ArrayList<Curso>>();
    private String[][] semana = new String[12][7];
    ArrayList<String[][]> semanas = new ArrayList<String[][]>();

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




    //
    // Accessor methods
    //

    /**
     * Get the value of semestre that contains an ArrayList of Curso
     * @return semestre
     */
    public ArrayList<ArrayList<Curso>> getSemestre() {
        return semestre;
    }
    /**
     * Set the value of nombreCompleto
     *
     * @param newVar the new value of nombreCompleto
     */
    public void setNombreCompleto(String newVar) {
        nombreCompleto = newVar;
    }

    /**
     * Get the value of nombreCompleto
     *
     * @return the value of nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Set the value of usuario
     *
     * @param newVar the new value of usuario
     */
    public void setUsuario(String newVar) {
        usuario = newVar;
    }

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set the value of contrasena
     *
     * @param newVar the new value of contrasena
     */
    public void setContrasena(String newVar) {
        contrasena = newVar;
    }

    /**
     * Get the value of contrasena
     *
     * @return the value of contrasena
     */
    public String getContrasena() {
        return contrasena;
    }


    //
    // Other methods
    //

    /** Method to change the student carreer.
     * @param carrera
     */
    public void cambiarCarrera(Carrera carrera) {
        Scanner sctemp = new Scanner(System.in);
        int temp = 0;
        for (int i = 0; i < this.carreras.size(); i++) {
            System.out.println("i: " + i + " Nombre:" + this.carreras.get(i).getNombre());
        }
        System.out.println("Digite la carrera que desea cambiar: ");
        temp = sctemp.nextInt();
        sctemp.nextLine();
        this.carreras.set(temp, carrera);

    }



    /** Method to check if is the course in the student carrer.
     * @param curso
     * @return Boolean
     */
    public Boolean validarCursoCarrera(Curso curso) {
        boolean flag = false;
        ArrayList<Carrera> carrerasCurso = curso.getCarrerasList();

        for (int i = 0; i < carrerasCurso.size(); i++) {
            for (int j = 0; j < this.carreras.size(); j++) {
                if (carrerasCurso.get(i).getNombre().toLowerCase().equals(this.carreras.get(j).getNombre().toLowerCase())) {
                    System.out.println("Si pertenece");
                    flag = true;
                }
            }
        }
        return flag;
    }

    /**
     * Method to check if the course is active
     * @param curso
     * @return
     */
    public Boolean validarCursoActivo(Curso curso) {
        boolean flag = false;
        if (curso.getEstado().toLowerCase() == "encurso") {
            flag = true;
        }

        return flag;
    }


    /**
     * Method to add courses to the semestre
     * @param curso
     */
    public void addCursoSemestre(ArrayList<Curso> curso) {
        this.semestre.add(curso);
    }

    /**
     * Method to get the courses of an specific semestre
     * @param semestre
     */
    public void getCursosSemestre(int semestre) {
        for (int i = 0; i < this.semestre.get(semestre).size(); i++) {
            System.out.println(this.semestre.get(semestre).get(i).getNombre());
        }

    }

    /**
     * Methot to the the activities
     * @return
     */
    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    /**
     * Method to add the activities to student
     * @param actividad
     */
    public void addActividades(Actividad actividad) {
        this.actividades.add(actividad);
    }


    /**
     *Method to set the current semestre
     */
    public void setCursosSemestreActual() {

        int actual = this.getSemestre().size() - 1;

        this.cursosActuales = getSemestre().get(actual);

    }

    /**
     *  Method to generate the schedule of the student, based in the courses and activities
     */
    public void crearHorario() {
        setCursosSemestreActual();
        //Bucle para llenar la matriz con los cursos
        for (int i = 0; i < this.cursosActuales.size(); i++) {
            Curso temp = this.cursosActuales.get(i);
            byte posActual = temp.getHoraInicio();
            byte posFinal = temp.getHoraFinal();
            byte dia = temp.getDia();
            for (byte j = posActual; j < posFinal; j++) {
                if (this.semana[j][dia] == null) {
                    this.clases++;
                    this.semana[j][dia] = "Clases " + temp.getNombre();
                } else {
                    System.out.println("Se presenta un choque de horario");
                }
            }
        }

        //Bucle para llenar la matriz con actividades.
        for (int i = 0; i < this.actividades.size(); i++) {
            Actividad tempAct = this.actividades.get(i);
            byte posActual = tempAct.getHoraInicio();
            byte posFinal = tempAct.getHoraFinal();
            byte dia = tempAct.getDia();
            for (byte j = posActual; j < posFinal; j++) {
                if (this.semana[j][dia] == null) {
                    if (tempAct.getClass().getName() == "ActividadCurso") {
                        this.actCurso++;
                    }
                    if (tempAct.getClass().getName() == "ActividadRecreativa") {
                        this.recreativa++;
                    }
                    if (tempAct.getClass().getName() == "Evaluaciones") {
                        this.evaluaciones++;
                    }
                    this.semana[j][dia] = "Actividad " + tempAct.getNombre();

                } else {
                    System.out.println("Se presenta un choque de horario");
                }
            }
        }
    }


    /**
     *  Method to generate the report of the week activities
     */
    public void reporteSemanal() {
        crearHorario();
        int cont = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Dia numero: " + (i + 1));
            for (int j = 0; j < 12; j++) {
                if (semana[j][i] != null) {
                    cont++;
                    System.out.print(ANSI_GREEN + "Hora: " + (j + 1) + " " + semana[j][i] + "  " + ANSI_RESET);
                } else {
                    System.out.print("Hora: " + (j + 1) + " Vacio  ");
                }
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("Porcentaje semanal: " + (((cont * 100)) / 84) + "%");
        System.out.println("Horas Ocupadas: " + cont);
    }

    /**
     * Method to generate the report of the day activities
     */
    public void reporteDia() {
        Scanner sctemp = new Scanner(System.in);
        int diaReporte = 0;
        System.out.println("Digite el dia que desea generar el reporte: ");
        if (diaReporte > 0 && diaReporte < 7) {
            diaReporte = sctemp.nextInt();
        } else {
            System.out.println("Ha digitado un dia incorrecto");
        }

        sctemp.nextLine();
        crearHorario();
        int cont = 0;
        System.out.println("Dia numero: " + (diaReporte + 1));

        for (int j = 0; j < 12; j++) {
            if (semana[j][diaReporte] != null) {
                cont++;
                System.out.print(ANSI_GREEN + "Hora: " + (j + 1) + " " + semana[j][diaReporte] + "  " + ANSI_RESET);
            } else {
                System.out.print("Hora: " + (j + 1) + " Vacio  ");
            }
        }


        System.out.println("Porcentaje dia: " + (((cont * 100)) / 12) + "%");
    }


    /**
     * Method to get the available  time in the week
     */
    public void reporteTiempoDisponibleSemana() {
        boolean flag = false;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 12; j++) {
                if (semana[j][i] != null) {
                    flag = true;
                }
            }
        }
        if (flag == false) {
            crearHorario();
        }
        int cont = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 12; j++) {
                if (semana[j][i] != null) {
                    cont++;
                }
            }
        }
        System.out.println("Tiempo disponible " + (84 - cont) + " horas");

    }

    /**
     * Method to generate a report to activity percent
     */
    public void reportePorcentajePorTipoActividad() {
        boolean flag = false;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 12; j++) {
                if (semana[j][i] != null) {
                    flag = true;
                }
            }
        }
        if (flag == false) {
            crearHorario();
        }
        System.out.println("Porcentaje por Asistencia a Clases: " + ((this.clases * 100)) / 84 + "%");
        System.out.println("Porcentaje por Actividades Curso: " + ((this.actCurso * 100)) / 84 + "%");
        System.out.println("Porcentaje por Actividades Recreativa: " + ((this.recreativa * 100)) / 84 + "%");
        System.out.println("Porcentaje por Actividades Evaluaciones: " + ((this.evaluaciones * 100)) / 84 + "%");


    }


    /**
     * Method add a new Student to the system
     * @param carreras
     * @return
     */
    public static Estudiante ingresarEstudiantes(ArrayList<Carrera> carreras) {
        Scanner sctemp = new Scanner(System.in);

        String nombreCompleto = "";
        String usuario = "";
        String contrasena = "";
        ArrayList<Carrera> carrerasEstudiante = new ArrayList<Carrera>();

        System.out.println("Digite el nombre del estudiante:");
        nombreCompleto = sctemp.nextLine();
        System.out.println("Digite el nombre de usuario:");
        usuario = sctemp.nextLine();
        System.out.println("Digite la contrasena:");
        contrasena = sctemp.nextLine();
        System.out.println("------------Carreras disponibles-------------");
        carrerasEstudiante = Carrera.seleccionarCarreras(carreras);

        Estudiante est = new Estudiante(nombreCompleto, usuario, contrasena, carrerasEstudiante);
        return est;

    }


    /**
     * Method to select the current student
     * @param estudiantes
     * @return
     */
    public static Estudiante seleccionarEstudiantes(ArrayList<Estudiante> estudiantes) {
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("i: " + i + " Nombre:" + estudiantes.get(i).getNombreCompleto());
        }
        Scanner sctemp = new Scanner(System.in);
        Estudiante tempEstudiante;
        int n = 0;
        System.out.println("El numero del estudiante a elegir:");
        n = sctemp.nextInt();
        sctemp.nextLine();
        tempEstudiante = estudiantes.get(n);
        boolean flag = false;

        do {
            String contra = "";
            String usuario = "";
            System.out.println("Digite el usuario:");
            usuario = sctemp.nextLine();
            sctemp.nextLine();
            System.out.println("Digite la contrasena:");
            contra = sctemp.nextLine();
            sctemp.nextLine();
            flag = Estudiante.checkLogin(usuario, contra, tempEstudiante);
        }
        while (flag != true);
        Estudiante estudiante2 = estudiantes.get(n);
        return estudiante2;
    }

    /**
     * Method to check if the selected student is the correct owner.
     * @param usuario
     * @param contrasena
     * @param est
     * @return
     */
    public static Boolean checkLogin(String usuario, String contrasena, Estudiante est) {
        boolean flag = false;
        Estudiante temp = est;
        if (usuario.equals(temp.getUsuario()) && contrasena.equals(temp.getContrasena())) {
            flag = true;
        } else {
            System.out.println("No coinciden los credenciales");
        }
        return flag;
    }

}