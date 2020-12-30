package com.loits.models.additional;

import com.loits.models.audit.Auditable;
import com.loits.models.customer.Customer;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_cc_additional_details")
public class AdditionalDetails extends Auditable<String> {
    @Id
    @Column(name = "additional_id_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long additionalIdPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id_fk", referencedColumnName = "customer_id_pk", nullable = false)
    private Customer customerIdFk;

    @Column(name = "name_on_card", nullable = false)
    private String nameOnCard;

    @Column(name = "mothers_maiden_name", nullable = false)
    private String mothersMaidenName;

    @Column(name = "card_col_branch", nullable = false)
    private String cardColBranch;

    @Column(name = "stm_delivery_method", nullable = false)
    private String stmDeliveryMethod;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "due_date", nullable = false)
    private Date dueDate;

    @Column(name = "pref_language", nullable = false)
    private String prefLanguage;

    @Column(name = "supp_card_requested", nullable = false)
    private String suppCardRequested;

    @Column(name = "savings_account_created")
    private String savingsAccountCreated;

    @Column(name = "politically_exposed")
    private String politicallyExposed;

    @Column(name = "salary_remitted")
    private String salaryRemitted;

    @Column(name = "sav_loan_applied")
    private String savLoanApplied;

    @Column(name = "version", nullable = false)
    @Version
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getAdditionalIdPk() {
        return additionalIdPk;
    }

    public void setAdditionalIdPk(Long additionalIdPk) {
        this.additionalIdPk = additionalIdPk;
    }

    public Customer getCustomerIdFk() {
        return customerIdFk;
    }

    public void setCustomerIdFk(Customer customerIdFk) {
        this.customerIdFk = customerIdFk;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public String getCardColBranch() {
        return cardColBranch;
    }

    public void setCardColBranch(String cardColBranch) {
        this.cardColBranch = cardColBranch;
    }

    public String getStmDeliveryMethod() {
        return stmDeliveryMethod;
    }

    public void setStmDeliveryMethod(String stmDeliveryMethod) {
        this.stmDeliveryMethod = stmDeliveryMethod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getPrefLanguage() {
        return prefLanguage;
    }

    public void setPrefLanguage(String prefLanguage) {
        this.prefLanguage = prefLanguage;
    }

    public String getSuppCardRequested() {
        return suppCardRequested;
    }

    public void setSuppCardRequested(String suppCardRequested) {
        this.suppCardRequested = suppCardRequested;
    }

    public String getSavingsAccountCreated() {
        return savingsAccountCreated;
    }

    public void setSavingsAccountCreated(String savingsAccountCreated) {
        this.savingsAccountCreated = savingsAccountCreated;
    }

    public String getPoliticallyExposed() {
        return politicallyExposed;
    }

    public void setPoliticallyExposed(String politicallyExposed) {
        this.politicallyExposed = politicallyExposed;
    }

    public String getSalaryRemitted() {
        return salaryRemitted;
    }

    public void setSalaryRemitted(String salaryRemitted) {
        this.salaryRemitted = salaryRemitted;
    }

    public String getSavLoanApplied() {
        return savLoanApplied;
    }

    public void setSavLoanApplied(String savLoanApplied) {
        this.savLoanApplied = savLoanApplied;
    }
}
