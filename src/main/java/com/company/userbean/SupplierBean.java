package com.company.userbean;

public class SupplierBean {
    private Integer supplierid;

    private String suppliername;

    private String supplierbank;

    private String industry;

    private String remarks;

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSupplierbank() {
        return supplierbank;
    }

    public void setSupplierbank(String supplierbank) {
        this.supplierbank = supplierbank == null ? null : supplierbank.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}