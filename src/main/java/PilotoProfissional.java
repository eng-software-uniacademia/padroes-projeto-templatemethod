public class PilotoProfissional extends Piloto {
    @Override
    public String verificarClassificacao() {
        if (this.calcularMedia() >= 8f) return "Classificado";
        return "Desclassificado";
    }

    @Override
    public String getTipo() {
        return "PilotoProfissional";
    }
}
