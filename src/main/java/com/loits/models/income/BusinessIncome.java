package com.loits.models.income;

import com.loits.models.audit.Auditable;
import com.loits.models.customer.Customer;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cc_business_income")
public class BusinessIncome extends Auditable<String> {
    @Id
    @Column(name = "business_id_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long businessIdPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id_fk", referencedColumnName = "customer_id_pk", nullable = false)
    private Customer customerIdFk;

    @Column(name = "bns_name", nullable = false)
    private String bnsName;

    @Column(name = "ownership_status", nullable = false)
    private String ownershipStatus;

    @Column(name = "bns_address_line1", nullable = false)
    private String bnsAddressLine1;

    @Column(name = "bns_address_line2", nullable = false)
    private String bnsAddressLine2;

    @Column(name = "bns_address_line3")
    private String bnsAddressLine3;

    @Column(name = "bns_address_line4")
    private String bnsAddressLine4;

    @Column(name = "nature_of_bns", nullable = false)
    private Integer natureOfBns;

    @Column(name = "since_when", nullable = false)
    private String sinceWhen;

    @Column(name = "previous_emp")
    private String previousEmp;

    @Column(name = "previous_emp_period")
    private String previousEmpPeriod;

    @Column(name = "mon_avg_turnover", nullable = false)
    private BigDecimal monAvgTurnover;

    @Column(name = "mon_other_income", nullable = false)
    private String monOtherIncome;

    @Column(name = "source_of_oth_income", nullable = false)
    private String sourceOfOthIncome;

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

    public Long getBusinessIdPk() {
        return businessIdPk;
    }

    public void setBusinessIdPk(Long businessIdPk) {
        this.businessIdPk = businessIdPk;
    }

    public Customer getCustomerIdFk() {
        return customerIdFk;
    }

    public void setCustomerIdFk(Customer customerIdFk) {
        this.customerIdFk = customerIdFk;
    }

    public String getBnsName() {
        return bnsName;
    }

    public void setBnsName(String bnsName) {
        this.bnsName = bnsName;
    }

    public String getOwnershipStatus() {
        return ownershipStatus;
    }

    public void setOwnershipStatus(String ownershipStatus) {
        this.ownershipStatus = ownershipStatus;
    }

    public String getBnsAddressLine1() {
        return bnsAddressLine1;
    }

    public void setBnsAddressLine1(String bnsAddressLine1) {
        this.bnsAddressLine1 = bnsAddressLine1;
    }

    public String getBnsAddressLine2() {
        return bnsAddressLine2;
    }

    public void setBnsAddressLine2(String bnsAddressLine2) {
        this.bnsAddressLine2 = bnsAddressLine2;
    }

    public String getBnsAddressLine3() {
        return bnsAddressLine3;
    }

    public void setBnsAddressLine3(String bnsAddressLine3) {
        this.bnsAddressLine3 = bnsAddressLine3;
    }

    public String getBnsAddressLine4() {
        return bnsAddressLine4;
    }

    public void setBnsAddressLine4(String bnsAddressLine4) {
        this.bnsAddressLine4 = bnsAddressLine4;
    }

    public Integer getNatureOfBns() {
        return natureOfBns;
    }

    public void setNatureOfBns(Integer natureOfBns) {
        this.natureOfBns = natureOfBns;
    }

    public String getSinceWhen() {
        return sinceWhen;
    }

    public void setSinceWhen(String sinceWhen) {
        this.sinceWhen = sinceWhen;
    }

    public String getPreviousEmp() {
        return previousEmp;
    }

    public void setPreviousEmp(String previousEmp) {
        this.previousEmp = previousEmp;
    }

    public String getPreviousEmpPeriod() {
        return previousEmpPeriod;
    }

    public void setPreviousEmpPeriod(String previousEmpPeriod) {
        this.previousEmpPeriod = previousEmpPeriod;
    }

    public BigDecimal getMonAvgTurnover() {
        return monAvgTurnover;
    }

    public void setMonAvgTurnover(BigDecimal monAvgTurnover) {
        this.monAvgTurnover = monAvgTurnover;
    }

    public String getMonOtherIncome() {
        return monOtherIncome;
    }

    public void setMonOtherIncome(String monOtherIncome) {
        this.monOtherIncome = monOtherIncome;
    }

    public String getSourceOfOthIncome() {
        return sourceOfOthIncome;
    }

    public void setSourceOfOthIncome(String sourceOfOthIncome) {
        this.sourceOfOthIncome = sourceOfOthIncome;
    }
}
