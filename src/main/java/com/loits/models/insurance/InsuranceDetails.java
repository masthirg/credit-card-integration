package com.loits.models.insurance;

import com.loits.models.audit.Auditable;
import com.loits.models.customer.Customer;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cc_insurance_details")
public class InsuranceDetails extends Auditable<String> {
    @Id
    @Column(name = "insurance_id_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long insuranceIdPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id_fk", referencedColumnName = "customer_id_pk", nullable = false)
    private Customer customerIdFk;

    @Column(name = "subscribed_for_ins", nullable = false)
    private String subscribedForIns;

    @Column(name = "nominee_name", nullable = false)
    private String nomineeName;

    @Column(name = "nominee_nic", nullable = false)
    private String nomineeNic;

    @Column(name = "exp_card_limit", nullable = false)
    private BigDecimal expCardLimit;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "ins_value", nullable = false)
    private BigDecimal insValue;

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

    public Long getInsuranceIdPk() {
        return insuranceIdPk;
    }

    public void setInsuranceIdPk(Long insuranceIdPk) {
        this.insuranceIdPk = insuranceIdPk;
    }

    public Customer getCustomerIdFk() {
        return customerIdFk;
    }

    public void setCustomerIdFk(Customer customerIdFk) {
        this.customerIdFk = customerIdFk;
    }

    public String getSubscribedForIns() {
        return subscribedForIns;
    }

    public void setSubscribedForIns(String subscribedForIns) {
        this.subscribedForIns = subscribedForIns;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public String getNomineeNic() {
        return nomineeNic;
    }

    public void setNomineeNic(String nomineeNic) {
        this.nomineeNic = nomineeNic;
    }

    public BigDecimal getExpCardLimit() {
        return expCardLimit;
    }

    public void setExpCardLimit(BigDecimal expCardLimit) {
        this.expCardLimit = expCardLimit;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getInsValue() {
        return insValue;
    }

    public void setInsValue(BigDecimal insValue) {
        this.insValue = insValue;
    }
}
