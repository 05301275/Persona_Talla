/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o 
O. Si no es correcto se deberá mostrar un mensaje 

 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano. 

A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores 
 */
package pooej7_persona_talla.servicio;

import java.util.Scanner;
import pooej7_persona_talla.entidades.Persona;

public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
       
        
        Persona p = new Persona();
        
        System.out.println("Favor ingrese el nombre del paciente.");
        p.setNombre(leer.next());
        
        System.out.println("Favor ingrese la edad del paciente.");
        p.setEdad(leer.nextInt());
        
        System.out.println("Favor ingrese el sexo del paciente.");
        
        do {
            System.out.println("Sexo: \n 1.H - Hombre.\n 2.M - Mujer.\n 3.O - Otro.");
            p.setSexo(leer.nextInt());
            
            
            switch(p.getSexo()){
                case 1: {
                    System.out.println("1. Hombre.");
                    break;
                }
                case 2: {
                    System.out.println("2. Mujer.");
                    break;
                }
                case 3: {
                    System.out.println("3. Otro.");
                    break;
                }
            }
            if (p.getSexo() < 1 || p.getSexo() > 3) {
                 System.out.println("Su opción es inválida.");
            }
        } while (p.getSexo() > 3);
        
        return p;
    }
    
    public Persona calcularIMC(Persona p) {

        double IMC;

        System.out.println("Favor ingresar el peso del paciente. En kg.");
        p.setPeso(leer.nextDouble());

        System.out.println("Favor ingrese la altura del paciente. Em mts.");
        p.setAltura(leer.nextDouble());

        IMC = p.getPeso() / (p.getAltura() * p.getAltura());

        if (IMC < 20) {
            System.out.println("-1. El paciente está por debajo de su peso ideal. ");
        }
        if (IMC > 20 && IMC <= 25) {
            System.out.println("0. El paciente se encuentra en su peso ideal. ");
        }
        if (IMC > 25) {
            System.out.println("1. El paciente está en sobrepeso. ");
        }
        return p;
    }

    public Persona esMayorDeEdad(Persona p){
        
        if (p.getEdad() >= 18) {
            System.out.println("El paciente es mayor de edad.");
        }else {
            System.out.println("El paciente es menor de edad.");
        }
        return p;
    }
    
}

//    public Persona calcularPorcentaje(Persona p){
//        
//            
//       double personasPorDebajo = 0;
//       double personasEnPesoIdeal = 0;
//       double personasSobrepeso = 0;
//       double personasMayoresDeEdad = 0;
//       double personasMenoresDeEdad = 0;
//       double calcularIMC;
//       double esMayorDeEdad;
//       
//       double[] calcularPorcentaje = new double[3];
//       
//        for (double cp : calcularPorcentaje) {
//            
//            double calcularIMC = persona.
//            
//        }
       
//        for (int i = 0; i < calcularPorcentaje.length; i++) {
//            
//            calcularPorcentaje[i] = calcularPorcentaje.length;
//        }
//       
        
       
       
    
//      return p;    
//    }


