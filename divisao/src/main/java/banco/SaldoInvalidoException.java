package banco;

public class SaldoInvalidoException extends Exception{
    String nomeUsuario;

    public SaldoInvalidoException(String message, String nomeUsuario) {
        super(message);
        this.nomeUsuario = nomeUsuario;
    }






}