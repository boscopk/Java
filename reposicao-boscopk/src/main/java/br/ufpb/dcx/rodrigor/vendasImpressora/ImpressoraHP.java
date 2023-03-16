package br.ufpb.dcx.rodrigor.vendasImpressora;

public class ImpressoraHP implements Impressora{

    public void imprimirCupomVenda(Pedido pedido){
        System.out.println("Imprimindo cupom do pedido na impressora HP"+pedido);
    }

}
