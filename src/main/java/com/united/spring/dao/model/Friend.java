package com.united.spring.dao.model;

import java.sql.Date;

/**
 * Created by myaskov on 08.02.2015.
 */
public class Friend {

    private long friendId;

    private long accountId;

    private long myFriendsAccountId;

    private Date createDate;

    private byte[] timestamp;

    public long getFriendId() {
        return friendId;
    }

    public void setFriendId(long friendId) {
        this.friendId = friendId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getMyFriendsAccountId() {
        return myFriendsAccountId;
    }

    public void setMyFriendsAccountId(long myFriendsAccountId) {
        this.myFriendsAccountId = myFriendsAccountId;
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
}
