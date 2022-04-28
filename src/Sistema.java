import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        ArrayList<Actividad> actividades = new ArrayList<Actividad>();

        int option = 1;

        // Hacer uso de los datos brindados en test para una ejecución mas rapida
        while (option != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------Menu opciones------------");
            System.out.println("1.Registrar de carreras");
            System.out.println("2.Registro de cursos");
            System.out.println("3.Mostrar Carreras Disponibles");
            System.out.println("4.Mostrar Cursos Disponibles");
            System.out.println("5.Ingresar Estudiantes");
            System.out.println("6.Matricular Cursos");    //--Esto debe de cambiarse a la clase
            System.out.println("7.Mostrar Cursos de un Semestre");      //--Esto debe de cambiarse a la clase
            System.out.println("8.Manipular estados de los Cursos de un Semestre"); //--Esto debe de cambiarse a la clase
            System.out.println("9.Cambiar carrera Estudiante");
            System.out.println("10.Obtener cursos del semestre actual");
            System.out.println("11.Registrar actividades");
            System.out.println("12.REPORTE semanal");
            System.out.println("13.REPORTE DIA");
            System.out.println("14.REPORTE Tiempo Disponible Semanal");
            System.out.println("15.REPORTE Porcentaje Semanal Por tipo de Actividad");

            System.out.println("Digite una opcion: ");
            option = sc2.nextInt();

            switch (option) {

                case 1:
                    Carrera c1 = Carrera.ingresarCarreras();
                    carreras.add(c1);
                    break;
                case 2:
                    Curso cr1 = Curso.ingresarCurso(carreras);
                    cursos.add(cr1);
                    break;

                case 3:
                    Carrera.mostrarCarreras(carreras);
                    break;
                case 4:
                    Curso.mostrarCursos(cursos);
                    break;
                case 5:
                    Estudiante est = Estudiante.ingresarEstudiantes(carreras);
                    estudiantes.add(est);
                    break;
                case 6:
                    Estudiante e1 = Estudiante.seleccionarEstudiantes(estudiantes);
                    Curso.ingresarCursosSemestre(cursos, e1);
                    break;
                case 7:
                    Estudiante e2 = Estudiante.seleccionarEstudiantes(estudiantes);
                    Curso.seleccionarCursosSemestre(e2);
                    break;

                case 8:
                    Estudiante e3 = Estudiante.seleccionarEstudiantes(estudiantes);
                    ArrayList<Curso> s1 = Curso.seleccionarCursosSemestre(e3);
                    Curso.manipularEstadoCursosSemestre(s1);
                    break;
                case 9:
                    Estudiante e4 = Estudiante.seleccionarEstudiantes(estudiantes);
                    Carrera carreratemp = Carrera.seleccionarCarrera(carreras, e4);
                    e4.cambiarCarrera(carreratemp);
                    break;
                case 10:
                    Estudiante e5 = Estudiante.seleccionarEstudiantes(estudiantes);
                    if (e5.getSemestre().size() > 0) {
                        Curso.seleccionarCursosSemestreActual(e5);
                    } else {
                        System.out.println("No tiene cursos agregados al semestre");
                    }

                    break;
                case 11:
                    Estudiante estAc = Estudiante.seleccionarEstudiantes(estudiantes);
                    Actividad.agregarActividad(estAc, cursos);
                    break;

                case 12:
                    Estudiante report = Estudiante.seleccionarEstudiantes(estudiantes);
                    report.reporteSemanal();
                    break;

                case 13:
                    Estudiante report1 = Estudiante.seleccionarEstudiantes(estudiantes);
                    report1.reporteDia();
                    break;

                case 14:
                    Estudiante report2 = Estudiante.seleccionarEstudiantes(estudiantes);
                    report2.reporteTiempoDisponibleSemana();
                    break;

                case 15:
                    Estudiante report3 = Estudiante.seleccionarEstudiantes(estudiantes);
                    report3.reportePorcentajePorTipoActividad();
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
}
