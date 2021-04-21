package com.EmployeesDB.service.persistence;

import com.EmployeesDB.model.Positions;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the positions service. This utility wraps {@link PositionsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionsPersistence
 * @see PositionsPersistenceImpl
 * @generated
 */
public class PositionsUtil {
    private static PositionsPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Positions positions) {
        getPersistence().clearCache(positions);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Positions> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Positions> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Positions> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Positions update(Positions positions)
        throws SystemException {
        return getPersistence().update(positions);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Positions update(Positions positions,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(positions, serviceContext);
    }

    /**
    * Caches the positions in the entity cache if it is enabled.
    *
    * @param positions the positions
    */
    public static void cacheResult(com.EmployeesDB.model.Positions positions) {
        getPersistence().cacheResult(positions);
    }

    /**
    * Caches the positionses in the entity cache if it is enabled.
    *
    * @param positionses the positionses
    */
    public static void cacheResult(
        java.util.List<com.EmployeesDB.model.Positions> positionses) {
        getPersistence().cacheResult(positionses);
    }

    /**
    * Creates a new positions with the primary key. Does not add the positions to the database.
    *
    * @param positionId the primary key for the new positions
    * @return the new positions
    */
    public static com.EmployeesDB.model.Positions create(long positionId) {
        return getPersistence().create(positionId);
    }

    /**
    * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param positionId the primary key of the positions
    * @return the positions that was removed
    * @throws com.EmployeesDB.NoSuchPositionsException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Positions remove(long positionId)
        throws com.EmployeesDB.NoSuchPositionsException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(positionId);
    }

    public static com.EmployeesDB.model.Positions updateImpl(
        com.EmployeesDB.model.Positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(positions);
    }

    /**
    * Returns the positions with the primary key or throws a {@link com.EmployeesDB.NoSuchPositionsException} if it could not be found.
    *
    * @param positionId the primary key of the positions
    * @return the positions
    * @throws com.EmployeesDB.NoSuchPositionsException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Positions findByPrimaryKey(
        long positionId)
        throws com.EmployeesDB.NoSuchPositionsException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(positionId);
    }

    /**
    * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param positionId the primary key of the positions
    * @return the positions, or <code>null</code> if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Positions fetchByPrimaryKey(
        long positionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(positionId);
    }

    /**
    * Returns all the positionses.
    *
    * @return the positionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Positions> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.EmployeesDB.model.Positions> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the positionses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.PositionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of positionses
    * @param end the upper bound of the range of positionses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of positionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Positions> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the positionses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of positionses.
    *
    * @return the number of positionses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PositionsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PositionsPersistence) PortletBeanLocatorUtil.locate(com.EmployeesDB.service.ClpSerializer.getServletContextName(),
                    PositionsPersistence.class.getName());

            ReferenceRegistry.registerReference(PositionsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PositionsPersistence persistence) {
    }
}
