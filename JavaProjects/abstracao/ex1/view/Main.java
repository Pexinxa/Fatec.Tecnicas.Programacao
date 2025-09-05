package abstracao.ex1.view;

import abstracao.ex1.model.carro;

public class Main {
    public static void main(String[] args){

        carro civic = new carro();
        civic.modelo = "civic";
        civic.cor = "Black";
        civic.capacidadeTanque = 53;

        carro sandero = new carro();
        sandero.modelo= "Sandero";
        sandero.cor = "Silver";
        sandero.capacidadeTanque = 41;

        civic.desligar();
        civic.freiar();
        civic.acelerar();
        civic.ligar();
        civic.buzinar();
        civic.freiar();
        civic.desligar();
        
    }
}