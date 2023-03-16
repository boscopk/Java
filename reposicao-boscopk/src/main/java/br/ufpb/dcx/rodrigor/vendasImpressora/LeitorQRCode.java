package br.ufpb.dcx.rodrigor.vendasImpressora;

public class LeitorQRCode implements Leitor {

    public String lerQRCode() {
        return "qrCode";
    }

    @Override
    public String lerCodigo() {
        return lerQRCode();
    }
}
