package com.Model;

import java.util.Date;

public class reviewerror {
    private Integer reid;

    private Integer nid;

    private String uid;

    private Integer rid;

    private Integer errortype;

    private Date date;

    private Integer state;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getErrortype() {
        return errortype;
    }

    public void setErrortype(Integer errortype) {
        this.errortype = errortype;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}