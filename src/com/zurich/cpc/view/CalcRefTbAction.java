package com.zurich.cpc.view;

import java.util.List;


//import net.viralpatel.contact.controller.ContactManager;
//import net.viralpatel.contact.model.Contact;

import com.zurich.cpc.controller.*;
import com.zurich.cpc.model.*;
import com.opensymphony.xwork2.ActionSupport;


public class CalcRefTbAction extends ActionSupport {
	private static final long serialVersionUID = 9149826260758390019L;
	private CalcRefTb calcRefTb;
	private List<CalcRefTb> calcRefTbList;
	private Long calc_Typ;

	private CalRefManager linkController;

	public CalcRefTbAction() {
		System.out.println("TEST....CalcRefTbAction");
		linkController = new CalRefManager();
	}

	public String execute() {
		this.calcRefTbList = linkController.list();
		return SUCCESS;
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

	
	
	
	public CalcRefTb getCalcRefTb() {
		return calcRefTb;
	}

	public void setCalcRefTb(CalcRefTb calcRefTb) {
		this.calcRefTb = calcRefTb;
	}

	public List<CalcRefTb> getCalcRefTbList() {
		return calcRefTbList;
	}

	public void setCalcRefTbList(List<CalcRefTb> calcRefTbList) {
		this.calcRefTbList = calcRefTbList;
	}

	public Long getCalc_Typ() {
		return calc_Typ;
	}

	public void setCalc_Typ(Long calc_Typ) {
		this.calc_Typ = calc_Typ;
	}

}
