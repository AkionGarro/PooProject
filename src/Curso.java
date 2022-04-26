
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
    private String horaInicio;
    private String horaFinal;
    private String estado;
    public ArrayList<Carrera> carrerasLista = new ArrayList<Carrera>();
    private int numeroGrupo;


    //
    // Constructors
    //


    public Curso(String nombre, byte creditos, byte horasLectivas, String horaInicio, String horaFinal, String estado,ArrayList<Carrera> carreras,int numeroGrupo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.horasLectivas = horasLectivas;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.estado = estado;
        this.numeroGrupo=numeroGrupo;
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
    public void setHoraInicio(String newVar) {
        horaInicio = newVar;
    }

    /**
     * Get the value of horaInicio
     *
     * @return the value of horaInicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Set the value of horaFinal
     *
     * @param newVar the new value of horaFinal
     */
    public void setHoraFinal(String newVar) {
        horaFinal = newVar;
    }

    /**
     * Get the value of horaFinal
     *
     * @return the value of horaFinal
     */
    public String getHoraFinal() {
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
        for(int i=0;i<new_object.size();i++){
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
    public List getCarrerasList() {
        return (List) carrerasLista;
    }

    public void showData() {
        for (int i = 0; i < this.carrerasLista.size(); i++) {
            System.out.println(this.carrerasLista.get(i).getNombre());
        }

    }

}
