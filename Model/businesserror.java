package com.Model;

import java.util.Date;

public class businesserror {
    private Integer beid;

    private String uid;

    private Integer nid;

    private Integer errortype;

    private Integer state;

    private Date date;

    private String echapter;

    public Integer getBeid() {
        return beid;
    }

    public void setBeid(Integer beid) {
        this.beid = beid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getErrortype() {
        return errortype;
    }

    public void setErrortype(Integer errortype) {
        this.errortype = errortype;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEchapter() {
        return echapter;
    }

    public void setEchapter(String echapter) {
        this.echapter = echapter == null ? null : echapter.trim();
    }
}