package com.vti.entity;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String _name, int _age, String _gender, String _address, String _nganhDaoTao) {
        super(_name, _age, _gender, _address);
        this.nganhDaoTao = _nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

}
