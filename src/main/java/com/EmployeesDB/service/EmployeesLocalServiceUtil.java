package com.EmployeesDB.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Employees. This utility wraps
 * {@link com.EmployeesDB.service.impl.EmployeesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeesLocalService
 * @see com.EmployeesDB.service.base.EmployeesLocalServiceBaseImpl
 * @see com.EmployeesDB.service.impl.EmployeesLocalServiceImpl
 * @generated
 */
public class EmployeesLocalServiceUtil {
    private static EmployeesLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.EmployeesDB.service.impl.EmployeesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the employees to the database. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees addEmployees(
        com.EmployeesDB.model.Employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEmployees(employees);
    }

    /**
    * Creates a new employees with the primary key. Does not add the employees to the database.
    *
    * @param empId the primary key for the new employees
    * @return the new employees
    */
    public static com.EmployeesDB.model.Employees createEmployees(long empId) {
        return getService().createEmployees(empId);
    }

    /**
    * Deletes the employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param empId the primary key of the employees
    * @return the employees that was removed
    * @throws PortalException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees deleteEmployees(long empId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEmployees(empId);
    }

    /**
    * Deletes the employees from the database. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees deleteEmployees(
        com.EmployeesDB.model.Employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEmployees(employees);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.EmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.EmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.EmployeesDB.model.Employees fetchEmployees(long empId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEmployees(empId);
    }

    /**
    * Returns the employees with the primary key.
    *
    * @param empId the primary key of the employees
    * @return the employees
    * @throws PortalException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees getEmployees(long empId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmployees(empId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the employeeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.EmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @return the range of employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> getEmployeeses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmployeeses(start, end);
    }

    /**
    * Returns the number of employeeses.
    *
    * @return the number of employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int getEmployeesesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmployeesesCount();
    }

    /**
    * Updates the employees in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees updateEmployees(
        com.EmployeesDB.model.Employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEmployees(employees);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<com.EmployeesDB.model.Employees> findByBankId(
        long bankId) {
        return getService().findByBankId(bankId);
    }

    public static java.util.List<com.EmployeesDB.model.Employees> findByName(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName) {
        return getService().findByName(firstName, secondName, lastName);
    }

    public static java.util.List<com.EmployeesDB.model.Employees> find(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName, java.util.Date start, java.util.Date end) {
        return getService().find(firstName, secondName, lastName, start, end);
    }

    public static java.util.List<com.EmployeesDB.model.Employees> findDate(
        java.util.Date start, java.util.Date end) {
        return getService().findDate(start, end);
    }

    public static void clearService() {
        _service = null;
    }

    public static EmployeesLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EmployeesLocalService.class.getName());

            if (invokableLocalService instanceof EmployeesLocalService) {
                _service = (EmployeesLocalService) invokableLocalService;
            } else {
                _service = new EmployeesLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EmployeesLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EmployeesLocalService service) {
    }
}
