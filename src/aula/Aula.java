package aula;

public class Aula extends Alumnos{

	private int notaPR1 = (int) (Math.random() * 11);
	private int notaBBDD1 = (int) (Math.random() * 11);
	
//	public void CrearAlumno() {
//		int numeroAlumnos = 30;
//	for(int i = 0; i<numeroAlumnos; i++) {
//		
//	}
//		Alumnos[] alumnos = new Alumnos[30];
//	}
	@Override
	public String toString() {
		return "Alumno [notaPR1=" + notaPR1 + ", notaBBDD1=" + notaBBDD1 +"]";
	}
	
	
	
	
	
		
}