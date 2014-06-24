package com.zurich.cpc.view;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;
		
//import net.viralpatel.contact.controller.ContactManager;
//import net.viralpatel.contact.model.Contact;

import com.zurich.cpc.controller.*;
import com.zurich.cpc.model.*;
import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionSupport;


public class AppMAction extends ActionSupport {
	private static final long serialVersionUID = 9149826260758390019L;
	private AppMTb appMTb;
	private List<AppMTb> appMTbList;
	private AppMTbDao linkController;
	private List<AppGtlMTb> appGtlMTbList;
	

	public AppMAction() {
		System.out.println("Cquery.....AppMAction....CalcRefTbAction");
		linkController = new AppMTbDao();
	}

	public String execute() {
		
		//linkController.listsql();
		return SUCCESS;
	}
	
	public String useTry(){
		//linkController.listsql();
		
		appGtlMTbList=linkController.listsql();
		
		
		
		if(appGtlMTbList!=null){
			
	        for (AppGtlMTb appGtlMTb :appGtlMTbList) { 
	        	System.out.println("getHostPolicyNo...............................: " +appGtlMTb.getHostPolicyNo());
			}
		}else{
			System.out.print("Null");
		}
		


		
		
		return SUCCESS;
	}

	public AppMTb getAppMTb() {
		return appMTb;
	}

	public void setAppMTb(AppMTb appMTb) {
		this.appMTb = appMTb;
	}

	public List<AppMTb> getAppMTbList() {
		return appMTbList;
	}

	public void setAppMTbList(List<AppMTb> appMTbList) {
		this.appMTbList = appMTbList;
	}





//	public String add() {
//		System.out.println(getContact());
//		try {
//			linkController.add(getContact());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		this.contactList = linkController.list();
//		return SUCCESS;
//	}

//	public String delete() {
//		linkController.delete(getId());
//		return SUCCESS;
//	}

	
	


}
