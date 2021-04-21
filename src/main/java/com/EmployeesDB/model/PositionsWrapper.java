package com.EmployeesDB.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Positions}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Positions
 * @generated
 */
public class PositionsWrapper implements Positions, ModelWrapper<Positions> {
    private Positions _positions;

    public PositionsWrapper(Positions positions) {
        _positions = positions;
    }

    @Override
    public Class<?> getModelClass() {
        return Positions.class;
    }

    @Override
    public String getModelClassName() {
        return Positions.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("positionId", getPositionId());
        attributes.put("positionName", getPositionName());
        attributes.put("isArchived", getIsArchived());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long positionId = (Long) attributes.get("positionId");

        if (positionId != null) {
            setPositionId(positionId);
        }

        String positionName = (String) attributes.get("positionName");

        if (positionName != null) {
            setPositionName(positionName);
        }

        Boolean isArchived = (Boolean) attributes.get("isArchived");

        if (isArchived != null) {
            setIsArchived(isArchived);
        }
    }

    /**
    * Returns the primary key of this positions.
    *
    * @return the primary key of this positions
    */
    @Override
    public long getPrimaryKey() {
        return _positions.getPrimaryKey();
    }

    /**
    * Sets the primary key of this positions.
    *
    * @param primaryKey the primary key of this positions
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _positions.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the position ID of this positions.
    *
    * @return the position ID of this positions
    */
    @Override
    public long getPositionId() {
        return _positions.getPositionId();
    }

    /**
    * Sets the position ID of this positions.
    *
    * @param positionId the position ID of this positions
    */
    @Override
    public void setPositionId(long positionId) {
        _positions.setPositionId(positionId);
    }

    /**
    * Returns the position name of this positions.
    *
    * @return the position name of this positions
    */
    @Override
    public java.lang.String getPositionName() {
        return _positions.getPositionName();
    }

    /**
    * Sets the position name of this positions.
    *
    * @param positionName the position name of this positions
    */
    @Override
    public void setPositionName(java.lang.String positionName) {
        _positions.setPositionName(positionName);
    }

    /**
    * Returns the is archived of this positions.
    *
    * @return the is archived of this positions
    */
    @Override
    public boolean getIsArchived() {
        return _positions.getIsArchived();
    }

    /**
    * Returns <code>true</code> if this positions is is archived.
    *
    * @return <code>true</code> if this positions is is archived; <code>false</code> otherwise
    */
    @Override
    public boolean isIsArchived() {
        return _positions.isIsArchived();
    }

    /**
    * Sets whether this positions is is archived.
    *
    * @param isArchived the is archived of this positions
    */
    @Override
    public void setIsArchived(boolean isArchived) {
        _positions.setIsArchived(isArchived);
    }

    @Override
    public boolean isNew() {
        return _positions.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _positions.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _positions.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _positions.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _positions.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _positions.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _positions.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _positions.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _positions.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _positions.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _positions.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PositionsWrapper((Positions) _positions.clone());
    }

    @Override
    public int compareTo(Positions positions) {
        return _positions.compareTo(positions);
    }

    @Override
    public int hashCode() {
        return _positions.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Positions> toCacheModel() {
        return _positions.toCacheModel();
    }

    @Override
    public Positions toEscapedModel() {
        return new PositionsWrapper(_positions.toEscapedModel());
    }

    @Override
    public Positions toUnescapedModel() {
        return new PositionsWrapper(_positions.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _positions.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _positions.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _positions.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PositionsWrapper)) {
            return false;
        }

        PositionsWrapper positionsWrapper = (PositionsWrapper) obj;

        if (Validator.equals(_positions, positionsWrapper._positions)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Positions getWrappedPositions() {
        return _positions;
    }

    @Override
    public Positions getWrappedModel() {
        return _positions;
    }

    @Override
    public void resetOriginalValues() {
        _positions.resetOriginalValues();
    }
}
