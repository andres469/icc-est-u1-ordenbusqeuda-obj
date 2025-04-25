package Models;

public class Persona {
    private String name;
    private int edad;
    Direccion direccion;

    public Persona(String name, int edad, Direccion direccion) {
        this.name = name;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public int getCodigoDireccion(){
        return direccion.getCodigo();
    }
    public boolean compareCodigoDireccion(Persona personas){
        //boolean condicion=direccion.getCodigo()>personas.getCodigoDireccion();
        return getCodigoDireccion()>personas.getCodigoDireccion();
    }
    public boolean compareCodigoDireccion(int codigo){
       return getCodigoDireccion()>codigo;
    }
    public boolean equalsByCodigoDireccion(int codigo){
        return getCodigoDireccion()==codigo;
    }
    @Override
    public String toString(){
        return name+" "+edad+" "+direccion;
    }
}
