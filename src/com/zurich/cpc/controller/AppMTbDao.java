package com.zurich.cpc.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.viralpatel.contact.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;


import com.zurich.cpc.model.*;
//import com.zurich.sds.model.gtl.hibernate.entity.CmpgnRefTb;
//import net.viralpatel.contact.model.Contact;
//import com.zurich.sds.model.gtl.hibernate.entity.CmpgnRefTb;

public class AppMTbDao extends HibernateUtil{



	private List<AppGtlMTb> resultList;

	public AppMTb add(AppMTb appMTb) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(appMTb);
		session.getTransaction().commit();
		return appMTb;
	}
	
	public AppMTb delete(Long dataId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		AppMTb appMTb = (AppMTb) session.load(AppMTb.class, dataId);
		if(null != appMTb) {
			session.delete(appMTb);
		}
		session.getTransaction().commit();
		return appMTb;
	}

	public List<AppMTb> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<AppMTb> appMTb = null;
		try {
			
			appMTb = (List<AppMTb>)session.createQuery("from AppMTb").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return appMTb;
	}
	
	public List<AppGtlMTb> listsql() {
		AppGtlMTb appGtlMTb = new AppGtlMTb();
		Transaction tx = null;
		//Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		tx=session.beginTransaction();
		try {
						StringBuffer sql = new StringBuffer();
						sql.append("SELECT Host_Policy_No,G.Data_ID,Data_ID_Verno from App_GTL_M_Tb G join App_M_Tb M on G.Data_ID=M.Data_ID   WHERE  1 = 1");
								//" Host_Policy_No is not null and Host_Policy_No >= '04313554' and (Email_Pcy_MK='Y' or Email_Recpt_MK='Y')  order by Host_Policy_No ");
					    sql.append(" AND Host_Policy_No>='04313554' ");	
					    SQLQuery query = session.createSQLQuery(sql.toString());
				        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
				        
				        List result = query.list();	
				        List<AppGtlMTb> resultList = new ArrayList<AppGtlMTb>();
				        
				        for (Object object :result) {
				        	//AppGtlMTb appGtlMTbR = new AppGtlMTb();
				        	Map qqq = (Map) object;
				        	//appGtlMTb.setHostPolicyNo(String.valueOf(map.get("Host_Policy_No")));
				            System.out.print("Host_Policy_No: " + String.valueOf((qqq.get("Host_Policy_No")))); 
				            System.out.print(", Data_ID: " + qqq.get("Data_ID"));
				            System.out.println(", Data_ID_Verno: " + qqq.get("Data_ID_Verno"));				            
				        
				            //appGtlMTbR.setHostPolicyNo(String.valueOf(qqq.get("Host_Policy_No")));
				            //appGtlMTbR.setCmpgnCd("allll065");
				            //resultList.add(appGtlMTbR);
				        }	
				//        
				        tx.commit();
				        
				        
				//            CmpgnRefTb cmpgnRefTb = new CmpgnRefTb();
				//            Map map = (Map) item;
				//            cmpgnRefTb.setCmpgnCd(String.valueOf(map.get("Cmpgn_CD")));
				//            cmpgnRefTb.setCmpgnNm(String.valueOf(map.get("Cmpgn_Nm")));
				//            cmpgnRefTb.setGtlAllowDomesticMk(String.valueOf(map.get("GTL_Allow_Domestic_MK")));
				//            cmpgnRefTb.setGtlLimitSchengenMk(String.valueOf(map.get("GTL_Limit_Schengen_MK")));
				//            resultList.add(cmpgnRefTb);
				        
				        //tx.commit();
				//		
				//        return resultList;
		} catch (HibernateException e) {
					if (tx!=null) tx.rollback();
					e.printStackTrace();
			
		}
		
		return resultList;
	}	
	

	//Example for nativeSQL
//	List<Person> peopleWithBooks = session.createSQLQuery(
//			   "select {p.*}, {b.*} from person p, book b where <complicated join>").
//			     .addEntity("p", Person.class)
//			     .addJoin("b", "p.books")
//			     .addEntity("p", Person.class)
//			     .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
//			     .list();	
	
	
//	  public List<CmpgnRefTb> getAgntCmpgnList(String agntCD, String prdtCD, String tourArea, String limitSchengen) {
//	        Session session = this.getSessionFactory().getCurrentSession();
//	        StringBuffer sql = new StringBuffer();
//	        //-------------------------appGTLMTB
//	        //將A.Total_Prm AS total_Prm, 改為 B.Tot_Prm AS GTL_Tot_Prm,及 Q.Tot_Prm AS QT_Tot_Prm, Wade   2/18
//	        sql.append(" select C.* from Cmpgn_Ref_Tb AS C inner join gtl_cmpgnAgnt_ref_tb AS G ON C.cmpgn_CD = G.cmpgn_CD WHERE  1 = 1 ");
//
//	        if (StringUtils.isNotBlank(agntCD)) {
//	            if (agntCD.length() > 5) {
//	                agntCD = agntCD.substring(0, 5);
//	            }
//	            sql.append(" AND G.agnt_CD like '"+ agntCD +"%' ");
//	        }
//
//	        if (StringUtils.isNotBlank(prdtCD)) {
//	            sql.append(" AND C.Prdt_CD='"+prdtCD+"' ");
//	        }
//
//	        if (StringUtils.isNotBlank(tourArea)) {
//	            sql.append(" AND C.GTL_Allow_Domestic_MK='"+tourArea+"' ");
//	        }
//
//	        if (StringUtils.isNotBlank(limitSchengen)) {
//	            sql.append(" AND C.GTL_Limit_Schengen_MK='"+limitSchengen+"' ");
//	        }
//
//	        Query query = session.createSQLQuery(sql.toString());
//	        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//	        List<Object> result = query.list();
//	        List<CmpgnRefTb> resultList = new ArrayList<CmpgnRefTb>();
//	        for (Object item :result) {
//	            CmpgnRefTb cmpgnRefTb = new CmpgnRefTb();
//	            Map map = (Map) item;
//	            cmpgnRefTb.setCmpgnCd(String.valueOf(map.get("Cmpgn_CD")));
//	            cmpgnRefTb.setCmpgnNm(String.valueOf(map.get("Cmpgn_Nm")));
//	            cmpgnRefTb.setGtlAllowDomesticMk(String.valueOf(map.get("GTL_Allow_Domestic_MK")));
//	            cmpgnRefTb.setGtlLimitSchengenMk(String.valueOf(map.get("GTL_Limit_Schengen_MK")));
//	            resultList.add(cmpgnRefTb);
//	        }
//
//	        return resultList;
//	    }	
	
}
