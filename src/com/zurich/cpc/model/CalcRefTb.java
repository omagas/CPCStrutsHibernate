package com.zurich.cpc.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Calc_Ref_Tb")
public class CalcRefTb {
	private static final long serialVersionUID= -8767337896773261201L;
	
	private Long Calc_Typ;
	private String Calc_Desc;
	private String Calc_Unit;
	private String Eff_MK;
	
	@Id
	@GeneratedValue
	@Column(name="Calc_Typ")
	public Long getCalc_Typ() {
		return Calc_Typ;
	}	
	
	@Column(name="Calc_Desc")
	public String getCalc_Desc() {
		return Calc_Desc;
	}
	
	@Column(name="Calc_Unit")
	public String getCalc_Unit() {
		return Calc_Unit;
	}

	@Column(name="Eff_MK")
	public String getEff_MK() {
		return Eff_MK;
	}


	public void setCalc_Typ(Long calc_Typ) {
		Calc_Typ = calc_Typ;
	}	
	
	public void setCalc_Desc(String calc_Desc) {
		Calc_Desc = calc_Desc;
	}
	
	public void setCalc_Unit(String calc_Unit) {
		Calc_Unit = calc_Unit;
	}	
	
	public void setEff_MK(String eff_MK) {
		Eff_MK = eff_MK;
	}


	
}
