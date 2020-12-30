package com.loits.models.income;

import com.loits.models.audit.Auditable;
import com.loits.models.customer.Customer;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cc_other_income")
public class OtherIncome extends Auditable<String> {
    @Id
    @Column(name = "other_id_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long otherIdPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id_fk", referencedColumnName = "customer_id_pk", nullable = false)
    private Customer customerIdFk;

    @Column(name = "source_of_oth_income", nullable = false)
    private String sourceOfOthIncome;

    @Column(name = "mon_net_income", nullable = false)
    private BigDecimal monNetIncome;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "version", nullable = false)
    @Version
    private Long version;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getOtherIdPk() {
        return otherIdPk;
    }

    public void setOtherIdPk(Long otherIdPk) {
        this.otherIdPk = otherIdPk;
    }

    public Customer getCustomerIdFk() {
        return customerIdFk;
    }

    public void setCustomerIdFk(Customer customerIdFk) {
        this.customerIdFk = customerIdFk;
    }

    public String getSourceOfOthIncome() {
        return sourceOfOthIncome;
    }

    public void setSourceOfOthIncome(String sourceOfOthIncome) {
        this.sourceOfOthIncome = sourceOfOthIncome;
    }

    public BigDecimal getMonNetIncome() {
        return monNetIncome;
    }

    public void setMonNetIncome(BigDecimal monNetIncome) {
        this.monNetIncome = monNetIncome;
    }
}
