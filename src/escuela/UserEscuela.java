package escuela;

public class UserEscuela {

    public static void main(String[] args) {
       Alumno alumno1 = new Alumno("Pepe","1000");
       Materia BD = new Materia("Bases de Datos",3);
       Materia Paradigmas = new Materia("Paradigmas",3);
       alumno1.agregarMateria(BD);
       alumno1.agregarMateria(Paradigmas);
       
        System.out.println("Materias del alumno1");
        alumno1.imprimeMaterias();
        
    }
    
}
