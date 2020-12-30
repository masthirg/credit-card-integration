package com.loits.models.income;

import com.loits.models.audit.Auditable;
import com.loits.models.customer.Customer;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cc_salaried_income")
public class SalariedIncome extends Auditable<String> {
    @Id
    @Column(name = "salaried_id_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salariedIdPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id_fk", referencedColumnName = "customer_id_pk", nullable = false)
    private Customer customerIdFk;

    @Column(name = "employer_name")
    private String employerName;

    @Column(name = "employer_category")
    private String employerCategory;

    @Column(name = "off_address_line1")
    private String offAddressLine1;

    @Column(name = "off_address_line2")
    private String offAddressLine2;

    @Column(name = "off_address_line3")
    private String offAddressLine3;

    @Column(name = "off_address_line4")
    private String offAddressLine4;

    @Column(name = "off_phone_no")
    private Integer offPhoneNo;

    @Column(name = "nature_of_bns")
    private String natureOfBns;

    @Column(name = "emp_status")
    private String empStatus;

    @Column(name = "designation")
    private String designation;

    @Column(name = "net_salary", nullable = false)
    private BigDecimal netSalary;

    @Column(name = "present_emp_period")
    private String presentEmpPeriod;

    @Column(name = "previous_employer")
    private String previousEmployer;

    @Column(name = "previous_emp_period ")
    private String previousEmpPeriod;

    @Column(name = "other_income")
    private String otherIncome;

    @Column(name = "other_income_source")
    private String otherIncomeSource;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "version", nullable = false)
    @Version
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSalariedIdPk() {
        return salariedIdPk;
    }

    public void setSalariedIdPk(Long salariedIdPk) {
        this.salariedIdPk = salariedIdPk;
    }

    public Customer getCustomerIdFk() {
        return customerIdFk;
    }

    public void setCustomerIdFk(Customer customerIdFk) {
        this.customerIdFk = customerIdFk;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerCategory() {
        return employerCategory;
    }

    public void setEmployerCategory(String employerCategory) {
        this.employerCategory = employerCategory;
    }

    public String getOffAddressLine1() {
        return offAddressLine1;
    }

    public void setOffAddressLine1(String offAddressLine1) {
        this.offAddressLine1 = offAddressLine1;
    }

    public String getOffAddressLine2() {
        return offAddressLine2;
    }

    public void setOffAddressLine2(String offAddressLine2) {
        this.offAddressLine2 = offAddressLine2;
    }

    public String getOffAddressLine3() {
        return offAddressLine3;
    }

    public void setOffAddressLine3(String offAddressLine3) {
        this.offAddressLine3 = offAddressLine3;
    }

    public String getOffAddressLine4() {
        return offAddressLine4;
    }

    public void setOffAddressLine4(String offAddressLine4) {
        this.offAddressLine4 = offAddressLine4;
    }

    public Integer getOffPhoneNo() {
        return offPhoneNo;
    }

    public void setOffPhoneNo(Integer offPhoneNo) {
        this.offPhoneNo = offPhoneNo;
    }

    public String getNatureOfBns() {
        return natureOfBns;
    }

    public void setNatureOfBns(String natureOfBns) {
        this.natureOfBns = natureOfBns;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(BigDecimal netSalary) {
        this.netSalary = netSalary;
    }

    public String getPresentEmpPeriod() {
        return presentEmpPeriod;
    }

    public void setPresentEmpPeriod(String presentEmpPeriod) {
        this.presentEmpPeriod = presentEmpPeriod;
    }

    public String getPreviousEmployer() {
        return previousEmployer;
    }

    public void setPreviousEmployer(String previousEmployer) {
        this.previousEmployer = previousEmployer;
    }

    public String getPreviousEmpPeriod() {
        return previousEmpPeriod;
    }

    public void setPreviousEmpPeriod(String previousEmpPeriod) {
        this.previousEmpPeriod = previousEmpPeriod;
    }

    public String getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(String otherIncome) {
        this.otherIncome = otherIncome;
    }

    public String getOtherIncomeSource() {
        return otherIncomeSource;
    }

    public void setOtherIncomeSource(String otherIncomeSource) {
        this.otherIncomeSource = otherIncomeSource;
    }
}
