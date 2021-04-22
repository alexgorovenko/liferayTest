<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.EmployeesDB.service.EmployeesLocalServiceUtil"%>
<%@ page import="com.EmployeesDB.model.Employees" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.EmployeesDB.service.PositionsLocalServiceUtil" %>
<%@ page import="com.EmployeesDB.service.BankLocalServiceUtil" %>
<%@ page import="com.EmployeesDB.model.Positions" %>
<%@ page import="com.EmployeesDB.model.Bank" %>
<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>


<portlet:defineObjects />

<portlet:renderURL var="addURL">
    <portlet:param name="jspPage" value="/portlets/employe/addEmpl.jsp"/>
</portlet:renderURL>
<a href="<%= addURL %>" >
    Add employer
</a>

<portlet:renderURL var="searchURL">
</portlet:renderURL>
<aui:form name="search" action="<%=searchURL%>">
    <aui:row>
        <aui:col width="25">
            <aui:input name="searchName" label="Employe name"/>
        </aui:col>
        <aui:col width="25">
            <aui:input name="startSearchDate" cssClass="DatePicker" label="Start date" type="text" placeholder="Day, Mon, yyyy"/>
        </aui:col>
        <aui:col width="25">
            <aui:input name="endSearchDate" cssClass="DatePicker" label="End date" type="text" placeholder="Day, Mon, yyyy"/>
        </aui:col>
        <aui:col width="10" cssClass="Margin">
            <aui:button name="searchURL" type="submit" value="Search"  />
        </aui:col>
    </aui:row>
</aui:form>


<liferay-ui:search-container>
    <%
        boolean dateSet = false;
        boolean nameSet = false;
        String[] words = null;
        List<String>tmp = null;
        List<Employees> result = EmployeesLocalServiceUtil.getEmployeeses(0, EmployeesLocalServiceUtil.getEmployeesesCount());
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String name= ParamUtil.getString(request, "searchName");
        Date start = ParamUtil.getDate(request, "startSearchDate", dateFormat, null);
        Date end = ParamUtil.getDate(request, "endSearchDate", dateFormat, null);
        if (!name.isEmpty()) {
            words = name.split(" ");
            tmp = Arrays.asList(words);
            nameSet = true;
        }
        if ( (start != null) && (end != null) ) {
            dateSet = true;
        }
        if ( (nameSet) && (dateSet) ) {
            result = EmployeesLocalServiceUtil.find(tmp, start, end);
        } else if (nameSet) {
            result = EmployeesLocalServiceUtil.findByName(tmp);
        } else if (dateSet) {
            result = EmployeesLocalServiceUtil.findDate(start, end);
        }
    %>
    <liferay-ui:search-container-results
            results="<%= result %>"
    />
    <liferay-ui:search-container-row
            className="com.EmployeesDB.model.Employees"
            modelVar="Employees">
        <%
            Positions empPos = PositionsLocalServiceUtil.fetchPositions(Employees.getEmplPosition());
            Bank empBank = BankLocalServiceUtil.fetchBank(Employees.getBank());
                    String pos;
            String bank;
            String str = Employees.getFirstName() + " " + Employees.getSecondName() + " " + Employees.getLastName();
            if ( (Employees.getEmplPosition() == 0) || (empPos == null) ) {
                pos = "  ";
            } else {
                pos = empPos.getPositionName();
            }
            if ( (Employees.getBank() == 0) || (empBank == null) ) {
                bank = "  ";
            } else {
                bank = empBank.getBankName();
            }
        %>
        <liferay-ui:search-container-column-text value="<%=str%>" name="Name"/>
        <liferay-ui:search-container-column-text property="gender" name="Gender"/>
        <liferay-ui:search-container-column-text value="<%= dateFormat.format(Employees.getBirthday()) %>" name="Birthday"/>
        <liferay-ui:search-container-column-text value="<%=pos%>" name="Position"/>
        <liferay-ui:search-container-column-text value="<%= dateFormat.format(Employees.getStartWork()) %>" name="Start work"/>
        <liferay-ui:search-container-column-text property="salary" name="Salary"/>
        <liferay-ui:search-container-column-text property="workPhoneNumber" name="Work phone"/>
        <liferay-ui:search-container-column-text property="phoneNumber" name="Mobile phone"/>
        <liferay-ui:search-container-column-text value="<%=bank%>" name="Bank"/>
        <liferay-ui:search-container-column-text property="isArchived" name="Archived"/>


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