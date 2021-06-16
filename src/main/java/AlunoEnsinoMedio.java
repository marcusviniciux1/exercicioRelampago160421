public class AlunoEnsinoMedio extends Aluno {
    private float notaEM1;
    private float notaEM2;

    public float getNotaEM1() {
        return notaEM1;
    }

    public void setNotaEM1(float notaEM1) {
        this.notaEM1 = notaEM1;
    }

    public float getNotaEM2() {
        return notaEM2;
    }

    public void setNotaEM2(float notaEM2) {
        this.notaEM2 = notaEM2;
    }

    public String calcularNota() {
        float media = (notaEM1 + notaEM2) / 2;

        if (media < 6) {
            return "Reprovado!";
        } else {
            return "Aprovado!";
        }
    }
}
