package com.EmployeesDB.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Positions service. Represents a row in the &quot;testtask_Positions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.EmployeesDB.model.impl.PositionsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.EmployeesDB.model.impl.PositionsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Positions
 * @see com.EmployeesDB.model.impl.PositionsImpl
 * @see com.EmployeesDB.model.impl.PositionsModelImpl
 * @generated
 */
public interface PositionsModel extends BaseModel<Positions> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a positions model instance should use the {@link Positions} interface instead.
     */

    /**
     * Returns the primary key of this positions.
     *
     * @return the primary key of this positions
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this positions.
     *
     * @param primaryKey the primary key of this positions
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the position ID of this positions.
     *
     * @return the position ID of this positions
     */
    public long getPositionId();

    /**
     * Sets the position ID of this positions.
     *
     * @param positionId the position ID of this positions
     */
    public void setPositionId(long positionId);

    /**
     * Returns the position name of this positions.
     *
     * @return the position name of this positions
     */
    @AutoEscape
    public String getPositionName();

    /**
     * Sets the position name of this positions.
     *
     * @param positionName the position name of this positions
     */
    public void setPositionName(String positionName);

    /**
     * Returns the is archived of this positions.
     *
     * @return the is archived of this positions
     */
    public boolean getIsArchived();

    /**
     * Returns <code>true</code> if this positions is is archived.
     *
     * @return <code>true</code> if this positions is is archived; <code>false</code> otherwise
     */
    public boolean isIsArchived();

    /**
     * Sets whether this positions is is archived.
     *
     * @param isArchived the is archived of this positions
     */
    public void setIsArchived(boolean isArchived);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(Positions positions);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Positions> toCacheModel();

    @Override
    public Positions toEscapedModel();

    @Override
    public Positions toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
