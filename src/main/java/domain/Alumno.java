package domain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Alumno {
    private List<Materia> aprobadas = new LinkedList<Materia>();

    public Alumno(Materia ... aprobadas) {
        Collections.addAll(this.aprobadas, aprobadas);
    }

    public Boolean materiaAprobada(Materia materia) {
        return this.aprobadas.contains(materia);
    }
}
