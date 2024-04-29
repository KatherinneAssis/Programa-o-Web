package school.sptech.treino.dto;

import java.util.Date;

public class PersonagemConsultaDto {

    private String id;
    private Date dataNascimento;
    private String codinome;
    private String habilidade;
    private String poder;
    private String classificacao;
    private int idadeAproximada;

    public PersonagemConsultaDto(String id, Date dataNascimento, String codinome, String habilidade, String poder, String classificacao, int idadeAproximada) {
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.codinome = codinome;
        this.habilidade = habilidade;
        this.poder = poder;
        this.classificacao = classificacao;
        this.idadeAproximada = idadeAproximada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getIdadeAproximada() {
        return idadeAproximada;
    }

    public void setIdadeAproximada(int idadeAproximada) {
        this.idadeAproximada = idadeAproximada;
    }
}