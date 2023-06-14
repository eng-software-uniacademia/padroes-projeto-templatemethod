import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotoAmadorTest {

    @Test
    void deveRetonarClassificado() {
        PilotoAmador piloto = new PilotoAmador();
        piloto.setPontuacao1(6.0f);
        piloto.setPontuacao2(6.0f);
        assertEquals("Classificado", piloto.verificarClassificacao());
    }

    @Test
    void deveRetonarDesclassificado() {
        PilotoAmador piloto = new PilotoAmador();
        piloto.setPontuacao1(6.0f);
        piloto.setPontuacao2(2f);
        assertEquals("Desclassificado", piloto.verificarClassificacao());
    }

    @Test
    void deveRetornarInformacoes() {
        PilotoAmador piloto = new PilotoAmador();
        piloto.setPontuacao1(6.0f);
        piloto.setPontuacao2(2f);
        piloto.setNome("Marcelo");
        piloto.setIdade(20);
        assertEquals("Piloto{nome=Marcelo, idade='20', resultado=Desclassificado}", piloto.getInfo());
    }
}