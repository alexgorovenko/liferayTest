package com.EmployeesDB.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Positions. This utility wraps
 * {@link com.EmployeesDB.service.impl.PositionsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PositionsLocalService
 * @see com.EmployeesDB.service.base.PositionsLocalServiceBaseImpl
 * @see com.EmployeesDB.service.impl.PositionsLocalServiceImpl
 * @generated
 */
public class PositionsLocalServiceUtil {
    private static PositionsLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.EmployeesDB.service.impl.PositionsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the positions to the database. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Positions addPositions(
        com.EmployeesDB.model.Positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPositions(positions);
    }

    /**
    * Creates a new positions with the primary key. Does not add the positions to the database.
    *
    * @param positionId the primary key for the new positions
    * @return the new positions
    */
    public static com.EmployeesDB.model.Positions createPositions(
        long positionId) {
        return getService().createPositions(positionId);
    }

    /**
    * Deletes the positions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param positionId the primary key of the positions
    * @return the positions that was removed
    * @throws PortalException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Positions deletePositions(
        long positionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePositions(positionId);
    }

    /**
    * Deletes the positions from the database. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Positions deletePositions(
        com.EmployeesDB.model.Positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePositions(positions);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.PositionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.EmployeesDB.model.Positions fetchPositions(
        long positionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPositions(positionId);
    }

    /**
    * Returns the positions with the primary key.
    *
    * @param positionId the primary key of the positions
    * @return the positions
    * @throws PortalException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Positions getPositions(long positionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPositions(positionId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.EmployeesDB.model.Positions> getPositionses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPositionses(start, end);
    }

    /**
    * Returns the number of positionses.
    *
    * @return the number of positionses
    * @throws SystemException if a system exception occurred
    */
    public static int getPositionsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPositionsesCount();
    }

    /**
    * Updates the positions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Positions updatePositions(
        com.EmployeesDB.model.Positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePositions(positions);
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

    public static void clearService() {
        _service = null;
    }

    public static PositionsLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PositionsLocalService.class.getName());

            if (invokableLocalService instanceof PositionsLocalService) {
                _service = (PositionsLocalService) invokableLocalService;
            } else {
                _service = new PositionsLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PositionsLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PositionsLocalService service) {
    }
}
