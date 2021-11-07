package escuela;

public class Materia {
    private String nombre;
    private int semestre;
    
    public Materia(String nom,int semestre){
        nombre = nom;
        this.semestre = semestre;
    }
    
    public String nombreMateria(){
        return nombre;
    }
    
    public int getSemestre(){
        return semestre;
    }
}
