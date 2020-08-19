package com.sue.my;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author sue
 * @date 2020/8/19 9:43
 */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
