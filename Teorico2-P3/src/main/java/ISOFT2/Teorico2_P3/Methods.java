package ISOFT2.Teorico2_P3;

public class Methods {
	public static String posiblesCuentas(Clases.Cliente cliente){
        Clases.Cliente clienteAlt = cliente;
        String result = "Esta informacion no corresponde a ningún tipo de cuenta";
        if(clienteAlt.getEdad() > 25){
            if(clienteAlt.getTrabajando()){
                if(clienteAlt.getCasaPadres()){
                    result = "Cuenta Independizate que va siendo hora";
                }else{
                    result = "Cuenta Bienvenido a la Vida Adulta";
                }
            }
        }else{
            if(clienteAlt.getEdad() > 18){
                if(clienteAlt.getTrabajando()){
                    if(clienteAlt.getCasaPadres()){
                        result = "Cuenta Ahorra ahora que puedes";
                    }else{
                        result = "Cuenta Saltando del nido";
                    }
                }else if(!clienteAlt.getCasaPadres()){
                    result = "Cuenta Vamos que tu puedes";
                }
            }else{
                if(!clienteAlt.getTrabajando()){
                    if(clienteAlt.getCasaPadres()){
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
