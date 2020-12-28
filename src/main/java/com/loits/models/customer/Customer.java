package com.loits.models.customer;

import com.loits.models.audit.Auditable;
import com.loits.models.master.MasterEntry;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_cc_customers")
public class Customer extends Auditable<String> {
    @Id
    @Column(name = "customer_id_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerIdPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="entry_id_fk", referencedColumnName = "entry_id_pk",nullable = false)
    private MasterEntry entryIdFk;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "full_name", nullable = false)
    private Integer fullName;

    @Column(name = "prefered_name", nullable = false)
    private String preferedName;

    @Column(name = "dob", nullable = false)
    private Date dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "perm_address_line1 ", nullable = false)
    private String permAddressLine1;

    @Column(name = "perm_address_line2", nullable = false)
    private String permAddressLine2;

    @Column(name = "perm_address_line3")
    private String permAddressLine3;

    @Column(name = "perm_address_line4")
    private String permAddressLine4;

    @Column(name = "mail_address_line1", nullable = false)
    private String mailAddressLine1;

    @Column(name = "mail_address_line2", nullable = false)
    private String mailAddressLine2;

    @Column(name = "mail_address_line3")
    private String mailAddressLine3;

    @Column(name = "mail_address_line4")
    private String mailAddressLine4;

    @Column(name = "mobile_connection", nullable = false)
    private String mobileConnection;

    @Column(name = "residence_phone")
    private int residencePhone;

    @Column(name = "province", nullable = false)
    private String province;

    @Column(name = "no_of_dependent", nullable = false)
    private String noOfDependent;

    @Column(name = "home_ownership", nullable = false)
    private String homeOwnership ;

    @Column(name = "vehicle_owned", nullable = false)
    private String vehicleOwned ;

    @Column(name = "highest_education", nullable = false)
    private String highestEducation ;


    @Column(name = "status", nullable = false)
    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCustomerIdPk() {
        return customerIdPk;
    }

    public void setCustomerIdPk(Long customerIdPk) {
        this.customerIdPk = customerIdPk;
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

    public Integer getFullName() {
        return fullName;
    }

    public void setFullName(Integer fullName) {
        this.fullName = fullName;
    }

    public String getPreferedName() {
        return preferedName;
    }

    public void setPreferedName(String preferedName) {
        this.preferedName = preferedName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
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

    public String getMailAddressLine1() {
        return mailAddressLine1;
    }

    public void setMailAddressLine1(String mailAddressLine1) {
        this.mailAddressLine1 = mailAddressLine1;
    }

    public String getMailAddressLine2() {
        return mailAddressLine2;
    }

    public void setMailAddressLine2(String mailAddressLine2) {
        this.mailAddressLine2 = mailAddressLine2;
    }

    public String getMailAddressLine3() {
        return mailAddressLine3;
    }

    public void setMailAddressLine3(String mailAddressLine3) {
        this.mailAddressLine3 = mailAddressLine3;
    }

    public String getMailAddressLine4() {
        return mailAddressLine4;
    }

    public void setMailAddressLine4(String mailAddressLine4) {
        this.mailAddressLine4 = mailAddressLine4;
    }

    public String getMobileConnection() {
        return mobileConnection;
    }

    public void setMobileConnection(String mobileConnection) {
        this.mobileConnection = mobileConnection;
    }

    public int getResidencePhone() {
        return residencePhone;
    }

    public void setResidencePhone(int residencePhone) {
        this.residencePhone = residencePhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNoOfDependent() {
        return noOfDependent;
    }

    public void setNoOfDependent(String noOfDependent) {
        this.noOfDependent = noOfDependent;
    }

    public String getHomeOwnership() {
        return homeOwnership;
    }

    public void setHomeOwnership(String homeOwnership) {
        this.homeOwnership = homeOwnership;
    }

    public String getVehicleOwned() {
        return vehicleOwned;
    }

    public void setVehicleOwned(String vehicleOwned) {
        this.vehicleOwned = vehicleOwned;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }
}
