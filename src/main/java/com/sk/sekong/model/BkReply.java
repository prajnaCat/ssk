package com.sk.sekong.model;


import java.util.Date;

/**
 * @author Xch
 */
public class BkReply {

  private long id;
  private String commentId;
  private String fromUserId;
  private String toUserId;
  private String replyMsg;
  private Date createDate;
  private String isvalid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }


  public String getFromUserId() {
    return fromUserId;
  }

  public void setFromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
  }


  public String getToUserId() {
    return toUserId;
  }

  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }


  public String getReplyMsg() {
    return replyMsg;
  }

  public void setReplyMsg(String replyMsg) {
    this.replyMsg = replyMsg;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public String getIsvalid() {
    return isvalid;
  }

  public void setIsvalid(String isvalid) {
    this.isvalid = isvalid;
  }

}
