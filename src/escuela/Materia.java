package escuela;

public class Materia {
    private String nombre;
    private int semestre;
    
    public Materia(String nombre,int semestre){
        this.nombre = nombre;
        this.semestre = semestre;
    }
    
    public String getNombreMateria(){
        return nombre;
    }
    
    public int getSemestre(){
        return semestre;
    }
}
