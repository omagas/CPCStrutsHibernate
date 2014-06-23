package com.zurich.cpc.view;

import java.util.List;


//import net.viralpatel.contact.controller.ContactManager;
//import net.viralpatel.contact.model.Contact;

import com.zurich.cpc.controller.*;
import com.zurich.cpc.model.*;
import com.opensymphony.xwork2.ActionSupport;


public class AppMAction extends ActionSupport {
	private static final long serialVersionUID = 9149826260758390019L;
	private AppMTb appMTb;
	private List<AppMTb> appMTbList;


	private AppMTbDao linkController;

	

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
		System.out.println("useTry.....");
		List<AppGtlMTb> appGtlMTb=linkController.listsql();
		
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
