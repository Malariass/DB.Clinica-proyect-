//package med.voll.api.domain.consulta.validaciones;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//
//import java.time.DayOfWeek;
//import java.time.LocalDateTime;
//
//import jakarta.validation.ValidationException;
//import med.voll.api.domain.consulta.dto.DatosAgendarConsulta;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.function.Executable;
//import org.springframework.test.util.ExceptionCollector;
//
//class HorarioDeFuncionamientoClinicaTest {
//
//    private HorarioDeFuncionamientoClinica validador;
//    private DatosAgendarConsulta datosMock;
//
//    @BeforeEach
//    void setUp() {
//        validador = new HorarioDeFuncionamientoClinica();
//        datosMock = mock(DatosAgendarConsulta.class);
//    }
//
//    @Test
//    void testValidar_ConsultaEnDomingo() {
//        when(datosMock.fecha()).thenReturn(LocalDateTime.of(2024, 5, 25, 10, 5));
//
//        Executable executable = () -> validador.validar(datosMock);
//
//        ValidationException exception = assertThrows(ValidationException.class, executable);
//        assertEquals("No se puede agendar una consulta en domingo", exception.getMessage());
//    }
//
//    @Test
//    void testValidar_ConsultaAntesDeLaApertura() {
//        when(datosMock.fecha()).thenReturn(LocalDateTime.of(2024, 5, 26, 6, 5));
//
//        Executable executable = () -> validador.validar(datosMock);
//
//        ValidationException exception = assertThrows(ValidationException.class, executable);
//        assertEquals("El horario de la clínica es de lunes a sabado, de 07:00 a 19:00 horas", exception.getMessage());
//    }
//
//    @Test
//    void testValidar_ConsultaDespuesDeLaCierre() {
//        when(datosMock.fecha()).thenReturn(LocalDateTime.of(2024, 5, 26, 20, 5));
//
//        Executable executable = () -> validador.validar(datosMock);
//
//        ValidationException exception = assertThrows(ValidationException.class, executable);
//        assertEquals("El horario de la cliínica es de lunes a sabado, de 07:00 a 19:00 horas", exception.getMessage());
//    }
//
//    @Test
//    void testValidar_ConsultaDentroDelHorario() {
//        when(datosMock.fecha()).thenReturn(LocalDateTime.of(2024, 5, 26, 12, 5));
//
//        assertDoesNotThrow(() -> validador.validar(datosMock));
//    }
//}
//
