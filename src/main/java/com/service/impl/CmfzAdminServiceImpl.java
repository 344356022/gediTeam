package com.service.impl;
import com.dao.CmfzAdminDao;
import com.entity.CmfzAdmin;
import com.service.CmfzAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: renpu
 * @Date: 2019/2/26 20:17
 * @Description:
 */
@Service
@Transactional
public class CmfzAdminServiceImpl implements CmfzAdminService {
private Logger loggerFactory= LoggerFactory.getLogger(CmfzAdminServiceImpl.class);

    @Autowired
    private CmfzAdminDao adminDao;


    @Override
    public List<CmfzAdmin> selectAll() {
        return adminDao.selectAll();
    }

    @Override
    public CmfzAdmin selectOne() {
        return adminDao.selectOne();
    }
}
