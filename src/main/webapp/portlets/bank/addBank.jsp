<%@ page import="javax.portlet.PortletURL" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>

<portlet:defineObjects/>
<liferay-theme:defineObjects/>
<%
    PortletURL backURL = renderResponse.createRenderURL();
%>
<liferay-ui:header title="Add bank" backURL="<%= backURL.toString() %>" showBackURL="true"/>

<portlet:actionURL name="addBank" var="addBank"/>
<aui:form name="addBank" action="<%= addBank %>">
    <aui:input name="name" id="name" label="Bank name" required="true" />
    <aui:input name="bik" id="bik" label="BIK" required="true"/>
    <aui:input name="adres" id="adres" label="Bank address" required="true" />

    <aui:button name="addBank" type="submit" value="Add"  />
</aui:form>