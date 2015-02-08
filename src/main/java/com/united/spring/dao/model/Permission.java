package com.united.spring.dao.model;

import java.sql.Date;

/**
 * Created by myaskov on 08.02.2015.
 */
public class Permission {

    private long permissionId;

    private String name;

    private byte[] timestamp;

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }
}
