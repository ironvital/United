package com.united.spring.dao.model;

import java.sql.Date;

/**
 * Created by myaskov on 08.02.2015.
 */
public class File {

    private long fileId;

    private String fileSystemName; //type=GUID !!!

    private long fileSystemFolderID;

    private String fileName;

    private long fileTypeId;

    private Date createDate;

    private long accountId;

    private boolean isPublicResource;

    private long defaultFolderId;

    private String description;

    private byte[] timestamp;

    private long size;

    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    public String getFileSystemName() {
        return fileSystemName;
    }

    public void setFileSystemName(String fileSystemName) {
        this.fileSystemName = fileSystemName;
    }

    public long getFileSystemFolderID() {
        return fileSystemFolderID;
    }

    public void setFileSystemFolderID(long fileSystemFolderID) {
        this.fileSystemFolderID = fileSystemFolderID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(long fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public boolean isPublicResource() {
        return isPublicResource;
    }

    public void setPublicResource(boolean isPublicResource) {
        this.isPublicResource = isPublicResource;
    }

    public long getDefaultFolderId() {
        return defaultFolderId;
    }

    public void setDefaultFolderId(long defaultFolderId) {
        this.defaultFolderId = defaultFolderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }
}
