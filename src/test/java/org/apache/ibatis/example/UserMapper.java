package org.apache.ibatis.example;

import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author qibao
 * @since 2019-09-26
 */
public interface UserMapper {

    List<User> listAll(RowBounds rowBounds);

    void dynamicTest( @Param("age") int age, @Param("param1") int param1);

    int insert(@Param("user") User user);
}
