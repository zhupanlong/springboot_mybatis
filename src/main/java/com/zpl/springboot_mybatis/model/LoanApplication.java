package com.zpl.springboot_mybatis.model;

public class LoanApplication {
    private String id;

    private String cid;

    private String pid;

    private String cusname;

    private String proname;

    private String loancode;

    private String loandate;

    private String loanamount;

    private String coveragedate;

    private String product;

    private String auditor;

    private String auditordate;

    private String status;

    private String appointdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname == null ? null : cusname.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getLoancode() {
        return loancode;
    }

    public void setLoancode(String loancode) {
        this.loancode = loancode == null ? null : loancode.trim();
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate == null ? null : loandate.trim();
    }

    public String getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(String loanamount) {
        this.loanamount = loanamount == null ? null : loanamount.trim();
    }

    public String getCoveragedate() {
        return coveragedate;
    }

    public void setCoveragedate(String coveragedate) {
        this.coveragedate = coveragedate == null ? null : coveragedate.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getAuditordate() {
        return auditordate;
    }

    public void setAuditordate(String auditordate) {
        this.auditordate = auditordate == null ? null : auditordate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAppointdate() {
        return appointdate;
    }

    public void setAppointdate(String appointdate) {
        this.appointdate = appointdate == null ? null : appointdate.trim();
    }
}