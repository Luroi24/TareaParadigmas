package escuela;
import java.util.ArrayList;
public class Alumno {
    private String nombre,matricula;
    private ArrayList<Materia> materias;
    
    public Alumno(String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        materias = new ArrayList<>();
    }
    
    public String regresaNombre(){
        return nombre;
    }
    
    public String regresaMatricula(){
        return matricula;
    }
    
    public void agregarMateria(Materia m){
        materias.add(m);
    }
    
    public void addMateria(String nombreMateria, int semestre) {
        materias.add(new Materia(nombreMateria, semestre));
    }
    
    public void imprimeMaterias(){
        int i = 1;
        for(Materia materia: materias){
            System.out.println((i++) + ". " + materia.getNombreMateria());
        }
    }
    // Test
}
