package org.hlx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.hlx.dao.UserinfoDao;
import org.hlx.pojo.Parames;
import org.hlx.pojo.Userinfo;
import org.hlx.service.UserinfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserinfoServiceImpl
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/15
 * @Version V1.0
 * 业务层
 *
 */
@Service   //业务
@Transactional  //事务
public class UserinfoServiceImpl implements UserinfoService {

    //注入底层数据
    @Resource
    private UserinfoDao  userinfoDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Userinfo> all() {
        return userinfoDao.all();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insert(Userinfo user) {
        return userinfoDao.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int update(Userinfo user) {
        return userinfoDao.update(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int delete(int id) {
        return userinfoDao.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Userinfo findById(int id) {
        return userinfoDao.findById(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public PageInfo<Userinfo> getPageInfo(Parames parames) {

        //1>开始进行分页
        PageHelper.startPage(parames.getPageCurrent(),parames.getPageSize());

        //2>调用底层方法
        List<Userinfo> list = userinfoDao.all();

        //3>分页包装
        PageInfo<Userinfo> pageInfo =new PageInfo<>(list);


        return pageInfo;
    }

    /**
     * 条件分页
     * @param userinfo
     * @param parames
     * @return
     */
    @Override
    public PageInfo<Userinfo> findName(Userinfo userinfo, Parames parames) {
        //1>开始进行分页
        PageHelper.startPage(parames.getPageCurrent(),parames.getPageSize());

        //2>调用底层方法
        List<Userinfo> list = userinfoDao.findName(userinfo);

        //3>分页包装
        PageInfo<Userinfo> pageInfo =new PageInfo<>(list);

        return pageInfo;
    }
}
