package cc.bricker.iblog.service.interfaces;

import cc.bricker.iblog.entity.User;
import cc.bricker.iblog.model.ExecResult;

/**
 * @author bricker
 * @date 2020/5/27
 */
public interface IUserService {

    ExecResult<User> login(String loginName, String password);
}
