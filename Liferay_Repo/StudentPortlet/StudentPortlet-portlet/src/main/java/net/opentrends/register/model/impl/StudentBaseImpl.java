package net.opentrends.register.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.register.model.Student;
import net.opentrends.register.service.StudentLocalServiceUtil;

/**
 * The extended model base implementation for the Student service. Represents a row in the &quot;StudentPortlet_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StudentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentImpl
 * @see net.opentrends.register.model.Student
 * @generated
 */
public abstract class StudentBaseImpl extends StudentModelImpl
    implements Student {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a student model instance should use the {@link Student} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            StudentLocalServiceUtil.addStudent(this);
        } else {
            StudentLocalServiceUtil.updateStudent(this);
        }
    }
}