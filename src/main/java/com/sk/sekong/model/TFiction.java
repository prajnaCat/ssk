package com.sk.sekong.model;


import java.util.Date;

/**
 * @author Xch
 */
public class TEssay {

  private long id;
  private String authorId;
  private String essayTitle;
  private String essayContent;
  private Date createDate;
  private String essayStatus;
  private String essayType;
  private String label;
  private String isvalid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public String getEssayTitle() {
    return essayTitle;
  }

  public void setEssayTitle(String essayTitle) {
    this.essayTitle = essayTitle;
  }


  public String getEssayContent() {
    return essayContent;
  }

  public void setEssayContent(String essayContent) {
    this.essayContent = essayContent;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public String getEssayStatus() {
    return essayStatus;
  }

  public void setEssayStatus(String essayStatus) {
    this.essayStatus = essayStatus;
  }


  public String getEssayType() {
    return essayType;
  }

  public void setEssayType(String essayType) {
    this.essayType = essayType;
  }


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public String getIsvalid() {
    return isvalid;
  }

  public void setIsvalid(String isvalid) {
    this.isvalid = isvalid;
  }

}
