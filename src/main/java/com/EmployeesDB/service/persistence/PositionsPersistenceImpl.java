package com.EmployeesDB.service.persistence;

import com.EmployeesDB.NoSuchPositionsException;

import com.EmployeesDB.model.Positions;
import com.EmployeesDB.model.impl.PositionsImpl;
import com.EmployeesDB.model.impl.PositionsModelImpl;

import com.EmployeesDB.service.persistence.PositionsPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the positions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionsPersistence
 * @see PositionsUtil
 * @generated
 */
public class PositionsPersistenceImpl extends BasePersistenceImpl<Positions>
    implements PositionsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PositionsUtil} to access the positions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PositionsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PositionsModelImpl.ENTITY_CACHE_ENABLED,
            PositionsModelImpl.FINDER_CACHE_ENABLED, PositionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PositionsModelImpl.ENTITY_CACHE_ENABLED,
            PositionsModelImpl.FINDER_CACHE_ENABLED, PositionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PositionsModelImpl.ENTITY_CACHE_ENABLED,
            PositionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_POSITIONS = "SELECT positions FROM Positions positions";
    private static final String _SQL_COUNT_POSITIONS = "SELECT COUNT(positions) FROM Positions positions";
    private static final String _ORDER_BY_ENTITY_ALIAS = "positions.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Positions exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PositionsPersistenceImpl.class);
    private static Positions _nullPositions = new PositionsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Positions> toCacheModel() {
                return _nullPositionsCacheModel;
            }
        };

    private static CacheModel<Positions> _nullPositionsCacheModel = new CacheModel<Positions>() {
            @Override
            public Positions toEntityModel() {
                return _nullPositions;
            }
        };

    public PositionsPersistenceImpl() {
        setModelClass(Positions.class);
    }

    /**
     * Caches the positions in the entity cache if it is enabled.
     *
     * @param positions the positions
     */
    @Override
    public void cacheResult(Positions positions) {
        EntityCacheUtil.putResult(PositionsModelImpl.ENTITY_CACHE_ENABLED,
            PositionsImpl.class, positions.getPrimaryKey(), positions);

        positions.resetOriginalValues();
    }

    /**
     * Caches the positionses in the entity cache if it is enabled.
     *
     * @param positionses the positionses
     */
    @Override
    public void cacheResult(List<Positions> positionses) {
        for (Positions positions : positionses) {
            if (EntityCacheUtil.getResult(
                        PositionsModelImpl.ENTITY_CACHE_ENABLED,
                        PositionsImpl.class, positions.getPrimaryKey()) == null) {
                cacheResult(positions);
            } else {
                positions.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all positionses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PositionsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PositionsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the positions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Positions positions) {
        EntityCacheUtil.removeResult(PositionsModelImpl.ENTITY_CACHE_ENABLED,
            PositionsImpl.class, positions.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Positions> positionses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Positions positions : positionses) {
            EntityCacheUtil.removeResult(PositionsModelImpl.ENTITY_CACHE_ENABLED,
                PositionsImpl.class, positions.getPrimaryKey());
        }
    }

    /**
     * Creates a new positions with the primary key. Does not add the positions to the database.
     *
     * @param positionId the primary key for the new positions
     * @return the new positions
     */
    @Override
    public Positions create(long positionId) {
        Positions positions = new PositionsImpl();

        positions.setNew(true);
        positions.setPrimaryKey(positionId);

        return positions;
    }

    /**
     * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param positionId the primary key of the positions
     * @return the positions that was removed
     * @throws com.EmployeesDB.NoSuchPositionsException if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Positions remove(long positionId)
        throws NoSuchPositionsException, SystemException {
        return remove((Serializable) positionId);
    }

    /**
     * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the positions
     * @return the positions that was removed
     * @throws com.EmployeesDB.NoSuchPositionsException if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Positions remove(Serializable primaryKey)
        throws NoSuchPositionsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Positions positions = (Positions) session.get(PositionsImpl.class,
                    primaryKey);

            if (positions == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPositionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(positions);
        } catch (NoSuchPositionsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Positions removeImpl(Positions positions)
        throws SystemException {
        positions = toUnwrappedModel(positions);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(positions)) {
                positions = (Positions) session.get(PositionsImpl.class,
                        positions.getPrimaryKeyObj());
            }

            if (positions != null) {
                session.delete(positions);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (positions != null) {
            clearCache(positions);
        }

        return positions;
    }

    @Override
    public Positions updateImpl(com.EmployeesDB.model.Positions positions)
        throws SystemException {
        positions = toUnwrappedModel(positions);

        boolean isNew = positions.isNew();

        Session session = null;

        try {
            session = openSession();

            if (positions.isNew()) {
                session.save(positions);

                positions.setNew(false);
            } else {
                session.merge(positions);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(PositionsModelImpl.ENTITY_CACHE_ENABLED,
            PositionsImpl.class, positions.getPrimaryKey(), positions);

        return positions;
    }

    protected Positions toUnwrappedModel(Positions positions) {
        if (positions instanceof PositionsImpl) {
            return positions;
        }

        PositionsImpl positionsImpl = new PositionsImpl();

        positionsImpl.setNew(positions.isNew());
        positionsImpl.setPrimaryKey(positions.getPrimaryKey());

        positionsImpl.setPositionId(positions.getPositionId());
        positionsImpl.setPositionName(positions.getPositionName());
        positionsImpl.setIsArchived(positions.isIsArchived());

        return positionsImpl;
    }

    /**
     * Returns the positions with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the positions
     * @return the positions
     * @throws com.EmployeesDB.NoSuchPositionsException if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Positions findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPositionsException, SystemException {
        Positions positions = fetchByPrimaryKey(primaryKey);

        if (positions == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPositionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return positions;
    }

    /**
     * Returns the positions with the primary key or throws a {@link com.EmployeesDB.NoSuchPositionsException} if it could not be found.
     *
     * @param positionId the primary key of the positions
     * @return the positions
     * @throws com.EmployeesDB.NoSuchPositionsException if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Positions findByPrimaryKey(long positionId)
        throws NoSuchPositionsException, SystemException {
        return findByPrimaryKey((Serializable) positionId);
    }

    /**
     * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the positions
     * @return the positions, or <code>null</code> if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Positions fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Positions positions = (Positions) EntityCacheUtil.getResult(PositionsModelImpl.ENTITY_CACHE_ENABLED,
                PositionsImpl.class, primaryKey);

        if (positions == _nullPositions) {
            return null;
        }

        if (positions == null) {
            Session session = null;

            try {
                session = openSession();

                positions = (Positions) session.get(PositionsImpl.class,
                        primaryKey);

                if (positions != null) {
                    cacheResult(positions);
                } else {
                    EntityCacheUtil.putResult(PositionsModelImpl.ENTITY_CACHE_ENABLED,
                        PositionsImpl.class, primaryKey, _nullPositions);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PositionsModelImpl.ENTITY_CACHE_ENABLED,
                    PositionsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return positions;
    }

    /**
     * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param positionId the primary key of the positions
     * @return the positions, or <code>null</code> if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Positions fetchByPrimaryKey(long positionId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) positionId);
    }

    /**
     * Returns all the positionses.
     *
     * @return the positionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Positions> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Positions> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Positions> findAll(int start, int end,
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

        List<Positions> list = (List<Positions>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_POSITIONS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_POSITIONS;

                if (pagination) {
                    sql = sql.concat(PositionsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Positions>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Positions>(list);
                } else {
                    list = (List<Positions>) QueryUtil.list(q, getDialect(),
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
     * Removes all the positionses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Positions positions : findAll()) {
            remove(positions);
        }
    }

    /**
     * Returns the number of positionses.
     *
     * @return the number of positionses
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

                Query q = session.createQuery(_SQL_COUNT_POSITIONS);

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
     * Initializes the positions persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.EmployeesDB.model.Positions")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Positions>> listenersList = new ArrayList<ModelListener<Positions>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Positions>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PositionsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
