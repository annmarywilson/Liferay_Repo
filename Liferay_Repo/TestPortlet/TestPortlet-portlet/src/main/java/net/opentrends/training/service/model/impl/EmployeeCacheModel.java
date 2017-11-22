package net.opentrends.training.service.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.service.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public long employeeId;
    public long groupId;
    public long companyId;
    public long userId;
    public String employeeName;
    public String employeeDesignation;
    public String address;
    public String email;
    public String phoneNumber;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{employeeId=");
        sb.append(employeeId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", employeeName=");
        sb.append(employeeName);
        sb.append(", employeeDesignation=");
        sb.append(employeeDesignation);
        sb.append(", address=");
        sb.append(address);
        sb.append(", email=");
        sb.append(email);
        sb.append(", phoneNumber=");
        sb.append(phoneNumber);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployeeId(employeeId);
        employeeImpl.setGroupId(groupId);
        employeeImpl.setCompanyId(companyId);
        employeeImpl.setUserId(userId);

        if (employeeName == null) {
            employeeImpl.setEmployeeName(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeName(employeeName);
        }

        if (employeeDesignation == null) {
            employeeImpl.setEmployeeDesignation(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeDesignation(employeeDesignation);
        }

        if (address == null) {
            employeeImpl.setAddress(StringPool.BLANK);
        } else {
            employeeImpl.setAddress(address);
        }

        if (email == null) {
            employeeImpl.setEmail(StringPool.BLANK);
        } else {
            employeeImpl.setEmail(email);
        }

        if (phoneNumber == null) {
            employeeImpl.setPhoneNumber(StringPool.BLANK);
        } else {
            employeeImpl.setPhoneNumber(phoneNumber);
        }

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        employeeName = objectInput.readUTF();
        employeeDesignation = objectInput.readUTF();
        address = objectInput.readUTF();
        email = objectInput.readUTF();
        phoneNumber = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employeeId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (employeeName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employeeName);
        }

        if (employeeDesignation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employeeDesignation);
        }

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (phoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phoneNumber);
        }
    }
}
