package org.mongodb.sbws.model;

import org.bson.types.ObjectId;

import java.util.Date;

public class FullDocument {

    private ObjectId _id;
    private String city;
    private double claimAmount;
    private String claimType;
    private java.util.Date dateClaimSubmitted;
    private String email;
    private String employer;
    private String gender;
    private String healthProvider;
    private String maritalStatus;
    private String name;
    private String phoneNumber;
    private String state;
    private String streetAddress;
    private String title;
    private String zip;

    public FullDocument() {

    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public Date getDateClaimSubmitted() {
        return dateClaimSubmitted;
    }

    public void setDateClaimSubmitted(Date dateClaimSubmitted) {
        this.dateClaimSubmitted = dateClaimSubmitted;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHealthProvider() {
        return healthProvider;
    }

    public void setHealthProvider(String healthProvider) {
        this.healthProvider = healthProvider;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "FullDocument{" +
                "_id=" + _id +
                ", city='" + city + '\'' +
                ", claimAmount=" + claimAmount +
                ", claimType='" + claimType + '\'' +
                ", dateClaimSubmitted=" + dateClaimSubmitted +
                ", email='" + email + '\'' +
                ", employer='" + employer + '\'' +
                ", gender='" + gender + '\'' +
                ", healthProvider='" + healthProvider + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", state='" + state + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", title='" + title + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
