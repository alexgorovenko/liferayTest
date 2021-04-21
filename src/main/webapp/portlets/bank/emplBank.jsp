<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.EmployeesDB.service.EmployeesLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="com.EmployeesDB.model.Employees" %>
<%@ page import="javax.portlet.PortletURL" %>

<portlet:defineObjects/>
<liferay-theme:defineObjects/>

<%
    PortletURL backURL = renderResponse.createRenderURL();
%>
<liferay-ui:header title="Employees" backURL="<%= backURL.toString() %>" showBackURL="true"/>
<%
    long id=ParamUtil.getLong(request, "id");
    List<Employees> result = EmployeesLocalServiceUtil.findByBankId(id);
%>

<liferay-ui:search-container>
    <portlet:property value="emplBank" name="emplBank"/>
    <liferay-ui:search-container-results
            results="<%= result %>"
    />

    <liferay-ui:search-container-row
            className="com.EmployeesDB.model.Employees"
            modelVar="empl">

        <%
            String str = empl.getFirstName() + " " + empl.getSecondName() + " " + empl.getLastName();
        %>
        <liferay-ui:search-container-column-text value="<%=str%>" name="Name">
        </liferay-ui:search-container-column-text>

    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<portlet:defineObjects />