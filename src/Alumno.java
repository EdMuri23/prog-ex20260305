public class Alumno {

    //Atributos
    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    /**CONSTRUCTOR_ALUMNO
     *
     * @param id
     * @param nombre
     * @param tituloFP
     * @param edad
     */
    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTituloFP() {
        return tituloFP;
    }

    public int getEdad() {
        return edad;
    }

    //ToString
    public String toString() {
        StringBuilder infoAlum = new StringBuilder("Alumno: ");
        infoAlum.append(id + "\n\t");
        infoAlum.append("nombre:" + nombre + "\n\t");
        infoAlum.append("titulo:" + tituloFP + "\n\t");
        infoAlum.append("edad:" + edad +"\n");

        return infoAlum.toString();
    }
}
