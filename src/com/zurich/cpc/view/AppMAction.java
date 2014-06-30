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


import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
		
//import net.viralpatel.contact.controller.ContactManager;
//import net.viralpatel.contact.model.Contact;

import com.zurich.core.model.common.impl.CustomResultImpl;
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
	protected CustomResultImpl<Object> ajaxResult = new CustomResultImpl<Object>();/*ajax用回應BEAN*/
	protected String errorMassage; /*錯誤訊息*/
	private String policyno;
	private AppGtlMTb jsonData;
	private List<AppGtlMTb> appGtlMTbsingle;

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
		
		this.appGtlMTbList=linkController.listsql();
		
		if(appGtlMTbList!=null){
			
	        for (AppGtlMTb appGtlMTb :appGtlMTbList) { 
	        	System.out.println("getHostPolicyNo1...............................: " +appGtlMTb.getHostPolicyNo());
	        	//System.out.println("AgentCd...............................: " +appGtlMTb.getAgentCd());
	        	//System.out.println("Data_ID...............................: " +appGtlMTbId.);
	        	//System.out.println("Data_ID_Verno...............................: " +appGtlMTb.getHostPolicyNo());
	        }
		}else{
			System.out.print("Null");
		}
				
		return SUCCESS;
	}
	
	public String Update(){
		
		
		String hostPolicyNo=policyno;

		
        try {
            if (!hostPolicyNo.equalsIgnoreCase("")) {
            	linkController.update(hostPolicyNo);	
        		System.out.print("Ajax..Success.....Success.....Success.....Success.....Success.....");
        		
        		
            } else {
                //ajaxResult = new CustomResultImpl<Object>(false, null, getErrorMassage());
            	
                return SUCCESS;
            }
        } catch (Exception e) {
            //ajaxResult = new CustomResultImpl<Object>(false, null, ExceptionUtils.getStackTrace(e));
            e.printStackTrace();
            return SUCCESS;
        }
        
        
        this.appGtlMTbsingle=linkController.listsql(hostPolicyNo);
        
		if(appGtlMTbsingle!=null){
			
	        for (AppGtlMTb appGtlMTb :appGtlMTbsingle) { 
	        	System.out.println("Update getHostPolicyNo1...............................: " +appGtlMTb.getHostPolicyNo());
	        	//jsonData=appGtlMTb;
	        	ajaxResult = new CustomResultImpl<Object>(true, "TTTTT", "TTTTT");
	        	//System.out.println("jsonData...............................: " +jsonData.getHostPolicyNo());
	        	//System.out.println("Data_ID...............................: " +appGtlMTbId.);
	        	//System.out.println("Data_ID_Verno...............................: " +appGtlMTb.getHostPolicyNo());
	        }
		}else{
			System.out.print("Null");
			ajaxResult = new CustomResultImpl<Object>(false, null, "null");
			return SUCCESS;
		}        
        
        
        return SUCCESS;		
		
		
		
	}

	
	
	public List<AppGtlMTb> getAppGtlMTbsingle() {
		return appGtlMTbsingle;
	}

	public void setAppGtlMTbsingle(List<AppGtlMTb> appGtlMTbsingle) {
		this.appGtlMTbsingle = appGtlMTbsingle;
	}

	public List<AppGtlMTb> getAppGtlMTbList() {
		return appGtlMTbList;
	}

	public void setAppGtlMTbList(List<AppGtlMTb> appGtlMTbList) {
		this.appGtlMTbList = appGtlMTbList;
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

    public String getErrorMassage() {
        return this.errorMassage;
    }

    public void setErrorMassage(String errorMassage) {
        this.errorMassage = errorMassage;
    }

	public String getPolicyno() {
		return policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	public CustomResultImpl<Object> getAjaxResult() {
		return ajaxResult;
	}

	public void setAjaxResult(CustomResultImpl<Object> ajaxResult) {
		this.ajaxResult = ajaxResult;
	}

	public AppGtlMTb getJsonData() {
		return jsonData;
	}

	public void setJsonData(AppGtlMTb jsonData) {
		this.jsonData = jsonData;
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
