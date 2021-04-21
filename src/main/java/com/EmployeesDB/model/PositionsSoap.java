package com.EmployeesDB.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PositionsSoap implements Serializable {
    private long _positionId;
    private String _positionName;
    private boolean _isArchived;

    public PositionsSoap() {
    }

    public static PositionsSoap toSoapModel(Positions model) {
        PositionsSoap soapModel = new PositionsSoap();

        soapModel.setPositionId(model.getPositionId());
        soapModel.setPositionName(model.getPositionName());
        soapModel.setIsArchived(model.getIsArchived());

        return soapModel;
    }

    public static PositionsSoap[] toSoapModels(Positions[] models) {
        PositionsSoap[] soapModels = new PositionsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PositionsSoap[][] toSoapModels(Positions[][] models) {
        PositionsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PositionsSoap[models.length][models[0].length];
        } else {
            soapModels = new PositionsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PositionsSoap[] toSoapModels(List<Positions> models) {
        List<PositionsSoap> soapModels = new ArrayList<PositionsSoap>(models.size());

        for (Positions model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PositionsSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _positionId;
    }

    public void setPrimaryKey(long pk) {
        setPositionId(pk);
    }

    public long getPositionId() {
        return _positionId;
    }

    public void setPositionId(long positionId) {
        _positionId = positionId;
    }

    public String getPositionName() {
        return _positionName;
    }

    public void setPositionName(String positionName) {
        _positionName = positionName;
    }

    public boolean getIsArchived() {
        return _isArchived;
    }

    public boolean isIsArchived() {
        return _isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        _isArchived = isArchived;
    }
}
