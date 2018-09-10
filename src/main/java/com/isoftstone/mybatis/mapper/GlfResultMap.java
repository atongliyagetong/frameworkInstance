package com.isoftstone.mybatis.mapper;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class GlfResultMap {
    public String _bfh;
    public String _ljh;
    public String _xmh;
    public String _bfhh;
    public String _lrrgh;
    public String _ckbm;
    public String _gcbh;
    public String _jldw;
    public String _gysbm;

    public GlfResultMap(String _bfh, String _ljh, String _xmh, String _bfhh, String _lrrgh, String _ckbm, String _gcbh, String _jldw, String _gysbm) {
        this._bfh = _bfh;
        this._ljh = _ljh;
        this._xmh = _xmh;
        this._bfhh = _bfhh;
        this._lrrgh = _lrrgh;
        this._ckbm = _ckbm;
        this._gcbh = _gcbh;
        this._jldw = _jldw;
        this._gysbm = _gysbm;
    }

    public GlfResultMap() {
    }

    public String get_bfh() {
        return _bfh;
    }

    public void set_bfh(String _bfh) {
        this._bfh = _bfh;
    }

    public String get_bfhh() {
        return _bfhh;
    }

    public void set_bfhh(String _bfhh) {
        this._bfhh = _bfhh;
    }

    public String get_ljh() {
        return _ljh;
    }

    public void set_ljh(String _ljh) {
        this._ljh = _ljh;
    }

    public String get_xmh() {
        return _xmh;
    }

    public void set_xmh(String _xmh) {
        this._xmh = _xmh;
    }

    public String get_lrrgh() {
        return _lrrgh;
    }

    public void set_lrrgh(String _lrrgh) {
        this._lrrgh = _lrrgh;
    }

    public String get_ckbm() {
        return _ckbm;
    }

    public void set_ckbm(String _ckbm) {
        this._ckbm = _ckbm;
    }

    public String get_gcbh() {
        return _gcbh;
    }

    public void set_gcbh(String _gcbh) {
        this._gcbh = _gcbh;
    }

    public String get_gysbm() {
        return _gysbm;
    }

    public void set_gysbm(String _gysbm) {
        this._gysbm = _gysbm;
    }

    @Override
    public String toString() {
        return "GlfResultMap{" +
                "_bfh='" + _bfh + '\'' +
                ", _bfhh='" + _bfhh + '\'' +
                ", _ljh='" + _ljh + '\'' +
                ", _xmh='" + _xmh + '\'' +
                ", _lrrgh='" + _lrrgh + '\'' +
                ", _ckbm='" + _ckbm + '\'' +
                ", _gcbh='" + _gcbh + '\'' +
                ", _gysbm='" + _gysbm + '\'' +
                '}';
    }
}
