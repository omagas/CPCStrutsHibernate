package com.zurich.cpc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.zurich.cpc.model.pk.AppGtlMId_bk;

@Entity
@Table(name = "APP_GTL_M_TB")
public class AppGtlMTb_bk1 implements Serializable {

    private static final long serialVersionUID = 7232448116092805066L;

    @EmbeddedId
    private AppGtlMId_bk id;
    
    @Column(name = "Recpt_No")
    private String recptNo;

    @Column(name = "Cmpgn_CD")
    private String cmpgnCd;
    
    /*@OneToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "Cmpgn_CD" , insertable = false, updatable = false)
    @Transient
    private CmpgnRefTb cmpgnRefTb;
    */

    @Column(name = "Host_Ref_Proj_CD")
    private String hostRefProjCd;

    @Column(name = "Tour_Days")
    private Integer tourDays;

    @Column(name = "TourArea_CD")
    private String tourAreaCd;
    
    //@OneToOne(fetch = FetchType.LAZY )
    //@JoinColumn(name = "TourArea_CD" , insertable = false, updatable = false)
    @Transient
    //private GtlTourAreaDefTb gtlTourAreaDefTb;
    
    @Column(name = "TourCnty_CD")
    private String tourCntyCd;
    /*
    @OneToOne(fetch = FetchType.LAZY )
    @JoinColumns(value = {
            @JoinColumn(name = "TourArea_CD" , insertable = false, updatable = false)
            ,@JoinColumn(name = "TourCnty_CD", insertable = false, updatable = false)
    })*/
    @Transient
    //private GtlTourCntyDefTb gtlTourCntyDefTb;
        
    @Column(name = "TourPlace_Desc")
    private String tourPlaceDesc;

    @Column(name = "TourCust_Cnt")
    private Integer tourCustCnt;

    @Column(name = "ChildCust_Cnt")
    private Integer childCustCnt;

    @Column(name = "AgedCust_Cnt")
    private Integer agedCustCnt;
    
    @Column(name = "AdultCust_Cnt")
    private Integer adultCustCnt;

    @Column(name = "ChildCust_Prm")
    private Integer childCustPrm;

    @Column(name = "AgedCust_Prm")
    private Integer agedCustPrm;

    @Column(name = "AdultCust_Prm")
    private Integer adultCustPrm;

    @Column(name = "RskID_01_MK")
    private String rskId01Mk;

    @Column(name = "RskID_01_Amt")
    private Integer rskId01Amt;

    @Column(name = "RskID_01_Prm")
    private Integer rskId01Prm;

    @Column(name = "RskID_02_MK")
    private String rskId02Mk;

    @Column(name = "RskID_02_Amt")
    private Integer rskId02Amt;

    @Column(name = "RskID_02_Prm")
    private Integer rskId02Prm;

    @Column(name = "RskID_03_MK")
    private String rskId03Mk;

    @Column(name = "RskID_03_Amt")
    private Integer rskId03Amt;

    @Column(name = "RskID_03_Prm")
    private Integer rskId03Prm;

    @Column(name = "RskID_04_MK")
    private String rskId04Mk;
    
    @Column(name = "RskID_04_Amt")
    private Integer rskId04Amt;

    @Column(name = "RskID_04_Prm")
    private Integer rskId04Prm;

    @Column(name = "RskID_05_MK")
    private String rskId05Mk;

    @Column(name = "RskID_05_Amt")
    private Integer rskId05Amt;

    @Column(name = "RskID_05_Prm")
    private Integer rskId05Prm;

    @Column(name = "RskID_06_MK", length = 1)
    private String rskId06Mk;

    @Column(name = "RskID_06_Amt")
    private Integer rskId06Amt;

    @Column(name = "RskID_06_Prm")
    private Integer rskId06Prm;

    @Column(name = "RskID_07_MK", length = 1)
    private String rskId07Mk;

