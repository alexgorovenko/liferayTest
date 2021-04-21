<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.EmployeesDB.service.EmployeesLocalServiceUtil"%>
<%@ page import="com.EmployeesDB.model.Employees" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<form autocomplete="off"/>

<portlet:renderURL var="addURL">
    <portlet:param name="jspPage" value="/portlets/employe/addEmpl.jsp"/>
</portlet:renderURL>
<a href="<%= addURL %>" >
    Add Employe
</a>

<portlet:renderURL var="searchURL">
</portlet:renderURL>
<aui:form name="search" action="<%=searchURL%>">
    <aui:row>
        <aui:col width="25">
            <aui:input name="searchName" id="searchName" label="Employe name"/>
        </aui:col>
        <aui:col width="25">
            <aui:input name="startSearchDate" cssClass="DatePicker" label="Start date" type="text" id="startSearchDate" placeholder="Day, Mon, yyyy"/>
        </aui:col>
        <aui:col width="25">
            <aui:input name="endSearchDate" cssClass="DatePicker" label="End date" type="text" id="endSearchDate" placeholder="Day, Mon, yyyy"/>
        </aui:col>
        <aui:col width="10" cssClass="Margin">
            <aui:button name="searchURL" type="submit" value="Search"  />
        </aui:col>
    </aui:row>
</aui:form>
<style>
    .Margin{margin-top:25px}
</style>
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

<%
    List<Employees> result = EmployeesLocalServiceUtil.getEmployeeses(0, EmployeesLocalServiceUtil.getEmployeesesCount());
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    String name= ParamUtil.getString(request, "searchName");
    Date start = ParamUtil.getDate(request, "startSearchDate", dateFormat);
    Date end = ParamUtil.getDate(request, "endSearchDate", dateFormat);
    if ( (start.toString().isEmpty()) && (!end.toString().isEmpty()) && (!name.isEmpty()) ){
        String[] words = name.split(" ");
        result = EmployeesLocalServiceUtil.find(words[0], words[1], words[2], start, end);
    } else if (!name.isEmpty()) {
        String[] words = name.split(" ");
        result = EmployeesLocalServiceUtil.findByName(words[0], words[1], words[2]);
    } else if ( (start.toString().isEmpty()) && (!end.toString().isEmpty() ) ) {
        result = EmployeesLocalServiceUtil.findDate(start, end);
    }

%>
<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= result %>"
    />

    <liferay-ui:search-container-row
            className="com.EmployeesDB.model.Employees"
            modelVar="Employees">
        <%
            String str = Employees.getFirstName() + " " + Employees.getSecondName() + " " + Employees.getLastName();
        %>
        <liferay-ui:search-container-column-text value="<%=str%>" name="Name">
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text property="isArchived" name="Archived">
        </liferay-ui:search-container-column-text>

        <liferay-ui:search-container-column-text name="Options">
            <liferay-ui:icon-menu>
                <portlet:renderURL var="editURL">
                    <portlet:param name="jspPage" value="/portlets/employe/editEmpl.jsp"/>
                    <portlet:param name="id" value="<%= String.valueOf( Employees.getPrimaryKey() ) %>"/>
                </portlet:renderURL>
                <liferay-ui:icon image="edit" message="edit" url="<%= editURL %>"/>

                <portlet:actionURL var="delEmpl" name="delEmpl">
                    <portlet:param name="id" value="<%= String.valueOf( Employees.getPrimaryKey() ) %>"/>
                </portlet:actionURL>
                <liferay-ui:icon-delete url="<%=delEmpl%>"/>
            </liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

</liferay-ui:search-container>

<portlet:defineObjects />