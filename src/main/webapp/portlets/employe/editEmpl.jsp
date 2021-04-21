<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.EmployeesDB.service.EmployeesLocalServiceUtil"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="liferay-theme" uri="http://java.sun.com/portlet" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.EmployeesDB.model.Employees" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.EmployeesDB.model.Bank" %>
<%@ page import="com.EmployeesDB.service.BankLocalServiceUtil" %>
<%@ page import="com.liferay.counter.service.CounterLocalServiceUtil" %>
<%@ page import="com.EmployeesDB.model.Positions" %>
<%@ page import="com.EmployeesDB.service.PositionsLocalServiceUtil" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>

<portlet:defineObjects/>
<liferay-theme:defineObjects/>

<%
    long id=ParamUtil.getLong(request, "id");
    Employees result = EmployeesLocalServiceUtil.fetchEmployees(id);

    PortletURL backURL = renderResponse.createRenderURL();
%>
<liferay-ui:header title="Edit Employe" backURL="<%= backURL.toString() %>" showBackURL="true"/>

<portlet:actionURL name="editEmpl" var="editEmpl">
    <portlet:param name="id" value="<%= String.valueOf(id) %>"/>
</portlet:actionURL>
<aui:form name="editEmpl" action="<%= editEmpl %>">
    <aui:input name="firstName" id="firstName" label="Employe first name" value="<%=result.getFirstName()%>" required="true" />
    <aui:input name="secondName" id="secondName" label="Employe second name" value="<%=result.getSecondName()%>" required="true" />
    <aui:input name="lastName" id="lastName" label="Employe last name" value="<%=result.getLastName()%>" required="true" />
    <aui:select name="gender">
        <aui:option label="male" value="male" selected="false" />
        <aui:option label="female" value="female" selected="false" />
    </aui:select>
    <%
        Date date = result.getBirthday();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String res = df.format(date);

    %>
    <aui:input name="birthday" cssClass="DatePicker" type="text" value="<%=res%>" id="birthday" placeholder="Day, Mon dd, yyyy"/>
    <aui:select name="emplPosition">
        <%
            boolean sel = false;
            for(Positions pos : PositionsLocalServiceUtil.getPositionses(0, (int) CounterLocalServiceUtil.increment(Positions.class.getName())) ) {
                if (pos.getPositionId() == result.getEmplPosition()) sel = true;
        %>
        <aui:option label="<%=pos.getPositionName() %>" value="<%=pos.getPositionId() %>" selected="<%=sel%>" />
        <%
                sel = false;
            }
        %>
    </aui:select>
    <%
        date = result.getBirthday();
        res = df.format(date);
    %>
    <aui:input name="startWork" cssClass="DatePicker" type="text" id="startWork" value="<%=res%>" placeholder="Day, Mon dd, yyyy"/>
    <aui:input name="salary" id="firstName" label="Employe salary" value="<%=result.getSalary()%>" required="true" >
        <aui:validator name="digits"></aui:validator>
    </aui:input>
    <aui:input name="workPhone" id="workPhone" label="Employe work phone number" value="<%=result.getWorkPhoneNumber()%>" required="true" >
        <aui:validator name="digits"></aui:validator>
    </aui:input>
    <aui:input name="phoneNumber" id="phoneNumber" label="Employe phone number" value="<%=result.getPhoneNumber()%>" required="true" >
        <aui:validator name="digits"></aui:validator>
    </aui:input>
    <aui:input name="isArchived" id="isArchived" label="Archived" value="<%=result.getIsArchived()%>" type="checkbox"/>
    <aui:select name="bank">
        <%
            boolean sel = false;
            for(Bank bank : BankLocalServiceUtil.getBanks(0, (int) CounterLocalServiceUtil.increment(Bank.class.getName())) ) {
                if (bank.getBankId() == result.getBank()) sel = true;
        %>
        <aui:option label="<%=bank.getBankName() %>" value="<%=bank.getBankId() %>" selected="<%=sel%>" />
        <%
                sel = false;
            }
        %>
    </aui:select>

    <aui:button name="addEmpl" type="submit" value="Add"  />
</aui:form>

<script>
    AUI().use(
        'aui-datepicker',
        function(Y) {
            var datepicker = new Y.DatePicker(
                {
                    trigger: '.DatePicker',
                    popover: {
                        zIndex: 1
                    },
                    after: {
                        selectionChange: function(event) {
                            event.preventDefault();
                            Y.log(datepicker.getSelectedDates());
                            var myDate=Y.DataType.Date.addDays(new Date(datepicker.getSelectedDates()),+6);
                            if (myDate.isValid()) {
                                $("#selecteddate").val(myDate);
                            }
                        }
                    }
                }
            );
        }
    );

    Date.prototype.isValid = function () {
        return this.getTime() === this.getTime();
    };
</script>