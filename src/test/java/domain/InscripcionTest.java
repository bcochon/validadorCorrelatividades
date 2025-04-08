package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InscripcionTest {
    Materia analisisMatematico = new Materia();
    Materia analisisMatematico2 = new Materia(analisisMatematico);
    Materia algebra = new Materia();
    Materia analisisNumerico = new Materia(analisisMatematico2, algebra);

    Alumno bruno = new Alumno(analisisMatematico);
    Alumno juan = new Alumno(algebra);
    Alumno dante = new Alumno(analisisNumerico, analisisMatematico2, algebra);
    Alumno pepe = new Alumno();

    @Test
    @DisplayName("Inscripción aprobada simple")
    public void revisarInscripcionBuena() {
        Inscripcion inscripcionBuena = new Inscripcion(dante, analisisNumerico);
        Assertions.assertEquals(true, inscripcionBuena.aprobada());
    }

    @Test
    @DisplayName("Inscripción aprobada compleja")
    public void revisarInscripcionBuenaMultiple() {
        Inscripcion inscripcionBuena = new Inscripcion(bruno, analisisMatematico2);
        Assertions.assertEquals(true, inscripcionBuena.aprobada());
    }

    @Test
    @DisplayName("Inscripción desaprobada")
    public void revisarInscripcionMala() {
        Inscripcion inscripcionMala = new Inscripcion(pepe, analisisMatematico2);
        Assertions.assertEquals(false, inscripcionMala.aprobada());
    }

    @Test
    @DisplayName("Inscripción desaprobada compleja")
    public void revisarInscripcionMalaMultiple() {
        Inscripcion inscripcionMala = new Inscripcion(juan, analisisNumerico);
        Assertions.assertEquals(false, inscripcionMala.aprobada());
    }
}