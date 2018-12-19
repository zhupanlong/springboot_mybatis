package com.zpl.springboot_mybatis;

import com.zpl.springboot_mybatis.dao.DAO;
import com.zpl.springboot_mybatis.model.PageBean;
import com.zpl.springboot_mybatis.model.User;
import com.zpl.springboot_mybatis.model.UserExample;
import com.zpl.springboot_mybatis.service.impl.BaseCommonServiceImpl;
import com.zpl.springboot_mybatis.util.CreateIdNO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
	@Resource
	private BaseCommonServiceImpl<User> baseCommonServiceImpl;
	@Test
	public void contextLoads() {
		String id = "1";
		User user =null;
		PageBean pageBean=new PageBean();
		pageBean.setPage(1);
		pageBean.setRows(2);
		UserExample userExample=new UserExample();
//        try {
//            Statement statement=dataSource.getConnection().prepareStatement("Select * from t_user");
////            statement.execute("create sequence seq_user");
//            ResultSet rs=statement.executeQuery("select * from t_user where rownum=1");
//            if(rs.next()){
//                user =new User(rs.getString(1),rs.getString(2),rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


//        UserExample.Criteria criteria= userExample.createCriteria();
//        criteria.andIdLessThan("2");
//        user = userDao.selectByExample(userExample).get(0);
//        user = (User) userDao.selectRecordsByPage(pageBean,userExample).get(0);

		Object[] params=new Object[1];
		params[0]=id;
		user = (User) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getUserDao(), DAO.SELECTBYPRIMARYKEY,params);
//        user.setPassword("654321");
//        user.setWeixin(null);
//        userDao.updateByPrimaryKey(user);
//        System.out.println(CreateIdNO.CreateIdNO("BankMoney"));
		System.out.println(user);
//        user.setPassword("654321");
//        user.setWeixin(null);
//        userDao.updateByPrimaryKey(user);
		System.out.println(CreateIdNO.CreateIdNO("BankMoney"));
	}

}