    @Column(name = "RskID_07_Amt")
    private Integer rskId07Amt;

    @Column(name = "RskID_07_Prm")
    private Integer rskId07Prm;

    @Column(name = "RskID_11_MK")
    private String rskId11Mk;

    @Column(name = "RskID_11_Amt")
    private Integer rskId11Amt;

    @Column(name = "RskID_11_Prm")
    private Integer rskId11Prm;

    @Column(name = "RskID_12_MK", length = 1)
    private String rskId12Mk;

    @Column(name = "RskID_12_Amt")
    private Integer rskId12Amt;

    @Column(name = "RskID_12_Prm")
    private Integer rskId12Prm;

    @Column(name = "RskID_13_MK", length = 1)
    private String rskId13Mk;

    @Column(name = "RskID_13_Amt")
    private Integer rskId13Amt;

    @Column(name = "RskID_13_Prm")
    private Integer rskId13Prm;

    @Column(name = "RskID_14_MK", length = 1)
    private String rskId14Mk;

    @Column(name = "RskID_14_Amt")
    private Integer rskId14Amt;

    @Column(name = "RskID_14_Prm")
    private Integer rskId14Prm;

    @Column(name = "RskID_15_MK", length = 1)
    private String rskId15Mk;

    @Column(name = "RskID_15_Amt")
    private Integer rskId15Amt;

    @Column(name = "RskID_15_Prm")
    private Integer rskId15Prm;

    @Column(name = "RskID_16_MK", length = 1)
    private String rskId16Mk;

    @Column(name = "RskID_16_Amt")
    private Integer rskId16Amt;

    @Column(name = "RskID_16_Prm")
    private Integer rskId16Prm;

    @Column(name = "RskID_17_MK", length = 1)
    private String rskId17Mk;

    @Column(name = "RskID_17_Amt")
    private Integer rskId17Amt;

    @Column(name = "RskID_17_Prm")
    private Integer rskId17Prm;

    @Column(name = "RskID_18_MK", length = 1)
    private String rskId18Mk;

    @Column(name = "RskID_18_Amt")
    private Integer rskId18Amt;

    @Column(name = "RskID_18_Prm")
    private Integer rskId18Prm;

    @Column(name = "RskID_19_MK", length = 1)
    private String rskId19Mk;

    @Column(name = "RskID_19_Amt")
    private Integer rskId19Amt;

    @Column(name = "RskID_19_Prm")
    private Integer rskId19Prm;

    @Column(name = "Tot_Prm")
    private Integer totPrm;
    
    @Column(name = "Insured_InputTyp")
    private String insuredInputTyp;
    
    @Column(name = "MemberList_Typ")
    private String memberListTyp;

    @Column(name = "Proc_Status_CD")
    private String procStatusCd;

    @Column(name = "Host_Policy_No")
    private String hostPolicyNo;

    @Column(name = "Host_Policy_TranNo")
    private String hostPolicyTranNo;

    @Column(name = "Paymnt_Card_Auth_CD")
    private String paymntCardAuthCd;

    @Column(name = "Paymnt_Response_CD", length = 3)
    private String paymntResponseCd;

    @Column(name = "Paymnt_Response_Msg")
    private String paymntResponseMsg;

    @Column(name = "Paymnt_Trans_SeqNo", length = 12)
    private String paymntTransSeqNo;

    @Column(name = "Paymnt_Auth_Dt", length = 8)
    private String paymntAuthDt;

    @Column(name = "Paymnt_Cancel_MK", length = 1)
    private String paymntCancelMk;

    @Column(name = "Paymnt_Cancel_UsrID", length = 15)
    private String paymntCancelUsrId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Paymnt_Cancel_Dt", length = 23)
    private Date paymntCancelDt;

    @Column(name = "KYC_VerNo")
    private Integer kycVerNo;

    @Column(name = "Cmpgn_Sel_MK", length = 1)
    private String cmpgnSelMk;

