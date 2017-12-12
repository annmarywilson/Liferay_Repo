package net.opentrends.register.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddressSoap implements Serializable {
    private long _addressId;
    private long _studentId;
    private long _groupId;
    private String _parentAddress;
    private String _parentState;
    private String _parentDistrict;
    private String _parentPin;
    private String _parentPhone;
    private String _parentMail;

    public AddressSoap() {
    }

    public static AddressSoap toSoapModel(Address model) {
        AddressSoap soapModel = new AddressSoap();

        soapModel.setAddressId(model.getAddressId());
        soapModel.setStudentId(model.getStudentId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setParentAddress(model.getParentAddress());
        soapModel.setParentState(model.getParentState());
        soapModel.setParentDistrict(model.getParentDistrict());
        soapModel.setParentPin(model.getParentPin());
        soapModel.setParentPhone(model.getParentPhone());
        soapModel.setParentMail(model.getParentMail());

        return soapModel;
    }

    public static AddressSoap[] toSoapModels(Address[] models) {
        AddressSoap[] soapModels = new AddressSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AddressSoap[][] toSoapModels(Address[][] models) {
        AddressSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AddressSoap[models.length][models[0].length];
        } else {
            soapModels = new AddressSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AddressSoap[] toSoapModels(List<Address> models) {
        List<AddressSoap> soapModels = new ArrayList<AddressSoap>(models.size());

        for (Address model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AddressSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _addressId;
    }

    public void setPrimaryKey(long pk) {
        setAddressId(pk);
    }

    public long getAddressId() {
        return _addressId;
    }

    public void setAddressId(long addressId) {
        _addressId = addressId;
    }

    public long getStudentId() {
        return _studentId;
    }

    public void setStudentId(long studentId) {
        _studentId = studentId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public String getParentAddress() {
        return _parentAddress;
    }

    public void setParentAddress(String parentAddress) {
        _parentAddress = parentAddress;
    }

    public String getParentState() {
        return _parentState;
    }

    public void setParentState(String parentState) {
        _parentState = parentState;
    }

    public String getParentDistrict() {
        return _parentDistrict;
    }

    public void setParentDistrict(String parentDistrict) {
        _parentDistrict = parentDistrict;
    }

    public String getParentPin() {
        return _parentPin;
    }

    public void setParentPin(String parentPin) {
        _parentPin = parentPin;
    }

    public String getParentPhone() {
        return _parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        _parentPhone = parentPhone;
    }

    public String getParentMail() {
        return _parentMail;
    }

    public void setParentMail(String parentMail) {
        _parentMail = parentMail;
    }
}
