package com.EmployeesDB.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeesSoap implements Serializable {
    private long _empId;
    private String _firstName;
    private String _secondName;
    private String _lastName;
    private String _gender;
    private Date _birthday;
    private long _emplPosition;
    private Date _startWork;
    private long _salary;
    private String _workPhoneNumber;
    private String _phoneNumber;
    private long _bank;
    private boolean _isArchived;

    public EmployeesSoap() {
    }

    public static EmployeesSoap toSoapModel(Employees model) {
        EmployeesSoap soapModel = new EmployeesSoap();

        soapModel.setEmpId(model.getEmpId());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setSecondName(model.getSecondName());
        soapModel.setLastName(model.getLastName());
        soapModel.setGender(model.getGender());
        soapModel.setBirthday(model.getBirthday());
        soapModel.setEmplPosition(model.getEmplPosition());
        soapModel.setStartWork(model.getStartWork());
        soapModel.setSalary(model.getSalary());
        soapModel.setWorkPhoneNumber(model.getWorkPhoneNumber());
        soapModel.setPhoneNumber(model.getPhoneNumber());
        soapModel.setBank(model.getBank());
        soapModel.setIsArchived(model.getIsArchived());

        return soapModel;
    }

    public static EmployeesSoap[] toSoapModels(Employees[] models) {
        EmployeesSoap[] soapModels = new EmployeesSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeesSoap[][] toSoapModels(Employees[][] models) {
        EmployeesSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeesSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeesSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeesSoap[] toSoapModels(List<Employees> models) {
        List<EmployeesSoap> soapModels = new ArrayList<EmployeesSoap>(models.size());

        for (Employees model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeesSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _empId;
    }

    public void setPrimaryKey(long pk) {
        setEmpId(pk);
    }

    public long getEmpId() {
        return _empId;
    }

    public void setEmpId(long empId) {
        _empId = empId;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getSecondName() {
        return _secondName;
    }

    public void setSecondName(String secondName) {
        _secondName = secondName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getGender() {
        return _gender;
    }

    public void setGender(String gender) {
        _gender = gender;
    }

    public Date getBirthday() {
        return _birthday;
    }

    public void setBirthday(Date birthday) {
        _birthday = birthday;
    }

    public long getEmplPosition() {
        return _emplPosition;
    }

    public void setEmplPosition(long emplPosition) {
        _emplPosition = emplPosition;
    }

    public Date getStartWork() {
        return _startWork;
    }

    public void setStartWork(Date startWork) {
        _startWork = startWork;
    }

    public long getSalary() {
        return _salary;
    }

    public void setSalary(long salary) {
        _salary = salary;
    }

    public String getWorkPhoneNumber() {
        return _workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        _workPhoneNumber = workPhoneNumber;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public long getBank() {
        return _bank;
    }

    public void setBank(long bank) {
        _bank = bank;
    }

    public boolean getIsArchived() {
        return _isArchived;
    }

    public boolean isIsArchived() {
        return _isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        _isArchived = isArchived;
    }
}
