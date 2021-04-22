<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.EmployeesDB.service.PositionsLocalServiceUtil" %>
<%@ page import="com.EmployeesDB.model.Positions" %>
<%@ page import="com.liferay.counter.service.CounterLocalServiceUtil" %>
<%@ page import="com.EmployeesDB.model.Bank" %>
<%@ page import="com.EmployeesDB.service.BankLocalServiceUtil" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>

<portlet:defineObjects/>
<liferay-theme:defineObjects/>

<%
    PortletURL backURL = renderResponse.createRenderURL();
%>

<liferay-ui:header title="Add Employe" backURL="<%= backURL.toString() %>" showBackURL="true"/>

<portlet:actionURL name="addEmpl" var="addEmpl"/>
<aui:form name="addEmpl" action="<%= addEmpl %>">
    <aui:input name="firstName" id="firstName" label="Employe first name" required="true" />
    <aui:input name="secondName" id="secondName" label="Employe second name" required="true" />
    <aui:input name="lastName" id="lastName" label="Employe last name" required="true" />
    <aui:select name="gender">
        <aui:option label="male" value="male" selected="false" required="true" />
        <aui:option label="female" value="female" selected="false" required="true" />
    </aui:select>
    <aui:input name="birthday" cssClass="DatePicker" type="text" id="birthday" placeholder="Day, Mon dd, yyyy" required="true" />
    <aui:select name="emplPosition" required="true" >
        <%
            for(Positions pos : PositionsLocalServiceUtil.getPositionses(0, (int) CounterLocalServiceUtil.increment(Positions.class.getName())) ) {
        %>
        <aui:option label="<%=pos.getPositionName() %>" value="<%=pos.getPositionId() %>" selected="false" />
        <%
            }
        %>
    </aui:select>
    <aui:input name="startWork" cssClass="DatePicker" type="text" id="startWork" placeholder="Day, Mon dd, yyyy" required="true" />
    <aui:input name="salary" id="firstName" label="Employe salary" required="true" >
        <aui:validator name="digits"></aui:validator>
    </aui:input>
    <aui:input name="workPhone" id="workPhone" label="Employe work phone number" required="true" >
        <aui:validator name="digits"></aui:validator>
    </aui:input>
    <aui:input name="phoneNumber" id="phoneNumber" label="Employe phone number"  required="true" >
        <aui:validator name="digits"></aui:validator>
    </aui:input>
    <aui:input name="isArchived" id="isArchived" label="Archived" type="checkbox" />
    <aui:select name="bank">
        <%
            for(Bank bank : BankLocalServiceUtil.getBanks(0, (int) CounterLocalServiceUtil.increment(Bank.class.getName())) ) {
        %>
        <aui:option label="<%=bank.getBankName() %>" value="<%=bank.getBankId() %>" selected="false" />
        <%
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