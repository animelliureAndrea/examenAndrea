/**
 * 
 */
package examenAndrea;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Andrea
 * @version examen
 * @since 6/3/2023
 *   
 */
public class UtilidadTest {
	static Utilidad util;
	static int resultado;
	static int esperado;

	/**
	 * @throws java.lang.Exception excepciones
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		util = new Utilidad();
	}

	/**
	 * @author Andrea
	 * @version examen
	 * @since 6/3/2023
	 */
	@Test
	public void cP1() {
		esperado=0;
		resultado=util.ejercicioD(0);
		assertEquals(esperado,resultado,0);
	}
	
	/**
	 * @author Andrea
	 * @version examen
	 * @since 6/3/2023
	 */
	@Test
	public void cP2() {
		esperado=4;
		resultado=util.ejercicioD(2);
		assertEquals(esperado,resultado,0);
	}
	
	/**
	 * @author Andrea
	 * @version examen
	 * @since 6/3/2023
	 */
	@Test
	public void cP3() {
		esperado=9;
		resultado=util.ejercicioD(3);
		assertEquals(esperado,resultado,0);
	}
	
	/**
	 * @author Andrea
	 * @version examen
	 * @since 6/3/2023
	 */
	@Test
	public void cP4() {
		esperado=28;
		resultado=util.ejercicioD(4);
		assertEquals(esperado,resultado,0);
	}
	
	/**
	 * @author Andrea
	 * @version examen
	 * @since 6/3/2023
	 */
	@Test
	public void cP5() {
		esperado=125;
		resultado=util.ejercicioD(5);
		assertEquals(esperado,resultado,0);
	}

}
