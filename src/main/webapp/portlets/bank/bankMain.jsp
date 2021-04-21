<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.EmployeesDB.service.BankLocalServiceUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/portlets/bank/addBank.jsp"/>
</portlet:renderURL>
<a href="<%= addURL %>" >
	Add bank
</a>

<liferay-ui:search-container>
	<liferay-ui:search-container-results
			results="<%= BankLocalServiceUtil.getBanks(searchContainer.getStart(), searchContainer.getEnd()) %>"
	/>

	<liferay-ui:search-container-row
		className="com.EmployeesDB.model.Bank"
		modelVar="abank">

	<liferay-ui:search-container-column-text property="bankName" name="Name">
	</liferay-ui:search-container-column-text>

	<liferay-ui:search-container-column-text property="bik" name="BIK">
	</liferay-ui:search-container-column-text>

	<liferay-ui:search-container-column-text property="adres" name="Address">
	</liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text name="Options">
            <liferay-ui:icon-menu>
                <portlet:renderURL var="editURL">
                    <portlet:param name="jspPage" value="/portlets/bank/editBank.jsp"/>
					<portlet:param name="id" value="<%= String.valueOf( abank.getPrimaryKey() ) %>"/>
                </portlet:renderURL>
                <liferay-ui:icon image="edit" message="edit" url="<%= editURL %>"/>

				<portlet:renderURL var="empl">
					<portlet:param name="jspPage" value="/portlets/bank/emplBank.jsp"/>
					<portlet:param name="id" value="<%= String.valueOf( abank.getPrimaryKey() ) %>"/>
				</portlet:renderURL>
				<liferay-ui:icon image="edit" message="show Employees" url="<%= empl %>"/>

			<portlet:actionURL var="delBank" name="delBank">
				<portlet:param name="id" value="<%= String.valueOf( abank.getPrimaryKey() ) %>"/>
			</portlet:actionURL>
			<liferay-ui:icon-delete url="<%=delBank%>"/>
			</liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>

<portlet:defineObjects />