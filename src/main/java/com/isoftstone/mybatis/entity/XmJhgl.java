package com.isoftstone.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class XmJhgl{

    private CgMxqz cgMxqz;

    private List<CgMxqmx> cgMxqmxList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.XMBH
     *
     * @mbggenerated
     */
    private String xmbh;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.JHH
     *
     * @mbggenerated
     */
    private String jhh;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.PCH
     *
     * @mbggenerated
     */
    private String pch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.CJSJ
     *
     * @mbggenerated
     */
    private Date cjsj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.CJR
     *
     * @mbggenerated
     */
    private String cjr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.JHZT
     *
     * @mbggenerated
     */
    private BigDecimal jhzt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.JHMC
     *
     * @mbggenerated
     */
    private String jhmc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.XGR
     *
     * @mbggenerated
     */
    private String xgr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.XGSJ
     *
     * @mbggenerated
     */
    private Date xgsj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.HZDHSJ
     *
     * @mbggenerated
     */
    private Date hzdhsj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.ZZDHSJ
     *
     * @mbggenerated
     */
    private Date zzdhsj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.BYZD3
     *
     * @mbggenerated
     */
    private String byzd3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.YGZT
     *
     * @mbggenerated
     */
    private String ygzt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.ZBZT
     *
     * @mbggenerated
     */
    private String zbzt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XM_JHGL.JD
     *
     * @mbggenerated
     */
    private String jd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XM_JHGL
     *
     * @mbggenerated
     */
    public XmJhgl(String xmbh, String jhh, String pch, Date cjsj, String cjr, BigDecimal jhzt, String jhmc, String xgr, Date xgsj, Date hzdhsj, Date zzdhsj, String byzd3, String ygzt, String zbzt, String jd) {
        this.xmbh = xmbh;
        this.jhh = jhh;
        this.pch = pch;
        this.cjsj = cjsj;
        this.cjr = cjr;
        this.jhzt = jhzt;
        this.jhmc = jhmc;
        this.xgr = xgr;
        this.xgsj = xgsj;
        this.hzdhsj = hzdhsj;
        this.zzdhsj = zzdhsj;
        this.byzd3 = byzd3;
        this.ygzt = ygzt;
        this.zbzt = zbzt;
        this.jd = jd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XM_JHGL
     *
     * @mbggenerated
     */
    public XmJhgl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.PCH
     *
     * @return the value of XM_JHGL.PCH
     *
     * @mbggenerated
     */
    public String getPch() {
        return pch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.PCH
     *
     * @param pch the value for XM_JHGL.PCH
     *
     * @mbggenerated
     */
    public void setPch(String pch) {
        this.pch = pch == null ? null : pch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.CJSJ
     *
     * @return the value of XM_JHGL.CJSJ
     *
     * @mbggenerated
     */
    public Date getCjsj() {
        return cjsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.CJSJ
     *
     * @param cjsj the value for XM_JHGL.CJSJ
     *
     * @mbggenerated
     */
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.CJR
     *
     * @return the value of XM_JHGL.CJR
     *
     * @mbggenerated
     */
    public String getCjr() {
        return cjr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.CJR
     *
     * @param cjr the value for XM_JHGL.CJR
     *
     * @mbggenerated
     */
    public void setCjr(String cjr) {
        this.cjr = cjr == null ? null : cjr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.JHZT
     *
     * @return the value of XM_JHGL.JHZT
     *
     * @mbggenerated
     */
    public BigDecimal getJhzt() {
        return jhzt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.JHZT
     *
     * @param jhzt the value for XM_JHGL.JHZT
     *
     * @mbggenerated
     */
    public void setJhzt(BigDecimal jhzt) {
        this.jhzt = jhzt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.JHMC
     *
     * @return the value of XM_JHGL.JHMC
     *
     * @mbggenerated
     */
    public String getJhmc() {
        return jhmc;
    }

    public CgMxqz getCgMxqz() {
        return cgMxqz;
    }

    public void setCgMxqz(CgMxqz cgMxqz) {
        this.cgMxqz = cgMxqz;
    }

    public List<CgMxqmx> getCgMxqmxList() {
        return cgMxqmxList;
    }

    public void setCgMxqmxList(List<CgMxqmx> cgMxqmxList) {
        this.cgMxqmxList = cgMxqmxList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.JHMC
     *
     * @param jhmc the value for XM_JHGL.JHMC
     *
     * @mbggenerated
     */
    public void setJhmc(String jhmc) {
        this.jhmc = jhmc == null ? null : jhmc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.XGR
     *
     * @return the value of XM_JHGL.XGR
     *
     * @mbggenerated
     */
    public String getXgr() {
        return xgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.XGR
     *
     * @param xgr the value for XM_JHGL.XGR
     *
     * @mbggenerated
     */
    public void setXgr(String xgr) {
        this.xgr = xgr == null ? null : xgr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.XGSJ
     *
     * @return the value of XM_JHGL.XGSJ
     *
     * @mbggenerated
     */
    public Date getXgsj() {
        return xgsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.XGSJ
     *
     * @param xgsj the value for XM_JHGL.XGSJ
     *
     * @mbggenerated
     */
    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.HZDHSJ
     *
     * @return the value of XM_JHGL.HZDHSJ
     *
     * @mbggenerated
     */
    public Date getHzdhsj() {
        return hzdhsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.HZDHSJ
     *
     * @param hzdhsj the value for XM_JHGL.HZDHSJ
     *
     * @mbggenerated
     */
    public void setHzdhsj(Date hzdhsj) {
        this.hzdhsj = hzdhsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.ZZDHSJ
     *
     * @return the value of XM_JHGL.ZZDHSJ
     *
     * @mbggenerated
     */
    public Date getZzdhsj() {
        return zzdhsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.ZZDHSJ
     *
     * @param zzdhsj the value for XM_JHGL.ZZDHSJ
     *
     * @mbggenerated
     */
    public void setZzdhsj(Date zzdhsj) {
        this.zzdhsj = zzdhsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.BYZD3
     *
     * @return the value of XM_JHGL.BYZD3
     *
     * @mbggenerated
     */
    public String getByzd3() {
        return byzd3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.BYZD3
     *
     * @param byzd3 the value for XM_JHGL.BYZD3
     *
     * @mbggenerated
     */
    public void setByzd3(String byzd3) {
        this.byzd3 = byzd3 == null ? null : byzd3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.YGZT
     *
     * @return the value of XM_JHGL.YGZT
     *
     * @mbggenerated
     */
    public String getYgzt() {
        return ygzt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.YGZT
     *
     * @param ygzt the value for XM_JHGL.YGZT
     *
     * @mbggenerated
     */
    public void setYgzt(String ygzt) {
        this.ygzt = ygzt == null ? null : ygzt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.ZBZT
     *
     * @return the value of XM_JHGL.ZBZT
     *
     * @mbggenerated
     */
    public String getZbzt() {
        return zbzt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.ZBZT
     *
     * @param zbzt the value for XM_JHGL.ZBZT
     *
     * @mbggenerated
     */
    public void setZbzt(String zbzt) {
        this.zbzt = zbzt == null ? null : zbzt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XM_JHGL.JD
     *
     * @return the value of XM_JHGL.JD
     *
     * @mbggenerated
     */
    public String getJd() {
        return jd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XM_JHGL.JD
     *
     * @param jd the value for XM_JHGL.JD
     *
     * @mbggenerated
     */
    public void setJd(String jd) {
        this.jd = jd == null ? null : jd.trim();
    }

    public String getXmbh() {
        return xmbh;
    }

    public void setXmbh(String xmbh) {
        this.xmbh = xmbh;
    }

    @Override
    public String toString() {
        return "XmJhgl{" +
                "cgMxqz=" + cgMxqz +
                ", cgMxqmxList=" + cgMxqmxList +
                ", xmbh='" + xmbh + '\'' +
                ", jhh='" + jhh + '\'' +
                ", pch='" + pch + '\'' +
                ", cjsj=" + cjsj +
                ", cjr='" + cjr + '\'' +
                ", jhzt=" + jhzt +
                ", jhmc='" + jhmc + '\'' +
                ", xgr='" + xgr + '\'' +
                ", xgsj=" + xgsj +
                ", hzdhsj=" + hzdhsj +
                ", zzdhsj=" + zzdhsj +
                ", byzd3='" + byzd3 + '\'' +
                ", ygzt='" + ygzt + '\'' +
                ", zbzt='" + zbzt + '\'' +
                ", jd='" + jd + '\'' +
                '}';
    }

    public String getJhh() {
        return jhh;
    }

    public void setJhh(String jhh) {
        this.jhh = jhh;
    }
}