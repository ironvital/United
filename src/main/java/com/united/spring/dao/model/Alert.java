package com.united.spring.dao.model;

import java.sql.Date;

/**
 * Created by myaskov on 08.02.2015.
 */
public class Alert {

    private long alertId;

    private long accountId;

    private Date createDate;

    private byte[] timestamp;

    private long alertTypeId;

    private boolean isHidden;

    private String message;

    public long getAlertId() {
        return alertId;
    }

    public void setAlertId(long alertId) {
        this.alertId = alertId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }

    public long getAlertTypeId() {
        return alertTypeId;
    }

    public void setAlertTypeId(long alertTypeId) {
        this.alertTypeId = alertTypeId;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
