package com.EmployeesDB.service.impl;

import com.EmployeesDB.service.base.EmployeesLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import org.omg.CORBA.SystemException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the Employees local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.EmployeesDB.service.EmployeesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.EmployeesDB.service.base.EmployeesLocalServiceBaseImpl
 * @see com.EmployeesDB.service.EmployeesLocalServiceUtil
 */
public class EmployeesLocalServiceImpl extends EmployeesLocalServiceBaseImpl {
    public List<com.EmployeesDB.model.Employees> findByBankId(long bankId) {
        List<com.EmployeesDB.model.Employees> res = new ArrayList<com.EmployeesDB.model.Employees>();
        try {
            DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(com.EmployeesDB.model.Employees.class);
            Criterion criterion = null;
            criterion = RestrictionsFactoryUtil.eq("bank", bankId);
            dynamicQuery.add(criterion);
            res = com.EmployeesDB.service.EmployeesLocalServiceUtil.dynamicQuery(dynamicQuery);
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }

        return res;
    }

    public List<com.EmployeesDB.model.Employees> findByName(String firstName, String secondName, String lastName) {
        List<com.EmployeesDB.model.Employees> res = new ArrayList<com.EmployeesDB.model.Employees>();
        try {
            DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(com.EmployeesDB.model.Employees.class);
            Criterion criterion = null;
            criterion = RestrictionsFactoryUtil.eq("firstName", firstName);
            criterion = RestrictionsFactoryUtil.eq("secondName", secondName);
            criterion = RestrictionsFactoryUtil.eq("lastName", lastName);
            dynamicQuery.add(criterion);
            res = com.EmployeesDB.service.EmployeesLocalServiceUtil.dynamicQuery(dynamicQuery);
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }

        return res;
    }

    public List<com.EmployeesDB.model.Employees> find(String firstName, String secondName, String lastName, Date start, Date end) {
        List<com.EmployeesDB.model.Employees> res = new ArrayList<com.EmployeesDB.model.Employees>();
        try {
            DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(com.EmployeesDB.model.Employees.class);
            Criterion criterion = null;
            criterion = RestrictionsFactoryUtil.eq("firstName", firstName);
            criterion = RestrictionsFactoryUtil.eq("secondName", secondName);
            criterion = RestrictionsFactoryUtil.eq("lastName", lastName);
            dynamicQuery.add(criterion);
            dynamicQuery.add(RestrictionsFactoryUtil.between("startWork", start, end));
            res = com.EmployeesDB.service.EmployeesLocalServiceUtil.dynamicQuery(dynamicQuery);
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }

        return res;
    }

    public List<com.EmployeesDB.model.Employees> findDate(Date start, Date end) {
        List<com.EmployeesDB.model.Employees> res = new ArrayList<com.EmployeesDB.model.Employees>();
        try {
            DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(com.EmployeesDB.model.Employees.class);
            dynamicQuery.add(RestrictionsFactoryUtil.between("startWork", start, end));
            res = com.EmployeesDB.service.EmployeesLocalServiceUtil.dynamicQuery(dynamicQuery);
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }
        return res;
    }
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.EmployeesDB.service.EmployeesLocalServiceUtil} to access the Employees local service.
     */
}
