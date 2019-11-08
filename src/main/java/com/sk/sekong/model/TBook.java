package com.sk.sekong.model;


import java.util.Date;

/**
 * @author Xch
 */
public class TBook {

  private long id;
  private String bookName;
  private String bookStatus;
  private String bookType;
  private String authorId;
  private Date createDate;
  private String translatorName;
  private String label;
  private String intro;
  private String isvalid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public String getBookStatus() {
    return bookStatus;
  }

  public void setBookStatus(String bookStatus) {
    this.bookStatus = bookStatus;
  }


  public String getBookType() {
    return bookType;
  }

  public void setBookType(String bookType) {
    this.bookType = bookType;
  }


  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public String getTranslatorName() {
    return translatorName;
  }

  public void setTranslatorName(String translatorName) {
    this.translatorName = translatorName;
  }


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

  public String getIsvalid() {
    return isvalid;
  }

  public void setIsvalid(String isvalid) {
    this.isvalid = isvalid;
  }

}