    @Column(name = "Same_InsAmt_MK", length = 1)
    private String sameInsAmtMk;
    
    @Column(name = "prt_Pcy_MK")
    private String prtPcyMK;
    
    @Column(name = "prt_Recpt_MK ")
    private String prtRecptMK;
    
    @Column(name = "email_Pcy_MK")
    private String emailPcyMK;
    
    @Column(name = "email_Recpt_MK")
    private String emailRecptMK;
    
    @Column(name = "rapidInput_MK")
    private String rapidInputMK;
    
    @Column(name = "RI_Tot_Prm")
    private Integer riTotPrm; 
    
    /*
    @OneToMany(fetch = FetchType.LAZY )
    @JoinColumns(value = {
            @JoinColumn(name = "Data_ID" , insertable = false, updatable = false)
            ,@JoinColumn(name = "Data_ID_VerNo" , insertable = false, updatable = false)
    })
    private List<AppGtlPaTb> appGtlPaTbList;
    
    @OneToMany(fetch = FetchType.LAZY )
    @JoinColumns(value = {
            @JoinColumn(name = "Data_ID" , insertable = false, updatable = false)
            ,@JoinColumn(name = "Data_ID_VerNo" , insertable = false, updatable = false)
    })
    private List<AppGtlRiskTb> appGtlRiskTbList;
    */
    public AppGtlMTb_bk1() {
    }
    
    public AppGtlMId_bk getId() {
        return this.id;
    }

    public void setId(AppGtlMId_bk id) {
        this.id = id;
    }
    
    public String getRecptNo() {
        return recptNo;
    }

    public void setRecptNo(String recptNo) {
        this.recptNo = recptNo;
    }
    
    public String getCmpgnCd() {
        return this.cmpgnCd;
    }

    public void setCmpgnCd(String cmpgnCd) {
        this.cmpgnCd = cmpgnCd;
    }
/*
    public CmpgnRefTb getCmpgnRefTb() {
        return this.cmpgnRefTb;
    }

    public void setCmpgnRefTb(CmpgnRefTb cmpgnRefTb) {
        this.cmpgnRefTb = cmpgnRefTb;
    }
*/
    public String getHostRefProjCd() {
        return this.hostRefProjCd;
    }

    public void setHostRefProjCd(String hostRefProjCd) {
        this.hostRefProjCd = hostRefProjCd;
    }


    public Integer getTourDays() {
        return this.tourDays;
    }

    public void setTourDays(Integer tourDays) {
        this.tourDays = tourDays;
    }


    public String getTourAreaCd() {
        return this.tourAreaCd;
    }

    public void setTourAreaCd(String tourAreaCd) {
        this.tourAreaCd = tourAreaCd;
    }


    public String getTourCntyCd() {
        return this.tourCntyCd;
    }

    public void setTourCntyCd(String tourCntyCd) {
        this.tourCntyCd = tourCntyCd;
    }


    public String getTourPlaceDesc() {
        return this.tourPlaceDesc;
    }

    public void setTourPlaceDesc(String tourPlaceDesc) {
        this.tourPlaceDesc = tourPlaceDesc;
    }


    public Integer getTourCustCnt() {
        return this.tourCustCnt;
    }

    public void setTourCustCnt(Integer tourCustCnt) {
        this.tourCustCnt = tourCustCnt;
    }


    public Integer getChildCustCnt() {
        return this.childCustCnt;
    }

    public void setChildCustCnt(Integer childCustCnt) {
        this.childCustCnt = childCustCnt;
    }


    public Integer getAgedCustCnt() {
        return this.agedCustCnt;
    }

    public void setAgedCustCnt(Integer agedCustCnt) {
        this.agedCustCnt = agedCustCnt;
    }


    public Integer getAdultCustCnt() {
        return this.adultCustCnt;
    }

    public void setAdultCustCnt(Integer adultCustCnt) {
        this.adultCustCnt = adultCustCnt;
    }


