package com.EmployeesDB.service.persistence;

import com.EmployeesDB.model.Employees;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employees service. This utility wraps {@link EmployeesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeesPersistence
 * @see EmployeesPersistenceImpl
 * @generated
 */
public class EmployeesUtil {
    private static EmployeesPersistence _persistence;

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
    public static void clearCache(Employees employees) {
        getPersistence().clearCache(employees);
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
    public static List<Employees> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Employees> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Employees> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Employees update(Employees employees)
        throws SystemException {
        return getPersistence().update(employees);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Employees update(Employees employees,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employees, serviceContext);
    }

    /**
    * Returns all the employeeses where bank = &#63;.
    *
    * @param bank the bank
    * @return the matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> findByBankId(
        long bank) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bank);
    }

    /**
    * Returns a range of all the employeeses where bank = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.EmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bank the bank
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @return the range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> findByBankId(
        long bank, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bank, start, end);
    }

    /**
    * Returns an ordered range of all the employeeses where bank = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.EmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bank the bank
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> findByBankId(
        long bank, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bank, start, end, orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where bank = &#63;.
    *
    * @param bank the bank
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees
    * @throws com.EmployeesDB.NoSuchEmployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees findByBankId_First(
        long bank,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.EmployeesDB.NoSuchEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId_First(bank, orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where bank = &#63;.
    *
    * @param bank the bank
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees fetchByBankId_First(
        long bank,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByBankId_First(bank, orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where bank = &#63;.
    *
    * @param bank the bank
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees
    * @throws com.EmployeesDB.NoSuchEmployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees findByBankId_Last(long bank,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.EmployeesDB.NoSuchEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId_Last(bank, orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where bank = &#63;.
    *
    * @param bank the bank
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees fetchByBankId_Last(
        long bank,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByBankId_Last(bank, orderByComparator);
    }

    /**
    * Returns the employeeses before and after the current employees in the ordered set where bank = &#63;.
    *
    * @param empId the primary key of the current employees
    * @param bank the bank
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employees
    * @throws com.EmployeesDB.NoSuchEmployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees[] findByBankId_PrevAndNext(
        long empId, long bank,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.EmployeesDB.NoSuchEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankId_PrevAndNext(empId, bank, orderByComparator);
    }

    /**
    * Removes all the employeeses where bank = &#63; from the database.
    *
    * @param bank the bank
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBankId(long bank)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBankId(bank);
    }

    /**
    * Returns the number of employeeses where bank = &#63;.
    *
    * @param bank the bank
    * @return the number of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countByBankId(long bank)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBankId(bank);
    }

    /**
    * Returns all the employeeses where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @return the matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> findByName(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(firstName, secondName, lastName);
    }

    /**
    * Returns a range of all the employeeses where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.EmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @return the range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> findByName(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByName(firstName, secondName, lastName, start, end);
    }

    /**
    * Returns an ordered range of all the employeeses where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.EmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> findByName(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByName(firstName, secondName, lastName, start, end,
            orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees
    * @throws com.EmployeesDB.NoSuchEmployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees findByName_First(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.EmployeesDB.NoSuchEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByName_First(firstName, secondName, lastName,
            orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees fetchByName_First(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByName_First(firstName, secondName, lastName,
            orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees
    * @throws com.EmployeesDB.NoSuchEmployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees findByName_Last(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.EmployeesDB.NoSuchEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByName_Last(firstName, secondName, lastName,
            orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees fetchByName_Last(
        java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByName_Last(firstName, secondName, lastName,
            orderByComparator);
    }

    /**
    * Returns the employeeses before and after the current employees in the ordered set where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * @param empId the primary key of the current employees
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employees
    * @throws com.EmployeesDB.NoSuchEmployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees[] findByName_PrevAndNext(
        long empId, java.lang.String firstName, java.lang.String secondName,
        java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.EmployeesDB.NoSuchEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByName_PrevAndNext(empId, firstName, secondName,
            lastName, orderByComparator);
    }

    /**
    * Removes all the employeeses where firstName = &#63; and secondName = &#63; and lastName = &#63; from the database.
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByName(java.lang.String firstName,
        java.lang.String secondName, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByName(firstName, secondName, lastName);
    }

    /**
    * Returns the number of employeeses where firstName = &#63; and secondName = &#63; and lastName = &#63;.
    *
    * @param firstName the first name
    * @param secondName the second name
    * @param lastName the last name
    * @return the number of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countByName(java.lang.String firstName,
        java.lang.String secondName, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByName(firstName, secondName, lastName);
    }

    /**
    * Caches the employees in the entity cache if it is enabled.
    *
    * @param employees the employees
    */
    public static void cacheResult(com.EmployeesDB.model.Employees employees) {
        getPersistence().cacheResult(employees);
    }

    /**
    * Caches the employeeses in the entity cache if it is enabled.
    *
    * @param employeeses the employeeses
    */
    public static void cacheResult(
        java.util.List<com.EmployeesDB.model.Employees> employeeses) {
        getPersistence().cacheResult(employeeses);
    }

    /**
    * Creates a new employees with the primary key. Does not add the employees to the database.
    *
    * @param empId the primary key for the new employees
    * @return the new employees
    */
    public static com.EmployeesDB.model.Employees create(long empId) {
        return getPersistence().create(empId);
    }

    /**
    * Removes the employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param empId the primary key of the employees
    * @return the employees that was removed
    * @throws com.EmployeesDB.NoSuchEmployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees remove(long empId)
        throws com.EmployeesDB.NoSuchEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(empId);
    }

    public static com.EmployeesDB.model.Employees updateImpl(
        com.EmployeesDB.model.Employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employees);
    }

    /**
    * Returns the employees with the primary key or throws a {@link com.EmployeesDB.NoSuchEmployeesException} if it could not be found.
    *
    * @param empId the primary key of the employees
    * @return the employees
    * @throws com.EmployeesDB.NoSuchEmployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees findByPrimaryKey(long empId)
        throws com.EmployeesDB.NoSuchEmployeesException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(empId);
    }

    /**
    * Returns the employees with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param empId the primary key of the employees
    * @return the employees, or <code>null</code> if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.EmployeesDB.model.Employees fetchByPrimaryKey(long empId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(empId);
    }

    /**
    * Returns all the employeeses.
    *
    * @return the employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.EmployeesDB.model.Employees> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employeeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.EmployeesDB.model.impl.EmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.EmployeesDB.model.Employees> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employeeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employeeses.
    *
    * @return the number of employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EmployeesPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EmployeesPersistence) PortletBeanLocatorUtil.locate(com.EmployeesDB.service.ClpSerializer.getServletContextName(),
                    EmployeesPersistence.class.getName());

            ReferenceRegistry.registerReference(EmployeesUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EmployeesPersistence persistence) {
    }
}
