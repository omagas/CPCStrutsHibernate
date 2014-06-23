package com.zurich.cpc.controller;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.zurich.cpc.model.AppGtlMTb;
import com.zurich.cpc.model.CalcRefTb;


//import net.viralpatel.contact.model.Contact;
import net.viralpatel.contact.util.HibernateUtil;

public class CalRefManager extends HibernateUtil{

//	public CalRefManager() {
//		// TODO Auto-generated constructor stub
//		System.out.print("Yes I am in.");
//	
//	}

	public CalcRefTb add(CalcRefTb calcRefTb) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(calcRefTb);
		session.getTransaction().commit();
		return calcRefTb;
	}
	
	public CalcRefTb delete(Long calc_Typ) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		CalcRefTb calcRefTb = (CalcRefTb) session.load(CalcRefTb.class, calc_Typ);
		if(null != calcRefTb) {
			session.delete(calcRefTb);
		}
		session.getTransaction().commit();
		return calcRefTb;
	}

	public List<CalcRefTb> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<CalcRefTb> calcRefTb = null;
		try {
			
			calcRefTb = (List<CalcRefTb>)session.createQuery("from CalcRefTb").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return calcRefTb;
	}
	
	public List<AppGtlMTb> getAppGtllist(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<AppGtlMTb> appGtlMTb = null;
		try {
			
			appGtlMTb = (List<AppGtlMTb>)session.createQuery("from AppGtlMTb").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();		
		
		return appGtlMTb;
	}
	
}
