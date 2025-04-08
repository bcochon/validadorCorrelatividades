package domain;

import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }

    public Boolean aprobada() {
        for (Materia materia : materias) {
            if(!materia.puedeCursar(this.alumno)) {
                return false;
            }
        }
        return true;
    }
}