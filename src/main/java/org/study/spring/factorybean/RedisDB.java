package org.study.spring.factorybean;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 17:25
 */
public class RedisDB implements DBOperation<RedisDBEntity>{
    public int save(RedisDBEntity t) {
        System.out.println("save this object"+t.getJsonStr());
        return 1;
    }

    public int update(RedisDBEntity t) {
        System.out.println("update this object"+t.getJsonStr());
        return 0;
    }

    public int delete(RedisDBEntity t) {
        System.out.println("delete this object"+t.getJsonStr());
        return 1;
    }

    public RedisDBEntity select(Integer id) {
        System.out.println("select this object by id " + id);
        return new RedisDBEntity();
    }
}
