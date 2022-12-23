package ISOFT2.Teorico2_P3_App;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ISOFT2.Teorico2_P3.Clases;
import ISOFT2.Teorico2_P3.Methods;

public class AppTest {
	Clases clases = new Clases();

	@Test
	public void TestP1() {
		int edad = -1;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP2() {
		int edad = 0;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP3() {
		int edad = 1;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP4() {
		int edad = 10;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP5() {
		int edad = 17;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP6() {
		int edad = 18;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP7() {
		int edad = 19;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Ahorra ahora que puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP8() {
		int edad = 20;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Ahorra ahora que puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP9() {
		int edad = 24;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Ahorra ahora que puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP10() {
		int edad = 25;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Ahorra ahora que puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP11() {
		int edad = 26;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Independizate que va siendo hora";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP12() {
		int edad = 40;
		boolean trabajando = true;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Independizate que va siendo hora";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP13() {
		int edad = -1;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP14() {
		int edad = 0;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP15() {
		int edad = 1;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP16() {
		int edad = 10;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP17() {
		int edad = 17;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP18() {
		int edad = 18;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP19() {
		int edad = 19;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Saltando del nido";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP20() {
		int edad = 20;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Saltando del nido";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP21() {
		int edad = 24;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Saltando del nido";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP22() {
		int edad = 25;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Saltando del nido";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP23() {
		int edad = 26;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Bienvenido a la Vida Adulta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP24() {
		int edad = 40;
		boolean trabajando = true;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Bienvenido a la Vida Adulta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP25() {
		int edad = -1;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Confort";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP26() {
		int edad = 0;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Confort";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP27() {
		int edad = 1;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Confort";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP28() {
		int edad = 10;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Confort";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP29() {
		int edad = 17;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Confort";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP30() {
		int edad = 18;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Confort";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP31() {
		int edad = 19;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP32() {
		int edad = 20;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP33() {
		int edad = 24;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP34() {
		int edad = 25;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP35() {
		int edad = 26;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP36() {
		int edad = 40;
		boolean trabajando = false;
		boolean casaPadres = true;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP37() {
		int edad = -1;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP38() {
		int edad = 0;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP39() {
		int edad = 1;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP40() {
		int edad = 10;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP41() {
		int edad = 17;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP42() {
		int edad = 18;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP43() {
		int edad = 19;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP44() {
		int edad = 20;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP45() {
		int edad = 24;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP46() {
		int edad = 25;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Cuenta Vamos que tu puedes";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP47() {
		int edad = 26;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}

	@Test
	public void TestP48() {
		int edad = 40;
		boolean trabajando = false;
		boolean casaPadres = false;
		Clases.Cliente cliente = clases.new Cliente(edad, casaPadres, trabajando);
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		assertEquals(result, Methods.posiblesCuentas(cliente));
	}
}
