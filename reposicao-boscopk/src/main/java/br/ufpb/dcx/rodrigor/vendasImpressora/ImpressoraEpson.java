package br.ufpb.dcx.rodrigor.vendasImpressora;

public class ImpressoraEpson implements Impressora{


    public void imprimirCupomVenda(Pedido pedido){
        System.out.println("Imprimindo cupom do pedido na impressora EPSON"+pedido);
    }

}
