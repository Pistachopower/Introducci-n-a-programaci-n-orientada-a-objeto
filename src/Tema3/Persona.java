package Tema3;

//esta es la clase principal que me va a permitri crear persona
public class Persona {

	//Los atributos "private" definen los atributos 
	private String nombre;

	private int edad;

	private double estatura;

	
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

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}

	
	
		
	}


	