    public Integer getChildCustPrm() {
        return this.childCustPrm;
    }

    public void setChildCustPrm(Integer childCustPrm) {
        this.childCustPrm = childCustPrm;
    }


    public Integer getAgedCustPrm() {
        return this.agedCustPrm;
    }

    public void setAgedCustPrm(Integer agedCustPrm) {
        this.agedCustPrm = agedCustPrm;
    }


    public Integer getAdultCustPrm() {
        return this.adultCustPrm;
    }

    public void setAdultCustPrm(Integer adultCustPrm) {
        this.adultCustPrm = adultCustPrm;
    }


    public String getRskId01Mk() {
        return this.rskId01Mk;
    }

    public void setRskId01Mk(String rskId01Mk) {
        this.rskId01Mk = rskId01Mk;
    }


    public Integer getRskId01Amt() {
        return this.rskId01Amt;
    }

    public void setRskId01Amt(Integer rskId01Amt) {
        this.rskId01Amt = rskId01Amt;
    }


    public Integer getRskId01Prm() {
        return this.rskId01Prm;
    }

    public void setRskId01Prm(Integer rskId01Prm) {
        this.rskId01Prm = rskId01Prm;
    }


    public String getRskId02Mk() {
        return this.rskId02Mk;
    }

    public void setRskId02Mk(String rskId02Mk) {
        this.rskId02Mk = rskId02Mk;
    }


    public Integer getRskId02Amt() {
        return this.rskId02Amt;
    }

    public void setRskId02Amt(Integer rskId02Amt) {
        this.rskId02Amt = rskId02Amt;
    }


    public Integer getRskId02Prm() {
        return this.rskId02Prm;
    }

    public void setRskId02Prm(Integer rskId02Prm) {
        this.rskId02Prm = rskId02Prm;
    }


    public String getRskId03Mk() {
        return this.rskId03Mk;
    }

    public void setRskId03Mk(String rskId03Mk) {
        this.rskId03Mk = rskId03Mk;
    }


    public Integer getRskId03Amt() {
        return this.rskId03Amt;
    }

    public void setRskId03Amt(Integer rskId03Amt) {
        this.rskId03Amt = rskId03Amt;
    }


    public Integer getRskId03Prm() {
        return this.rskId03Prm;
    }

    public void setRskId03Prm(Integer rskId03Prm) {
        this.rskId03Prm = rskId03Prm;
    }


    public String getRskId04Mk() {
        return this.rskId04Mk;
    }

    public void setRskId04Mk(String rskId04Mk) {
        this.rskId04Mk = rskId04Mk;
    }


    public Integer getRskId04Amt() {
        return this.rskId04Amt;
    }

    public void setRskId04Amt(Integer rskId04Amt) {
        this.rskId04Amt = rskId04Amt;
    }

    public Integer getRskId04Prm() {
        return this.rskId04Prm;
    }

    public void setRskId04Prm(Integer rskId04Prm) {
        this.rskId04Prm = rskId04Prm;
    }

    public String getRskId05Mk() {
        return this.rskId05Mk;
    }

    public void setRskId05Mk(String rskId05Mk) {
        this.rskId05Mk = rskId05Mk;
    }

    public Integer getRskId05Amt() {
        return this.rskId05Amt;
    }

    public void setRskId05Amt(Integer rskId05Amt) {
        this.rskId05Amt = rskId05Amt;
    }

    public Integer getRskId05Prm() {
        return this.rskId05Prm;
    }

    public void setRskId05Prm(Integer rskId05Prm) {
        this.rskId05Prm = rskId05Prm;
    }

    public String getRskId06Mk() {
        return this.rskId06Mk;
    }

    public void setRskId06Mk(String rskId06Mk) {
        this.rskId06Mk = rskId06Mk;
    }

    public Integer getRskId06Amt() {
        return this.rskId06Amt;
    }

