public class TestePet {
    public static void main(String[] args) {
        ListaObj<Pet> pets = new ListaObj<>(5);

        pets.adiciona(new Pet(100, "Moon", "M", 30.));
        pets.adiciona(new Pet(101, "Bob", "G", 40.));
        pets.adiciona(new Pet(102, "Ana", "P", 4.));
        pets.adiciona(new Pet(103, "July", "P", 4.));
        pets.adiciona(new Pet(104, "Maria", "P", 4.));

        System.out.println("Gravando Arquivo...");
        GerenciadorAqvCSV.gravaArquivoCsv(pets, "arqvPets");
        GerenciadorAqvCSV.leArquivoCsv("arqvPets");
    }
}
