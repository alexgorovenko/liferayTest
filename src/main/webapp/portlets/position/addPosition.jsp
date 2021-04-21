<%@ page import="javax.portlet.PortletURL" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>

<portlet:defineObjects/>
<liferay-theme:defineObjects/>

<%
    PortletURL backURL = renderResponse.createRenderURL();
%>
<liferay-ui:header title="Add position" backURL="<%= backURL.toString() %>" showBackURL="true"/>

<portlet:actionURL name="addPosition" var="addPosition"/>
<aui:form name="addBank" action="<%= addPosition %>">
    <aui:input name="name" id="name" label="Position name" required="true" />
    <aui:input name="isArchived" id="isArchived" label="Archived" type="checkbox"/>

    <aui:button name="addPosition" type="submit" value="Add"  />
</aui:form>