package cc.bricker.iblog.mapper;

import cc.bricker.iblog.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author bricker
 * @date 2020/5/27
 */
@Mapper
public interface UserMapper {

    User selectByLogin(String loginName);
}
