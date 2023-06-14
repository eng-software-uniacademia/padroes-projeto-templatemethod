public abstract class Piloto {
    private String nome;
    private int idade;
    private float pontuacao1;
    private float pontuacao2;

    public Piloto() { }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPontuacao1() {
        return pontuacao1;
    }

    public void setPontuacao1(float pontuacao1) {
        this.pontuacao1 = pontuacao1;
    }

    public float getPontuacao2() {
        return pontuacao2;
    }

    public void setPontuacao2(float pontuacao2) {
        this.pontuacao2 = pontuacao2;
    }

    public String getTipo() {
        return "Piloto";
    }

    public float calcularMedia() {
        return (pontuacao1 + pontuacao2) / 2;
    }

    public abstract String verificarClassificacao();

    public String getInfo() {
        return getTipo() + "{" +
                "nome=" + this.nome +
                ", idade='" + this.idade + '\'' +
                ", resultado=" + this.verificarClassificacao() +
                '}';
    }
}
