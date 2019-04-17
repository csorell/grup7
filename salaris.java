/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salaris;

/**
 *
 * @author marge
 */
public class salaris {

    enum TipoEmpleado {
        vendedor,
        encargado;
    };

    public float calculaSalarioBruto(float ventasMes, float horasExtra, TipoEmpleado tipo) {
        float salarioBruto = 0;

        if (tipo == TipoEmpleado.encargado) {
            salarioBruto = 1500;
            salarioBruto += ((horasExtra) * 20);
            if ((ventasMes >= 1000) && (ventasMes < 1500)) {
                salarioBruto += 100;
            } else if (ventasMes >= 1500) {
                salarioBruto += 200;
            }
        } else if (tipo == TipoEmpleado.vendedor) {
            salarioBruto = 1000;
            salarioBruto += ((horasExtra) * 20);
            if ((ventasMes >= 1000) && (ventasMes < 1500)) {
                salarioBruto += 100;
            } else if (ventasMes >= 1500) {
                salarioBruto += 200;
            }
        }

        return salarioBruto;
    }

    public float calculaSalarioNeto(float salarioBruto) {
        float retencion = 0;
        if ((salarioBruto >= 1000) && (salarioBruto < 1500)) {
            retencion = ((salarioBruto * 16) / 100);
        } else if (salarioBruto >= 1500) {
            retencion = ((salarioBruto * 18) / 100);
        }

        return (salarioBruto - retencion);
    }

}
