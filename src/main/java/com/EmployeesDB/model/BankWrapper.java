package com.EmployeesDB.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bank}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bank
 * @generated
 */
public class BankWrapper implements Bank, ModelWrapper<Bank> {
    private Bank _bank;

    public BankWrapper(Bank bank) {
        _bank = bank;
    }

    @Override
    public Class<?> getModelClass() {
        return Bank.class;
    }

    @Override
    public String getModelClassName() {
        return Bank.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bankId", getBankId());
        attributes.put("bankName", getBankName());
        attributes.put("bik", getBik());
        attributes.put("adres", getAdres());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bankId = (Long) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        String bankName = (String) attributes.get("bankName");

        if (bankName != null) {
            setBankName(bankName);
        }

        String bik = (String) attributes.get("bik");

        if (bik != null) {
            setBik(bik);
        }

        String adres = (String) attributes.get("adres");

        if (adres != null) {
            setAdres(adres);
        }
    }

    /**
    * Returns the primary key of this bank.
    *
    * @return the primary key of this bank
    */
    @Override
    public long getPrimaryKey() {
        return _bank.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bank.
    *
    * @param primaryKey the primary key of this bank
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _bank.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the bank ID of this bank.
    *
    * @return the bank ID of this bank
    */
    @Override
    public long getBankId() {
        return _bank.getBankId();
    }

    /**
    * Sets the bank ID of this bank.
    *
    * @param bankId the bank ID of this bank
    */
    @Override
    public void setBankId(long bankId) {
        _bank.setBankId(bankId);
    }

    /**
    * Returns the bank name of this bank.
    *
    * @return the bank name of this bank
    */
    @Override
    public java.lang.String getBankName() {
        return _bank.getBankName();
    }

    /**
    * Sets the bank name of this bank.
    *
    * @param bankName the bank name of this bank
    */
    @Override
    public void setBankName(java.lang.String bankName) {
        _bank.setBankName(bankName);
    }

    /**
    * Returns the bik of this bank.
    *
    * @return the bik of this bank
    */
    @Override
    public java.lang.String getBik() {
        return _bank.getBik();
    }

    /**
    * Sets the bik of this bank.
    *
    * @param bik the bik of this bank
    */
    @Override
    public void setBik(java.lang.String bik) {
        _bank.setBik(bik);
    }

    /**
    * Returns the adres of this bank.
    *
    * @return the adres of this bank
    */
    @Override
    public java.lang.String getAdres() {
        return _bank.getAdres();
    }

    /**
    * Sets the adres of this bank.
    *
    * @param adres the adres of this bank
    */
    @Override
    public void setAdres(java.lang.String adres) {
        _bank.setAdres(adres);
    }

    @Override
    public boolean isNew() {
        return _bank.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bank.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bank.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bank.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bank.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bank.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bank.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bank.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bank.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bank.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bank.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BankWrapper((Bank) _bank.clone());
    }

    @Override
    public int compareTo(Bank bank) {
        return _bank.compareTo(bank);
    }

    @Override
    public int hashCode() {
        return _bank.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Bank> toCacheModel() {
        return _bank.toCacheModel();
    }

    @Override
    public Bank toEscapedModel() {
        return new BankWrapper(_bank.toEscapedModel());
    }

    @Override
    public Bank toUnescapedModel() {
        return new BankWrapper(_bank.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bank.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bank.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bank.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankWrapper)) {
            return false;
        }

        BankWrapper bankWrapper = (BankWrapper) obj;

        if (Validator.equals(_bank, bankWrapper._bank)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Bank getWrappedBank() {
        return _bank;
    }

    @Override
    public Bank getWrappedModel() {
        return _bank;
    }

    @Override
    public void resetOriginalValues() {
        _bank.resetOriginalValues();
    }
}
