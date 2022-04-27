import javax.swing.text.Caret;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc2 = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        ArrayList<Actividad> actividades = new ArrayList<Actividad>();

        //Registro de carreras.

        Carrera pc1 = new Carrera("Computacion","IC01",(byte) 8);
        Carrera pc2 = new Carrera("Computadores","CE01",(byte) 10);
        Carrera pc3 = new Carrera("Administracion","AD01",(byte) 8);
        Carrera pc4 = new Carrera("Produccion Industrial","PI01",(byte) 10);
        Carrera pc5 = new Carrera("Mecatronica","MC01",(byte) 10);

        carreras.add(pc1);
        carreras.add(pc2);
        carreras.add(pc3);
        carreras.add(pc4);
        carreras.add(pc5);

        //Registro de cursos

        ArrayList<Carrera> carrerasCC = new ArrayList<Carrera>();
        carrerasCC.add(carreras.get(0));
        carrerasCC.add(carreras.get(1));
        Curso pcs1 = new Curso("CC",(byte) 4,(byte) 4,(byte) 8 , (byte) 12,"Aprobado",carrerasCC,01);

        ArrayList<Carrera> carrerasCA = new ArrayList<Carrera>();
        carrerasCA.add(carreras.get(1));
        carrerasCA.add(carreras.get(2));
        Curso pcs2 = new Curso("CA",(byte) 4,(byte) 4,(byte) 8 , (byte) 12,"Aprobado",carrerasCA,02);

        ArrayList<Carrera> carrerasCompi = new ArrayList<Carrera>();
        carrerasCompi.add(carreras.get(2));
        carrerasCompi.add(carreras.get(3));
        Curso pcs3 = new Curso("Compiladores",(byte) 4,(byte) 4,(byte) 8 , (byte) 12,"Aprobado",carrerasCompi,03);


        ArrayList<Carrera> carrerasPOO = new ArrayList<Carrera>();
        carrerasPOO.add(carreras.get(3));
        carrerasPOO.add(carreras.get(4));
        Curso pcs4 = new Curso("POO",(byte) 4,(byte) 4,(byte) 8 , (byte) 12,"Aprobado",carrerasPOO,04);

        cursos.add(pcs1);
        cursos.add(pcs2);
        cursos.add(pcs3);
        cursos.add(pcs4);

        //Registro de estudiantes

        ArrayList<Carrera> carrerasEst1 = new ArrayList<Carrera>();
        carrerasEst1.add(carreras.get(0)); //Computacion
        carrerasEst1.add(carreras.get(3)); //Produ
        Estudiante pe1=new Estudiante("Akion Garro Campos","GarroAkion", "gcgc2908", carrerasEst1);
        estudiantes.add(pe1);

        ArrayList<Carrera> carrerasEst2 = new ArrayList<Carrera>();
        carrerasEst2.add(carreras.get(1)); //Computadores
        carrerasEst2.add(carreras.get(2)); //Administracion
        Estudiante pe2=new Estudiante("Alex Perez","Alxpe", "1234", carrerasEst2);
        estudiantes.add(pe2);

        ArrayList<Carrera> carrerasEst3 = new ArrayList<Carrera>();
        carrerasEst3.add(carreras.get(2));
        carrerasEst3.add(carreras.get(3)); //Produc
        Estudiante pe3=new Estudiante("Juan Rodriguez","JuanRod", "321", carrerasEst3);
        estudiantes.add(pe3);

        ArrayList<Carrera> carrerasEst4 = new ArrayList<Carrera>();
        carrerasEst4.add(carreras.get(4)); // Mecatronica
        carrerasEst4.add(carreras.get(3));
        Estudiante pe4=new Estudiante("Carlos Jiminez","CarJi", "3122", carrerasEst4);
        estudiantes.add(pe4);



        //Registro
    }
}
