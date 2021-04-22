package com.portlets;

import com.EmployeesDB.model.Employees;
import com.EmployeesDB.service.EmployeesLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import org.omg.CORBA.SystemException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EmployePortlet extends MVCPortlet {
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    public void addEmpl(ActionRequest request, ActionResponse response) throws SystemException {
        try {
            Employees empl;
            empl = EmployeesLocalServiceUtil.createEmployees(CounterLocalServiceUtil.increment(Employees.class.getName()));
            empl.setFirstName(request.getParameter("firstName"));
            empl.setSecondName(request.getParameter("secondName"));
            empl.setLastName(request.getParameter("lastName"));
            empl.setGender(ParamUtil.getString(request, "gender"));
            empl.setBirthday( dateFormat.parse(request.getParameter("birthday")));
            empl.setEmplPosition(ParamUtil.getLong(request, "emplPosition"));
            empl.setStartWork(ParamUtil.getDate(request, "startWork", dateFormat) );
            empl.setSalary(ParamUtil.getLong(request, "salary"));
            empl.setWorkPhoneNumber(request.getParameter("workPhone"));
            empl.setPhoneNumber(request.getParameter("phoneNumber"));
            empl.setBank(ParamUtil.getLong(request, "bank"));
            empl.setIsArchived(Boolean.parseBoolean( request.getParameter("isArchived")));
            EmployeesLocalServiceUtil.updateEmployees(empl);

        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void editEmpl(ActionRequest request, ActionResponse response) {
        Employees edit = null;
        try {
            edit = EmployeesLocalServiceUtil.getEmployees( ParamUtil.getLong(request, "id") );
            edit.setFirstName(request.getParameter("firstName"));
            edit.setSecondName(request.getParameter("secondName"));
            edit.setLastName(request.getParameter("lastName"));
            edit.setGender(ParamUtil.getString(request, "gender"));
            edit.setBirthday( dateFormat.parse(request.getParameter("birthday")));
            edit.setEmplPosition(ParamUtil.getLong(request, "emplPosition"));
            edit.setStartWork(ParamUtil.getDate(request, "startWork", dateFormat) );
            edit.setSalary(ParamUtil.getLong(request, "salary"));
            edit.setWorkPhoneNumber(request.getParameter("workPhone"));
            edit.setPhoneNumber(request.getParameter("phoneNumber"));
            edit.setBank(ParamUtil.getLong(request, "bank"));
            edit.setIsArchived(Boolean.parseBoolean( request.getParameter("isArchived")));
            EmployeesLocalServiceUtil.updateEmployees(edit);
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void delEmpl(ActionRequest request, ActionResponse response) throws SystemException{
        try {
            EmployeesLocalServiceUtil.deleteEmployees(ParamUtil.getLong(request, "id"));
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }
    }
}
