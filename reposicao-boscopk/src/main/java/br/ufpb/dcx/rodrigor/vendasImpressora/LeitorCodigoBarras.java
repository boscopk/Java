package br.ufpb.dcx.rodrigor.vendasImpressora;

public class LeitorCodigoBarras implements Leitor{

    public String lerCodigoBarras(){
        return "codigoBarras";
    }

    public String lerCodigo() {
        return lerCodigoBarras();
    }
}
