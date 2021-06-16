public class AlunoGraduacao extends Aluno {
    private float notaG1;
    private float notaG2;

    public float getNotaG1() {
        return notaG1;
    }

    public void setNotaG1(float notaG1) {
        this.notaG1 = notaG1;
    }

    public float getNotaG2() {
        return notaG2;
    }

    public void setNotaG2(float notaG2) {
        this.notaG2 = notaG2;
    }

    public String calcularNota() {
        float media = (notaG1 + notaG2) / 2;

        if (media < 7) {
            return "Reprovado!";
        } else {
            return "Aprovado!";
        }
    }
}
