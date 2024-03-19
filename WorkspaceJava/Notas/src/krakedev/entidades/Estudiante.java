package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	
	public Estudiante(String cedula, String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.notas = new ArrayList<>();
	}
	public void agregarNota(Nota nuevaNota) {
	    boolean codigoRepetido = false;
	    for (int i = 0; i < notas.size(); i++) {
	        Nota nota = notas.get(i);
	        if (nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
	            codigoRepetido = true;
	            System.out.println("No se agrego la nota debido a duplicidad.");
	        }
	    }
	    if(codigoRepetido==false && nuevaNota.getCalificacion()>=0 && nuevaNota.getCalificacion()<=10) {
	    	notas.add(nuevaNota);
	    }else{
	    	if (nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
	            System.out.println("La nueva nota debe ser mayor o igual a 0 y menor o igual a 10.");
	        }
	    }

	}
	public void modificarNota(String codigo, double nuevaNota) {
	    boolean notaEncontrada = false;
	    Nota notaModificada = null;
	    for (int i = 0; i < notas.size(); i++) {
	        Nota nota = notas.get(i);
	        if (nota.getMateria().getCodigo().equals(codigo)) {
	            notaEncontrada = true;
	            notaModificada = nota;
	        }
	    }
	    
	    if (notaEncontrada == true) {
	        if (nuevaNota >= 0 && nuevaNota <= 10) {
	            notaModificada.setCalificacion(nuevaNota);
	        } else {
	            System.out.println("La nueva nota debe ser mayor o igual a 0 y menor o igual a 10.");
	        }
	    } else {
	        System.out.println("No se encontró el código de materia.");
	    }
	}
	public double calcularPromedioNotasEstudiante() {
		double promedioNota=0;
		double notaRecuperada;
		double promedio;
		for (int i = 0; i < notas.size(); i++) {
	        Nota nota = notas.get(i);
	        notaRecuperada=nota.getCalificacion();
	        promedioNota=notaRecuperada+promedioNota;
		}
		promedio=promedioNota/notas.size();
		return promedio;
	}
	public Estudiante buscarEstudiantePorCedula(ArrayList<Estudiante> estudiantes, String cedula) {

	    for (int i = 0; i < estudiantes.size(); i++) {
	        Estudiante estudiante = estudiantes.get(i);
	        if (estudiante.getCedula().equals(cedula)) {
	        	System.out.println("Estudiante con cedula " + cedula + " encontrado.");
	        }
	    }
	    
		return null;
	}
	public void matricularEstudiantes(ArrayList<Estudiante> estudiantes) {
	    Estudiante estudianteEncontrado = buscarEstudiantePorCedula(estudiantes, this.getCedula());
	    if (estudianteEncontrado == null) {
	        estudiantes.add(this);
	    }
	}
	public double calcularPromedioCurso() {
	    double promedioCurso = 0;
	    double promedioTotal;
	    for (int i = 0; i < notas.size(); i++) {
	        Nota nota = notas.get(i);
	        promedioCurso += nota.getCalificacion();
	    }
	    promedioTotal=promedioCurso/notas.size();

	    return promedioTotal;
	}
	public void mostrar() {
        System.out.println("Información del estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cédula: " + cedula);
        System.out.println("Notas:");
        for (Nota nota : notas) {
            nota.mostrar();
        }
        System.out.println("Promedio del curso: " + calcularPromedioCurso());
        System.out.println("----------------------");
    }

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	
	
}
