package escuela;

import java.util.ArrayList;

public class EscuelaP {
    private String name;
    private ArrayList<Alumno> alumnos;

    public EscuelaP() {
        this(null);
    }

    public EscuelaP(String name) {
        this.name  = name;
        alumnos = new ArrayList<>();
    }

    public void addStudent(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void imprimirAlumnos() {
        System.out.println("Alumnos: ");
        for (Alumno alumno : alumnos) {
            System.out.println("- Nombre" + alumno.regresaNombre() + "\n" +
                               "  Matricula: " + alumno.regresaMatricula());
            alumno.imprimeMaterias();
        }
    }

    public String getName() {
        return name;
    }

}
