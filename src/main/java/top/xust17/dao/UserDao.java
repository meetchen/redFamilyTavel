package top.xust17.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.xust17.domain.User;

import java.util.List;

/**
 * @author fitz
 */
@Repository
public interface UserDao {
    /**
     *
     * @return 所有账户
     */
    @Select("select user_id as userId,user_name as userName, user_password as userPassword from user")
    public List<User> findAll();

    @Insert("insert into user(user_name,user_password) values(#{userName},#{userPassword}) ")
    public void saveUser(User user);

    @Select(" select user_id as userId,user_name as userName, user_password as userPassword   " +
            " from user where user_name = #{userName}  ")
    User findByUserName(User user);
}
