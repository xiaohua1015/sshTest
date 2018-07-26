package cn.isdev.ssh.service.imp;

import cn.isdev.ssh.bean.Student;
import cn.isdev.ssh.dao.BaseDao;
import cn.isdev.ssh.dao.imp.StuDao;
import cn.isdev.ssh.service.IStudentService;
import cn.isdev.ssh.utils.HibernateUtils;
import org.hibernate.Session;

/**
 * Created by lsh134667 on 2018/7/24.
 */
public class StudentService implements IStudentService {
    private BaseDao dao;

    public BaseDao getDao() {
        return dao;
    }

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public void regStu(Student stu) {
        dao.save(stu);
    }
}
