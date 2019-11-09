package top.lin.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.lin.entity.Account;

import java.util.List;

/**
 * 账户的dao接口
 */
@Repository
public interface AccountMapper {
    //查询所有账户
    @Select("select * from account")
    List<Account> findAll();

    //保存账户信息
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
