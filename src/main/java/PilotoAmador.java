public class PilotoAmador extends Piloto {
    @Override
    public String verificarClassificacao() {
        if (this.calcularMedia() >= 5f) return "Classificado";
        return "Desclassificado";
    }
}
