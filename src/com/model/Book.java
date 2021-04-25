package com.model;
import javax.persistence.*;
@Entity
@Table(name="BookMaster")
public class Book {
	@Id
	int bid;
		@Column
	String bname;
		@Column
	String bauthor;
		@Column
	float bprice;
		public Book() 
		{
			
		}
		public Book(int bid, String bname, String bauthor, float bprice) {
			super();
			this.bid = bid;
			this.bname = bname;
			this.bauthor = bauthor;
			this.bprice = bprice;
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public String getBauthor() {
			return bauthor;
		}
		public void setBauthor(String bauthor) {
			this.bauthor = bauthor;
		}
		public float getBprice() {
			return bprice;
		}
		public void setBprice(float bprice) {
			this.bprice = bprice;
		}
		@Override
		public String toString() {
			return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bprice=" + bprice + "]";
		}
		
	

}
