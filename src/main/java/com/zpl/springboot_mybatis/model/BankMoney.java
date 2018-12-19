package com.zpl.springboot_mybatis.model;

public class BankMoney {
    private String id;

    private String loanapplication;

    private String loancode;

    private String period;

    private String accrual;

    private String capital;

    public BankMoney() {
    }

    public BankMoney(String id, String loanapplication, String loancode, String period, String accrual, String capital) {
        this.id = id;
        this.loanapplication = loanapplication;
        this.loancode = loancode;
        this.period = period;
        this.accrual = accrual;
        this.capital = capital;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoanapplication() {
        return loanapplication;
    }

    public void setLoanapplication(String loanapplication) {
        this.loanapplication = loanapplication == null ? null : loanapplication.trim();
    }

    public String getLoancode() {
        return loancode;
    }

    public void setLoancode(String loancode) {
        this.loancode = loancode == null ? null : loancode.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public String getAccrual() {
        return accrual;
    }

    public void setAccrual(String accrual) {
        this.accrual = accrual == null ? null : accrual.trim();
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital == null ? null : capital.trim();
    }
}