/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 */
package pooej7_persona_talla.entidades;

public class Persona {
    
    private String nombre;
    private int edad;
    private int sexo, H, M, O;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, int sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Persona(String nombre, int edad, int sexo, int H, int M, int O, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.H = H;
        this.M = M;
        this.O = O;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getO() {
        return O;
    }

    public void setO(int O) {
        this.O = O;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

   
    
    

}
