package com.EmployeesDB.service.persistence;

import com.EmployeesDB.model.Positions;

import com.EmployeesDB.service.PositionsLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PositionsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PositionsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PositionsLocalServiceUtil.getService());
        setClass(Positions.class);

        setClassLoader(com.EmployeesDB.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("positionId");
    }
}
