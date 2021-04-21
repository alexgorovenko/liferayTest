package com.EmployeesDB.service.messaging;

import com.EmployeesDB.service.BankLocalServiceUtil;
import com.EmployeesDB.service.ClpSerializer;
import com.EmployeesDB.service.EmployeesLocalServiceUtil;
import com.EmployeesDB.service.PositionsLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BankLocalServiceUtil.clearService();

            EmployeesLocalServiceUtil.clearService();

            PositionsLocalServiceUtil.clearService();
        }
    }
}
