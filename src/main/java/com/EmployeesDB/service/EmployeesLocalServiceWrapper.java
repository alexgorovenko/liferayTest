package com.EmployeesDB.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeesLocalService
 * @generated
 */
public class EmployeesLocalServiceWrapper implements EmployeesLocalService,
    ServiceWrapper<EmployeesLocalService> {
    private EmployeesLocalService _employeesLocalService;

    public EmployeesLocalServiceWrapper(
        EmployeesLocalService employeesLocalService) {
        _employeesLocalService = employeesLocalService;
    }

    /**
    * Adds the employees to the database. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Employees addEmployees(
        com.EmployeesDB.model.Employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.addEmployees(employees);
    }

    /**
    * Creates a new employees with the primary key. Does not add the employees to the database.
    *
    * @param empId the primary key for the new employees
    * @return the new employees
    */
    @Override
    public com.EmployeesDB.model.Employees createEmployees(long empId) {
        return _employeesLocalService.createEmployees(empId);
    }

    /**
    * Deletes the employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param empId the primary key of the employees
    * @return the employees that was removed
    * @throws PortalException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Employees deleteEmployees(long empId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.deleteEmployees(empId);
    }

    /**
    * Deletes the employees from the database. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Employees deleteEmployees(
        com.EmployeesDB.model.Employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.deleteEmployees(employees);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _employeesLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.EmployeesDB.model.Employees fetchEmployees(long empId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.fetchEmployees(empId);
    }

    /**
    * Returns the employees with the primary key.
    *
    * @param empId the primary key of the employees
    * @return the employees
    * @throws PortalException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Employees getEmployees(long empId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getEmployees(empId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.EmployeesDB.model.Employees> getEmployeeses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getEmployeeses(start, end);
    }

    /**
    * Returns the number of employeeses.
    *
    * @return the number of employeeses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEmployeesesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getEmployeesesCount();
    }

    /**
    * Updates the employees in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Employees updateEmployees(
        com.EmployeesDB.model.Employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.updateEmployees(employees);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employeesLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employeesLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employeesLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.EmployeesDB.model.Employees> findByBankId(
        long bankId) {
        return _employeesLocalService.findByBankId(bankId);
    }

    @Override
    public java.util.List<com.EmployeesDB.model.Employees> findByName(
        java.util.List<java.lang.String> name) {
        return _employeesLocalService.findByName(name);
    }

    @Override
    public java.util.List<com.EmployeesDB.model.Employees> find(
        java.util.List<java.lang.String> name, java.util.Date start,
        java.util.Date end) {
        return _employeesLocalService.find(name, start, end);
    }

    @Override
    public java.util.List<com.EmployeesDB.model.Employees> findDate(
        java.util.Date start, java.util.Date end) {
        return _employeesLocalService.findDate(start, end);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EmployeesLocalService getWrappedEmployeesLocalService() {
        return _employeesLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployeesLocalService(
        EmployeesLocalService employeesLocalService) {
        _employeesLocalService = employeesLocalService;
    }

    @Override
    public EmployeesLocalService getWrappedService() {
        return _employeesLocalService;
    }

    @Override
    public void setWrappedService(EmployeesLocalService employeesLocalService) {
        _employeesLocalService = employeesLocalService;
    }
}
