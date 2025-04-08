package domain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Inscripcion {
    private List<Materia> materias = new LinkedList<Materia>();
    private Alumno alumno;

    public Inscripcion(Alumno alumno, Materia materia, Materia ... materias) {
        this.alumno = alumno;
        this.materias.add(materia);
        Collections.addAll(this.materias, materias);
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