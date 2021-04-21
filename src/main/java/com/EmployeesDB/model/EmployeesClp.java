package com.EmployeesDB.model;

import com.EmployeesDB.service.ClpSerializer;
import com.EmployeesDB.service.EmployeesLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EmployeesClp extends BaseModelImpl<Employees> implements Employees {
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
    private BaseModel<?> _employeesRemoteModel;

    public EmployeesClp() {
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
    public long getPrimaryKey() {
        return _empId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmpId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _empId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getEmpId() {
        return _empId;
    }

    @Override
    public void setEmpId(long empId) {
        _empId = empId;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setEmpId", long.class);

                method.invoke(_employeesRemoteModel, empId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirstName() {
        return _firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        _firstName = firstName;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstName", String.class);

                method.invoke(_employeesRemoteModel, firstName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSecondName() {
        return _secondName;
    }

    @Override
    public void setSecondName(String secondName) {
        _secondName = secondName;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setSecondName", String.class);

                method.invoke(_employeesRemoteModel, secondName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastName() {
        return _lastName;
    }

    @Override
    public void setLastName(String lastName) {
        _lastName = lastName;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setLastName", String.class);

                method.invoke(_employeesRemoteModel, lastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGender() {
        return _gender;
    }

    @Override
    public void setGender(String gender) {
        _gender = gender;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setGender", String.class);

                method.invoke(_employeesRemoteModel, gender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getBirthday() {
        return _birthday;
    }

    @Override
    public void setBirthday(Date birthday) {
        _birthday = birthday;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setBirthday", Date.class);

                method.invoke(_employeesRemoteModel, birthday);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getEmplPosition() {
        return _emplPosition;
    }

    @Override
    public void setEmplPosition(long emplPosition) {
        _emplPosition = emplPosition;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setEmplPosition", long.class);

                method.invoke(_employeesRemoteModel, emplPosition);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getStartWork() {
        return _startWork;
    }

    @Override
    public void setStartWork(Date startWork) {
        _startWork = startWork;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setStartWork", Date.class);

                method.invoke(_employeesRemoteModel, startWork);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(long salary) {
        _salary = salary;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary", long.class);

                method.invoke(_employeesRemoteModel, salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getWorkPhoneNumber() {
        return _workPhoneNumber;
    }

    @Override
    public void setWorkPhoneNumber(String workPhoneNumber) {
        _workPhoneNumber = workPhoneNumber;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setWorkPhoneNumber",
                        String.class);

                method.invoke(_employeesRemoteModel, workPhoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhoneNumber() {
        return _phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setPhoneNumber", String.class);

                method.invoke(_employeesRemoteModel, phoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBank() {
        return _bank;
    }

    @Override
    public void setBank(long bank) {
        _bank = bank;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setBank", long.class);

                method.invoke(_employeesRemoteModel, bank);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getIsArchived() {
        return _isArchived;
    }

    @Override
    public boolean isIsArchived() {
        return _isArchived;
    }

    @Override
    public void setIsArchived(boolean isArchived) {
        _isArchived = isArchived;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setIsArchived", boolean.class);

                method.invoke(_employeesRemoteModel, isArchived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeesRemoteModel() {
        return _employeesRemoteModel;
    }

    public void setEmployeesRemoteModel(BaseModel<?> employeesRemoteModel) {
        _employeesRemoteModel = employeesRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _employeesRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_employeesRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeesLocalServiceUtil.addEmployees(this);
        } else {
            EmployeesLocalServiceUtil.updateEmployees(this);
        }
    }

    @Override
    public Employees toEscapedModel() {
        return (Employees) ProxyUtil.newProxyInstance(Employees.class.getClassLoader(),
            new Class[] { Employees.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeesClp clone = new EmployeesClp();

        clone.setEmpId(getEmpId());
        clone.setFirstName(getFirstName());
        clone.setSecondName(getSecondName());
        clone.setLastName(getLastName());
        clone.setGender(getGender());
        clone.setBirthday(getBirthday());
        clone.setEmplPosition(getEmplPosition());
        clone.setStartWork(getStartWork());
        clone.setSalary(getSalary());
        clone.setWorkPhoneNumber(getWorkPhoneNumber());
        clone.setPhoneNumber(getPhoneNumber());
        clone.setBank(getBank());
        clone.setIsArchived(getIsArchived());

        return clone;
    }

    @Override
    public int compareTo(Employees employees) {
        long primaryKey = employees.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeesClp)) {
            return false;
        }

        EmployeesClp employees = (EmployeesClp) obj;

        long primaryKey = employees.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{empId=");
        sb.append(getEmpId());
        sb.append(", firstName=");
        sb.append(getFirstName());
        sb.append(", secondName=");
        sb.append(getSecondName());
        sb.append(", lastName=");
        sb.append(getLastName());
        sb.append(", gender=");
        sb.append(getGender());
        sb.append(", birthday=");
        sb.append(getBirthday());
        sb.append(", emplPosition=");
        sb.append(getEmplPosition());
        sb.append(", startWork=");
        sb.append(getStartWork());
        sb.append(", salary=");
        sb.append(getSalary());
        sb.append(", workPhoneNumber=");
        sb.append(getWorkPhoneNumber());
        sb.append(", phoneNumber=");
        sb.append(getPhoneNumber());
        sb.append(", bank=");
        sb.append(getBank());
        sb.append(", isArchived=");
        sb.append(getIsArchived());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.EmployeesDB.model.Employees");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>empId</column-name><column-value><![CDATA[");
        sb.append(getEmpId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstName</column-name><column-value><![CDATA[");
        sb.append(getFirstName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>secondName</column-name><column-value><![CDATA[");
        sb.append(getSecondName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastName</column-name><column-value><![CDATA[");
        sb.append(getLastName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gender</column-name><column-value><![CDATA[");
        sb.append(getGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>birthday</column-name><column-value><![CDATA[");
        sb.append(getBirthday());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>emplPosition</column-name><column-value><![CDATA[");
        sb.append(getEmplPosition());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>startWork</column-name><column-value><![CDATA[");
        sb.append(getStartWork());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary</column-name><column-value><![CDATA[");
        sb.append(getSalary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>workPhoneNumber</column-name><column-value><![CDATA[");
        sb.append(getWorkPhoneNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
        sb.append(getPhoneNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bank</column-name><column-value><![CDATA[");
        sb.append(getBank());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isArchived</column-name><column-value><![CDATA[");
        sb.append(getIsArchived());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
