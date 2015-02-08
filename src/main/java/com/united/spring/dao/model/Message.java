package com.united.spring.dao.model;

import java.sql.Date;

/**
 * Created by myaskov on 08.02.2015.
 */
public class Message {

    private long messageId;

    private long sentByAccountId;

    private String subject;

    private String body;

    private Date createDate;

    private byte[] timestamp;

    private long messageTypeId;// maybe, type=int

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public long getSentByAccountId() {
        return sentByAccountId;
    }

    public void setSentByAccountId(long sentByAccountId) {
        this.sentByAccountId = sentByAccountId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    public long getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(long messageTypeId) {
        this.messageTypeId = messageTypeId;
    }
}
