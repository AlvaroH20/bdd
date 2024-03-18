package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;


    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public Curso(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    public double calcularPromedioCurso() {
        double promedioTotal = 0;
        for (Estudiante estudiante : estudiantes) {
            promedioTotal += estudiante.calcularPromedioNotasEstudiante();
        }
        return promedioTotal / estudiantes.size();
    }

    public void mostrar() {
        System.out.println("Información del curso:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrar();
        }
        System.out.println("Promedio del curso: " + calcularPromedioCurso());
    }
}
