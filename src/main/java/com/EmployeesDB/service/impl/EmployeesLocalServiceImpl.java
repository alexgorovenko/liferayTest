package com.EmployeesDB.service.impl;

import com.EmployeesDB.service.base.EmployeesLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.*;
import org.omg.CORBA.SystemException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

    private Disjunction disjunction(String prop, List<String> param) {
        Disjunction res = RestrictionsFactoryUtil.disjunction();
        for (String el : param){
            res.add(RestrictionsFactoryUtil.ilike(prop, el));
        }
        return res;
    }

    public List<com.EmployeesDB.model.Employees> findByName(List<String> name) {
        List<com.EmployeesDB.model.Employees> res = new ArrayList<com.EmployeesDB.model.Employees>();
        try {
            DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(com.EmployeesDB.model.Employees.class);

            Disjunction disjunction1 = disjunction("firstName", name);
            Disjunction disjunction2 = disjunction("secondName", name);
            Disjunction disjunction3 = disjunction("lastName", name);
            Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
            disjunction.add(disjunction1);
            disjunction.add(disjunction2);
            disjunction.add(disjunction3);
            dynamicQuery.add(disjunction);
            res = com.EmployeesDB.service.EmployeesLocalServiceUtil.dynamicQuery(dynamicQuery);
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }

        return res;
    }

    public List<com.EmployeesDB.model.Employees> find(List<String> name, Date start, Date end) {
        List<com.EmployeesDB.model.Employees> res = new ArrayList<com.EmployeesDB.model.Employees>();
        try {
            DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(com.EmployeesDB.model.Employees.class);

            Disjunction disjunction1 = disjunction("firstName", name);
            Disjunction disjunction2 = disjunction("secondName", name);
            Disjunction disjunction3 = disjunction("lastName", name);
            Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
            disjunction.add(disjunction1);
            disjunction.add(disjunction2);
            disjunction.add(disjunction3);
            dynamicQuery.add(disjunction);
            dynamicQuery.add(RestrictionsFactoryUtil.between("birthday", start, end));
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
            dynamicQuery.add(RestrictionsFactoryUtil.between("birthday", start, end));
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
