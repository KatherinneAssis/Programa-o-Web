public class Pet {
    private int id;
    private String nome;
    private String porte;
    private Double peso;

    public Pet(int id, String nome, String porte, Double peso) {
        this.id = id;
        this.nome = nome;
        this.porte = porte;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nPet{" + "Id: " + id + ", Nome:'" + nome + '\'' + ", Porte: '" + porte + '\'' +", Peso: " + peso + "}";
    }
}