import java.util.ArrayList;
import java.util.Scanner;

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


    /**
     * Constructor of the class
     */
    public Actividad(String nombre, byte horaInicio, byte horaFinal, byte dia) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.dia = dia;
    }


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
     * Get the value of horaInicio
     *
     * @return the value of horaInicio
     */
    public byte getHoraInicio() {
        return horaInicio;
    }

    /**
     * Set the value of horaInicio
     *
     * @param horaInicio the new value of horaInicio
     */
    public void setHoraInicio(byte horaInicio) {
        this.horaInicio = horaInicio;
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
     * Set the value of horaFinal
     *
     * @param horaFinal the new value of horaFinal
     */
    public void setHoraFinal(byte horaFinal) {
        this.horaFinal = horaFinal;
    }

    /**
     * Get the value of dia
     *
     * @return the value of dia
     */
    public byte getDia() {
        return dia;
    }

    /**
     * Set the value of dia
     *
     * @param dia the new value of dia
     */
    public void setDia(byte dia) {
        this.dia = dia;
    }


    //
    // Other methods
    //

    /**
     * Add new Actividad to a student.
     *
     * @param estudiante the current studend to add an Activity
     * @param cursos     all of avaliable courses
     */

    public static void agregarActividad(Estudiante estudiante, ArrayList<Curso> cursos) {
        Scanner sctemp = new Scanner(System.in);
        int n = 0;
        System.out.println("Tipos de actividades disponibles ");
        System.out.println("1. Actividad Recreativa");
        System.out.println("2. Actividad Curso");
        System.out.println("3. Evaluaciones");
        n = sctemp.nextInt();

        switch (n) {
            case 1:
                String nombre = "";
                byte horaInc = 0;
                byte horaFin = 0;
                byte horasAc = 0;
                byte diaAc = 0;
                String descrip = "";
                System.out.println("Digite el nombre de la actividad:");
                nombre = sctemp.nextLine();
                sctemp.nextLine();
                System.out.println("Digite la hora de inicio:");
                horaInc = sctemp.nextByte();
                sctemp.nextLine();
                System.out.println("Digite al hora final:");
                horaFin = sctemp.nextByte();
                sctemp.nextLine();
                System.out.println("Digite la cantidad de horas:");
                horasAc = sctemp.nextByte();
                sctemp.nextLine();
                System.out.println("Digite el dia:");
                diaAc = sctemp.nextByte();
                sctemp.nextLine();
                System.out.println("Digite la descripcion de la actividad:");
                descrip = sctemp.nextLine();
                sctemp.nextLine();

                ActividadRecreativa ar = new ActividadRecreativa(nombre, horaInc, horaFin, horasAc, diaAc, descrip);
                estudiante.addActividades(ar);
                break;
            case 2:

                String nombreActividad = "";
                String descripcionCurso = "";
                byte fechaInicio = 0;
                byte fechaFinal = 0;
                byte dia = 0;
                System.out.println("Digite el nombre de la actividad:");
                nombreActividad = sctemp.nextLine();
                sctemp.nextLine();
                System.out.println("Digite la descripcion del curso:");
                descripcionCurso = sctemp.nextLine();
                sctemp.nextLine();
                System.out.println("Digite la hora de inicio:");
                fechaInicio = sctemp.nextByte();
                sctemp.nextLine();
                System.out.println("Digite al hora final:");
                fechaFinal = sctemp.nextByte();
                sctemp.nextLine();
                System.out.println("Digite el dia:");
                dia = sctemp.nextByte();
                sctemp.nextLine();
                Curso crs1 = Curso.seleccionarCurso(cursos);
                if (estudiante.validarCursoCarrera(crs1) == true && estudiante.validarCursoActivo(crs1)) {

                    ActividadCurso ar2 = new ActividadCurso(nombreActividad, descripcionCurso, crs1, fechaInicio, fechaFinal, dia);
                    estudiante.addActividades(ar2);
                } else {
                    System.out.println("Curso no está activo ");
                }


                break;
            case 3:
                String nombreEvaluacion = "";
                String tipo = "";
                byte hrInicio = 0;
                byte hrFin = 0;
                byte diaEv = 0;
                System.out.println("Digite el nombre de la evalacion:");
                nombreEvaluacion = sctemp.nextLine();
                sctemp.nextLine();
                System.out.println("Digite el tipo de la evaluacion:");
                tipo = sctemp.nextLine();
                sctemp.nextLine();
                System.out.println("Digite la hora de incio:");
                hrInicio = sctemp.nextByte();
                sctemp.nextLine();
                System.out.println("Digite la hora final:");
                hrFin = sctemp.nextByte();
                sctemp.nextLine();
                System.out.println("Digite el dia:");
                diaEv = sctemp.nextByte();
                sctemp.nextLine();
                Curso cursoAsociado = Curso.seleccionarCurso(cursos);
                if (estudiante.validarCursoCarrera(cursoAsociado) == true && estudiante.validarCursoActivo(cursoAsociado)) {
                    Evaluaciones e1 = new Evaluaciones(nombreEvaluacion, tipo, hrInicio, hrFin, diaEv, cursoAsociado);
                    estudiante.addActividades(e1);
                } else {
                    System.out.println("Curso no está activo ");
                }

                break;
            default:
                System.out.println("Digite una opcion correcta");
                break;

        }


    }


}
