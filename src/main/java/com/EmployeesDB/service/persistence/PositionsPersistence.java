package com.EmployeesDB.service.persistence;

import com.EmployeesDB.model.Positions;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the positions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionsPersistenceImpl
 * @see PositionsUtil
 * @generated
 */
public interface PositionsPersistence extends BasePersistence<Positions> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PositionsUtil} to access the positions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the positions in the entity cache if it is enabled.
    *
    * @param positions the positions
    */
    public void cacheResult(com.EmployeesDB.model.Positions positions);

    /**
    * Caches the positionses in the entity cache if it is enabled.
    *
    * @param positionses the positionses
    */
    public void cacheResult(
        java.util.List<com.EmployeesDB.model.Positions> positionses);

    /**
    * Creates a new positions with the primary key. Does not add the positions to the database.
    *
    * @param positionId the primary key for the new positions
    * @return the new positions
    */
    public com.EmployeesDB.model.Positions create(long positionId);

    /**
    * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param positionId the primary key of the positions
    * @return the positions that was removed
    * @throws com.EmployeesDB.NoSuchPositionsException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.EmployeesDB.model.Positions remove(long positionId)
        throws com.EmployeesDB.NoSuchPositionsException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.EmployeesDB.model.Positions updateImpl(
        com.EmployeesDB.model.Positions positions)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the positions with the primary key or throws a {@link com.EmployeesDB.NoSuchPositionsException} if it could not be found.
    *
    * @param positionId the primary key of the positions
    * @return the positions
    * @throws com.EmployeesDB.NoSuchPositionsException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.EmployeesDB.model.Positions findByPrimaryKey(long positionId)
        throws com.EmployeesDB.NoSuchPositionsException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param positionId the primary key of the positions
    * @return the positions, or <code>null</code> if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.EmployeesDB.model.Positions fetchByPrimaryKey(long positionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the positionses.
    *
    * @return the positionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.EmployeesDB.model.Positions> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.EmployeesDB.model.Positions> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.EmployeesDB.model.Positions> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the positionses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of positionses.
    *
    * @return the number of positionses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
