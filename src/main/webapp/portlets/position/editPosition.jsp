<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.EmployeesDB.service.PositionsLocalServiceUtil"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="liferay-theme" uri="http://java.sun.com/portlet" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.EmployeesDB.model.Positions" %>
<%@ page import="javax.portlet.PortletURL" %>

<portlet:defineObjects/>
<liferay-theme:defineObjects/>

<%
    long id=ParamUtil.getLong(request, "id");
    Positions result = PositionsLocalServiceUtil.fetchPositions(id);

    PortletURL backURL = renderResponse.createRenderURL();
%>
<liferay-ui:header title="Edit position" backURL="<%= backURL.toString() %>" showBackURL="true"/>

<portlet:actionURL name="editPosition" var="editPosition">
    <portlet:param name="id" value="<%= String.valueOf(id) %>"/>
</portlet:actionURL>
<aui:form name="editPosition" action="<%= editPosition %>">
    <aui:input name="name" id="name" label="Position name" required="true" value="<%= result.getPositionName()  %>"/>
    <aui:input name="isArchived" id="isArchived" label="Archived" type="checkbox" value="<%= result.getIsArchived()  %>" />

    <aui:button-row>
        <aui:button name="done" type="submit" value="Done"  />

        <portlet:renderURL var="mainURL">
            <portlet:param name="jspPage" value="/portlets/position/posMain.jsp"/>
        </portlet:renderURL>
        <aui:button name="cancel" type="cancel" href="<%= mainURL %>" value="Cancel"/>
    </aui:button-row>
</aui:form>