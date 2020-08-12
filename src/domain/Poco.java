package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@Table(name = "POCO")
public class Poco implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "IMAGEM")
    private Blob imagem;
    
    @OneToMany
    private List<Cardume> cardumes;
    
    public Poco() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Blob getImagem() {
        return imagem;
    }

    public List<Cardume> getCardumes() {
        return cardumes;
    }

    public void setCardumes(List<Cardume> cardumes) {
        this.cardumes = cardumes;
    }

    public void setImagem(Blob imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Poco " + id + ": " + nome;
    }
}
