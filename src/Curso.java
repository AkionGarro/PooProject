
import java.util.*;


/**
 * Class Curso
 */
public class Curso {

    //
    // Fields
    //

    private String nombre;
    private byte creditos;
    private byte horasLectivas;
    private byte horaInicio;
    private byte horaFinal;
    private byte dia;
    private String estado;
    public ArrayList<Carrera> carrerasLista = new ArrayList<Carrera>();
    private int numeroGrupo;
    private byte tiempoDedicacion;


    //
    // Constructors
    //


    public Curso(String nombre, byte creditos, byte horasLectivas, byte horaInicio, byte horaFinal, byte dia, String estado, ArrayList<Carrera> carreras, int numeroGrupo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.horasLectivas = horasLectivas;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.estado = estado;
        this.dia = dia;
        this.numeroGrupo = numeroGrupo;
        this.addCarreras(carreras);
    }


    ;

    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Set the value of nombre
     *
     * @param newVar the new value of nombre
     */
    public void setNombre(String newVar) {
        nombre = newVar;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of creditos
     *
     * @param newVar the new value of creditos
     */
    public void setCreditos(byte newVar) {
        creditos = newVar;
    }

    /**
     * Get the value of creditos
     *
     * @return the value of creditos
     */
    public byte getCreditos() {
        return creditos;
    }

    /**
     * Set the value of horasLectivas
     *
     * @param newVar the new value of horasLectivas
     */
    public void setHorasLectivas(byte newVar) {
        horasLectivas = newVar;
    }

    /**
     * Get the value of horasLectivas
     *
     * @return the value of horasLectivas
     */
    public byte getHorasLectivas() {
        return horasLectivas;
    }

    /**
     * Set the value of horaInicio
     *
     * @param newVar the new value of horaInicio
     */
    public void setHoraInicio(byte newVar) {
        horaInicio = newVar;
    }

    /**
     * Get the value of horaInicio
     *
     * @return the value of horaInicio
     */
    public byte getHoraInicio() {
        return horaInicio;
    }

    /**
     * Set the value of horaFinal
     *
     * @param newVar the new value of horaFinal
     */
    public void setHoraFinal(byte newVar) {
        horaFinal = newVar;
    }

    /**
     * Get the value of horaFinal
     *
     * @return the value of horaFinal
     */
    public byte getHoraFinal() {
        return horaFinal;
    }

    /**
     * Set the value of estado
     *
     * @param newVar the new value of estado
     */
    public void setEstado(String newVar) {
        estado = newVar;
    }

    /**
     * Get the value of estado
     *
     * @return the value of estado
     */
    public String getEstado() {
        return estado;
    }


    /**
     * Add a Carreras object to the carrerasVector List
     */
    public void addCarreras(ArrayList<Carrera> new_object) {
        for (int i = 0; i < new_object.size(); i++) {
            addCarrera(new_object.get(i));
        }
    }

    /**
     * Add a Carreras object to the carrerasVector List
     */
    public void addCarrera(Carrera new_object) {

        carrerasLista.add(new_object);
        new_object.addCursos(this);
    }

    /**
     * Remove a Carreras object from carrerasVector List
     */
    public void removeCarreras(Carrera new_object) {
        carrerasLista.remove(new_object);
        new_object.removeCursos(this);
    }

    /**
     * Get the List of Carreras objects held by carrerasVector
     *
     * @return List of Carreras objects held by carrerasVector
     */
    public ArrayList<Carrera> getCarrerasList() {
        return this.carrerasLista;
    }


    /**
     * Method to get the dedication time
     * @param creditos
     * @param horas
     */
    public void setTiempoDedicacion(byte creditos, byte horas) {
        byte temp = (byte) (creditos * 3);
        this.tiempoDedicacion = (byte) (temp - horas);
    }

    /**
     * Metho to get the day of class
     * @return
     */
    public byte getDia() {
        return dia;
    }

    /**
     * Set the new value of day
     * @param dia
     */
    public void setDia(byte dia) {
        this.dia = dia;
    }

    /**
     * Get the number of group
     * @return
     */
    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    /**
     *  Set the new value of group number
     * @param numeroGrupo
     */
    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    /**
     * Set the new value of group number
     * @return
     */
    public byte getTiempoDedicacion() {
        return tiempoDedicacion;
    }

    /**
     * Set the new value of dedication time
     * @param tiempoDedicacion
     */
    public void setTiempoDedicacion(byte tiempoDedicacion) {
        this.tiempoDedicacion = tiempoDedicacion;
    }

    /**
     * Show the current courses added to the main list
     * @param cursos
     */
    public static void mostrarCursos(ArrayList<Curso> cursos) {
        System.out.println("-----------------------Cursos disponibles----------------------");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Curso " + i + ": " + cursos.get(i).getNombre());
        }
        System.out.println("-----------------------------------------------------------------");

    }

