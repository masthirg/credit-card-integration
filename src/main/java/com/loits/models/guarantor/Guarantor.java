package com.loits.models.guarantor;

import com.loits.models.audit.Auditable;
import com.loits.models.master.MasterEntry;

import javax.persistence.*;

@Entity
@Table(name = "tbl_cc_guarantors")
public class Guarantor extends Auditable<String> {
    @Id
    @Column(name = "guarantor_id_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guarantorIdPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entry_id_fk", referencedColumnName = "entry_id_pk", nullable = false)
    private MasterEntry entryIdFk;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "nic", nullable = false)
    private String nic;

    @Column(name = "perm_address_line1 ", nullable = false)
    private String permAddressLine1;

    @Column(name = "perm_address_line2", nullable = false)
    private String permAddressLine2;

    @Column(name = "perm_address_line3")
    private String permAddressLine3;

    @Column(name = "perm_address_line4")
    private String permAddressLine4;

    @Column(name = "mobile_number", nullable = false)
    private Integer mobileNumber;

    @Column(name = "residence_phone", nullable = false)
    private Integer residencePhone;

    @Column(name = "employer")
    private String employer;

    @Column(name = "office_tel_no")
    private Integer officeTelNo;

    @Column(name = "guarantor_type")
    private String guarantorType;

    @Column(name = "sequence")
    private String sequence;

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

    public Long getGuarantorIdPk() {
        return guarantorIdPk;
    }

    public void setGuarantorIdPk(Long guarantorIdPk) {
        this.guarantorIdPk = guarantorIdPk;
    }

    public MasterEntry getEntryIdFk() {
        return entryIdFk;
    }

    public void setEntryIdFk(MasterEntry entryIdFk) {
        this.entryIdFk = entryIdFk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPermAddressLine1() {
        return permAddressLine1;
    }

    public void setPermAddressLine1(String permAddressLine1) {
        this.permAddressLine1 = permAddressLine1;
    }

    public String getPermAddressLine2() {
        return permAddressLine2;
    }

    public void setPermAddressLine2(String permAddressLine2) {
        this.permAddressLine2 = permAddressLine2;
    }

    public String getPermAddressLine3() {
        return permAddressLine3;
    }

    public void setPermAddressLine3(String permAddressLine3) {
        this.permAddressLine3 = permAddressLine3;
    }

    public String getPermAddressLine4() {
        return permAddressLine4;
    }

    public void setPermAddressLine4(String permAddressLine4) {
        this.permAddressLine4 = permAddressLine4;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getResidencePhone() {
        return residencePhone;
    }

    public void setResidencePhone(Integer residencePhone) {
        this.residencePhone = residencePhone;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public Integer getOfficeTelNo() {
        return officeTelNo;
    }

    public void setOfficeTelNo(Integer officeTelNo) {
        this.officeTelNo = officeTelNo;
    }

    public String getGuarantorType() {
        return guarantorType;
    }

    public void setGuarantorType(String guarantorType) {
        this.guarantorType = guarantorType;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
