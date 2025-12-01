package br.com.fatec.modulo4_consumer2.core.domain;

import java.time.LocalDate;

public record Pessoa(
        String nome,
        LocalDate dataNascimento
) {
}