package escuela;

public class UserEscuela {

    public static void main(String[] args) {
        /*
       Alumno alumno1 = new Alumno("Pepe","1000");
       Materia BD = new Materia("Bases de Datos",3);
       Materia Paradigmas = new Materia("Paradigmas",3);
       alumno1.agregarMateria(BD);
       alumno1.agregarMateria(Paradigmas);
       
        System.out.println("Materias del alumno1");
        alumno1.imprimeMaterias();
        */
        EscuelaP escuela = new EscuelaP("ESCOM");
        Alumno alumno1 = new Alumno("Pepe","1000");
        Alumno alumno2 = new Alumno("Luis", "1032");
        Alumno alumno3 = new Alumno("Jose", "4234");

        alumno1.addMateria("Paradigmas", 3);
        alumno1.addMateria("Base de datos", 3);
        alumno1.addMateria("Sistemas Operativos", 4);

        alumno2.addMateria("Ec. Diferenciales", 3);
        alumno2.addMateria("Finanzas empresariales", 3);
        alumno2.addMateria("Analisis y diseño de algoritmos", 3);

        alumno3.addMateria("Calculo aplicado", 2);
        alumno3.addMateria("Analisis vectorial", 1);
        alumno3.addMateria("Algebra lineal", 2);

        escuela.addStudent(alumno1);
        escuela.addStudent(alumno2);
        escuela.addStudent(alumno3);

        System.out.println(escuela.getName());
        escuela.imprimirAlumnos();
        
    }
    
}
