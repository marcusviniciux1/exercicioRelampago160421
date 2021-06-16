import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    @Test
    void testeProfessorNome() {
        Professor professor = new Professor();
        professor.setNome("Marco Araújo");
        assertEquals("Marco Araújo", professor.getNome());
    }

    @Test
    void testeProfessorTitulacao() {
        Professor professor = new Professor();
        professor.setTitulacao("Pós-Doutorado");
        assertEquals("Pós-Doutorado", professor.getTitulacao());
    }
}