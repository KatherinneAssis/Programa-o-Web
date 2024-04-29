package banco;

public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Danilo", 500000000.);

        try{
            conta01.sacar(50.);
        }catch (SaldoInvalidoException ex){
            System.out.println(ex.getMessage());
            System.out.println("Usuario: " + ex.nomeUsuario);
        }

    }
}
