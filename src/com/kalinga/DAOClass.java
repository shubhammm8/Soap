package com.kalinga;

import java.util.List;

public interface DAOClass {

	public  void Insert();
	public  List<Minds> RetrieveDetails();
	public  void UpdateDetails(int id,String name1);
	public  void DeleteDetails(int id);
	public  void getMindById(int i); 
	public  void getLeadById(int i); 
	public  void getAllLead();
	public  void getAllMinds();
	public  void getAllTracks();
	public  void InsertMinds(String z,String x,String c,int q,int w,int e);
}
