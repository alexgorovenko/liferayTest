<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.EmployeesDB.service.BankLocalServiceUtil"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="liferay-theme" uri="http://java.sun.com/portlet" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.EmployeesDB.model.Bank" %>
<%@ page import="javax.portlet.PortletURL" %>

<portlet:defineObjects/>
<liferay-theme:defineObjects/>

<%
    long id=ParamUtil.getLong(request, "id");
    Bank result = BankLocalServiceUtil.fetchBank(id);

    PortletURL backURL = renderResponse.createRenderURL();
%>
<liferay-ui:header title="Edit bank" backURL="<%= backURL.toString() %>" showBackURL="true"/>

<portlet:actionURL name="editBank" var="editBank">
                   <portlet:param name="id" value="<%= String.valueOf(id) %>"/>
</portlet:actionURL>
<aui:form name="editBank" action="<%= editBank %>">
    <aui:input name="bik" id="bik" label="BIK" required="true" value="<%= result.getBik()  %>"/>
    <aui:input name="adres" id="adres" label="Bank address" required="true"  value="<%= result.getAdres()  %>" />

    <aui:button-row>
        <aui:button name="done" type="submit" value="Done"  />

        <portlet:renderURL var="mainURL">
            <portlet:param name="jspPage" value="/portlets/bank/bankMain.jsp"/>
        </portlet:renderURL>
        <aui:button name="cancel" type="cancel" href="<%= mainURL %>" value="Cancel"/>
    </aui:button-row>
</aui:form>