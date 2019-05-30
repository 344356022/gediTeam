package com.dao;

import com.entity.CmfzAdmin;


import java.util.List;

/**
 * @Author: renpu
 * @Date: 2019/2/26 19:04
 * @Description:
 */

public interface CmfzAdminDao {
    public List<CmfzAdmin> selectAll();

    public CmfzAdmin selectOne();

}
