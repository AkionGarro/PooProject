import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

//        Carrera c1 = new Carrera("Computadores","CE", (byte) 12);
//        Carrera c2 = new Carrera("Admi Tecnologías","TIC", (byte) 12);
//        Carrera c3 = new Carrera("Computacion","IC", (byte) 12);
//        carreras.add(c1);
//        carreras.add(c2);
//        carreras.add(c3);
//        Curso cs1 = new Curso("Compi",(byte) 4,(byte) 4,"Martes 12 md","Martes 4pm","Cursando",carreras,51);
//        cs1.showData();

        int option = 1;

        while (option != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------Menu opciones------------");
            System.out.println("1.Registrar de carreras");
            System.out.println("2.Registro de cursos");
            System.out.println("3.Mostrar Carreras");
            System.out.println("4.Mostrar Cursos");
            System.out.println("5.Ingresar Estudiantes");


            System.out.println("Digite una opcion: ");
            option = sc2.nextInt();

            switch (option) {

                case 1:
                    Carrera c1 = ingresarCarreras();
                    carreras.add(c1);
                    break;
                case 2:
                    Curso cr1 = ingresarCurso(carreras);
                    cursos.add(cr1);
                    break;

                case 3:
                    mostrarCarreras(carreras);
                    break;
                case 4:
                    mostrarCursos(cursos);
                    break;
                case 5:
                    Estudiante est = ingresarEstudiantes(carreras);
                    estudiantes.add(est);
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Se ha digitado una opcion incorrecta");
                    break;

            }

        }


    }

    public static Carrera ingresarCarreras() {
        Carrera.getListaNombres();
        Scanner sctemp = new Scanner(System.in);
        String nombreCarrera = "";
        String codigoCarrera = "";
        byte semestresTotalesCarrera = 0;

        System.out.println("Digite el nombre de la carrera:");
        nombreCarrera = sctemp.nextLine();
        sctemp.nextLine();
        System.out.println("Digite el codigo de la carrera:");
        codigoCarrera = sctemp.nextLine();
        sctemp.nextLine();
        System.out.println("Digite la cantidad de semestres:");
        semestresTotalesCarrera = sctemp.nextByte();
        sctemp.nextLine();
        Carrera c1 = new Carrera(nombreCarrera, codigoCarrera, semestresTotalesCarrera);
        return c1;

    }

    public static void mostrarCarreras(ArrayList<Carrera> carreras) {
        System.out.println("-----------------------Carreras disponibles----------------------");
        for (int i = 0; i < carreras.size(); i++) {
            System.out.println("Carrera " + i + ": " + carreras.get(i).getNombre());
        }
        System.out.println("-----------------------------------------------------------------");

    }

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
        carrerasCurso = seleccionarCarreras(carreras);
        System.out.println("Digite el numero de grupo del curso:");
        numeroGrupoCurso = sctemp.nextInt();
        Curso cr1 = new Curso(nombreCurso, creditosCurso, horasLectivasCurso, horaInicioCurso, horaFinalCurso, estadoCurso, carrerasCurso, numeroGrupoCurso);
        return cr1;

    }


    public static void mostrarCursos(ArrayList<Curso> cursos) {
        System.out.println("-----------------------Cursos disponibles----------------------");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Curso " + i + ": " + cursos.get(i).getNombre());
        }
        System.out.println("-----------------------------------------------------------------");

    }

    public static ArrayList<Carrera> seleccionarCarreras(ArrayList<Carrera> carrerasMain) {
        for (int i = 0; i < carrerasMain.size(); i++) {
            System.out.println("i: " + i + " Nombre:" + carrerasMain.get(i).getNombre());
        }
        Scanner sctemp = new Scanner(System.in);
        ArrayList<Carrera> tempCarreras = new ArrayList<Carrera>();
        int n = 0;
        System.out.println("Digite la cantidad de carreras a las que pertenece:");
        n = sctemp.nextInt();
        sctemp.nextLine();
        for (int i = 0; i < n; i++) {
            int temp = 0;
            System.out.println("Digite la carrera que desea agregar:");
            temp = sctemp.nextInt();
            tempCarreras.add(carrerasMain.get(temp));
        }
        return tempCarreras;

    }


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
        carrerasEstudiante = seleccionarCarreras(carreras);

        Estudiante est = new Estudiante(nombreCompleto, usuario, contrasena, carrerasEstudiante);
        return est;

    }

    public static void ingresarCursosSemestre(ArrayList<Curso> disponibles,Estudiante estudiante) {
        Scanner sctemp = new Scanner(System.in);

        ArrayList<Curso> cursosAgregar = new ArrayList<Curso>();
        seleccionarCursos(disponibles);
        System.out.println("Digite el nombre del estudiante:");
        nombreCompleto = sctemp.nextLine();
        System.out.println("Digite el nombre de usuario:");
        usuario = sctemp.nextLine();
        System.out.println("Digite la contrasena:");
        contrasena = sctemp.nextLine();
        System.out.println("------------Carreras disponibles-------------");
        carrerasEstudiante = seleccionarCarreras(carreras);

        Estudiante est = new Estudiante(nombreCompleto, usuario, contrasena, carrerasEstudiante);
        return est;

    }


    public static ArrayList<Curso> seleccionarCursos(ArrayList<Curso> cursos) {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("i: " + i + " Nombre:" + cursos.get(i).getNombre());
        }
        Scanner sctemp = new Scanner(System.in);
        ArrayList<Curso> tempCursos= new  ArrayList<Curso>();
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





}
