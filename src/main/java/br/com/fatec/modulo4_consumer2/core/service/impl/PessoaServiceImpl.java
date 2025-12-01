package br.com.fatec.modulo4_consumer2.core.service.impl;

import br.com.fatec.modulo4_consumer2.core.domain.Pessoa;
import br.com.fatec.modulo4_consumer2.core.service.PessoaService;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final Logger log;

    public PessoaServiceImpl(Logger logger) {
        this.log = logger;
    }

    @Override
    public void processarEntrada(Pessoa pessoa) {
        log.info("Processando pessoa recebida: {}", pessoa);
    }
}
