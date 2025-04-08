package domain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Materia {
    private List<Materia> correlativas = new LinkedList<Materia>();

    public Materia(Materia ... correlativas) {
        Collections.addAll(this.correlativas, correlativas);
    }

    public Boolean puedeCursar(Alumno alumno) {
        for (Materia correlativa : correlativas) {
            if (!alumno.materiaAprobada(correlativa)) {
                return false;
            }
        }
        return true;
    }
}