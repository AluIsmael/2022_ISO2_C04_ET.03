package ISOFT2.Teorico2_P3;

public class Methods {
	public static String posiblesCuentas(Clases.Cliente cliente){
        Clases.Cliente clienteAlt = cliente;
        String result = null;
        if(clienteAlt.edad > 25){
            if(clienteAlt.trabajando){
                if(clienteAlt.casaPadres){
                    result = "Cuenta Independizate que va siendo hora";
                }else{
                    result = "Cuenta Bienvenido a la Vida Adulta";
                }
            }
        }else{
            if(clienteAlt.edad > 18){
                if(clienteAlt.trabajando){
                    if(clienteAlt.casaPadres){
                        result = "Cuenta Ahorra ahora que puedes";
                    }else{
                        result = "Cuenta Saltando del nido";
                    }
                }else if(!clienteAlt.casaPadres){
                    result = "Cuenta Vamos que tu puedes";
                }
            }else{
                if(!clienteAlt.trabajando){
                    if(clienteAlt.casaPadres){
                        result = "Cuenta Confort";
                    }else{
                        result = "Cuenta Vamos que tu puedes";
                    }
                }
            }
        }
        return result;
    }
}
