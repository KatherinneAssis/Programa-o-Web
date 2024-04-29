public class DivisaoThrows {
    public static int dividir(int a, int b) throws ArithmeticException{
        return a /b;
    }

    public static void main(String[] args) {
        try {
            dividir(10,0);
        }catch (ArithmeticException ex){
            System.out.println("Erro de divisão");
        }
    }
}
