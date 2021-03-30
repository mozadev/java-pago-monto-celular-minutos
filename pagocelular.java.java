package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class ejercicios {

    public static void main(String[] args) {

        //declaracion de variable
        int codigoUsuario;
        int numeroTelefonico;
        int cantidadMinutosUtilizados;
        double costoMinuto = 0.3;
        double igvApagar;
        double pagoTotal;
        double pagoTotalsinIGV;
        int rentaBasica = 48;
        String mensaje = "";

        // ingreso de datos del usuario
        codigoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del usuario: "));
        numeroTelefonico = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico: "));
        cantidadMinutosUtilizados = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de minutos utilizados: "));

        // procesamiento de datos
        pagoTotalsinIGV = cantidadMinutosUtilizados * costoMinuto;
        igvApagar = pagoTotalsinIGV * 0.19;
        pagoTotal = pagoTotalsinIGV + igvApagar + rentaBasica;

        // impresion de informacion
        System.out.println("codigo usuario: " + codigoUsuario);
        System.out.println("numero telefonico: " + numeroTelefonico);
        System.out.println("minutos consumidos: " + cantidadMinutosUtilizados);
        System.out.println("importe por los minutos utilizados: " + pagoTotalsinIGV);
        System.out.println("IGV de los minutos utilizados: " + igvApagar);
        System.out.println("renta basica: " + rentaBasica);
        
        System.out.println("pago total: " + pagoTotal);

    }
}
