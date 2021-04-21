package com.EmployeesDB.model.impl;

import com.EmployeesDB.model.Positions;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Positions in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Positions
 * @generated
 */
public class PositionsCacheModel implements CacheModel<Positions>,
    Externalizable {
    public long positionId;
    public String positionName;
    public boolean isArchived;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{positionId=");
        sb.append(positionId);
        sb.append(", positionName=");
        sb.append(positionName);
        sb.append(", isArchived=");
        sb.append(isArchived);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Positions toEntityModel() {
        PositionsImpl positionsImpl = new PositionsImpl();

        positionsImpl.setPositionId(positionId);

        if (positionName == null) {
            positionsImpl.setPositionName(StringPool.BLANK);
        } else {
            positionsImpl.setPositionName(positionName);
        }

        positionsImpl.setIsArchived(isArchived);

        positionsImpl.resetOriginalValues();

        return positionsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        positionId = objectInput.readLong();
        positionName = objectInput.readUTF();
        isArchived = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(positionId);

        if (positionName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(positionName);
        }

        objectOutput.writeBoolean(isArchived);
    }
}
