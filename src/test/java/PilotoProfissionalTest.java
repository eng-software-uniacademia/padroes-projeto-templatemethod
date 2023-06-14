import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PilotoProfissionalTest {

    @Test
    void deveRetonarClassificado() {
        PilotoProfissional piloto = new PilotoProfissional();
        piloto.setPontuacao1(8.0f);
        piloto.setPontuacao2(8.0f);
        assertEquals("Classificado", piloto.verificarClassificacao());
    }

    @Test
    void deveRetonarDesclassificado() {
        PilotoProfissional piloto = new PilotoProfissional();
        piloto.setPontuacao1(6.0f);
        piloto.setPontuacao2(2f);
        assertEquals("Desclassificado", piloto.verificarClassificacao());
    }

    @Test
    void deveRetornarInformacoes() {
        PilotoProfissional piloto = new PilotoProfissional();
        piloto.setPontuacao1(6.0f);
        piloto.setPontuacao2(2f);
        piloto.setNome("Marcelo");
        piloto.setIdade(20);
        assertEquals("PilotoProfissional{nome=Marcelo, idade='20', resultado=Desclassificado}", piloto.getInfo());
    }
}