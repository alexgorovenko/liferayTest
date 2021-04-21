package com.EmployeesDB.model.impl;

import com.EmployeesDB.model.Bank;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bank in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Bank
 * @generated
 */
public class BankCacheModel implements CacheModel<Bank>, Externalizable {
    public long bankId;
    public String bankName;
    public String bik;
    public String adres;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{bankId=");
        sb.append(bankId);
        sb.append(", bankName=");
        sb.append(bankName);
        sb.append(", bik=");
        sb.append(bik);
        sb.append(", adres=");
        sb.append(adres);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Bank toEntityModel() {
        BankImpl bankImpl = new BankImpl();

        bankImpl.setBankId(bankId);

        if (bankName == null) {
            bankImpl.setBankName(StringPool.BLANK);
        } else {
            bankImpl.setBankName(bankName);
        }

        if (bik == null) {
            bankImpl.setBik(StringPool.BLANK);
        } else {
            bankImpl.setBik(bik);
        }

        if (adres == null) {
            bankImpl.setAdres(StringPool.BLANK);
        } else {
            bankImpl.setAdres(adres);
        }

        bankImpl.resetOriginalValues();

        return bankImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bankId = objectInput.readLong();
        bankName = objectInput.readUTF();
        bik = objectInput.readUTF();
        adres = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(bankId);

        if (bankName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankName);
        }

        if (bik == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bik);
        }

        if (adres == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(adres);
        }
    }
}
