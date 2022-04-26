import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();

        Carrera c1 = new Carrera("Computadores","CE", (byte) 12);
        Carrera c2 = new Carrera("Admi Tecnologías","TIC", (byte) 12);
        Carrera c3 = new Carrera("Computacion","IC", (byte) 12);
        carreras.add(c1);
        carreras.add(c2);
        carreras.add(c3);
        Curso cs1 = new Curso("Compi",(byte) 4,(byte) 4,"Martes 12 md","Martes 4pm","Cursando",carreras,51);
        cs1.showData();



    }
}
