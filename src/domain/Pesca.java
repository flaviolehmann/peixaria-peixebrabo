package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PESCA")
public class Pesca implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "POCO", nullable = false)
    private Poco poco;

    @ManyToOne
    @JoinColumn(name = "ID_PEIXE", nullable = false)
    private Peixe peixe;

    @Column(name = "QUANTIDADE", nullable = false)
    private Long quantidade;

    public Pesca() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Poco getPoco() {
        return poco;
    }

    public void setPoco(Poco poco) {
        this.poco = poco;
    }

    public Peixe getPeixe() {
        return peixe;
    }

    public void setPeixe(Peixe peixe) {
        this.peixe = peixe;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
