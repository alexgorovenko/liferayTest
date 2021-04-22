<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.EmployeesDB.service.PositionsLocalServiceUtil"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>

<portlet:renderURL var="addURL">
    <portlet:param name="jspPage" value="/portlets/position/addPosition.jsp"/>
</portlet:renderURL>
<a href="<%= addURL %>" >
    Add position
</a>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= PositionsLocalServiceUtil.getPositionses(searchContainer.getStart(), searchContainer.getEnd()) %>"
    />

    <liferay-ui:search-container-row
            className="com.EmployeesDB.model.Positions"
            modelVar="position">

        <liferay-ui:search-container-column-text property="positionName" name="Name">
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text property="isArchived" name="Arhcived">
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text name="Options">
            <liferay-ui:icon-menu>
                <portlet:renderURL var="editURL">
                    <portlet:param name="jspPage" value="/portlets/position/editPosition.jsp"/>
                    <portlet:param name="id" value="<%= String.valueOf( position.getPrimaryKey() ) %>"/>
                </portlet:renderURL>
                <liferay-ui:icon image="edit" message="edit" url="<%= editURL %>"/>

                <portlet:actionURL var="delPosition" name="delPosition">
                    <portlet:param name="id" value="<%= String.valueOf( position.getPrimaryKey() ) %>"/>
                </portlet:actionURL>
                <liferay-ui:icon-delete url="<%=delPosition%>"/>
            </liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

</liferay-ui:search-container>

<portlet:defineObjects />