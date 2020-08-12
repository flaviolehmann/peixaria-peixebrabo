package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "ALIMENTO")
public class Alimento implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "RACAO_ID", nullable = false)
    private Racao racao;

    @Column(name = "QUANTIDADE", nullable = false)
    private Long quantidade;

    @Column(name = "DATA_ALIMENTACAO", nullable = false)
    private final LocalDate dataAlimentacao = LocalDate.now();

    public Alimento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Racao getRacao() {
        return racao;
    }

    public void setRacao(Racao racao) {
        this.racao = racao;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataAlimentacao() {
        return dataAlimentacao;
    }
}
