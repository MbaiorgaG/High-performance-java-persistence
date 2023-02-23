package com.sdl.model;


import jakarta.persistence.MappedSuperclass;

import java.util.Date;


@MappedSuperclass
public class User extends AbstractEntity{

    protected String userName;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String password;
    protected String status;
    protected Date createdOnDate;
    protected Date expiryDate;
    protected Date lockedUntilDate;
    protected Date lastLoginDate;
    protected int noOfLoginAttempts;
    protected Integer noOfTokenAttempts =0;

    protected String entrustId;
    protected String entrustGroup;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedOnDate() {
        return createdOnDate;
    }

    public void setCreatedOnDate(Date createdOnDate) {
        this.createdOnDate = createdOnDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getLockedUntilDate() {
        return lockedUntilDate;
    }

    public void setLockedUntilDate(Date lockedUntilDate) {
        this.lockedUntilDate = lockedUntilDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public int getNoOfLoginAttempts() {
        return noOfLoginAttempts;
    }

    public void setNoOfLoginAttempts(int noOfLoginAttempts) {
        this.noOfLoginAttempts = noOfLoginAttempts;
    }

    public Integer getNoOfTokenAttempts() {
        return noOfTokenAttempts;
    }

    public void setNoOfTokenAttempts(Integer noOfTokenAttempts) {
        this.noOfTokenAttempts = noOfTokenAttempts;
    }

    public String getEntrustId() {
        return entrustId;
    }

    public void setEntrustId(String entrustId) {
        this.entrustId = entrustId;
    }

    public String getEntrustGroup() {
        return entrustGroup;
    }

    public void setEntrustGroup(String entrustGroup) {
        this.entrustGroup = entrustGroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", createdOnDate=" + createdOnDate +
                ", expiryDate=" + expiryDate +
                ", lockedUntilDate=" + lockedUntilDate +
                ", lastLoginDate=" + lastLoginDate +
                ", noOfLoginAttempts=" + noOfLoginAttempts +
                ", noOfTokenAttempts=" + noOfTokenAttempts +
                ", entrustId='" + entrustId + '\'' +
                ", entrustGroup='" + entrustGroup + '\'' +
                super.toString()+
                '}';
    }
}