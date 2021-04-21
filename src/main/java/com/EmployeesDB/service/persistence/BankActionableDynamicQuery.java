package com.EmployeesDB.service.persistence;

import com.EmployeesDB.model.Bank;

import com.EmployeesDB.service.BankLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BankActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BankActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BankLocalServiceUtil.getService());
        setClass(Bank.class);

        setClassLoader(com.EmployeesDB.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bankId");
    }
}
