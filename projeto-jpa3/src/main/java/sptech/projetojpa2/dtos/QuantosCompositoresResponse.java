package sptech.projetojpa2.dtos;

public class QuantosCompositoresResponse {

    private Long qdCompositores;

    public QuantosCompositoresResponse(Long qdCompositores) {
        this.qdCompositores = qdCompositores;
    }

    public Long getQdCompositores() {
        return qdCompositores;
    }
}
