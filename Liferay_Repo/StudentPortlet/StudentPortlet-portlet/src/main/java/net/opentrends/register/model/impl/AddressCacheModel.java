package net.opentrends.register.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.register.model.Address;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Address in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Address
 * @generated
 */
public class AddressCacheModel implements CacheModel<Address>, Externalizable {
    public long addressId;
    public long studentId;
    public long groupId;
    public String parentAddress;
    public String parentState;
    public String parentDistrict;
    public String parentPin;
    public String parentPhone;
    public String parentMail;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{addressId=");
        sb.append(addressId);
        sb.append(", studentId=");
        sb.append(studentId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", parentAddress=");
        sb.append(parentAddress);
        sb.append(", parentState=");
        sb.append(parentState);
        sb.append(", parentDistrict=");
        sb.append(parentDistrict);
        sb.append(", parentPin=");
        sb.append(parentPin);
        sb.append(", parentPhone=");
        sb.append(parentPhone);
        sb.append(", parentMail=");
        sb.append(parentMail);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Address toEntityModel() {
        AddressImpl addressImpl = new AddressImpl();

        addressImpl.setAddressId(addressId);
        addressImpl.setStudentId(studentId);
        addressImpl.setGroupId(groupId);

        if (parentAddress == null) {
            addressImpl.setParentAddress(StringPool.BLANK);
        } else {
            addressImpl.setParentAddress(parentAddress);
        }

        if (parentState == null) {
            addressImpl.setParentState(StringPool.BLANK);
        } else {
            addressImpl.setParentState(parentState);
        }

        if (parentDistrict == null) {
            addressImpl.setParentDistrict(StringPool.BLANK);
        } else {
            addressImpl.setParentDistrict(parentDistrict);
        }

        if (parentPin == null) {
            addressImpl.setParentPin(StringPool.BLANK);
        } else {
            addressImpl.setParentPin(parentPin);
        }

        if (parentPhone == null) {
            addressImpl.setParentPhone(StringPool.BLANK);
        } else {
            addressImpl.setParentPhone(parentPhone);
        }

        if (parentMail == null) {
            addressImpl.setParentMail(StringPool.BLANK);
        } else {
            addressImpl.setParentMail(parentMail);
        }

        addressImpl.resetOriginalValues();

        return addressImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        addressId = objectInput.readLong();
        studentId = objectInput.readLong();
        groupId = objectInput.readLong();
        parentAddress = objectInput.readUTF();
        parentState = objectInput.readUTF();
        parentDistrict = objectInput.readUTF();
        parentPin = objectInput.readUTF();
        parentPhone = objectInput.readUTF();
        parentMail = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(addressId);
        objectOutput.writeLong(studentId);
        objectOutput.writeLong(groupId);

        if (parentAddress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(parentAddress);
        }

        if (parentState == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(parentState);
        }

        if (parentDistrict == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(parentDistrict);
        }

        if (parentPin == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(parentPin);
        }

        if (parentPhone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(parentPhone);
        }

        if (parentMail == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(parentMail);
        }
    }
}
