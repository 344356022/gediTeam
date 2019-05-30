package com.service;


import com.entity.CmfzAdmin;

import java.util.List;
import java.util.Map;

/**
 * @Author: renpu
 * @Date: 2019/2/26 20:16
 * @Description:
 */
public interface CmfzAdminService {

    public List<CmfzAdmin> selectAll();

    public CmfzAdmin selectOne();

}