    public void setRskId06Amt(Integer rskId06Amt) {
        this.rskId06Amt = rskId06Amt;
    }

    public Integer getRskId06Prm() {
        return this.rskId06Prm;
    }

    public void setRskId06Prm(Integer rskId06Prm) {
        this.rskId06Prm = rskId06Prm;
    }

    public String getRskId07Mk() {
        return this.rskId07Mk;
    }

    public void setRskId07Mk(String rskId07Mk) {
        this.rskId07Mk = rskId07Mk;
    }

    public Integer getRskId07Amt() {
        return this.rskId07Amt;
    }

    public void setRskId07Amt(Integer rskId07Amt) {
        this.rskId07Amt = rskId07Amt;
    }

    public Integer getRskId07Prm() {
        return this.rskId07Prm;
    }

    public void setRskId07Prm(Integer rskId07Prm) {
        this.rskId07Prm = rskId07Prm;
    }

    public String getRskId11Mk() {
        return this.rskId11Mk;
    }

    public void setRskId11Mk(String rskId11Mk) {
        this.rskId11Mk = rskId11Mk;
    }

    public Integer getRskId11Amt() {
        return this.rskId11Amt;
    }

    public void setRskId11Amt(Integer rskId11Amt) {
        this.rskId11Amt = rskId11Amt;
    }


    public Integer getRskId11Prm() {
        return this.rskId11Prm;
    }

    public void setRskId11Prm(Integer rskId11Prm) {
        this.rskId11Prm = rskId11Prm;
    }

    public String getRskId12Mk() {
        return this.rskId12Mk;
    }

    public void setRskId12Mk(String rskId12Mk) {
        this.rskId12Mk = rskId12Mk;
    }

    public Integer getRskId12Amt() {
        return this.rskId12Amt;
    }

    public void setRskId12Amt(Integer rskId12Amt) {
        this.rskId12Amt = rskId12Amt;
    }

    public Integer getRskId12Prm() {
        return this.rskId12Prm;
    }

    public void setRskId12Prm(Integer rskId12Prm) {
        this.rskId12Prm = rskId12Prm;
    }

    public String getRskId13Mk() {
        return this.rskId13Mk;
    }

    public void setRskId13Mk(String rskId13Mk) {
        this.rskId13Mk = rskId13Mk;
    }

    public Integer getRskId13Amt() {
        return this.rskId13Amt;
    }

    public void setRskId13Amt(Integer rskId13Amt) {
        this.rskId13Amt = rskId13Amt;
    }

    public Integer getRskId13Prm() {
        return this.rskId13Prm;
    }

    public void setRskId13Prm(Integer rskId13Prm) {
        this.rskId13Prm = rskId13Prm;
    }

    public String getRskId14Mk() {
        return this.rskId14Mk;
    }

    public void setRskId14Mk(String rskId14Mk) {
        this.rskId14Mk = rskId14Mk;
    }

    public Integer getRskId14Amt() {
        return this.rskId14Amt;
    }

    public void setRskId14Amt(Integer rskId14Amt) {
        this.rskId14Amt = rskId14Amt;
    }

    public Integer getRskId14Prm() {
        return this.rskId14Prm;
    }

    public void setRskId14Prm(Integer rskId14Prm) {
        this.rskId14Prm = rskId14Prm;
    }

    public String getRskId15Mk() {
        return this.rskId15Mk;
    }

    public void setRskId15Mk(String rskId15Mk) {
        this.rskId15Mk = rskId15Mk;
    }

    public Integer getRskId15Amt() {
        return this.rskId15Amt;
    }

    public void setRskId15Amt(Integer rskId15Amt) {
        this.rskId15Amt = rskId15Amt;
    }

    public Integer getRskId15Prm() {
        return this.rskId15Prm;
    }

    public void setRskId15Prm(Integer rskId15Prm) {
        this.rskId15Prm = rskId15Prm;
    }

