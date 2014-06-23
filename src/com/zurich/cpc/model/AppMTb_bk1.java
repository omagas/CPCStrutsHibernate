/**
 * 
 */
package com.zurich.cpc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author SUN
 */
@Entity
@Table(name = "APP_M_TB")
public class AppMTb_bk1 implements Serializable {

    private static final long serialVersionUID = 3161915070043548793L;

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "data_id", updatable = false)
    private String dataId;
    
    @Column(name = "data_src_cd")
    private String dataSrcCd;
    
    @Column(name = "prdt_cd")
    private String prdtCd;
    
    @Column(name = "cmpgn_cd")
    private String cmpgnCd;
    
    @Column(name = "pkge_cd")
    private String pkgeCd;
    
    @Column(name = "insured_cust_no")
    private Integer insuredCustNo;
    
    @Column(name = "applicant_cust_no")
    private Integer applicantCustNo;
    
    @Column(name = "payer_cust_no")
    private Integer payerCustNo;
    
    @Column(name = "receiver_cust_no")
    private Integer receiverCustNo;
    
    @Column(name = "chl_cd")
    private String chlCd;
    
    @Column(name = "bus_unit_cd")
    private String busUnitCd;
    
    @Column(name = "agnt_cd")
    private String agntCd;
    
    @Column(name = "agnt_kind_cd")
    private String agntKindCd;
    
    @Column(name = "agnt_id")
    private String agntId;
    
    @Column(name = "agnt_nm")
    private String agntNm;
    
    @Column(name = "agnt_email")
    private String agntEmail;
    
    @Column(name = "agnt_grp_nm")
    private String agntGrpNm;
    
    @Column(name = "intrAgnt_cd")
    private String intrAgntCd;
    
    @Column(name = "intrAgnt_id")
    private String intrAgntId;
    
    @Column(name = "intrAgnt_nm")
    private String intrAgntNm;
    
    @Column(name = "intrAgnt_email")
    private String intrAgntEmail;
    
    @Column(name = "sales_cd")
    private String salesCd;
    
    @Column(name = "sales_id")
    private String salesId;
    
    @Column(name = "sales_nm")
    private String salesNm;
    
    @Column(name = "sales_email")
    private String salesEmail;
    
    @Column(name = "ref_calc_chnl")
    private String refCalcChnl;
    
    @Column(name = "collect_id")
    private String collectId;
    
    @Column(name = "issue_brh_cd")
    private String issueBrhCd;
    
    @Column(name = "dist_chl_cd")
    private String distChlCd;
    
    @Column(name = "tgtMkt_cd")
    private String tgtMktCd;
    
    @Column(name = "sbu")
    private String sbu;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ins_eff_dt")
    private Date insEffDt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ins_exp_dt")
    private Date insExpDt;
    
    @Column(name = "ins_eff_tm")
    private String insEffTm;
    
    @Column(name = "ins_exp_tm")
    private String insExpTm;
    
    @Column(name = "ins_dt_tm")
    private String insDtTm;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "income_Dt", insertable = false, updatable = false)
    private Date incomeDt;
    
    @Column(name = "income_id" )
    private String incomeId;
    
    @Column(name = "host_proj_cd")
    private String hostProjCd;
    
    @Column(name = "host_pkge_cd")
    private String hostPkgeCd;
    
    @Column(name = "total_prm")
    private Integer totalPrm;
    
    @Column(name = "allow_mod_mk")
    private String allowModMk;
    
    @Column(name = "zAuto_contact_mk")
    private String zautoContactMk;
    
    @Column(name = "elecDocu_nm")
    private String elecDocuNm;
    
    @Column(name = "elecDocu_create_mk")
    private String elecDocuCreateMk;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "elecDocu_create_dt")
    private Date elecDocuCreateDt;
    
    @Column(name = "chl_data_no")
    private String chlDataNo;
    
    @Column(name = "chl_data_tranNo")
    private Integer chlDataTranNo;
    
    @Column(name = "chl_userGrp_cd")
    private String chlUserGrpCd;
    
    @Column(name = "contact_win_nm")
    private String contactWinNm;
    
    @Column(name = "contact_win_way")
    private String contactWinWay;
    
    @Column(name = "contact_win_email")
    private String contactWinEmail;
    
    @Column(name = "ori_data_id")
    private String oriDataId;
    
    @Column(name = "quot_mk")
    private String quotMk;
    
    @Column(name = "invite_mk")
    private String inviteMk;

    @Column(name = "autoUW_mk")
    private String autoUwMk;

    @Column(name = "manualUW_mk")
    private String manualUwMk;
    
    @Column(name = "cancel_mk")
    private String cancelMk;

    @Column(name = "paymnt_mk")
    private String paymntMk;

    @Column(name = "issue_mk")
    private String issueMk;

    @Column(name = "issueCA_mk")
    private String issueCaMk;

    @Column(name = "host_paymnt_mthd_cd")
    private String hostPaymntMthdCd;

    @Column(name = "settlement_freq_cd")
    private String settlementFreqCd;

    @Column(name = "own_cost_mk")
    private String ownCostMk;

    @Column(name = "paymnt_encode_acnt")
    private String paymntEncodeAcnt;

    @Column(name = "paymnt_card_expYM")
    private String paymntCardExpYm;

    @Column(name = "paymnt_result_mk")
    private String paymntResultMk;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "paymnt_trans_dt")
    private Date paymntTransDt;

    @Column(name = "paymnt_quest")
    private String paymntQuest;

    @Column(name = "paymnt_ans")
    private String paymntAns;
    
    public AppMTb_bk1(){}

    
    public AppMTb_bk1(String dataId) {
    	this.dataId = dataId;
    }

    /**
     * @return the dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @param dataId the dataId to set
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * @return the dataSrcCd
     */
    public String getDataSrcCd() {
        return this.dataSrcCd;
    }

    /**
     * @param dataSrcCd the dataSrcCd to set
     */
    public void setDataSrcCd(String dataSrcCd) {
        this.dataSrcCd = dataSrcCd;
    }

    /**
     * @return the prdtCd
     */
    public String getPrdtCd() {
        return this.prdtCd;
    }

    /**
     * @param prdtCd the prdtCd to set
     */
    public void setPrdtCd(String prdtCd) {
        this.prdtCd = prdtCd;
    }

    /**
     * @return the cmpgnCd
     */
    public String getCmpgnCd() {
        return this.cmpgnCd;
    }

    /**
     * @param cmpgnCd the cmpgnCd to set
     */
    public void setCmpgnCd(String cmpgnCd) {
        this.cmpgnCd = cmpgnCd;
    }

    /**
     * @return the pkgeCd
     */
    public String getPkgeCd() {
        return this.pkgeCd;
    }

    /**
     * @param pkgeCd the pkgeCd to set
     */
    public void setPkgeCd(String pkgeCd) {
        this.pkgeCd = pkgeCd;
    }

    /**
     * @return the insuredCustNo
     */
    public Integer getInsuredCustNo() {
        return this.insuredCustNo;
    }

    /**
     * @param insuredCustNo the insuredCustNo to set
     */
    public void setInsuredCustNo(Integer insuredCustNo) {
        this.insuredCustNo = insuredCustNo;
    }

    /**
     * @return the applicantCustNo
     */
    public Integer getApplicantCustNo() {
        return this.applicantCustNo;
    }

    /**
     * @param applicantCustNo the applicantCustNo to set
     */
    public void setApplicantCustNo(Integer applicantCustNo) {
        this.applicantCustNo = applicantCustNo;
    }

    /**
     * @return the payerCustNo
     */
    public Integer getPayerCustNo() {
        return this.payerCustNo;
    }

    /**
     * @param payerCustNo the payerCustNo to set
     */
    public void setPayerCustNo(Integer payerCustNo) {
        this.payerCustNo = payerCustNo;
    }

    /**
     * @return the receiverCustNo
     */
    public Integer getReceiverCustNo() {
        return this.receiverCustNo;
    }

    /**
     * @param receiverCustNo the receiverCustNo to set
     */
    public void setReceiverCustNo(Integer receiverCustNo) {
        this.receiverCustNo = receiverCustNo;
    }

    /**
     * @return the chlCd
     */
    public String getChlCd() {
        return this.chlCd;
    }

    /**
     * @param chlCd the chlCd to set
     */
    public void setChlCd(String chlCd) {
        this.chlCd = chlCd;
    }

    /**
     * @return the busUnitCd
     */
    public String getBusUnitCd() {
        return this.busUnitCd;
    }

    /**
     * @param busUnitCd the busUnitCd to set
     */
    public void setBusUnitCd(String busUnitCd) {
        this.busUnitCd = busUnitCd;
    }

    /**
     * @return the agntCd
     */
    public String getAgntCd() {
        return this.agntCd;
    }

    /**
     * @param agntCd the agntCd to set
     */
    public void setAgntCd(String agntCd) {
        this.agntCd = agntCd;
    }

    /**
     * @return the agntKindCd
     */
    public String getAgntKindCd() {
        return this.agntKindCd;
    }

    /**
     * @param agntKindCd the agntKindCd to set
     */
    public void setAgntKindCd(String agntKindCd) {
        this.agntKindCd = agntKindCd;
    }

    /**
     * @return the agntId
     */
    public String getAgntId() {
        return this.agntId;
    }

    /**
     * @param agntId the agntId to set
     */
    public void setAgntId(String agntId) {
        this.agntId = agntId;
    }

    /**
     * @return the agntNm
     */
    public String getAgntNm() {
        return this.agntNm;
    }

    /**
     * @param agntNm the agntNm to set
     */
    public void setAgntNm(String agntNm) {
        this.agntNm = agntNm;
    }

    /**
     * @return the agntEmail
     */
    public String getAgntEmail() {
        return this.agntEmail;
    }

    /**
     * @param agntEmail the agntEmail to set
     */
    public void setAgntEmail(String agntEmail) {
        this.agntEmail = agntEmail;
    }

    /**
     * @return the agntGrpNm
     */
    public String getAgntGrpNm() {
        return this.agntGrpNm;
    }

    /**
     * @param agntGrpNm the agntGrpNm to set
     */
    public void setAgntGrpNm(String agntGrpNm) {
        this.agntGrpNm = agntGrpNm;
    }

    /**
     * @return the intrAgntCd
     */
    public String getIntrAgntCd() {
        return this.intrAgntCd;
    }

    /**
     * @param intrAgntCd the intrAgntCd to set
     */
    public void setIntrAgntCd(String intrAgntCd) {
        this.intrAgntCd = intrAgntCd;
    }

    /**
     * @return the intrAgntId
     */
    public String getIntrAgntId() {
        return this.intrAgntId;
    }

    /**
     * @param intrAgntId the intrAgntId to set
     */
    public void setIntrAgntId(String intrAgntId) {
        this.intrAgntId = intrAgntId;
    }

    /**
     * @return the intrAgntNm
     */
    public String getIntrAgntNm() {
        return this.intrAgntNm;
    }

    /**
     * @param intrAgntNm the intrAgntNm to set
     */
    public void setIntrAgntNm(String intrAgntNm) {
        this.intrAgntNm = intrAgntNm;
    }

    /**
     * @return the intrAgntEmail
     */
    public String getIntrAgntEmail() {
        return this.intrAgntEmail;
    }

    /**
     * @param intrAgntEmail the intrAgntEmail to set
     */
    public void setIntrAgntEmail(String intrAgntEmail) {
        this.intrAgntEmail = intrAgntEmail;
    }

    /**
     * @return the salesCd
     */
    public String getSalesCd() {
        return this.salesCd;
    }

    /**
     * @param salesCd the salesCd to set
     */
    public void setSalesCd(String salesCd) {
        this.salesCd = salesCd;
    }

    /**
     * @return the salesId
     */
    public String getSalesId() {
        return this.salesId;
    }

    /**
     * @param salesId the salesId to set
     */
    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    /**
     * @return the salesNm
     */
    public String getSalesNm() {
        return this.salesNm;
    }

    /**
     * @param salesNm the salesNm to set
     */
    public void setSalesNm(String salesNm) {
        this.salesNm = salesNm;
    }

    /**
     * @return the salesEmail
     */
    public String getSalesEmail() {
        return this.salesEmail;
    }

    /**
     * @param salesEmail the salesEmail to set
     */
    public void setSalesEmail(String salesEmail) {
        this.salesEmail = salesEmail;
    }

    /**
     * @return the refCalcChnl
     */
    public String getRefCalcChnl() {
        return this.refCalcChnl;
    }

    /**
     * @param refCalcChnl the refCalcChnl to set
     */
    public void setRefCalcChnl(String refCalcChnl) {
        this.refCalcChnl = refCalcChnl;
    }

    /**
     * @return the collectId
     */
    public String getCollectId() {
        return this.collectId;
    }

    /**
     * @param collectId the collectId to set
     */
    public void setCollectId(String collectId) {
        this.collectId = collectId;
    }

    /**
     * @return the issueBrhCd
     */
    public String getIssueBrhCd() {
        return this.issueBrhCd;
    }

    /**
     * @param issueBrhCd the issueBrhCd to set
     */
    public void setIssueBrhCd(String issueBrhCd) {
        this.issueBrhCd = issueBrhCd;
    }

    /**
     * @return the distChlCd
     */
    public String getDistChlCd() {
        return this.distChlCd;
    }

    /**
     * @param distChlCd the distChlCd to set
     */
    public void setDistChlCd(String distChlCd) {
        this.distChlCd = distChlCd;
    }

    /**
     * @return the tgtMktCd
     */
    public String getTgtMktCd() {
        return this.tgtMktCd;
    }

    /**
     * @param tgtMktCd the tgtMktCd to set
     */
    public void setTgtMktCd(String tgtMktCd) {
        this.tgtMktCd = tgtMktCd;
    }

    /**
     * @return the sbu
     */
    public String getSbu() {
        return this.sbu;
    }

    /**
     * @param sbu the sbu to set
     */
    public void setSbu(String sbu) {
        this.sbu = sbu;
    }

    /**
     * @return the insEffDt
     */
    public Date getInsEffDt() {
        return this.insEffDt;
    }

    /**
     * @param insEffDt the insEffDt to set
     */
    public void setInsEffDt(Date insEffDt) {
        this.insEffDt = insEffDt;
    }

    /**
     * @return the insExpDt
     */
    public Date getInsExpDt() {
        return this.insExpDt;
    }

    /**
     * @param insExpDt the insExpDt to set
     */
    public void setInsExpDt(Date insExpDt) {
        this.insExpDt = insExpDt;
    }

    /**
     * @return the insEffTm
     */
    public String getInsEffTm() {
        return this.insEffTm;
    }

    /**
     * @param insEffTm the insEffTm to set
     */
    public void setInsEffTm(String insEffTm) {
        this.insEffTm = insEffTm;
    }

    /**
     * @return the insExpTm
     */
    public String getInsExpTm() {
        return this.insExpTm;
    }

    /**
     * @param insExpTm the insExpTm to set
     */
    public void setInsExpTm(String insExpTm) {
        this.insExpTm = insExpTm;
    }

    /**
     * @return the insDtTm
     */
    public String getInsDtTm() {
        return this.insDtTm;
    }

    /**
     * @param insDtTm the insDtTm to set
     */
    public void setInsDtTm(String insDtTm) {
        this.insDtTm = insDtTm;
    }

    /**
     * @return the incomeDt
     */
    public Date getIncomeDt() {
        return this.incomeDt;
    }

    /**
     * @param incomeDt the incomeDt to set
     */
    public void setIncomeDt(Date incomeDt) {
        this.incomeDt = incomeDt;
    }

    /**
     * @return the incomeId
     */
    public String getIncomeId() {
        return this.incomeId;
    }

    /**
     * @param incomeId the incomeId to set
     */
    public void setIncomeId(String incomeId) {
        this.incomeId = incomeId;
    }

    /**
     * @return the hostProjCd
     */
    public String getHostProjCd() {
        return this.hostProjCd;
    }

    /**
     * @param hostProjCd the hostProjCd to set
     */
    public void setHostProjCd(String hostProjCd) {
        this.hostProjCd = hostProjCd;
    }

    /**
     * @return the hostPkgeCd
     */
    public String getHostPkgeCd() {
        return this.hostPkgeCd;
    }

    /**
     * @param hostPkgeCd the hostPkgeCd to set
     */
    public void setHostPkgeCd(String hostPkgeCd) {
        this.hostPkgeCd = hostPkgeCd;
    }

    /**
     * @return the totalPrm
     */
    public Integer getTotalPrm() {
        return this.totalPrm;
    }

    /**
     * @param totalPrm the totalPrm to set
     */
    public void setTotalPrm(Integer totalPrm) {
        this.totalPrm = totalPrm;
    }

    /**
     * @return the allowModMk
     */
    public String getAllowModMk() {
        return this.allowModMk;
    }

    /**
     * @param allowModMk the allowModMk to set
     */
    public void setAllowModMk(String allowModMk) {
        this.allowModMk = allowModMk;
    }

    /**
     * @return the zautoContactMk
     */
    public String getZautoContactMk() {
        return this.zautoContactMk;
    }

    /**
     * @param zautoContactMk the zautoContactMk to set
     */
    public void setZautoContactMk(String zautoContactMk) {
        this.zautoContactMk = zautoContactMk;
    }

    /**
     * @return the elecDocuNm
     */
    public String getElecDocuNm() {
        return this.elecDocuNm;
    }

    /**
     * @param elecDocuNm the elecDocuNm to set
     */
    public void setElecDocuNm(String elecDocuNm) {
        this.elecDocuNm = elecDocuNm;
    }

    /**
     * @return the elecDocuCreateMk
     */
    public String getElecDocuCreateMk() {
        return this.elecDocuCreateMk;
    }

    /**
     * @param elecDocuCreateMk the elecDocuCreateMk to set
     */
    public void setElecDocuCreateMk(String elecDocuCreateMk) {
        this.elecDocuCreateMk = elecDocuCreateMk;
    }

    /**
     * @return the elecDocuCreateDt
     */
    public Date getElecDocuCreateDt() {
        return this.elecDocuCreateDt;
    }

    /**
     * @param elecDocuCreateDt the elecDocuCreateDt to set
     */
    public void setElecDocuCreateDt(Date elecDocuCreateDt) {
        this.elecDocuCreateDt = elecDocuCreateDt;
    }

    /**
     * @return the chlDataNo
     */
    public String getChlDataNo() {
        return this.chlDataNo;
    }

    /**
     * @param chlDataNo the chlDataNo to set
     */
    public void setChlDataNo(String chlDataNo) {
        this.chlDataNo = chlDataNo;
    }

    /**
     * @return the chlDataTranNo
     */
    public Integer getChlDataTranNo() {
        return this.chlDataTranNo;
    }

    /**
     * @param chlDataTranNo the chlDataTranNo to set
     */
    public void setChlDataTranNo(Integer chlDataTranNo) {
        this.chlDataTranNo = chlDataTranNo;
    }

    /**
     * @return the chlUserGrpCd
     */
    public String getChlUserGrpCd() {
        return this.chlUserGrpCd;
    }

    /**
     * @param chlUserGrpCd the chlUserGrpCd to set
     */
    public void setChlUserGrpCd(String chlUserGrpCd) {
        this.chlUserGrpCd = chlUserGrpCd;
    }

    /**
     * @return the contactWinNm
     */
    public String getContactWinNm() {
        return this.contactWinNm;
    }

    /**
     * @param contactWinNm the contactWinNm to set
     */
    public void setContactWinNm(String contactWinNm) {
        this.contactWinNm = contactWinNm;
    }

    /**
     * @return the contactWinWay
     */
    public String getContactWinWay() {
        return this.contactWinWay;
    }

    /**
     * @param contactWinWay the contactWinWay to set
     */
    public void setContactWinWay(String contactWinWay) {
        this.contactWinWay = contactWinWay;
    }

    /**
     * @return the contactWinEmail
     */
    public String getContactWinEmail() {
        return this.contactWinEmail;
    }

    /**
     * @param contactWinEmail the contactWinEmail to set
     */
    public void setContactWinEmail(String contactWinEmail) {
        this.contactWinEmail = contactWinEmail;
    }

    /**
     * @return the oriDataId
     */
    public String getOriDataId() {
        return this.oriDataId;
    }

    /**
     * @param oriDataId the oriDataId to set
     */
    public void setOriDataId(String oriDataId) {
        this.oriDataId = oriDataId;
    }

    /**
     * @return the quotMk
     */
    public String getQuotMk() {
        return this.quotMk;
    }

    /**
     * @param quotMk the quotMk to set
     */
    public void setQuotMk(String quotMk) {
        this.quotMk = quotMk;
    }

    /**
     * @return the inviteMk
     */
    public String getInviteMk() {
        return this.inviteMk;
    }

    /**
     * @param inviteMk the inviteMk to set
     */
    public void setInviteMk(String inviteMk) {
        this.inviteMk = inviteMk;
    }

    /**
     * @return the autoUwMk
     */
    public String getAutoUwMk() {
        return this.autoUwMk;
    }

    /**
     * @param autoUwMk the autoUwMk to set
     */
    public void setAutoUwMk(String autoUwMk) {
        this.autoUwMk = autoUwMk;
    }

    /**
     * @return the manualUwMk
     */
    public String getManualUwMk() {
        return this.manualUwMk;
    }

    /**
     * @param manualUwMk the manualUwMk to set
     */
    public void setManualUwMk(String manualUwMk) {
        this.manualUwMk = manualUwMk;
    }

    /**
     * @return the cancelMk
     */
    public String getCancelMk() {
        return this.cancelMk;
    }

    /**
     * @param cancelMk the cancelMk to set
     */
    public void setCancelMk(String cancelMk) {
        this.cancelMk = cancelMk;
    }

    /**
     * @return the paymntMk
     */
    public String getPaymntMk() {
        return this.paymntMk;
    }

    /**
     * @param paymntMk the paymntMk to set
     */
    public void setPaymntMk(String paymntMk) {
        this.paymntMk = paymntMk;
    }

    /**
     * @return the issueMk
     */
    public String getIssueMk() {
        return this.issueMk;
    }

    /**
     * @param issueMk the issueMk to set
     */
    public void setIssueMk(String issueMk) {
        this.issueMk = issueMk;
    }

    /**
     * @return the issueCaMk
     */
    public String getIssueCaMk() {
        return this.issueCaMk;
    }

    /**
     * @param issueCaMk the issueCaMk to set
     */
    public void setIssueCaMk(String issueCaMk) {
        this.issueCaMk = issueCaMk;
    }

    /**
     * @return the hostPaymntMthdCd
     */
    public String getHostPaymntMthdCd() {
        return this.hostPaymntMthdCd;
    }

    /**
     * @param hostPaymntMthdCd the hostPaymntMthdCd to set
     */
    public void setHostPaymntMthdCd(String hostPaymntMthdCd) {
        this.hostPaymntMthdCd = hostPaymntMthdCd;
    }

    /**
     * @return the settlementFreqCd
     */
    public String getSettlementFreqCd() {
        return this.settlementFreqCd;
    }

    /**
     * @param settlementFreqCd the settlementFreqCd to set
     */
    public void setSettlementFreqCd(String settlementFreqCd) {
        this.settlementFreqCd = settlementFreqCd;
    }

    /**
     * @return the ownCostMk
     */
    public String getOwnCostMk() {
        return this.ownCostMk;
    }

    /**
     * @param ownCostMk the ownCostMk to set
     */
    public void setOwnCostMk(String ownCostMk) {
        this.ownCostMk = ownCostMk;
    }

    /**
     * @return the paymntEncodeAcnt
     */
    public String getPaymntEncodeAcnt() {
        return this.paymntEncodeAcnt;
    }

    /**
     * @param paymntEncodeAcnt the paymntEncodeAcnt to set
     */
    public void setPaymntEncodeAcnt(String paymntEncodeAcnt) {
        this.paymntEncodeAcnt = paymntEncodeAcnt;
    }

    /**
     * @return the paymntCardExpYm
     */
    public String getPaymntCardExpYm() {
        return this.paymntCardExpYm;
    }

    /**
     * @param paymntCardExpYm the paymntCardExpYm to set
     */
    public void setPaymntCardExpYm(String paymntCardExpYm) {
        this.paymntCardExpYm = paymntCardExpYm;
    }

    /**
     * @return the paymntResultMk
     */
    public String getPaymntResultMk() {
        return this.paymntResultMk;
    }

    /**
     * @param paymntResultMk the paymntResultMk to set
     */
    public void setPaymntResultMk(String paymntResultMk) {
        this.paymntResultMk = paymntResultMk;
    }

    /**
     * @return the paymntTransDt
     */
    public Date getPaymntTransDt() {
        return this.paymntTransDt;
    }

    /**
     * @param paymntTransDt the paymntTransDt to set
     */
    public void setPaymntTransDt(Date paymntTransDt) {
        this.paymntTransDt = paymntTransDt;
    }

    /**
     * @return the paymntQuest
     */
    public String getPaymntQuest() {
        return this.paymntQuest;
    }

    /**
     * @param paymntQuest the paymntQuest to set
     */
    public void setPaymntQuest(String paymntQuest) {
        this.paymntQuest = paymntQuest;
    }

    /**
     * @return the paymntAns
     */
    public String getPaymntAns() {
        return this.paymntAns;
    }

    /**
     * @param paymntAns the paymntAns to set
     */
    public void setPaymntAns(String paymntAns) {
        this.paymntAns = paymntAns;
    }

}
