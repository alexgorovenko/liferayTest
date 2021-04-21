package com.EmployeesDB.service.persistence;

import com.EmployeesDB.NoSuchEmployeesException;

import com.EmployeesDB.model.Employees;
import com.EmployeesDB.model.impl.EmployeesImpl;
import com.EmployeesDB.model.impl.EmployeesModelImpl;

import com.EmployeesDB.service.persistence.EmployeesPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employees service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeesPersistence
 * @see EmployeesUtil
 * @generated
 */
public class EmployeesPersistenceImpl extends BasePersistenceImpl<Employees>
    implements EmployeesPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EmployeesUtil} to access the employees persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EmployeesImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, EmployeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, EmployeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID = new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, EmployeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBankId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID =
        new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, EmployeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBankId",
            new String[] { Long.class.getName() },
            EmployeesModelImpl.BANK_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKID = new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBankId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_BANKID_BANK_2 = "employees.bank = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, EmployeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, EmployeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName()
            },
            EmployeesModelImpl.FIRSTNAME_COLUMN_BITMASK |
            EmployeesModelImpl.SECONDNAME_COLUMN_BITMASK |
            EmployeesModelImpl.LASTNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName()
            });
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_1 = "employees.firstName IS NULL AND ";
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_2 = "employees.firstName = ? AND ";
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_3 = "(employees.firstName IS NULL OR employees.firstName = '') AND ";
    private static final String _FINDER_COLUMN_NAME_SECONDNAME_1 = "employees.secondName IS NULL AND ";
    private static final String _FINDER_COLUMN_NAME_SECONDNAME_2 = "employees.secondName = ? AND ";
    private static final String _FINDER_COLUMN_NAME_SECONDNAME_3 = "(employees.secondName IS NULL OR employees.secondName = '') AND ";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_1 = "employees.lastName IS NULL";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_2 = "employees.lastName = ?";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_3 = "(employees.lastName IS NULL OR employees.lastName = '')";
    private static final String _SQL_SELECT_EMPLOYEES = "SELECT employees FROM Employees employees";
    private static final String _SQL_SELECT_EMPLOYEES_WHERE = "SELECT employees FROM Employees employees WHERE ";
    private static final String _SQL_COUNT_EMPLOYEES = "SELECT COUNT(employees) FROM Employees employees";
    private static final String _SQL_COUNT_EMPLOYEES_WHERE = "SELECT COUNT(employees) FROM Employees employees WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "employees.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employees exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Employees exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EmployeesPersistenceImpl.class);
    private static Employees _nullEmployees = new EmployeesImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Employees> toCacheModel() {
                return _nullEmployeesCacheModel;
            }
        };

    private static CacheModel<Employees> _nullEmployeesCacheModel = new CacheModel<Employees>() {
            @Override
            public Employees toEntityModel() {
                return _nullEmployees;
            }
        };

    public EmployeesPersistenceImpl() {
        setModelClass(Employees.class);
    }

    /**
     * Returns all the employeeses where bank = &#63;.
     *
     * @param bank the bank
     * @return the matching employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employees> findByBankId(long bank) throws SystemException {
        return findByBankId(bank, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Employees> findByBankId(long bank, int start, int end)
        throws SystemException {
        return findByBankId(bank, start, end, null);
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
    @Override
    public List<Employees> findByBankId(long bank, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] { bank };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] { bank, start, end, orderByComparator };
        }

        List<Employees> list = (List<Employees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employees employees : list) {
                if ((bank != employees.getBank())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEES_WHERE);

            query.append(_FINDER_COLUMN_BANKID_BANK_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(bank);

                if (!pagination) {
                    list = (List<Employees>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employees>(list);
                } else {
                    list = (List<Employees>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Employees findByBankId_First(long bank,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeesException, SystemException {
        Employees employees = fetchByBankId_First(bank, orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bank=");
        msg.append(bank);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeesException(msg.toString());
    }

    /**
     * Returns the first employees in the ordered set where bank = &#63;.
     *
     * @param bank the bank
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employees, or <code>null</code> if a matching employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employees fetchByBankId_First(long bank,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employees> list = findByBankId(bank, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employees findByBankId_Last(long bank,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeesException, SystemException {
        Employees employees = fetchByBankId_Last(bank, orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bank=");
        msg.append(bank);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeesException(msg.toString());
    }

    /**
     * Returns the last employees in the ordered set where bank = &#63;.
     *
     * @param bank the bank
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employees, or <code>null</code> if a matching employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employees fetchByBankId_Last(long bank,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByBankId(bank);

        if (count == 0) {
            return null;
        }

        List<Employees> list = findByBankId(bank, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employees[] findByBankId_PrevAndNext(long empId, long bank,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeesException, SystemException {
        Employees employees = findByPrimaryKey(empId);

        Session session = null;

        try {
            session = openSession();

            Employees[] array = new EmployeesImpl[3];

            array[0] = getByBankId_PrevAndNext(session, employees, bank,
                    orderByComparator, true);

            array[1] = employees;

            array[2] = getByBankId_PrevAndNext(session, employees, bank,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employees getByBankId_PrevAndNext(Session session,
        Employees employees, long bank, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEES_WHERE);

        query.append(_FINDER_COLUMN_BANKID_BANK_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EmployeesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(bank);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employees);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employees> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employeeses where bank = &#63; from the database.
     *
     * @param bank the bank
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBankId(long bank) throws SystemException {
        for (Employees employees : findByBankId(bank, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(employees);
        }
    }

    /**
     * Returns the number of employeeses where bank = &#63;.
     *
     * @param bank the bank
     * @return the number of matching employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBankId(long bank) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANKID;

        Object[] finderArgs = new Object[] { bank };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEES_WHERE);

            query.append(_FINDER_COLUMN_BANKID_BANK_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(bank);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
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
    @Override
    public List<Employees> findByName(String firstName, String secondName,
        String lastName) throws SystemException {
        return findByName(firstName, secondName, lastName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Employees> findByName(String firstName, String secondName,
        String lastName, int start, int end) throws SystemException {
        return findByName(firstName, secondName, lastName, start, end, null);
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
    @Override
    public List<Employees> findByName(String firstName, String secondName,
        String lastName, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { firstName, secondName, lastName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] {
                    firstName, secondName, lastName,
                    
                    start, end, orderByComparator
                };
        }

        List<Employees> list = (List<Employees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employees employees : list) {
                if (!Validator.equals(firstName, employees.getFirstName()) ||
                        !Validator.equals(secondName, employees.getSecondName()) ||
                        !Validator.equals(lastName, employees.getLastName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(5 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(5);
            }

            query.append(_SQL_SELECT_EMPLOYEES_WHERE);

            boolean bindFirstName = false;

            if (firstName == null) {
                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_1);
            } else if (firstName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_3);
            } else {
                bindFirstName = true;

                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_2);
            }

            boolean bindSecondName = false;

            if (secondName == null) {
                query.append(_FINDER_COLUMN_NAME_SECONDNAME_1);
            } else if (secondName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_SECONDNAME_3);
            } else {
                bindSecondName = true;

                query.append(_FINDER_COLUMN_NAME_SECONDNAME_2);
            }

            boolean bindLastName = false;

            if (lastName == null) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_1);
            } else if (lastName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_3);
            } else {
                bindLastName = true;

                query.append(_FINDER_COLUMN_NAME_LASTNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindFirstName) {
                    qPos.add(firstName);
                }

                if (bindSecondName) {
                    qPos.add(secondName);
                }

                if (bindLastName) {
                    qPos.add(lastName);
                }

                if (!pagination) {
                    list = (List<Employees>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employees>(list);
                } else {
                    list = (List<Employees>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Employees findByName_First(String firstName, String secondName,
        String lastName, OrderByComparator orderByComparator)
        throws NoSuchEmployeesException, SystemException {
        Employees employees = fetchByName_First(firstName, secondName,
                lastName, orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("firstName=");
        msg.append(firstName);

        msg.append(", secondName=");
        msg.append(secondName);

        msg.append(", lastName=");
        msg.append(lastName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeesException(msg.toString());
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
    @Override
    public Employees fetchByName_First(String firstName, String secondName,
        String lastName, OrderByComparator orderByComparator)
        throws SystemException {
        List<Employees> list = findByName(firstName, secondName, lastName, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employees findByName_Last(String firstName, String secondName,
        String lastName, OrderByComparator orderByComparator)
        throws NoSuchEmployeesException, SystemException {
        Employees employees = fetchByName_Last(firstName, secondName, lastName,
                orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("firstName=");
        msg.append(firstName);

        msg.append(", secondName=");
        msg.append(secondName);

        msg.append(", lastName=");
        msg.append(lastName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeesException(msg.toString());
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
    @Override
    public Employees fetchByName_Last(String firstName, String secondName,
        String lastName, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByName(firstName, secondName, lastName);

        if (count == 0) {
            return null;
        }

        List<Employees> list = findByName(firstName, secondName, lastName,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employees[] findByName_PrevAndNext(long empId, String firstName,
        String secondName, String lastName, OrderByComparator orderByComparator)
        throws NoSuchEmployeesException, SystemException {
        Employees employees = findByPrimaryKey(empId);

        Session session = null;

        try {
            session = openSession();

            Employees[] array = new EmployeesImpl[3];

            array[0] = getByName_PrevAndNext(session, employees, firstName,
                    secondName, lastName, orderByComparator, true);

            array[1] = employees;

            array[2] = getByName_PrevAndNext(session, employees, firstName,
                    secondName, lastName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employees getByName_PrevAndNext(Session session,
        Employees employees, String firstName, String secondName,
        String lastName, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEES_WHERE);

        boolean bindFirstName = false;

        if (firstName == null) {
            query.append(_FINDER_COLUMN_NAME_FIRSTNAME_1);
        } else if (firstName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_FIRSTNAME_3);
        } else {
            bindFirstName = true;

            query.append(_FINDER_COLUMN_NAME_FIRSTNAME_2);
        }

        boolean bindSecondName = false;

        if (secondName == null) {
            query.append(_FINDER_COLUMN_NAME_SECONDNAME_1);
        } else if (secondName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_SECONDNAME_3);
        } else {
            bindSecondName = true;

            query.append(_FINDER_COLUMN_NAME_SECONDNAME_2);
        }

        boolean bindLastName = false;

        if (lastName == null) {
            query.append(_FINDER_COLUMN_NAME_LASTNAME_1);
        } else if (lastName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_LASTNAME_3);
        } else {
            bindLastName = true;

            query.append(_FINDER_COLUMN_NAME_LASTNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EmployeesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindFirstName) {
            qPos.add(firstName);
        }

        if (bindSecondName) {
            qPos.add(secondName);
        }

        if (bindLastName) {
            qPos.add(lastName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employees);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employees> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employeeses where firstName = &#63; and secondName = &#63; and lastName = &#63; from the database.
     *
     * @param firstName the first name
     * @param secondName the second name
     * @param lastName the last name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByName(String firstName, String secondName,
        String lastName) throws SystemException {
        for (Employees employees : findByName(firstName, secondName, lastName,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(employees);
        }
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
    @Override
    public int countByName(String firstName, String secondName, String lastName)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

        Object[] finderArgs = new Object[] { firstName, secondName, lastName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_EMPLOYEES_WHERE);

            boolean bindFirstName = false;

            if (firstName == null) {
                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_1);
            } else if (firstName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_3);
            } else {
                bindFirstName = true;

                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_2);
            }

            boolean bindSecondName = false;

            if (secondName == null) {
                query.append(_FINDER_COLUMN_NAME_SECONDNAME_1);
            } else if (secondName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_SECONDNAME_3);
            } else {
                bindSecondName = true;

                query.append(_FINDER_COLUMN_NAME_SECONDNAME_2);
            }

            boolean bindLastName = false;

            if (lastName == null) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_1);
            } else if (lastName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_3);
            } else {
                bindLastName = true;

                query.append(_FINDER_COLUMN_NAME_LASTNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindFirstName) {
                    qPos.add(firstName);
                }

                if (bindSecondName) {
                    qPos.add(secondName);
                }

                if (bindLastName) {
                    qPos.add(lastName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the employees in the entity cache if it is enabled.
     *
     * @param employees the employees
     */
    @Override
    public void cacheResult(Employees employees) {
        EntityCacheUtil.putResult(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesImpl.class, employees.getPrimaryKey(), employees);

        employees.resetOriginalValues();
    }

    /**
     * Caches the employeeses in the entity cache if it is enabled.
     *
     * @param employeeses the employeeses
     */
    @Override
    public void cacheResult(List<Employees> employeeses) {
        for (Employees employees : employeeses) {
            if (EntityCacheUtil.getResult(
                        EmployeesModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeesImpl.class, employees.getPrimaryKey()) == null) {
                cacheResult(employees);
            } else {
                employees.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all employeeses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EmployeesImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EmployeesImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the employees.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Employees employees) {
        EntityCacheUtil.removeResult(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesImpl.class, employees.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Employees> employeeses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Employees employees : employeeses) {
            EntityCacheUtil.removeResult(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
                EmployeesImpl.class, employees.getPrimaryKey());
        }
    }

    /**
     * Creates a new employees with the primary key. Does not add the employees to the database.
     *
     * @param empId the primary key for the new employees
     * @return the new employees
     */
    @Override
    public Employees create(long empId) {
        Employees employees = new EmployeesImpl();

        employees.setNew(true);
        employees.setPrimaryKey(empId);

        return employees;
    }

    /**
     * Removes the employees with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param empId the primary key of the employees
     * @return the employees that was removed
     * @throws com.EmployeesDB.NoSuchEmployeesException if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employees remove(long empId)
        throws NoSuchEmployeesException, SystemException {
        return remove((Serializable) empId);
    }

    /**
     * Removes the employees with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the employees
     * @return the employees that was removed
     * @throws com.EmployeesDB.NoSuchEmployeesException if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employees remove(Serializable primaryKey)
        throws NoSuchEmployeesException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Employees employees = (Employees) session.get(EmployeesImpl.class,
                    primaryKey);

            if (employees == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmployeesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(employees);
        } catch (NoSuchEmployeesException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Employees removeImpl(Employees employees)
        throws SystemException {
        employees = toUnwrappedModel(employees);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(employees)) {
                employees = (Employees) session.get(EmployeesImpl.class,
                        employees.getPrimaryKeyObj());
            }

            if (employees != null) {
                session.delete(employees);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (employees != null) {
            clearCache(employees);
        }

        return employees;
    }

    @Override
    public Employees updateImpl(com.EmployeesDB.model.Employees employees)
        throws SystemException {
        employees = toUnwrappedModel(employees);

        boolean isNew = employees.isNew();

        EmployeesModelImpl employeesModelImpl = (EmployeesModelImpl) employees;

        Session session = null;

        try {
            session = openSession();

            if (employees.isNew()) {
                session.save(employees);

                employees.setNew(false);
            } else {
                session.merge(employees);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EmployeesModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((employeesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeesModelImpl.getOriginalBank()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);

                args = new Object[] { employeesModelImpl.getBank() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);
            }

            if ((employeesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeesModelImpl.getOriginalFirstName(),
                        employeesModelImpl.getOriginalSecondName(),
                        employeesModelImpl.getOriginalLastName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);

                args = new Object[] {
                        employeesModelImpl.getFirstName(),
                        employeesModelImpl.getSecondName(),
                        employeesModelImpl.getLastName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);
            }
        }

        EntityCacheUtil.putResult(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EmployeesImpl.class, employees.getPrimaryKey(), employees);

        return employees;
    }

    protected Employees toUnwrappedModel(Employees employees) {
        if (employees instanceof EmployeesImpl) {
            return employees;
        }

        EmployeesImpl employeesImpl = new EmployeesImpl();

        employeesImpl.setNew(employees.isNew());
        employeesImpl.setPrimaryKey(employees.getPrimaryKey());

        employeesImpl.setEmpId(employees.getEmpId());
        employeesImpl.setFirstName(employees.getFirstName());
        employeesImpl.setSecondName(employees.getSecondName());
        employeesImpl.setLastName(employees.getLastName());
        employeesImpl.setGender(employees.getGender());
        employeesImpl.setBirthday(employees.getBirthday());
        employeesImpl.setEmplPosition(employees.getEmplPosition());
        employeesImpl.setStartWork(employees.getStartWork());
        employeesImpl.setSalary(employees.getSalary());
        employeesImpl.setWorkPhoneNumber(employees.getWorkPhoneNumber());
        employeesImpl.setPhoneNumber(employees.getPhoneNumber());
        employeesImpl.setBank(employees.getBank());
        employeesImpl.setIsArchived(employees.isIsArchived());

        return employeesImpl;
    }

    /**
     * Returns the employees with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the employees
     * @return the employees
     * @throws com.EmployeesDB.NoSuchEmployeesException if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employees findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEmployeesException, SystemException {
        Employees employees = fetchByPrimaryKey(primaryKey);

        if (employees == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEmployeesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return employees;
    }

    /**
     * Returns the employees with the primary key or throws a {@link com.EmployeesDB.NoSuchEmployeesException} if it could not be found.
     *
     * @param empId the primary key of the employees
     * @return the employees
     * @throws com.EmployeesDB.NoSuchEmployeesException if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employees findByPrimaryKey(long empId)
        throws NoSuchEmployeesException, SystemException {
        return findByPrimaryKey((Serializable) empId);
    }

    /**
     * Returns the employees with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the employees
     * @return the employees, or <code>null</code> if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employees fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Employees employees = (Employees) EntityCacheUtil.getResult(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
                EmployeesImpl.class, primaryKey);

        if (employees == _nullEmployees) {
            return null;
        }

        if (employees == null) {
            Session session = null;

            try {
                session = openSession();

                employees = (Employees) session.get(EmployeesImpl.class,
                        primaryKey);

                if (employees != null) {
                    cacheResult(employees);
                } else {
                    EntityCacheUtil.putResult(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeesImpl.class, primaryKey, _nullEmployees);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EmployeesModelImpl.ENTITY_CACHE_ENABLED,
                    EmployeesImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return employees;
    }

    /**
     * Returns the employees with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param empId the primary key of the employees
     * @return the employees, or <code>null</code> if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employees fetchByPrimaryKey(long empId) throws SystemException {
        return fetchByPrimaryKey((Serializable) empId);
    }

    /**
     * Returns all the employeeses.
     *
     * @return the employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employees> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Employees> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Employees> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Employees> list = (List<Employees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPLOYEES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPLOYEES;

                if (pagination) {
                    sql = sql.concat(EmployeesModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Employees>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employees>(list);
                } else {
                    list = (List<Employees>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the employeeses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Employees employees : findAll()) {
            remove(employees);
        }
    }

    /**
     * Returns the number of employeeses.
     *
     * @return the number of employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EMPLOYEES);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the employees persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.EmployeesDB.model.Employees")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Employees>> listenersList = new ArrayList<ModelListener<Employees>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Employees>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EmployeesImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
