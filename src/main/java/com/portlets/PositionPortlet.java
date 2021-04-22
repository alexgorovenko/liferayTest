package com.portlets;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import org.omg.CORBA.SystemException;
import com.EmployeesDB.service.PositionsLocalServiceUtil;
import com.EmployeesDB.model.Positions;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class PositionPortlet extends MVCPortlet {

    public void addPosition(ActionRequest request, ActionResponse response) throws SystemException {

        try {
            Positions pos;
            pos = PositionsLocalServiceUtil.createPositions(CounterLocalServiceUtil.increment(Positions.class.getName()));
            pos.setPositionName(request.getParameter("name"));
            pos.setIsArchived(Boolean.parseBoolean( request.getParameter("isArchived")));
            PositionsLocalServiceUtil.updatePositions(pos);

        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }
    }

    public void editPosition(ActionRequest request, ActionResponse response) {
        Positions edit = null;
        try {
            edit = PositionsLocalServiceUtil.getPositions( ParamUtil.getLong(request, "id") );
            edit.setPositionName(request.getParameter("name"));
            edit.setIsArchived(Boolean.parseBoolean( request.getParameter("isArchived")));
            PositionsLocalServiceUtil.updatePositions(edit);
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }
    }

    public void delPosition(ActionRequest request, ActionResponse response) throws SystemException{
        try {
            PositionsLocalServiceUtil.deletePositions(ParamUtil.getLong(request, "id"));
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }
    }
}
