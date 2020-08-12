package domain;

import br.gov.anvisa.sisgap.trabjean.domain.enumeration.StatusPeixe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEIXE")
public class Peixe {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "PESO", nullable = false)
    private Long peso;

    @Column(name = "IDADE_EM_MESES", nullable = false)
    private Long idadeEmMeses;

    @ManyToOne
    @JoinColumn(name = "ID_ESPECIE")
    private Especie especie;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_PEIXE", nullable = false)
    private StatusPeixe statusPeixe;

    public Peixe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    public Long getIdadeEmMeses() {
        return idadeEmMeses;
    }

    public void setIdadeEmMeses(Long idadeEmMeses) {
        this.idadeEmMeses = idadeEmMeses;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public StatusPeixe getStatusPeixe() {
        return statusPeixe;
    }

    public void setStatusPeixe(StatusPeixe statusPeixe) {
        this.statusPeixe = statusPeixe;
    }
}
