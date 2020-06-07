package be.ticket.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ticket {
	
	 @Id
	 @GeneratedValue
	private  int id;
	 
    private  int accountId;
    private  String title;
    private  String category;
    private  String text;
    private LocalDateTime  publishDate;
    private  int userId;
    public boolean status; //**********************************
    
    
    
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int id, int accountId, String title, String category, String text, LocalDateTime publishDate, int userId) {
		super();
		this.id = id;
		this.setAccountId(accountId);
		this.title = title;
		this.category = category;
		this.text = text;
		this.publishDate = publishDate;
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getText() {
		return text;
	}
	public LocalDateTime getPublishDate() {
		return publishDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setPublishDate(LocalDateTime publishDate) {
		this.publishDate = publishDate;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", accountId=" + accountId + ", title=" + title + ", category=" + category
				+ ", text=" + text + ", publishDate=" + publishDate + ", userId=" + userId + ", status=" + status + "]";
	}

    

}