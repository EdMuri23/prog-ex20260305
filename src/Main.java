
void main() {

    Alumno alumno1;
    Alumno alumno2;
    Alumno alumno3;

    CentroFP centroFP;

    alumno1 = new Alumno(1, "Carlos", "DAM", 21);
    alumno2 = new Alumno(2, "Ivan", "ASIR", 18);
    alumno3 = new Alumno(3, "Ana", "DAM", 19);

    centroFP = new CentroFP(50);

    System.out.println("Registro 1: " + centroFP.registrarAlumno(alumno1));
    System.out.println("Registro 2: " + centroFP.registrarAlumno(alumno2));
    System.out.println("Registro 3: " + centroFP.registrarAlumno(alumno3));
    System.out.println("Registro 4: " + centroFP.registrarAlumno(alumno2));

    //metodo para comprobar los limites del array
    centroFP.imprimirAlumnos();

    System.out.print(centroFP.mostrarAlumnos());

    System.out.println("Alumnos totales en el centro: " + centroFP.contarAlumnos());

    System.out.println("Busqueda 1: " + centroFP.buscarAlumno(5));
    System.out.println("Busqueda 2: " + centroFP.buscarAlumno(2));
}
