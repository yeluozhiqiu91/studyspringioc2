package org.study.spring.factorybean;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 17:22
 */

/**
 *
 * 数据库操作对象
 */
public interface DBOperation<T extends DBEntity> {

    int save(T t);

    int update(T t);

    int delete(T t);

    T select(Integer id);


}
