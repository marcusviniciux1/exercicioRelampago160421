import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {
    @Test
    void retornaAlunoEnsinoMedioNome() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNome("Vinícius");
        assertEquals("Vinícius", aluno.getNome());
    }

    @Test
    void retornaAlunoEnsinoMedioMatricula() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setMatricula(201976010);
        assertEquals(201976010, aluno.getMatricula());
    }

    @Test
    void alunoEnsinoMedioReprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNotaEM1(3.5f);
        aluno.setNotaEM2(4.2f);
        assertEquals("Reprovado!", aluno.calcularNota());
    }

    @Test
    void alunoEnsinoMedioAprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNotaEM1(8.0f);
        aluno.setNotaEM2(10.0f);
        assertEquals("Aprovado!", aluno.calcularNota());
    }
}