    /**
     * Method to add new Course
     * @param carreras
     * @return
     */
    public static Curso ingresarCurso(ArrayList<Carrera> carreras) {
        Scanner sctemp = new Scanner(System.in);
        String nombreCurso = "";
        byte creditosCurso = 0;
        byte horasLectivasCurso = 0;
        byte horaInicioCurso = 0;
        byte horaFinalCurso = 0;
        String estadoCurso = "";
        ArrayList<Carrera> carrerasCurso = new ArrayList<Carrera>();
        int numeroGrupoCurso = 0;
        byte dia = 0;

        System.out.println("Digite el nombre del curso:");
        nombreCurso = sctemp.nextLine();
        System.out.println("Digite la cantidad de creditos del curso:");
        creditosCurso = sctemp.nextByte();
        System.out.println("Digite la hora de inicio del curso:");
        horaInicioCurso = sctemp.nextByte();
        System.out.println("Digite la hora final del curso:");
        horaFinalCurso = sctemp.nextByte();
        System.out.println("Digite el estado del curso: (Aprobado-Reprobado-EnCurso)");
        estadoCurso = sctemp.nextLine();
        sctemp.nextLine();
        System.out.println("------------Carreras disponibles-------------");
        carrerasCurso = Carrera.seleccionarCarreras(carreras);
        System.out.println("Digite el numero de grupo del curso:");
        numeroGrupoCurso = sctemp.nextInt();
        sctemp.nextLine();
        System.out.println("Digite el dia de clases:");
        dia = sctemp.nextByte();
        sctemp.nextLine();
        Curso cr1 = new Curso(nombreCurso, creditosCurso, horasLectivasCurso, horaInicioCurso, horaFinalCurso, dia, estadoCurso, carrerasCurso, numeroGrupoCurso);
        cr1.setTiempoDedicacion(creditosCurso, horasLectivasCurso);
        return cr1;

    }

    /**
     * Method to add courses into studend semestre
     * @param disponibles
     * @param estudiante
     */

    public static void ingresarCursosSemestre(ArrayList<Curso> disponibles, Estudiante estudiante) {

        boolean flag = true;
        Scanner sctemp = new Scanner(System.in);
        ArrayList<Curso> cursosAgregar = new ArrayList<Curso>();
        cursosAgregar = seleccionarCursos(disponibles);
        for (int i = 0; i < cursosAgregar.size(); i++) {
            if (estudiante.validarCursoCarrera(cursosAgregar.get(i)) == false) {
                cursosAgregar.remove(cursosAgregar.get(i));
            }
        }
        if (cursosAgregar.size() > 0) {
            estudiante.addCursoSemestre(cursosAgregar);
        }

    }


    /**
     * Method to select the courses
     * @param cursos
     * @return
     */
    public static ArrayList<Curso> seleccionarCursos(ArrayList<Curso> cursos) {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("i: " + i + " Nombre:" + cursos.get(i).getNombre());
        }
        Scanner sctemp = new Scanner(System.in);
        ArrayList<Curso> tempCursos = new ArrayList<Curso>();
        int n = 0;
        System.out.println("Digite la cantidad de cursos que desea agregar:");
        n = sctemp.nextInt();
        sctemp.nextLine();
        for (int i = 0; i < n; i++) {
            int temp = 0;
            System.out.println("Digite el curso que desea agregar:");
            temp = sctemp.nextInt();
            tempCursos.add(cursos.get(temp));
        }
        return tempCursos;

    }

    /**
     * Method to select specific course
     * @param cursos
     * @return
     */

    public static Curso seleccionarCurso(ArrayList<Curso> cursos) {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("i: " + i + " Nombre:" + cursos.get(i).getNombre());
        }
        Scanner sctemp = new Scanner(System.in);
        Curso tempCursos;
        int n = 0;
        System.out.println("Digite el curso que desea agregar:");
        n = sctemp.nextInt();
        sctemp.nextLine();
        tempCursos = cursos.get(n);
        return tempCursos;
    }


    /**
     * Method to select the courses of the semestre
     * @param estudiante
     * @return
     */
    public static ArrayList<Curso> seleccionarCursosSemestre(Estudiante estudiante) {
        Scanner sctemp = new Scanner(System.in);
        int n = 0;
        System.out.println("-------------Semestres disponibles-----------------");
        for (int i = 0; i < estudiante.getSemestre().size(); i++) {
            System.out.println("Semestre : " + i);
        }
        System.out.println("");
        System.out.println("Digite el semestre que desea seleccionar: ");
        n = sctemp.nextInt();
        for (int i = 0; i < estudiante.getSemestre().get(n).size(); i++) {
            System.out.println("Curso del semestre " + n + " --->" + estudiante.getSemestre().get(n).get(i).getNombre());
        }

        return estudiante.getSemestre().get(n);

    }

    /**
     * Method to select the current semestre courses
     * @param estudiante
     * @return
     */
    public static ArrayList<Curso> seleccionarCursosSemestreActual(Estudiante estudiante) {

        System.out.println("-------------Cursos semestre actual-----------------");
        int actual = estudiante.getSemestre().size() - 1;
        for (int i = 0; i < estudiante.getSemestre().get(actual).size(); i++) {
            System.out.println("Curso : " + estudiante.getSemestre().get(actual).get(i).getNombre());
        }

        return estudiante.getSemestre().get(actual);

    }


    /**
     * Method to change the state of courses
     * @param cursos
     */
    public static void manipularEstadoCursosSemestre(ArrayList<Curso> cursos) {
        Scanner sctemp = new Scanner(System.in);
        int n = 0;
        String estado = "";
        System.out.println("-------------Cursos Disponibles-----------------");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("i : " + i + " Nombre: " + cursos.get(i).getNombre() + " Estado: " + cursos.get(i).getEstado());
        }
        System.out.println("");
        System.out.println("Digite el curso que desea cambiar de estado: ");
        n = sctemp.nextInt();
        sctemp.nextLine();
        System.out.println("Digite al estado que desea cambiar: ");
        estado = sctemp.nextLine();
        sctemp.nextLine();

        Curso c1 = cursos.get(n);
        c1.setEstado(estado);
        System.out.println(" Nombre: " + cursos.get(n).getNombre() + " Estado: " + cursos.get(n).getEstado());

    }
}
