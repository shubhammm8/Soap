package com.kalinga;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
	DAOClassImpl Dao=new DAOClassImpl();
	int num=-1;
	
while(num!=10){System.out.println("1  -  Retrieve Details from database  \n2  -  Insert Details in Database \n3  -  Delete Campus Minds\n4  -  Update Details of Campus Minds \n5  -  Get Mind By ID\n6  -  Get Lead by id\n7  -  Get All Tracks \n8  -  Get All Leads \n9  -  Get All Minds \n10  -  EXIT");
Scanner s=new Scanner(System.in);
num=s.nextInt();
switch(num){
case 1:{
	Dao.RetrieveDetails();
	continue;
}
case 2:{

Session session= hibernateUtility.getSessionFactory().openSession();
session.beginTransaction();
Scanner d=new Scanner(System.in);

System.out.println("Please insert the track");
String t=d.nextLine();
System.out.println("Please insert the track id");
int tid=d.nextInt();
d.nextLine();
System.out.println("Please insert the Lead");
String l=d.nextLine();
System.out.println("Please insert the LEad id");
int lid=d.nextInt();
d.nextLine();
System.out.println("Please insert the Minds");
String m=d.nextLine();

System.out.println("Please insert the track");
int mid=d.nextInt();
d.nextLine();
try{
	Dao.InsertMinds(t,l,m,tid,lid,mid);
}catch(Exception e){e.printStackTrace();}



	
	continue;
}
case 3:{
	System.out.println("Enter the id of the Campus Minds to be Deleted");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	Dao.DeleteDetails(id);
	continue;
}
case 4:{
	System.out.println("Enter the campus mind id to be updated");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	System.out.println("Enter the campus mind Name to be updated");
	String name=sc.next();
	Dao.UpdateDetails(id, name);
	continue;

}
case 5:{
	System.out.println("Enter the campus mind id");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	Dao.getMindById(id);
	continue;

	
}
case 6:{
	System.out.println("Enter the Lead id");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	Dao.getLeadById(id);
	continue;

}
case 7:{
	System.out.println("-----------------------------------------------------");
	Dao.getAllTracks();
	continue;

}
case 8:{	
	System.out.println("-----------------------------------------------------");
	Dao.getAllLead();
	continue;

}
case 9:{
	
	System.out.println("-----------------------------------------------------");
	Dao.getAllMinds();
	continue;

}
case 10:{
	
	System.out.println("-------------------------Thank you----------------------------");
	break;
}

}


}
	
	
	


	
		
	}


	


}
