package com.sk.sekong.model;


import java.util.Date;

/**
 * @author Xch
 */
public class EsComment {

  private long id;
  private String essayId;
  private String userId;
  private String commentMsg;
  private Date createDate;
  private long zanCount;
  private String isvalid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEssayId() {
    return essayId;
  }

  public void setEssayId(String essayId) {
    this.essayId = essayId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getCommentMsg() {
    return commentMsg;
  }

  public void setCommentMsg(String commentMsg) {
    this.commentMsg = commentMsg;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public long getZanCount() {
    return zanCount;
  }

  public void setZanCount(long zanCount) {
    this.zanCount = zanCount;
  }


  public String getIsvalid() {
    return isvalid;
  }

  public void setIsvalid(String isvalid) {
    this.isvalid = isvalid;
  }

}
