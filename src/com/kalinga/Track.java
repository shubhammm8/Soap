package com.kalinga;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Track")
public class Track{
	private int tid;
	private String tname;
	
	public Track(){
		
	}
	
public Track(int id,String name){
		this.tid=id;
		this.tname=name;
	}

	@Id
	@Column(name="t_id")
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	@Column(name="t_name")
	public String getName() {
		return tname;
	}
	public void setName(String name) {
		this.tname = name;
	}
	

}
