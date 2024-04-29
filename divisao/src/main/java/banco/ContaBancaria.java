package banco;

public class ContaBancaria {
    private String nomeTitular;
    private Double saldo;

    public ContaBancaria(String nomeTitular, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void sacar(Double valorSaque) throws SaldoInvalidoException{
        if (valorSaque > saldo){
            throw new SaldoInvalidoException("Saldo insuficiente", nomeTitular);
        }else {
            saldo -= valorSaque;
            System.out.println("Saque efetuado!");
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
