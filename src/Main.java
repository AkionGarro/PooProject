import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        ArrayList<Actividad> actividades = new ArrayList<Actividad>();
        Curso[][] horario = new Curso[12][7];


        //Registro de carreras.

        Carrera pc1 = new Carrera("Computacion", "IC01", (byte) 8);
        Carrera pc2 = new Carrera("Computadores", "CE01", (byte) 10);
        Carrera pc3 = new Carrera("Administracion", "AD01", (byte) 8);
        Carrera pc4 = new Carrera("Produccion Industrial", "PI01", (byte) 10);
        Carrera pc5 = new Carrera("Mecatronica", "MC01", (byte) 10);

        carreras.add(pc1);
        carreras.add(pc2);
        carreras.add(pc3);
        carreras.add(pc4);
        carreras.add(pc5);

        //Registro de cursos

        ArrayList<Carrera> carrerasCC = new ArrayList<Carrera>();
        carrerasCC.add(carreras.get(0));
        carrerasCC.add(carreras.get(1));
        Curso pcs1 = new Curso("CC", (byte) 4, (byte) 4, (byte) 0, (byte) 4,(byte) 1, "encurso", carrerasCC, 01);

        ArrayList<Carrera> carrerasCA = new ArrayList<Carrera>();
        carrerasCA.add(carreras.get(1));
        carrerasCA.add(carreras.get(2));
        Curso pcs2 = new Curso("CA", (byte) 4, (byte) 4, (byte) 2, (byte) 6, (byte) 2,"encurso", carrerasCA, 02);

        ArrayList<Carrera> carrerasCompi = new ArrayList<Carrera>();
        carrerasCompi.add(carreras.get(2));
        carrerasCompi.add(carreras.get(3));
        Curso pcs3 = new Curso("Compiladores", (byte) 2, (byte) 2, (byte) 0, (byte) 2,(byte) 3 ,"encurso", carrerasCompi, 03);


        ArrayList<Carrera> carrerasPOO = new ArrayList<Carrera>();
        carrerasPOO.add(carreras.get(3));
        carrerasPOO.add(carreras.get(4));
        Curso pcs4 = new Curso("POO", (byte) 4, (byte) 4, (byte) 4, (byte) 7, (byte) 4, "encurso", carrerasPOO, 04);

        cursos.add(pcs1);
        cursos.add(pcs2);
        cursos.add(pcs3);
        cursos.add(pcs4);

        //Registro de estudiantes

        ArrayList<Carrera> carrerasEst1 = new ArrayList<Carrera>();
        carrerasEst1.add(carreras.get(0)); //Computacion
        carrerasEst1.add(carreras.get(3)); //Produc
        Estudiante pe1 = new Estudiante("Akion Garro Campos", "GarroAkion", "gcgc2908", carrerasEst1);
        estudiantes.add(pe1);

        ArrayList<Carrera> carrerasEst2 = new ArrayList<Carrera>();
        carrerasEst2.add(carreras.get(1)); //Computadores
        carrerasEst2.add(carreras.get(2)); //Administracion
        Estudiante pe2 = new Estudiante("Alex Perez", "Alxpe", "1234", carrerasEst2);
        estudiantes.add(pe2);

        ArrayList<Carrera> carrerasEst3 = new ArrayList<Carrera>();
        carrerasEst3.add(carreras.get(2)); //Computadores
        carrerasEst3.add(carreras.get(3)); //Produc
        Estudiante pe3 = new Estudiante("Juan Rodriguez", "JuanRod", "321", carrerasEst3);
        estudiantes.add(pe3);

        ArrayList<Carrera> carrerasEst4 = new ArrayList<Carrera>();
        carrerasEst4.add(carreras.get(4)); // Mecatronica
        carrerasEst4.add(carreras.get(3)); //Produc
        Estudiante pe4 = new Estudiante("Carlos Jiminez", "CarJi", "3122", carrerasEst4);
        estudiantes.add(pe4);


        int option = 1;

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
            System.out.println("12.Agenda semanal");

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
                case 6:
                    Estudiante e1 = seleccionarEstudiantes(estudiantes);
                    ingresarCursosSemestre(cursos, e1);
                    break;
                case 7:
                    Estudiante e2 = seleccionarEstudiantes(estudiantes);
                    seleccionarCursosSemestre(e2);
                    break;

                case 8:
                    Estudiante e3 = seleccionarEstudiantes(estudiantes);
                    ArrayList<Curso> s1 = seleccionarCursosSemestre(e3);
                    manipularEstadoCursosSemestre(s1);
                    break;
                case 9:
                    Estudiante e4 = seleccionarEstudiantes(estudiantes);
                    Carrera carreratemp = seleccionarCarrera(carreras, e4);
                    e4.cambiarCarrera(carreratemp);
                    break;
                case 10:
                    Estudiante e5 = seleccionarEstudiantes(estudiantes);
                    if (e5.getSemestre().size() > 0) {
                        seleccionarCursosSemestreActual(e5);
                    } else {
                        System.out.println("No tiene cursos agregados al semestre");
                    }

                    break;
                case 11:
                    Estudiante estAc = seleccionarEstudiantes(estudiantes);
                    agregarActividad(estAc, cursos);
                    break;

                case 12:
                    Estudiante report = seleccionarEstudiantes(estudiantes);
                    report.agendaSemanal();
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
        byte dia=0;

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
        sctemp.nextLine();
        System.out.println("Digite el dia de clases:");
        dia = sctemp.nextByte();
        sctemp.nextLine();
        Curso cr1 = new Curso(nombreCurso, creditosCurso, horasLectivasCurso, horaInicioCurso, horaFinalCurso, dia,estadoCurso, carrerasCurso, numeroGrupoCurso);
        cr1.setTiempoDedicacion(creditosCurso, horasLectivasCurso);
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

    public static Carrera seleccionarCarrera(ArrayList<Carrera> carrerasMain, Estudiante estudiante) {

        System.out.println("----------------Carreras disponibles para cambio----------");
        for (int i = 0; i < carrerasMain.size(); i++) {
            System.out.println("i: " + i + " Nombre:" + carrerasMain.get(i).getNombre());
        }
        Scanner sctemp = new Scanner(System.in);
        Carrera tempCarreras;
        int n = 0;
        System.out.println("");
        System.out.println("Digite la carrera a la que desea cambiar:");
        n = sctemp.nextInt();
        sctemp.nextLine();
        tempCarreras = carrerasMain.get(n);

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
            flag = checkLogin(usuario, contra, tempEstudiante);
        }
        while (flag != true);

        Estudiante estudiante2 = estudiantes.get(n);

        return estudiante2;

    }


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

    public static ArrayList<Curso> seleccionarCursosSemestreActual(Estudiante estudiante) {

        System.out.println("-------------Cursos semestre actual-----------------");
        int actual = estudiante.getSemestre().size() - 1;
        for (int i = 0; i < estudiante.getSemestre().get(actual).size(); i++) {
            System.out.println("Curso : " + estudiante.getSemestre().get(actual).get(i).getNombre());
        }

        return estudiante.getSemestre().get(actual);

    }


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
                byte horaInc=0;
                byte horaFin=0;
                byte horasAc = 0;
                byte diaAc=0;
                String descrip="";
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

                ActividadRecreativa ar = new ActividadRecreativa(nombre,horaInc,horaFin,horasAc,diaAc,descrip);
                estudiante.addActividades(ar);
                break;
            case 2:

                String nombreActividad = "";
                String descripcionCurso = "";
                byte fechaInicio = 0;
                byte fechaFinal = 0;
                byte dia=0;
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
                Curso crs1 = seleccionarCurso(cursos);
                if (estudiante.validarCursoCarrera(crs1) == true && estudiante.validarCursoActivo(crs1)) {

                    ActividadCurso ar2 = new ActividadCurso(nombreActividad, descripcionCurso, crs1, fechaInicio, fechaFinal,dia);
                    estudiante.addActividades(ar2);
                }else{
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
                Curso cursoAsociado = seleccionarCurso(cursos);
                if (estudiante.validarCursoCarrera(cursoAsociado) == true && estudiante.validarCursoActivo(cursoAsociado)) {
                    Evaluaciones e1 = new Evaluaciones(nombreEvaluacion, tipo, hrInicio, hrFin,diaEv,cursoAsociado);
                    estudiante.addActividades(e1);
                }else{
                    System.out.println("Curso no está activo ");
                }

                break;
            default:
                System.out.println("Digite una opcion correcta");
                break;

        }


    }


}
