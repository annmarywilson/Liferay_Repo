package net.opentrends.register.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.register.model.Student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
    public long studentId;
    public long groupId;
    public String studentName;
    public String studentClass;
    public String studentEmail;
    public String phoneNumber;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{studentId=");
        sb.append(studentId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", studentName=");
        sb.append(studentName);
        sb.append(", studentClass=");
        sb.append(studentClass);
        sb.append(", studentEmail=");
        sb.append(studentEmail);
        sb.append(", phoneNumber=");
        sb.append(phoneNumber);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Student toEntityModel() {
        StudentImpl studentImpl = new StudentImpl();

        studentImpl.setStudentId(studentId);
        studentImpl.setGroupId(groupId);

        if (studentName == null) {
            studentImpl.setStudentName(StringPool.BLANK);
        } else {
            studentImpl.setStudentName(studentName);
        }

        if (studentClass == null) {
            studentImpl.setStudentClass(StringPool.BLANK);
        } else {
            studentImpl.setStudentClass(studentClass);
        }

        if (studentEmail == null) {
            studentImpl.setStudentEmail(StringPool.BLANK);
        } else {
            studentImpl.setStudentEmail(studentEmail);
        }

        if (phoneNumber == null) {
            studentImpl.setPhoneNumber(StringPool.BLANK);
        } else {
            studentImpl.setPhoneNumber(phoneNumber);
        }

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        studentId = objectInput.readLong();
        groupId = objectInput.readLong();
        studentName = objectInput.readUTF();
        studentClass = objectInput.readUTF();
        studentEmail = objectInput.readUTF();
        phoneNumber = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(studentId);
        objectOutput.writeLong(groupId);

        if (studentName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(studentName);
        }

        if (studentClass == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(studentClass);
        }

        if (studentEmail == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(studentEmail);
        }

        if (phoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phoneNumber);
        }
    }
}
