package com.EmployeesDB.model;

import com.EmployeesDB.service.ClpSerializer;
import com.EmployeesDB.service.PositionsLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PositionsClp extends BaseModelImpl<Positions> implements Positions {
    private long _positionId;
    private String _positionName;
    private boolean _isArchived;
    private BaseModel<?> _positionsRemoteModel;

    public PositionsClp() {
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
    public long getPrimaryKey() {
        return _positionId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPositionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _positionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getPositionId() {
        return _positionId;
    }

    @Override
    public void setPositionId(long positionId) {
        _positionId = positionId;

        if (_positionsRemoteModel != null) {
            try {
                Class<?> clazz = _positionsRemoteModel.getClass();

                Method method = clazz.getMethod("setPositionId", long.class);

                method.invoke(_positionsRemoteModel, positionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPositionName() {
        return _positionName;
    }

    @Override
    public void setPositionName(String positionName) {
        _positionName = positionName;

        if (_positionsRemoteModel != null) {
            try {
                Class<?> clazz = _positionsRemoteModel.getClass();

                Method method = clazz.getMethod("setPositionName", String.class);

                method.invoke(_positionsRemoteModel, positionName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getIsArchived() {
        return _isArchived;
    }

    @Override
    public boolean isIsArchived() {
        return _isArchived;
    }

    @Override
    public void setIsArchived(boolean isArchived) {
        _isArchived = isArchived;

        if (_positionsRemoteModel != null) {
            try {
                Class<?> clazz = _positionsRemoteModel.getClass();

                Method method = clazz.getMethod("setIsArchived", boolean.class);

                method.invoke(_positionsRemoteModel, isArchived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPositionsRemoteModel() {
        return _positionsRemoteModel;
    }

    public void setPositionsRemoteModel(BaseModel<?> positionsRemoteModel) {
        _positionsRemoteModel = positionsRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _positionsRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_positionsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PositionsLocalServiceUtil.addPositions(this);
        } else {
            PositionsLocalServiceUtil.updatePositions(this);
        }
    }

    @Override
    public Positions toEscapedModel() {
        return (Positions) ProxyUtil.newProxyInstance(Positions.class.getClassLoader(),
            new Class[] { Positions.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PositionsClp clone = new PositionsClp();

        clone.setPositionId(getPositionId());
        clone.setPositionName(getPositionName());
        clone.setIsArchived(getIsArchived());

        return clone;
    }

    @Override
    public int compareTo(Positions positions) {
        long primaryKey = positions.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PositionsClp)) {
            return false;
        }

        PositionsClp positions = (PositionsClp) obj;

        long primaryKey = positions.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{positionId=");
        sb.append(getPositionId());
        sb.append(", positionName=");
        sb.append(getPositionName());
        sb.append(", isArchived=");
        sb.append(getIsArchived());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.EmployeesDB.model.Positions");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>positionId</column-name><column-value><![CDATA[");
        sb.append(getPositionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>positionName</column-name><column-value><![CDATA[");
        sb.append(getPositionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isArchived</column-name><column-value><![CDATA[");
        sb.append(getIsArchived());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
