package br.com.fatec.modulo4_consumer2.infra.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerFactoryProvider {

    private LoggerFactoryProvider() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}
