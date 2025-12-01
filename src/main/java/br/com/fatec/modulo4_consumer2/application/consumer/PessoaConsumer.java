package br.com.fatec.modulo4_consumer2.application.consumer;

import br.com.fatec.modulo4_consumer2.core.domain.Pessoa;
import br.com.fatec.modulo4_consumer2.core.service.PessoaService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

@Component
public class PessoaConsumer {

    private final Logger log;
    private final PessoaService pessoaService;

    public PessoaConsumer(Logger logger, PessoaService pessoaService) {
        this.log = logger;
        this.pessoaService = pessoaService;
    }

    @RetryableTopic(
            autoCreateTopics = "false",
            topicSuffixingStrategy = TopicSuffixingStrategy.SUFFIX_WITH_INDEX_VALUE,
            backoff = @Backoff(delay = 12000, multiplier = 2.0, maxDelay = 48000)
    )
    @KafkaListener(
            topics = "${spring.kafka.topic.lambda.kafka}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void listener(@Payload Pessoa pessoa, ConsumerRecord<String, Pessoa> consumerRecord) {

        log.info("[Consumer2] Evento recebido → {}", consumerRecord.topic());
        pessoaService.processarEntrada(pessoa);
    }

}