    public String getRskId16Mk() {
        return this.rskId16Mk;
    }

    public void setRskId16Mk(String rskId16Mk) {
        this.rskId16Mk = rskId16Mk;
    }

    public Integer getRskId16Amt() {
        return this.rskId16Amt;
    }

    public void setRskId16Amt(Integer rskId16Amt) {
        this.rskId16Amt = rskId16Amt;
    }

    public Integer getRskId16Prm() {
        return this.rskId16Prm;
    }

    public void setRskId16Prm(Integer rskId16Prm) {
        this.rskId16Prm = rskId16Prm;
    }

    public String getRskId17Mk() {
        return this.rskId17Mk;
    }

    public void setRskId17Mk(String rskId17Mk) {
        this.rskId17Mk = rskId17Mk;
    }

    public Integer getRskId17Amt() {
        return this.rskId17Amt;
    }

    public void setRskId17Amt(Integer rskId17Amt) {
        this.rskId17Amt = rskId17Amt;
    }

    public Integer getRskId17Prm() {
        return this.rskId17Prm;
    }

    public void setRskId17Prm(Integer rskId17Prm) {
        this.rskId17Prm = rskId17Prm;
    }

    public String getRskId18Mk() {
        return this.rskId18Mk;
    }

    public void setRskId18Mk(String rskId18Mk) {
        this.rskId18Mk = rskId18Mk;
    }

    public Integer getRskId18Amt() {
        return this.rskId18Amt;
    }

    public void setRskId18Amt(Integer rskId18Amt) {
        this.rskId18Amt = rskId18Amt;
    }

    public Integer getRskId18Prm() {
        return this.rskId18Prm;
    }

    public void setRskId18Prm(Integer rskId18Prm) {
        this.rskId18Prm = rskId18Prm;
    }

    public String getRskId19Mk() {
        return this.rskId19Mk;
    }

    public void setRskId19Mk(String rskId19Mk) {
        this.rskId19Mk = rskId19Mk;
    }

    public Integer getRskId19Amt() {
        return this.rskId19Amt;
    }

    public void setRskId19Amt(Integer rskId19Amt) {
        this.rskId19Amt = rskId19Amt;
    }

    public Integer getRskId19Prm() {
        return this.rskId19Prm;
    }

    public void setRskId19Prm(Integer rskId19Prm) {
        this.rskId19Prm = rskId19Prm;
    }

    public Integer getTotPrm() {
        return this.totPrm;
    }

    public void setTotPrm(Integer totPrm) {
        this.totPrm = totPrm;
    }


    public String getInsuredInputTyp() {
        return this.insuredInputTyp;
    }

    public void setInsuredInputTyp(String insuredInputTyp) {
        this.insuredInputTyp = insuredInputTyp;
    }

    public String getMemberListTyp() {
        return this.memberListTyp;
    }

    public void setMemberListTyp(String memberListTyp) {
        this.memberListTyp = memberListTyp;
    }

    public String getProcStatusCd() {
        return this.procStatusCd;
    }

    public void setProcStatusCd(String procStatusCd) {
        this.procStatusCd = procStatusCd;
    }

    public String getHostPolicyNo() {
        return this.hostPolicyNo;
    }

    public void setHostPolicyNo(String hostPolicyNo) {
        this.hostPolicyNo = hostPolicyNo;
    }

    public String getHostPolicyTranNo() {
        return this.hostPolicyTranNo;
    }

    public void setHostPolicyTranNo(String hostPolicyTranNo) {
        this.hostPolicyTranNo = hostPolicyTranNo;
    }

    public String getPaymntCardAuthCd() {
        return this.paymntCardAuthCd;
    }

    public void setPaymntCardAuthCd(String paymntCardAuthCd) {
        this.paymntCardAuthCd = paymntCardAuthCd;
    }


    public String getPaymntResponseCd() {
        return this.paymntResponseCd;
    }

