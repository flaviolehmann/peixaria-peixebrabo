package br.gov.anvisa.sisgap.trabjean.domain.enumeration;

import javax.persistence.Embeddable;

@Embeddable
public enum StatusPeixe {
    PESCADO("PESCADO"),
    NADANDO("NADANDO");

    private final String statusPeixe;

    StatusPeixe(String statusPeixe) {
        this.statusPeixe = statusPeixe;
    }

    public String getStatusPeixe() {
        return statusPeixe;
    }
}
