package com.Model;

import org.springframework.stereotype.Component;

@Component
public class novellist {
    private Integer nid;

    private String nname;

    private String nkind;

    private String author;

    private Integer amount;

    private String brief;

    private Integer colamount;

    private String covers;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname == null ? null : nname.trim();
    }

    public String getNkind() {
        return nkind;
    }

    public void setNkind(String nkind) {
        this.nkind = nkind == null ? null : nkind.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public Integer getColamount() {
        return colamount;
    }

    public void setColamount(Integer colamount) {
        this.colamount = colamount;
    }

    public String getCovers() {
        return covers;
    }

    public void setCovers(String covers) {
        this.covers = covers;
    }
}