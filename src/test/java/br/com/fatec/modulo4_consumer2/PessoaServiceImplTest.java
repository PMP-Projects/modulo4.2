package br.com.fatec.modulo4_consumer2;

import br.com.fatec.modulo4_consumer2.core.domain.Pessoa;
import br.com.fatec.modulo4_consumer2.core.service.impl.PessoaServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

@SpringBootTest
@ActiveProfiles("test")
class PessoaServiceImplTest {

    @Test
    void deveProcessarPessoaELogar() {
        Logger logger = Mockito.mock(Logger.class);
        PessoaServiceImpl service = new PessoaServiceImpl(logger);

        Pessoa pessoa = new Pessoa("Julio", LocalDate.of(2000, 5, 10));

        service.processarEntrada(pessoa);

        Mockito.verify(logger, Mockito.times(1))
                .info("Processando pessoa recebida: {}", pessoa);
    }
}
