
void main() {

    Alumno alumno1;
    Alumno alumno2;
    Alumno alumno3;

    CentroFP centroFP;

    alumno1 = new Alumno(1, "Carlos", "DAM", 21);
    alumno2 = new Alumno(2, "Ivan", "ASIR", 18);
    alumno3 = new Alumno(3, "Ana", "DAM", 19);

    centroFP = new CentroFP(50);

    System.out.println(centroFP.registrarAlumno(alumno1));
    System.out.println(centroFP.registrarAlumno(alumno2));
    System.out.println(centroFP.registrarAlumno(alumno3));
    System.out.println(centroFP.registrarAlumno(alumno2));

    centroFP.imprimirAlumnos();

    System.out.println(centroFP.mostrarAlumnos());
}
