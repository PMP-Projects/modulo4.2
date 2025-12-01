package br.com.fatec.modulo4_consumer2;

import br.com.fatec.modulo4_consumer2.application.consumer.PessoaConsumer;
import br.com.fatec.modulo4_consumer2.core.domain.Pessoa;
import br.com.fatec.modulo4_consumer2.core.service.PessoaService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

@SpringBootTest
@ActiveProfiles("test")
class PessoaConsumerTest {

    @Test
    void deveConsumirMensagemEProcessar() {
        Logger logger = Mockito.mock(Logger.class);
        PessoaService service = Mockito.mock(PessoaService.class);

        PessoaConsumer consumer = new PessoaConsumer(logger, service);

        Pessoa pessoa = new Pessoa("Julio", LocalDate.of(2000, 5, 10));

        ConsumerRecord<String, Pessoa> consumerRecord  =
                new ConsumerRecord<>("lambda.kafka", 0, 0L, "key", pessoa);

        consumer.listener(pessoa, consumerRecord);

        Mockito.verify(logger).info("[Consumer2] Evento recebido → {}", "lambda.kafka");

        Mockito.verify(service, Mockito.times(1)).processarEntrada(pessoa);
    }
}
