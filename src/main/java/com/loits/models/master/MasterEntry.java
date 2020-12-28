package com.loits.models.master;

import com.loits.models.audit.Auditable;

import javax.persistence.*;

@Entity
@Table(name = "tbl_cc_master_entry")
public class MasterEntry extends Auditable<String> {
    @Id
    @Column(name = "entry_id_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entryIdPk;

    @Column(name = "nic", nullable = false)
    private String nic;

    @Column(name = "mobile_number", nullable = false)
    private Integer mobileNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "emp_category", nullable = false)
    private String empCategory;

    @Column(name = "is_resident", nullable = false)
    private String isResident;

    @Column(name = "status", nullable = false)
    private String status;

    public Long getEntryIdPk() {
        return entryIdPk;
    }

    public void setEntryIdPk(Long entryIdPk) {
        this.entryIdPk = entryIdPk;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpCategory() {
        return empCategory;
    }

    public void setEmpCategory(String empCategory) {
        this.empCategory = empCategory;
    }

    public String getIsResident() {
        return isResident;
    }

    public void setIsResident(String isResident) {
        this.isResident = isResident;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
