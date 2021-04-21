package com.EmployeesDB.service.persistence;

import com.EmployeesDB.model.Employees;

import com.EmployeesDB.service.EmployeesLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EmployeesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmployeesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EmployeesLocalServiceUtil.getService());
        setClass(Employees.class);

        setClassLoader(com.EmployeesDB.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("empId");
    }
}
