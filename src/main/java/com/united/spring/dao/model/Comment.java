package com.united.spring.dao.model;

import java.sql.Date;

/**
 * Created by myaskov on 08.02.2015.
 */
public class Comment {

    private long commentId;

    private byte[] timestamp;

    private String body;

    private Date createDate;

    private long commentByAccountId;

    private String commentByUsername;

    private long systemObjectId;

    private long systemObjectRecordId;

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
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

    public long getCommentByAccountId() {
        return commentByAccountId;
    }

    public void setCommentByAccountId(long commentByAccountId) {
        this.commentByAccountId = commentByAccountId;
    }

    public String getCommentByUsername() {
        return commentByUsername;
    }

    public void setCommentByUsername(String commentByUsername) {
        this.commentByUsername = commentByUsername;
    }

    public long getSystemObjectId() {
        return systemObjectId;
    }

    public void setSystemObjectId(long systemObjectId) {
        this.systemObjectId = systemObjectId;
    }

    public long getSystemObjectRecordId() {
        return systemObjectRecordId;
    }

    public void setSystemObjectRecordId(long systemObjectRecordId) {
        this.systemObjectRecordId = systemObjectRecordId;
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }
}
