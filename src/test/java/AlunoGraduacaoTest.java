import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {
    @Test
    void retornaAlunoGraduacaoNome() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNome("Marcus");
        assertEquals("Marcus", aluno.getNome());
    }

    @Test
    void retornaAlunoGraduacaoMatricula() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setMatricula(201976010);
        assertEquals(201976010, aluno.getMatricula());
    }

    @Test
    void alunoGraduacaoReprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaG1(2.0f);
        aluno.setNotaG2(3.0f);
        assertEquals("Reprovado!", aluno.calcularNota());
    }

    @Test
    void alunoGraduacaoAprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaG1(9.5f);
        aluno.setNotaG2(9.0f);
        assertEquals("Aprovado!", aluno.calcularNota());
    }
}