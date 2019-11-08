import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.lin.entity.Account;
import top.lin.mapper.AccountMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {
    /**
     * 测试查询所有
     */
    @Test
    public void test01(){
        //1.读取配置文件
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        AccountMapper accountMapper = session.getMapper(AccountMapper.class);
        //5.使用代理对象执行方法
        List<Account> accounts = accountMapper.findAll();
        for(Account account : accounts){
            System.out.println(account);
        }
        //6.释放资源
        session.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试保存
     */
    @Test
    public void test02(){
        //1.读取配置文件
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        AccountMapper accountMapper = session.getMapper(AccountMapper.class);
        //5.使用代理对象执行方法
        Account account = new Account();
        account.setName("LIN");
        account.setMoney(300);
        accountMapper.saveAccount(account);
        //6提交事务
        session.commit();
        //7.释放资源
        session.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
