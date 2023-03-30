package aula011;

public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
 
    public void renovarBolsa() {
        System.err.println("Renovando bolsa de " + this.nome);
    }
    
    @Override
    public void pagarMensalidade() {
        System.err.println(this.nome + " é bolsista! Pagamento facilitado!");
    }
}
