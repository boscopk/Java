package br.ufpb.dcx.rodrigor.vendasImpressora;

public class Exemplo {

    public static void main(String[] argsadd){
        SistemaControleVendas controleVendas = new SistemaControleVendas();

        controleVendas.setImpressora(new ImpressoraEpson());


        // controleVendas.setImpressora(new ImpressoraHP());

    }
}
