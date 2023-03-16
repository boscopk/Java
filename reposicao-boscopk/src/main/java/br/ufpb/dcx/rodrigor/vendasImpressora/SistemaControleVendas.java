package br.ufpb.dcx.rodrigor.vendasImpressora;

import java.util.LinkedList;
import java.util.List;

public class SistemaControleVendas implements Leitor {

    private Impressora impressora;

    private Leitor leitorCodigo;

    private List<Pedido> pedidos = new LinkedList<>();


    public void setLeitorCodigo(Leitor leitor){
        this.leitorCodigo = leitor;
    }


    public void setImpressora(Impressora impressora){
        this.impressora = impressora;
    }



    private void registrarPedido(Pedido pedido){
        this.pedidos.add(pedido);
        impressora.imprimirCupomVenda(pedido);
    }

    public Impressora getImpressora() {
        return this.impressora;
    }

    public Leitor getLeitorCodigo(){
        return this.leitorCodigo;
    }

    @Override
    public String lerCodigo() {
        return lerCodigo();
    }
}
