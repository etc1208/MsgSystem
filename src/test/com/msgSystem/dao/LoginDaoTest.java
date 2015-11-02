package test.com.msgSystem.dao; 

import com.msgSystem.dao.LoginDao;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* LoginDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 1, 2015</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class LoginDaoTest { 

    @Autowired
    private LoginDao loginDao;
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testLogin() throws Exception {
    //TODO: Test goes here...
        JSONObject jsonObject = loginDao.login("super", "902902902");
        System.out.println(jsonObject);
    }
} 
