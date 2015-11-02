package test.com.msgSystem.dao; 

import com.msgSystem.dao.RegisterDao;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* RegisterDao Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 1, 2015</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class RegisterDaoTest { 

    @Autowired
    private RegisterDao registerDao;
    private JSONObject jsonObject;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testRegister() throws Exception {
        jsonObject = registerDao.register("yh","123456","13717820302","599068284@qq.com");
        System.out.println(jsonObject);
    }


} 
