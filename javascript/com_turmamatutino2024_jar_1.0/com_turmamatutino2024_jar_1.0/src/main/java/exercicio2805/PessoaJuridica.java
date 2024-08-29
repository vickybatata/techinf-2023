package exercicio2805;



public class PessoaJuridica extends pessoa{
    
 private long CNPJ;
    private long InscricaoEstadual;
    private long InscricaoMunicipal;
    private String NomeFantasia;

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public long getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(long InscricaoEstadual) {
        this.InscricaoEstadual = InscricaoEstadual;
    }

    public long getInscricaoMunicipal() {
        return InscricaoMunicipal;
    }

    public void setInscricaoMunicipal(long InscricaoMunicipal) {
        this.InscricaoMunicipal = InscricaoMunicipal;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }
    
}