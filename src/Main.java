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
        Curso pcs1 = new Curso("CC", (byte) 4, (byte) 4, (byte) 8, (byte) 12, "Aprobado", carrerasCC, 01);

        ArrayList<Carrera> carrerasCA = new ArrayList<Carrera>();
        carrerasCA.add(carreras.get(1));
        carrerasCA.add(carreras.get(2));
        Curso pcs2 = new Curso("CA", (byte) 4, (byte) 4, (byte) 8, (byte) 12, "Aprobado", carrerasCA, 02);

        ArrayList<Carrera> carrerasCompi = new ArrayList<Carrera>();
        carrerasCompi.add(carreras.get(2));
        carrerasCompi.add(carreras.get(3));
        Curso pcs3 = new Curso("Compiladores", (byte) 4, (byte) 4, (byte) 8, (byte) 12, "Aprobado", carrerasCompi, 03);


        ArrayList<Carrera> carrerasPOO = new ArrayList<Carrera>();
        carrerasPOO.add(carreras.get(3));
        carrerasPOO.add(carreras.get(4));
        Curso pcs4 = new Curso("POO", (byte) 4, (byte) 4, (byte) 8, (byte) 12, "Aprobado", carrerasPOO, 04);

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
            System.out.println("6.Ingresar Cursos a un Semestre");    //--Esto debe de cambiarse a la clase
            System.out.println("7.Mostrar Cursos de un Semestre");      //--Esto debe de cambiarse a la clase
            System.out.println("8.Manipular estados de los Cursos de un Semestre"); //--Esto debe de cambiarse a la clase
            System.out.println("9.Obtener cursos del semestre actual");

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

    public static void ingresarCursosSemestre(ArrayList<Curso> disponibles, Estudiante estudiante) {

        boolean flag = true;
        Scanner sctemp = new Scanner(System.in);
        ArrayList<Curso> cursosAgregar = new ArrayList<Curso>();
        cursosAgregar = seleccionarCursos(disponibles);
        for (int i = 0; i < cursosAgregar.size(); i++) {
            if (estudiante.validarCursoCarrera(cursosAgregar.get(i))==false) {
                cursosAgregar.remove(cursosAgregar.get(i));
            }
        }
        if(cursosAgregar.size()>0){
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


        boolean flag =false;

        do {
            String contra="";
            String usuario="";
            System.out.println("Digite el usuario:");
            usuario = sctemp.nextLine();
            sctemp.nextLine();
            System.out.println("Digite la contrasena:");
            contra = sctemp.nextLine();
            sctemp.nextLine();
            flag =checkLogin(usuario,contra,tempEstudiante);
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
        int size = estudiante.getSemestre().size() - 1;
        for (int i = 0; i < estudiante.getSemestre().get(size).size(); i++) {
            System.out.println("Curso : " + estudiante.getSemestre().get(size).get(i).getNombre());
        }

        return estudiante.getSemestre().get(size);

    }


    public static void manipularEstadoCursosSemestre(ArrayList<Curso> cursos) {
        Scanner sctemp = new Scanner(System.in);
        int n = 0;
        String estado = "";
        System.out.println("-------------Cursos Disponibles-----------------");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("i : " + i + " Nombre: " + cursos.get(i).getNombre()+ " Estado: "+ cursos.get(i).getEstado());
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

        System.out.println(" Nombre: " + cursos.get(n).getNombre()+ " Estado: "+ cursos.get(n).getEstado());


    }

    public static Boolean checkLogin(String usuario,String contrasena,Estudiante est){
        boolean flag = false;
        Estudiante temp = est;
        if(usuario.equals(temp.getUsuario()) && contrasena.equals(temp.getContrasena())){
            flag =true;
        }else{
            System.out.println("No coinciden los credenciales");
        }
        return flag;
    }


}
