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
    
    public void imprimeMaterias(){
        int i = 1;
        System.out.println("Matricula " + matricula + ":");
        for(Materia aux: materias){
            System.out.println( i++ + ". " + aux.nombreMateria());
        }
    }
    // Test
}
