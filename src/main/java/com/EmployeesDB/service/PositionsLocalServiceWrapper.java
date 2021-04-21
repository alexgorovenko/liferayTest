package com.EmployeesDB.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PositionsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PositionsLocalService
 * @generated
 */
public class PositionsLocalServiceWrapper implements PositionsLocalService,
    ServiceWrapper<PositionsLocalService> {
    private PositionsLocalService _positionsLocalService;

    public PositionsLocalServiceWrapper(
        PositionsLocalService positionsLocalService) {
        _positionsLocalService = positionsLocalService;
    }

    /**
    * Adds the positions to the database. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Positions addPositions(
        com.EmployeesDB.model.Positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.addPositions(positions);
    }

    /**
    * Creates a new positions with the primary key. Does not add the positions to the database.
    *
    * @param positionId the primary key for the new positions
    * @return the new positions
    */
    @Override
    public com.EmployeesDB.model.Positions createPositions(long positionId) {
        return _positionsLocalService.createPositions(positionId);
    }

    /**
    * Deletes the positions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param positionId the primary key of the positions
    * @return the positions that was removed
    * @throws PortalException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Positions deletePositions(long positionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.deletePositions(positionId);
    }

    /**
    * Deletes the positions from the database. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Positions deletePositions(
        com.EmployeesDB.model.Positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.deletePositions(positions);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _positionsLocalService.dynamicQuery();
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
        return _positionsLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.PositionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _positionsLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.PositionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _positionsLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _positionsLocalService.dynamicQueryCount(dynamicQuery);
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
        return _positionsLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.EmployeesDB.model.Positions fetchPositions(long positionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.fetchPositions(positionId);
    }

    /**
    * Returns the positions with the primary key.
    *
    * @param positionId the primary key of the positions
    * @return the positions
    * @throws PortalException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Positions getPositions(long positionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getPositions(positionId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the positionses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.PositionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of positionses
    * @param end the upper bound of the range of positionses (not inclusive)
    * @return the range of positionses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.EmployeesDB.model.Positions> getPositionses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getPositionses(start, end);
    }

    /**
    * Returns the number of positionses.
    *
    * @return the number of positionses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPositionsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getPositionsesCount();
    }

    /**
    * Updates the positions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.EmployeesDB.model.Positions updatePositions(
        com.EmployeesDB.model.Positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.updatePositions(positions);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _positionsLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _positionsLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _positionsLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PositionsLocalService getWrappedPositionsLocalService() {
        return _positionsLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPositionsLocalService(
        PositionsLocalService positionsLocalService) {
        _positionsLocalService = positionsLocalService;
    }

    @Override
    public PositionsLocalService getWrappedService() {
        return _positionsLocalService;
    }

    @Override
    public void setWrappedService(PositionsLocalService positionsLocalService) {
        _positionsLocalService = positionsLocalService;
    }
}
