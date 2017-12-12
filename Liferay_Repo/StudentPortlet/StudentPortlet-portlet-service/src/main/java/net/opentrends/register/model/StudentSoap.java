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
public class StudentSoap implements Serializable {
    private long _studentId;
    private long _groupId;
    private String _studentName;
    private String _studentClass;
    private String _studentEmail;
    private String _phoneNumber;

    public StudentSoap() {
    }

    public static StudentSoap toSoapModel(Student model) {
        StudentSoap soapModel = new StudentSoap();

        soapModel.setStudentId(model.getStudentId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setStudentName(model.getStudentName());
        soapModel.setStudentClass(model.getStudentClass());
        soapModel.setStudentEmail(model.getStudentEmail());
        soapModel.setPhoneNumber(model.getPhoneNumber());

        return soapModel;
    }

    public static StudentSoap[] toSoapModels(Student[] models) {
        StudentSoap[] soapModels = new StudentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[][] toSoapModels(Student[][] models) {
        StudentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StudentSoap[models.length][models[0].length];
        } else {
            soapModels = new StudentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[] toSoapModels(List<Student> models) {
        List<StudentSoap> soapModels = new ArrayList<StudentSoap>(models.size());

        for (Student model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StudentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _studentId;
    }

    public void setPrimaryKey(long pk) {
        setStudentId(pk);
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

    public String getStudentName() {
        return _studentName;
    }

    public void setStudentName(String studentName) {
        _studentName = studentName;
    }

    public String getStudentClass() {
        return _studentClass;
    }

    public void setStudentClass(String studentClass) {
        _studentClass = studentClass;
    }

    public String getStudentEmail() {
        return _studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        _studentEmail = studentEmail;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }
}
