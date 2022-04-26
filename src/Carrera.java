
import java.util.*;


/**
 * Class Carrera
 */
public class Carrera {

    //
    // Fields
    //

    private static ArrayList<String> nombresLista = new ArrayList<String>();
    private String nombre;
    private String codigo;
    private byte semestresTotales;
    public ArrayList<Curso> cursosLista = new ArrayList<Curso>();


    //
    // Constructors
    //

    public Carrera(String nombre, String codigo, byte semestresTotales) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestresTotales = semestresTotales;
        this.nombresLista.add(nombre);


    }
//
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Get the value of listaNombres
     *
     * @return the value of listaNombres
     */
    public static void getListaNombres() {
        System.out.println("----------------Nombres de las carreras disponibles--------------");
        for (int i = 0; i < nombresLista.size(); i++) {
            System.out.println(nombresLista.get(i).toString());
        }
        System.out.println("-----------------------------------------------------------------");
    }

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
     * Set the value of codigo
     *
     * @param newVar the new value of codigo
     */
    public void setCodigo(String newVar) {
        codigo = newVar;
    }

    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set the value of semestresTotales
     *
     * @param newVar the new value of semestresTotales
     */
    public void setSemestresTotales(byte newVar) {
        semestresTotales = newVar;
    }

    /**
     * Get the value of semestresTotales
     *
     * @return the value of semestresTotales
     */
    public byte getSemestresTotales() {
        return semestresTotales;
    }


    /**
     * Add a Cursos object to the cursosVector List
     */
    public void addCursos(Curso new_object) {
        cursosLista.add(new_object);
       // showData();
    }

    /**
     * Remove a Cursos object from cursosVector List
     */
    public void removeCursos(Curso new_object) {
        cursosLista.remove(new_object);

    }

    /**
     * Get the List of Cursos objects held by cursosVector
     *
     * @return List of Cursos objects held by cursosVector
     */
    public List getCursosList() {
        return (List) cursosLista;
    }

    public void showData() {
        for (int i = 0; i < this.cursosLista.size(); i++) {
            System.out.println(this.cursosLista.get(i).getNombre());
        }

    }

}
