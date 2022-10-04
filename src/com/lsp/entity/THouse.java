package com.lsp.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * (THouse)实体类
 *
 * @author makejava
 * @since 2022-09-22 11:02:02
 */
public class THouse implements Serializable {
    private static final long serialVersionUID = -94552932841947204L;
    
    private Integer houseId;
    
    private String address;
    
    private String type;
    
    private Integer size;
    
    private String toward;
    
    private String floor;
    
    private String fitment;
    
    private String community;
    
    private Integer price;
    
    private String houseDetail;
    
    private String img;
    
    private String intro;
    
    private String way;
    
    private Integer sortId;

    private String title;

    private Integer userid;

    private  String username;

    private Timestamp addtime;

    private Integer fousid;

    private Timestamp foustime;

    private Integer user_fous_id;

    public Integer getFousid() {
        return fousid;
    }

    public Integer getUser_fous_id() {
        return user_fous_id;
    }

    public void setUser_fous_id(Integer user_fous_id) {
        this.user_fous_id = user_fous_id;
    }

    public void setFousid(Integer fousid) {
        this.fousid = fousid;
    }

    public Timestamp getFoustime() {
        return foustime;
    }

    public void setFoustime(Timestamp foustime) {
        this.foustime = foustime;
    }

    public Integer getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getToward() {
        return toward;
    }

    public void setToward(String toward) {
        this.toward = toward;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFitment() {
        return fitment;
    }

    public void setFitment(String fitment) {
        this.fitment = fitment;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getHouseDetail() {
        return houseDetail;
    }

    public void setHouseDetail(String houseDetail) {
        this.houseDetail = houseDetail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

}

