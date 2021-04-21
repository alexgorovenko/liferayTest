package com.EmployeesDB.model.impl;

import com.EmployeesDB.model.Employees;
import com.EmployeesDB.model.EmployeesModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Employees service. Represents a row in the &quot;testtask_Employees&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.EmployeesDB.model.EmployeesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeesImpl
 * @see com.EmployeesDB.model.Employees
 * @see com.EmployeesDB.model.EmployeesModel
 * @generated
 */
public class EmployeesModelImpl extends BaseModelImpl<Employees>
    implements EmployeesModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a employees model instance should use the {@link com.EmployeesDB.model.Employees} interface instead.
     */
    public static final String TABLE_NAME = "testtask_Employees";
    public static final Object[][] TABLE_COLUMNS = {
            { "empId", Types.BIGINT },
            { "firstName", Types.VARCHAR },
            { "secondName", Types.VARCHAR },
            { "lastName", Types.VARCHAR },
            { "gender", Types.VARCHAR },
            { "birthday", Types.TIMESTAMP },
            { "emplPosition", Types.BIGINT },
            { "startWork", Types.TIMESTAMP },
            { "salary", Types.BIGINT },
            { "workPhoneNumber", Types.VARCHAR },
            { "phoneNumber", Types.VARCHAR },
            { "bank", Types.BIGINT },
            { "isArchived", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table testtask_Employees (empId LONG not null primary key,firstName VARCHAR(75) null,secondName VARCHAR(75) null,lastName VARCHAR(75) null,gender VARCHAR(75) null,birthday DATE null,emplPosition LONG,startWork DATE null,salary LONG,workPhoneNumber VARCHAR(75) null,phoneNumber VARCHAR(75) null,bank LONG,isArchived BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table testtask_Employees";
    public static final String ORDER_BY_JPQL = " ORDER BY employees.empId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY testtask_Employees.empId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.EmployeesDB.model.Employees"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.EmployeesDB.model.Employees"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.EmployeesDB.model.Employees"),
            true);
    public static long BANK_COLUMN_BITMASK = 1L;
    public static long FIRSTNAME_COLUMN_BITMASK = 2L;
    public static long LASTNAME_COLUMN_BITMASK = 4L;
    public static long SECONDNAME_COLUMN_BITMASK = 8L;
    public static long EMPID_COLUMN_BITMASK = 16L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.EmployeesDB.model.Employees"));
    private static ClassLoader _classLoader = Employees.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Employees.class
        };
    private long _empId;
    private String _firstName;
    private String _originalFirstName;
    private String _secondName;
    private String _originalSecondName;
    private String _lastName;
    private String _originalLastName;
    private String _gender;
    private Date _birthday;
    private long _emplPosition;
    private Date _startWork;
    private long _salary;
    private String _workPhoneNumber;
    private String _phoneNumber;
    private long _bank;
    private long _originalBank;
    private boolean _setOriginalBank;
    private boolean _isArchived;
    private long _columnBitmask;
    private Employees _escapedModel;

    public EmployeesModelImpl() {
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

    @Override
    public long getEmpId() {
        return _empId;
    }

    @Override
    public void setEmpId(long empId) {
        _empId = empId;
    }

    @Override
    public String getFirstName() {
        if (_firstName == null) {
            return StringPool.BLANK;
        } else {
            return _firstName;
        }
    }

    @Override
    public void setFirstName(String firstName) {
        _columnBitmask |= FIRSTNAME_COLUMN_BITMASK;

        if (_originalFirstName == null) {
            _originalFirstName = _firstName;
        }

        _firstName = firstName;
    }

    public String getOriginalFirstName() {
        return GetterUtil.getString(_originalFirstName);
    }

    @Override
    public String getSecondName() {
        if (_secondName == null) {
            return StringPool.BLANK;
        } else {
            return _secondName;
        }
    }

    @Override
    public void setSecondName(String secondName) {
        _columnBitmask |= SECONDNAME_COLUMN_BITMASK;

        if (_originalSecondName == null) {
            _originalSecondName = _secondName;
        }

        _secondName = secondName;
    }

    public String getOriginalSecondName() {
        return GetterUtil.getString(_originalSecondName);
    }

    @Override
    public String getLastName() {
        if (_lastName == null) {
            return StringPool.BLANK;
        } else {
            return _lastName;
        }
    }

    @Override
    public void setLastName(String lastName) {
        _columnBitmask |= LASTNAME_COLUMN_BITMASK;

        if (_originalLastName == null) {
            _originalLastName = _lastName;
        }

        _lastName = lastName;
    }

    public String getOriginalLastName() {
        return GetterUtil.getString(_originalLastName);
    }

    @Override
    public String getGender() {
        if (_gender == null) {
            return StringPool.BLANK;
        } else {
            return _gender;
        }
    }

    @Override
    public void setGender(String gender) {
        _gender = gender;
    }

    @Override
    public Date getBirthday() {
        return _birthday;
    }

    @Override
    public void setBirthday(Date birthday) {
        _birthday = birthday;
    }

    @Override
    public long getEmplPosition() {
        return _emplPosition;
    }

    @Override
    public void setEmplPosition(long emplPosition) {
        _emplPosition = emplPosition;
    }

    @Override
    public Date getStartWork() {
        return _startWork;
    }

    @Override
    public void setStartWork(Date startWork) {
        _startWork = startWork;
    }

    @Override
    public long getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(long salary) {
        _salary = salary;
    }

    @Override
    public String getWorkPhoneNumber() {
        if (_workPhoneNumber == null) {
            return StringPool.BLANK;
        } else {
            return _workPhoneNumber;
        }
    }

    @Override
    public void setWorkPhoneNumber(String workPhoneNumber) {
        _workPhoneNumber = workPhoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        if (_phoneNumber == null) {
            return StringPool.BLANK;
        } else {
            return _phoneNumber;
        }
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    @Override
    public long getBank() {
        return _bank;
    }

    @Override
    public void setBank(long bank) {
        _columnBitmask |= BANK_COLUMN_BITMASK;

        if (!_setOriginalBank) {
            _setOriginalBank = true;

            _originalBank = _bank;
        }

        _bank = bank;
    }

    public long getOriginalBank() {
        return _originalBank;
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
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Employees.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Employees toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Employees) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EmployeesImpl employeesImpl = new EmployeesImpl();

        employeesImpl.setEmpId(getEmpId());
        employeesImpl.setFirstName(getFirstName());
        employeesImpl.setSecondName(getSecondName());
        employeesImpl.setLastName(getLastName());
        employeesImpl.setGender(getGender());
        employeesImpl.setBirthday(getBirthday());
        employeesImpl.setEmplPosition(getEmplPosition());
        employeesImpl.setStartWork(getStartWork());
        employeesImpl.setSalary(getSalary());
        employeesImpl.setWorkPhoneNumber(getWorkPhoneNumber());
        employeesImpl.setPhoneNumber(getPhoneNumber());
        employeesImpl.setBank(getBank());
        employeesImpl.setIsArchived(getIsArchived());

        employeesImpl.resetOriginalValues();

        return employeesImpl;
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

        if (!(obj instanceof Employees)) {
            return false;
        }

        Employees employees = (Employees) obj;

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
    public void resetOriginalValues() {
        EmployeesModelImpl employeesModelImpl = this;

        employeesModelImpl._originalFirstName = employeesModelImpl._firstName;

        employeesModelImpl._originalSecondName = employeesModelImpl._secondName;

        employeesModelImpl._originalLastName = employeesModelImpl._lastName;

        employeesModelImpl._originalBank = employeesModelImpl._bank;

        employeesModelImpl._setOriginalBank = false;

        employeesModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Employees> toCacheModel() {
        EmployeesCacheModel employeesCacheModel = new EmployeesCacheModel();

        employeesCacheModel.empId = getEmpId();

        employeesCacheModel.firstName = getFirstName();

        String firstName = employeesCacheModel.firstName;

        if ((firstName != null) && (firstName.length() == 0)) {
            employeesCacheModel.firstName = null;
        }

        employeesCacheModel.secondName = getSecondName();

        String secondName = employeesCacheModel.secondName;

        if ((secondName != null) && (secondName.length() == 0)) {
            employeesCacheModel.secondName = null;
        }

        employeesCacheModel.lastName = getLastName();

        String lastName = employeesCacheModel.lastName;

        if ((lastName != null) && (lastName.length() == 0)) {
            employeesCacheModel.lastName = null;
        }

        employeesCacheModel.gender = getGender();

        String gender = employeesCacheModel.gender;

        if ((gender != null) && (gender.length() == 0)) {
            employeesCacheModel.gender = null;
        }

        Date birthday = getBirthday();

        if (birthday != null) {
            employeesCacheModel.birthday = birthday.getTime();
        } else {
            employeesCacheModel.birthday = Long.MIN_VALUE;
        }

        employeesCacheModel.emplPosition = getEmplPosition();

        Date startWork = getStartWork();

        if (startWork != null) {
            employeesCacheModel.startWork = startWork.getTime();
        } else {
            employeesCacheModel.startWork = Long.MIN_VALUE;
        }

        employeesCacheModel.salary = getSalary();

        employeesCacheModel.workPhoneNumber = getWorkPhoneNumber();

        String workPhoneNumber = employeesCacheModel.workPhoneNumber;

        if ((workPhoneNumber != null) && (workPhoneNumber.length() == 0)) {
            employeesCacheModel.workPhoneNumber = null;
        }

        employeesCacheModel.phoneNumber = getPhoneNumber();

        String phoneNumber = employeesCacheModel.phoneNumber;

        if ((phoneNumber != null) && (phoneNumber.length() == 0)) {
            employeesCacheModel.phoneNumber = null;
        }

        employeesCacheModel.bank = getBank();

        employeesCacheModel.isArchived = getIsArchived();

        return employeesCacheModel;
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