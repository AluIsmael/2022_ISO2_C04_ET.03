package ISOFT2.Teorico2_P3_App;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ISOFT2.Teorico2_P3.Clases;
import ISOFT2.Teorico2_P3.Methods;

public class AppTest {
	Clases clases = new Clases();
	public void TestP1() {
	    String nombre = "Pepe";
	    int edad = -1;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP2() {
	    String nombre = "Pepe";
	    int edad = 0;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP3() {
	    String nombre = "Pepe";
	    int edad = 1;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP4() {
	    String nombre = "Pepe";
	    int edad = 10;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP5() {
	    String nombre = "Pepe";
	    int edad = 17;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP6() {
	    String nombre = "Pepe";
	    int edad = 18;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Ahorra ahora que puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP7() {
	    String nombre = "Pepe";
	    int edad = 19;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Ahorra ahora que puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP8() {
	    String nombre = "Pepe";
	    int edad = 20;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Ahorra ahora que puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP9() {
	    String nombre = "Pepe";
	    int edad = 24;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Ahorra ahora que puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP10() {
	    String nombre = "Pepe";
	    int edad = 25;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Ahorra ahora que puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP11() {
	    String nombre = "Pepe";
	    int edad = 26;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Independizate que va siendo hora";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP12() {
	    String nombre = "Pepe";
	    int edad = 40;
	    boolean trabajando = true;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Independizate que va siendo hora";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP13() {
	    String nombre = "Pepe";
	    int edad = -1;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP14() {
	    String nombre = "Pepe";
	    int edad = 0;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP15() {
	    String nombre = "Pepe";
	    int edad = 1;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP16() {
	    String nombre = "Pepe";
	    int edad = 10;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP17() {
	    String nombre = "Pepe";
	    int edad = 17;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP18() {
	    String nombre = "Pepe";
	    int edad = 18;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Saltando del nido";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP19() {
	    String nombre = "Pepe";
	    int edad = 19;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Saltando del nido";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP20() {
	    String nombre = "Pepe";
	    int edad = 20;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Saltando del nido";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP21() {
	    String nombre = "Pepe";
	    int edad = 24;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Saltando del nido";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP22() {
	    String nombre = "Pepe";
	    int edad = 25;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Saltando del nido";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP23() {
	    String nombre = "Pepe";
	    int edad = 26;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Bienvenido a la Vida Adulta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP24() {
	    String nombre = "Pepe";
	    int edad = 40;
	    boolean trabajando = true;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Bienvenido a la Vida Adulta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP25() {
	    String nombre = "Pepe";
	    int edad = -1;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP26() {
	    String nombre = "Pepe";
	    int edad = 0;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP27() {
	    String nombre = "Pepe";
	    int edad = 1;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Confort";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP28() {
	    String nombre = "Pepe";
	    int edad = 10;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Confort";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP29() {
	    String nombre = "Pepe";
	    int edad = 17;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Confort";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP30() {
	    String nombre = "Pepe";
	    int edad = 18;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP31() {
	    String nombre = "Pepe";
	    int edad = 19;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP32() {
	    String nombre = "Pepe";
	    int edad = 20;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP33() {
	    String nombre = "Pepe";
	    int edad = 24;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP34() {
	    String nombre = "Pepe";
	    int edad = 25;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP35() {
	    String nombre = "Pepe";
	    int edad = 26;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP36() {
	    String nombre = "Pepe";
	    int edad = 40;
	    boolean trabajando = false;
	    boolean casaPadres = true;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP37() {
	    String nombre = "Pepe";
	    int edad = -1;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP38() {
	    String nombre = "Pepe";
	    int edad = 0;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP39() {
	    String nombre = "Pepe";
	    int edad = 1;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Vamos que tu puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP40() {
	    String nombre = "Pepe";
	    int edad = 10;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Vamos que tu puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP41() {
	    String nombre = "Pepe";
	    int edad = 17;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Vamos que tu puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP42() {
	    String nombre = "Pepe";
	    int edad = 18;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Vamos que tu puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP43() {
	    String nombre = "Pepe";
	    int edad = 19;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Vamos que tu puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP44() {
	    String nombre = "Pepe";
	    int edad = 20;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Vamos que tu puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP45() {
	    String nombre = "Pepe";
	    int edad = 24;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Vamos que tu puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP46() {
	    String nombre = "Pepe";
	    int edad = 25;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Cuenta Vamos que tu puedes";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP47() {
	    String nombre = "Pepe";
	    int edad = 26;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
	@Test
	public void TestP48() {
	    String nombre = "Pepe";
	    int edad = 40;
	    boolean trabajando = false;
	    boolean casaPadres = false;
	    Clases.Cliente cliente = clases.new Cliente(nombre, edad, casaPadres, trabajando);
	    String result = "Esta informacion no corresponde a ningún tipo de cuenta";
	    assertEquals(result, Methods.posiblesCuentas(cliente));
	}
}
