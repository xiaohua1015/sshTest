package cn.isdev.ssh.dao.imp;

import cn.isdev.ssh.dao.BaseDao;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by lsh134667 on 2018/7/24.
 */
public class StuDao extends HibernateDaoSupport implements BaseDao {
    @Override
    public void save(Object object) {
        getHibernateTemplate().saveOrUpdate(object);
    }
}
