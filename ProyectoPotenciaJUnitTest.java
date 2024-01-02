/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyectopotencia;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cherry
 */
public class ProyectoPotenciaJUnitTest {
    
    public ProyectoPotenciaJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    /**
     * Test de Potencia Iterativa
     */
    
    //Un test a potencia Iterativa con valores 0
    @Test
    public void testPotenciaIterativa(){
        System.out.println("PotenciaIterativa");
        int x = 2;
        int y = 3;
        
        double expResult = 8.0;
        double result = ProyectoPotencia.potenciaIterativa(x,y);
        assertEquals (expResult, result, 0.0);
        
        
    }
    
        @Test
    public void testPotenciaRecursiva(){
        System.out.println("PotenciaRecursiva");
        int x = 2;
        int y = 3;
        
        double expResult = 8.0;
        double result = ProyectoPotencia.potenciaRecursiva(x,y);
        assertEquals (expResult, result, 0.0);
        
        
    }
    
    //Caso Prueba Potencia Iterativa Cherry
    //¿Qué sucede si el exponente es Cero? Debería devolver 1
    @Test
    public void testPotenciaIterativa_(){
        System.out.println("PotenciaIterativa con exponente 0");
        int x = 5;
        int y = 0;
        
        double expResult = 1.0;
        double result = ProyectoPotencia.potenciaIterativa(x,y);
        assertEquals (expResult, result, 0.0);
        
    }
  
    //Caso prueba Potenciarecursiva Cherry
    //¿Admitirá un valor negativo?
    @Test
    public void testPotenciaRecursiva_(){
        System.out.println("PotenciaRecursiva con base negativa");
        int x = -1;
        int y = 3;
        
        double expResult = -1.0;
        double result = ProyectoPotencia.potenciaRecursiva(x,y);
        assertEquals (expResult, result, 0.0);
    }
    
    
    
    
  //Caso prueba en el que el test falle. Error Stack Overflow. Cherry
  //¿Que pasa si tanto base como exponente son negativos?
    @Test
    public void testPotenciaRecursiva_fail(){
        System.out.println("PotenciaRecursiva con base negativa y exponente negativo");
        int x = -1;
        int y = -1;
        
        double expResult = -1.0;
        double result = ProyectoPotencia.potenciaRecursiva(x,y);
        assertEquals (expResult, result, 0.0);
    }
}