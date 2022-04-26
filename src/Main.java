import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();

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

            System.out.println("Digite una opcion: ");
            option = sc2.nextInt();

            switch (option) {

                case 1:
                    String nombreCarrera = "";
                    String codigoCarrera = "";
                    byte semestresTotalesCarrera = 0;

                    System.out.println("Digite el nombre de la carrera:");
                    nombreCarrera = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Digite el codigo de la carrera:");
                    codigoCarrera = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Digite la cantidad de semestres:");
                    semestresTotalesCarrera = sc.nextByte();
                    sc.nextLine();
                    Carrera c1 = new Carrera(nombreCarrera, codigoCarrera, semestresTotalesCarrera);
                    carreras.add(c1);
                    break;
                case 2:

                    String nombreCurso = "";
                    byte creditosCurso = 0;
                    byte horasLectivasCurso = 0;
                    byte horaInicioCurso = 0;
                    byte horaFinalCurso = 0;
                    String estadoCurso = "";
                    ArrayList<Carrera> carrerasCurso = new ArrayList<Carrera>();
                    int numeroGrupoCurso = 0;

                    System.out.println("Digite el nombre del curso:");
                    nombreCurso = sc.nextLine();
                    System.out.println("Digite la cantidad de creditos del curso:");
                    creditosCurso = sc.nextByte();
                    System.out.println("Digite la hora de inicio del curso:");
                    horaInicioCurso = sc.nextByte();
                    System.out.println("Digite la hora final del curso:");
                    horaFinalCurso = sc.nextByte();
                    System.out.println("Digite el estado del curso: (Aprobado-Reprobado-EnCurso)");
                    estadoCurso = sc.nextLine();
                    sc.nextLine();
                    System.out.println("------------Carreras disponibles-------------");
                    carrerasCurso = ingresarCarreras(carreras);
                    System.out.println("Digite el numero de grupo del curso:");
                    numeroGrupoCurso = sc.nextInt();
                    Curso cr1 = new Curso(nombreCurso, creditosCurso, horasLectivasCurso, horaInicioCurso, horaFinalCurso, estadoCurso, carrerasCurso, numeroGrupoCurso);
                    cursos.add(cr1);
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

    public static ArrayList<Carrera> ingresarCarreras(ArrayList<Carrera> carrerasMain) {
        for (int i = 0; i < carrerasMain.size(); i++) {
            System.out.println("Carrera " + i + ": " + carrerasMain.get(i).getNombre());
        }
        Scanner sctemp = new Scanner(System.in);
        ArrayList<Carrera> tempCarreras = new ArrayList<Carrera>();
        int n = 0;
        System.out.println("Digite la cantidad de carreras a las que pertenece el curso:");
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
}
