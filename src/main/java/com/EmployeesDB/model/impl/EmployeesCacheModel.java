package com.EmployeesDB.model.impl;

import com.EmployeesDB.model.Employees;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employees in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employees
 * @generated
 */
public class EmployeesCacheModel implements CacheModel<Employees>,
    Externalizable {
    public long empId;
    public String firstName;
    public String secondName;
    public String lastName;
    public String gender;
    public long birthday;
    public long emplPosition;
    public long startWork;
    public long salary;
    public String workPhoneNumber;
    public String phoneNumber;
    public long bank;
    public boolean isArchived;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{empId=");
        sb.append(empId);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", secondName=");
        sb.append(secondName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", gender=");
        sb.append(gender);
        sb.append(", birthday=");
        sb.append(birthday);
        sb.append(", emplPosition=");
        sb.append(emplPosition);
        sb.append(", startWork=");
        sb.append(startWork);
        sb.append(", salary=");
        sb.append(salary);
        sb.append(", workPhoneNumber=");
        sb.append(workPhoneNumber);
        sb.append(", phoneNumber=");
        sb.append(phoneNumber);
        sb.append(", bank=");
        sb.append(bank);
        sb.append(", isArchived=");
        sb.append(isArchived);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employees toEntityModel() {
        EmployeesImpl employeesImpl = new EmployeesImpl();

        employeesImpl.setEmpId(empId);

        if (firstName == null) {
            employeesImpl.setFirstName(StringPool.BLANK);
        } else {
            employeesImpl.setFirstName(firstName);
        }

        if (secondName == null) {
            employeesImpl.setSecondName(StringPool.BLANK);
        } else {
            employeesImpl.setSecondName(secondName);
        }

        if (lastName == null) {
            employeesImpl.setLastName(StringPool.BLANK);
        } else {
            employeesImpl.setLastName(lastName);
        }

        if (gender == null) {
            employeesImpl.setGender(StringPool.BLANK);
        } else {
            employeesImpl.setGender(gender);
        }

        if (birthday == Long.MIN_VALUE) {
            employeesImpl.setBirthday(null);
        } else {
            employeesImpl.setBirthday(new Date(birthday));
        }

        employeesImpl.setEmplPosition(emplPosition);

        if (startWork == Long.MIN_VALUE) {
            employeesImpl.setStartWork(null);
        } else {
            employeesImpl.setStartWork(new Date(startWork));
        }

        employeesImpl.setSalary(salary);

        if (workPhoneNumber == null) {
            employeesImpl.setWorkPhoneNumber(StringPool.BLANK);
        } else {
            employeesImpl.setWorkPhoneNumber(workPhoneNumber);
        }

        if (phoneNumber == null) {
            employeesImpl.setPhoneNumber(StringPool.BLANK);
        } else {
            employeesImpl.setPhoneNumber(phoneNumber);
        }

        employeesImpl.setBank(bank);
        employeesImpl.setIsArchived(isArchived);

        employeesImpl.resetOriginalValues();

        return employeesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        empId = objectInput.readLong();
        firstName = objectInput.readUTF();
        secondName = objectInput.readUTF();
        lastName = objectInput.readUTF();
        gender = objectInput.readUTF();
        birthday = objectInput.readLong();
        emplPosition = objectInput.readLong();
        startWork = objectInput.readLong();
        salary = objectInput.readLong();
        workPhoneNumber = objectInput.readUTF();
        phoneNumber = objectInput.readUTF();
        bank = objectInput.readLong();
        isArchived = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(empId);

        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
        }

        if (secondName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(secondName);
        }

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }

        if (gender == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gender);
        }

        objectOutput.writeLong(birthday);
        objectOutput.writeLong(emplPosition);
        objectOutput.writeLong(startWork);
        objectOutput.writeLong(salary);

        if (workPhoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(workPhoneNumber);
        }

        if (phoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phoneNumber);
        }

        objectOutput.writeLong(bank);
        objectOutput.writeBoolean(isArchived);
    }
}
