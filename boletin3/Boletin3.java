/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consumo consume = new Consumo();
        consume.setLitros(50);
        consume.setpGas(1.57f);
        Consumo consumo = new Consumo(400f, 50f, 80f, 1.57f);
        System.out.println("O consumo medio é "
                + consumo.consumoMedio() + " litros cada 100 km.");
        consumo.setLitros(156f);
        System.out.println("A velocidade media do 2º obxeto é "
                + consumo.getvMed() + ".");
    }
}
