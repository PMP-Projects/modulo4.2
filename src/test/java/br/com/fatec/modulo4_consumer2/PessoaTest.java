package br.com.fatec.modulo4_consumer2;

import br.com.fatec.modulo4_consumer2.core.domain.Pessoa;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class PessoaTest {

    @Test
    void deveCriarPessoaCorretamente() {
        LocalDate nascimento = LocalDate.of(1999, 1, 1);
        Pessoa pessoa = new Pessoa("Julio", nascimento);

        assertEquals("Julio", pessoa.nome());
        assertEquals(nascimento, pessoa.dataNascimento());
    }
}
