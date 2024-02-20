/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    @Test
    public void datosCompletos(){
        
        LOG.info("Inicio de la prueba de datos completos");
        Estudiante estudiante = new Estudiante("Carlos","Casas Gomez","12334","32145465", "ccasas@gmail.com","32");
        
        assertEquals("Carlos",estudiante.nombres());
    
    
    
    }






}


