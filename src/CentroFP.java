public class CentroFP {

    //Atributos
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    /**CONSTRUCTOR_CENTRO FP
     *
     * @param maxAlumnos
     */
    public  CentroFP(int maxAlumnos) {

        if (maxAlumnos < 0 || maxAlumnos > 20) {
            maxAlumnos = 20;
        }

        this.MAX_ALUMNOS = maxAlumnos;
        this.alumnos = new Alumno[maxAlumnos];

    }

    /**BUSCAR_ALUMNO
     * este metodo buscara a un alumno en alunos(array)
     * @param id
     * @return alumnoBuscado --> null si no se ha encontrado, si no nos devuelven el alumno
     */
    public Alumno buscarAlumno(int id){
        Alumno alumnoBuscado = null;
        int i = 0;

        while (alumnoBuscado != null && i < this.MAX_ALUMNOS) {

            if (alumnos[i].getId() == id) {
                alumnoBuscado = alumnos[i];
            }

            i++;
        }

        return alumnoBuscado;
    }

    private int buscarPrimerHuecoLibre()
    public boolean registrarAlumno(Alumno alumno)
    public void mostrarAlumnos()
    public int contarAlumnos()
}