    public void setPaymntResponseCd(String paymntResponseCd) {
        this.paymntResponseCd = paymntResponseCd;
    }


    public String getPaymntResponseMsg() {
        return this.paymntResponseMsg;
    }

    public void setPaymntResponseMsg(String paymntResponseMsg) {
        this.paymntResponseMsg = paymntResponseMsg;
    }


    public String getPaymntTransSeqNo() {
        return this.paymntTransSeqNo;
    }

    public void setPaymntTransSeqNo(String paymntTransSeqNo) {
        this.paymntTransSeqNo = paymntTransSeqNo;
    }


    public String getPaymntAuthDt() {
        return this.paymntAuthDt;
    }

    public void setPaymntAuthDt(String paymntAuthDt) {
        this.paymntAuthDt = paymntAuthDt;
    }


    public String getPaymntCancelMk() {
        return this.paymntCancelMk;
    }

    public void setPaymntCancelMk(String paymntCancelMk) {
        this.paymntCancelMk = paymntCancelMk;
    }


    public String getPaymntCancelUsrId() {
        return this.paymntCancelUsrId;
    }

    public void setPaymntCancelUsrId(String paymntCancelUsrId) {
        this.paymntCancelUsrId = paymntCancelUsrId;
    }


    public Date getPaymntCancelDt() {
        return this.paymntCancelDt;
    }

    public void setPaymntCancelDt(Date paymntCancelDt) {
        this.paymntCancelDt = paymntCancelDt;
    }


    public Integer getKycVerNo() {
        return this.kycVerNo;
    }

    public void setKycVerNo(Integer kycVerNo) {
        this.kycVerNo = kycVerNo;
    }


    public String getCmpgnSelMk() {
        return this.cmpgnSelMk;
    }

    public void setCmpgnSelMk(String cmpgnSelMk) {
        this.cmpgnSelMk = cmpgnSelMk;
    }


    public String getSameInsAmtMk() {
        return this.sameInsAmtMk;
    }
    
    public void setSameInsAmtMk(String sameInsAmtMk) {
        this.sameInsAmtMk = sameInsAmtMk;
    }

    public String getPrtPcyMK() {
        return this.prtPcyMK;
    }

    public void setPrtPcyMK(String prtPcyMK) {
        this.prtPcyMK = prtPcyMK;
    }

    public String getPrtRecptMK() {
        return this.prtRecptMK;
    }

    public void setPrtRecptMK(String prtRecptMK) {
        this.prtRecptMK = prtRecptMK;
    }
    
    public String getEmailPcyMK() {
        return this.emailPcyMK;
    }

    public void setEmailPcyMK(String emailPcyMK) {
        this.emailPcyMK = emailPcyMK;
    }

    public String getEmailRecptMK() {
        return this.emailRecptMK;
    }

    public void setEmailRecptMK(String emailRecptMK) {
        this.emailRecptMK = emailRecptMK;
    }
    
    public String getRapidInputMK() {
        return this.rapidInputMK;
    }

    public void setRapidInputMK(String rapidInputMK) {
        this.rapidInputMK = rapidInputMK;
    }

/*
    public List<AppGtlPaTb> getAppGtlPaTbList() {
        return this.appGtlPaTbList;
    }

    public void setAppGtlPaTbList(List<AppGtlPaTb> appGtlPaTbList) {
        this.appGtlPaTbList = appGtlPaTbList;
    }

    public List<AppGtlRiskTb> getAppGtlRiskTbList() {
        return this.appGtlRiskTbList;
    }

    public void setAppGtlRiskTbList(List<AppGtlRiskTb> appGtlRiskTbList) {
        this.appGtlRiskTbList = appGtlRiskTbList;
    }
*/


    public Integer getRiTotPrm() {
        return this.riTotPrm;
    }

    public void setRiTotPrm(Integer riTotPrm) {
        this.riTotPrm = riTotPrm;
    }

}
