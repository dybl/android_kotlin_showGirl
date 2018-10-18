package com.junjc9.j9.gg.bean.entity;

/**
 * 描述：妹子业务Bean
 *
 * @author dybl： 2018/10/18 11:19
 */

public class Sister {
     private String _id;
    private String createAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
     public String getType() {
        return type;
    }
     public void setType(String type) {
        this.type = type;
    }
     public String get_id() {
        return _id;
    }
     public void set_id(String _id) {
        this._id = _id;
    }
     public String getCreateAt() {
        return createAt;
    }
     public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
     public String getDesc() {
        return desc;
    }
     public void setDesc(String desc) {
        this.desc = desc;
    }
     public String getPublishedAt() {
        return publishedAt;
    }
     public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
     public String getSource() {
        return source;
    }
     public void setSource(String source) {
        this.source = source;
    }
     public String getUrl() {
        return url;
    }
     public void setUrl(String url) {
        this.url = url;
    }
     public boolean isUsed() {
        return used;
    }
     public void setUsed(boolean used) {
        this.used = used;
    }
     public String getWho() {
        return who;
    }
     public void setWho(String who) {
        this.who = who;
    }
     @Override
    public String toString() {
        return "Sister{" +
                "_id='" + _id + '\'' +
                ", createAt='" + createAt + '\'' +
                ", desc='" + desc + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", source='" + source + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", used=" + used +
                ", who='" + who + '\'' +
                '}';
    }
}