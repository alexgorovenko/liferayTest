package com.EmployeesDB.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BankSoap implements Serializable {
    private long _bankId;
    private String _bankName;
    private String _bik;
    private String _adres;

    public BankSoap() {
    }

    public static BankSoap toSoapModel(Bank model) {
        BankSoap soapModel = new BankSoap();

        soapModel.setBankId(model.getBankId());
        soapModel.setBankName(model.getBankName());
        soapModel.setBik(model.getBik());
        soapModel.setAdres(model.getAdres());

        return soapModel;
    }

    public static BankSoap[] toSoapModels(Bank[] models) {
        BankSoap[] soapModels = new BankSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BankSoap[][] toSoapModels(Bank[][] models) {
        BankSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BankSoap[models.length][models[0].length];
        } else {
            soapModels = new BankSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BankSoap[] toSoapModels(List<Bank> models) {
        List<BankSoap> soapModels = new ArrayList<BankSoap>(models.size());

        for (Bank model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BankSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bankId;
    }

    public void setPrimaryKey(long pk) {
        setBankId(pk);
    }

    public long getBankId() {
        return _bankId;
    }

    public void setBankId(long bankId) {
        _bankId = bankId;
    }

    public String getBankName() {
        return _bankName;
    }

    public void setBankName(String bankName) {
        _bankName = bankName;
    }

    public String getBik() {
        return _bik;
    }

    public void setBik(String bik) {
        _bik = bik;
    }

    public String getAdres() {
        return _adres;
    }

    public void setAdres(String adres) {
        _adres = adres;
    }
}
