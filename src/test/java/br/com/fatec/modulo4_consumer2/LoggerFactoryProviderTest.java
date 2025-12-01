package br.com.fatec.modulo4_consumer2;

import br.com.fatec.modulo4_consumer2.infra.logging.LoggerFactoryProvider;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class LoggerFactoryProviderTest {

    @Test
    void deveRetornarLoggerValido() {
        Logger logger = LoggerFactoryProvider.getLogger(LoggerFactoryProviderTest.class);

        assertNotNull(logger);
        assertEquals(Logger.class, logger.getClass().getInterfaces()[0]); // Logger é interface
    }

    @Test
    void construtorPrivadoDeveLancarExcecao() throws Exception {
        Constructor<LoggerFactoryProvider> constructor =
                LoggerFactoryProvider.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        InvocationTargetException exception = assertThrows(
                InvocationTargetException.class,
                constructor::newInstance
        );

        assertTrue(exception.getCause() instanceof UnsupportedOperationException);
        assertEquals("Utility class", exception.getCause().getMessage());
    }
}
