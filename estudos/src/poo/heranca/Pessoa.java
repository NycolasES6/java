package poo.heranca;

public class Pessoa extends Object{

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa{FISICA, JURIDICA}

    public Integer codigo;
    public String nome;
    private String documento;
    private TipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty())
            throw new RuntimeException("Documento não pode ser nulo ou vazio");

        if (documento.length() == TAMANHO_CPF)
            tipo = TipoPessoa.FISICA;
        else if(documento.length() == TAMANHO_CNPJ)
            tipo = TipoPessoa.JURIDICA;
        else
            throw new RuntimeException("Documento inválido para pessoa física ou " +
                    "jurídica");

        this.documento = documento;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }
}