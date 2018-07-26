package cn.isdev.ssh.action;

import cn.isdev.ssh.bean.Student;
import cn.isdev.ssh.service.IStudentService;
import cn.isdev.ssh.service.imp.StudentService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lsh134667 on 2018/7/24.
 */
public class RegisterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private Student stu;
    private IStudentService stuService;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public IStudentService getStuService() {
        return stuService;
    }

    public void setStuService(IStudentService stuService) {
        this.stuService = stuService;
    }

    @Override
    public String execute() throws Exception {
        try {
            stuService.regStu(stu);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
}
