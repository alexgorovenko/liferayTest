package com.EmployeesDB.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employees}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employees
 * @generated
 */
public class EmployeesWrapper implements Employees, ModelWrapper<Employees> {
    private Employees _employees;

    public EmployeesWrapper(Employees employees) {
        _employees = employees;
    }

    @Override
    public Class<?> getModelClass() {
        return Employees.class;
    }

    @Override
    public String getModelClassName() {
        return Employees.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("empId", getEmpId());
        attributes.put("firstName", getFirstName());
        attributes.put("secondName", getSecondName());
        attributes.put("lastName", getLastName());
        attributes.put("gender", getGender());
        attributes.put("birthday", getBirthday());
        attributes.put("emplPosition", getEmplPosition());
        attributes.put("startWork", getStartWork());
        attributes.put("salary", getSalary());
        attributes.put("workPhoneNumber", getWorkPhoneNumber());
        attributes.put("phoneNumber", getPhoneNumber());
        attributes.put("bank", getBank());
        attributes.put("isArchived", getIsArchived());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long empId = (Long) attributes.get("empId");

        if (empId != null) {
            setEmpId(empId);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String secondName = (String) attributes.get("secondName");

        if (secondName != null) {
            setSecondName(secondName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String gender = (String) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        Date birthday = (Date) attributes.get("birthday");

        if (birthday != null) {
            setBirthday(birthday);
        }

        Long emplPosition = (Long) attributes.get("emplPosition");

        if (emplPosition != null) {
            setEmplPosition(emplPosition);
        }

        Date startWork = (Date) attributes.get("startWork");

        if (startWork != null) {
            setStartWork(startWork);
        }

        Long salary = (Long) attributes.get("salary");

        if (salary != null) {
            setSalary(salary);
        }

        String workPhoneNumber = (String) attributes.get("workPhoneNumber");

        if (workPhoneNumber != null) {
            setWorkPhoneNumber(workPhoneNumber);
        }

        String phoneNumber = (String) attributes.get("phoneNumber");

        if (phoneNumber != null) {
            setPhoneNumber(phoneNumber);
        }

        Long bank = (Long) attributes.get("bank");

        if (bank != null) {
            setBank(bank);
        }

        Boolean isArchived = (Boolean) attributes.get("isArchived");

        if (isArchived != null) {
            setIsArchived(isArchived);
        }
    }

    /**
    * Returns the primary key of this employees.
    *
    * @return the primary key of this employees
    */
    @Override
    public long getPrimaryKey() {
        return _employees.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employees.
    *
    * @param primaryKey the primary key of this employees
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employees.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the emp ID of this employees.
    *
    * @return the emp ID of this employees
    */
    @Override
    public long getEmpId() {
        return _employees.getEmpId();
    }

    /**
    * Sets the emp ID of this employees.
    *
    * @param empId the emp ID of this employees
    */
    @Override
    public void setEmpId(long empId) {
        _employees.setEmpId(empId);
    }

    /**
    * Returns the first name of this employees.
    *
    * @return the first name of this employees
    */
    @Override
    public java.lang.String getFirstName() {
        return _employees.getFirstName();
    }

    /**
    * Sets the first name of this employees.
    *
    * @param firstName the first name of this employees
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _employees.setFirstName(firstName);
    }

    /**
    * Returns the second name of this employees.
    *
    * @return the second name of this employees
    */
    @Override
    public java.lang.String getSecondName() {
        return _employees.getSecondName();
    }

    /**
    * Sets the second name of this employees.
    *
    * @param secondName the second name of this employees
    */
    @Override
    public void setSecondName(java.lang.String secondName) {
        _employees.setSecondName(secondName);
    }

    /**
    * Returns the last name of this employees.
    *
    * @return the last name of this employees
    */
    @Override
    public java.lang.String getLastName() {
        return _employees.getLastName();
    }

    /**
    * Sets the last name of this employees.
    *
    * @param lastName the last name of this employees
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _employees.setLastName(lastName);
    }

    /**
    * Returns the gender of this employees.
    *
    * @return the gender of this employees
    */
    @Override
    public java.lang.String getGender() {
        return _employees.getGender();
    }

    /**
    * Sets the gender of this employees.
    *
    * @param gender the gender of this employees
    */
    @Override
    public void setGender(java.lang.String gender) {
        _employees.setGender(gender);
    }

    /**
    * Returns the birthday of this employees.
    *
    * @return the birthday of this employees
    */
    @Override
    public java.util.Date getBirthday() {
        return _employees.getBirthday();
    }

    /**
    * Sets the birthday of this employees.
    *
    * @param birthday the birthday of this employees
    */
    @Override
    public void setBirthday(java.util.Date birthday) {
        _employees.setBirthday(birthday);
    }

    /**
    * Returns the empl position of this employees.
    *
    * @return the empl position of this employees
    */
    @Override
    public long getEmplPosition() {
        return _employees.getEmplPosition();
    }

    /**
    * Sets the empl position of this employees.
    *
    * @param emplPosition the empl position of this employees
    */
    @Override
    public void setEmplPosition(long emplPosition) {
        _employees.setEmplPosition(emplPosition);
    }

    /**
    * Returns the start work of this employees.
    *
    * @return the start work of this employees
    */
    @Override
    public java.util.Date getStartWork() {
        return _employees.getStartWork();
    }

    /**
    * Sets the start work of this employees.
    *
    * @param startWork the start work of this employees
    */
    @Override
    public void setStartWork(java.util.Date startWork) {
        _employees.setStartWork(startWork);
    }

    /**
    * Returns the salary of this employees.
    *
    * @return the salary of this employees
    */
    @Override
    public long getSalary() {
        return _employees.getSalary();
    }

    /**
    * Sets the salary of this employees.
    *
    * @param salary the salary of this employees
    */
    @Override
    public void setSalary(long salary) {
        _employees.setSalary(salary);
    }

    /**
    * Returns the work phone number of this employees.
    *
    * @return the work phone number of this employees
    */
    @Override
    public java.lang.String getWorkPhoneNumber() {
        return _employees.getWorkPhoneNumber();
    }

    /**
    * Sets the work phone number of this employees.
    *
    * @param workPhoneNumber the work phone number of this employees
    */
    @Override
    public void setWorkPhoneNumber(java.lang.String workPhoneNumber) {
        _employees.setWorkPhoneNumber(workPhoneNumber);
    }

    /**
    * Returns the phone number of this employees.
    *
    * @return the phone number of this employees
    */
    @Override
    public java.lang.String getPhoneNumber() {
        return _employees.getPhoneNumber();
    }

    /**
    * Sets the phone number of this employees.
    *
    * @param phoneNumber the phone number of this employees
    */
    @Override
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _employees.setPhoneNumber(phoneNumber);
    }

    /**
    * Returns the bank of this employees.
    *
    * @return the bank of this employees
    */
    @Override
    public long getBank() {
        return _employees.getBank();
    }

    /**
    * Sets the bank of this employees.
    *
    * @param bank the bank of this employees
    */
    @Override
    public void setBank(long bank) {
        _employees.setBank(bank);
    }

    /**
    * Returns the is archived of this employees.
    *
    * @return the is archived of this employees
    */
    @Override
    public boolean getIsArchived() {
        return _employees.getIsArchived();
    }

    /**
    * Returns <code>true</code> if this employees is is archived.
    *
    * @return <code>true</code> if this employees is is archived; <code>false</code> otherwise
    */
    @Override
    public boolean isIsArchived() {
        return _employees.isIsArchived();
    }

    /**
    * Sets whether this employees is is archived.
    *
    * @param isArchived the is archived of this employees
    */
    @Override
    public void setIsArchived(boolean isArchived) {
        _employees.setIsArchived(isArchived);
    }

    @Override
    public boolean isNew() {
        return _employees.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employees.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employees.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employees.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employees.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employees.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employees.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employees.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employees.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employees.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employees.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeesWrapper((Employees) _employees.clone());
    }

    @Override
    public int compareTo(Employees employees) {
        return _employees.compareTo(employees);
    }

    @Override
    public int hashCode() {
        return _employees.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Employees> toCacheModel() {
        return _employees.toCacheModel();
    }

    @Override
    public Employees toEscapedModel() {
        return new EmployeesWrapper(_employees.toEscapedModel());
    }

    @Override
    public Employees toUnescapedModel() {
        return new EmployeesWrapper(_employees.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employees.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employees.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employees.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeesWrapper)) {
            return false;
        }

        EmployeesWrapper employeesWrapper = (EmployeesWrapper) obj;

        if (Validator.equals(_employees, employeesWrapper._employees)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employees getWrappedEmployees() {
        return _employees;
    }

    @Override
    public Employees getWrappedModel() {
        return _employees;
    }

    @Override
    public void resetOriginalValues() {
        _employees.resetOriginalValues();
    }
}
