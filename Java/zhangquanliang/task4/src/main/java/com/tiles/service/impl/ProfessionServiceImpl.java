package com.tiles.service.impl;

import com.tiles.dao.ProfessionDao;
import com.tiles.pojo.Profession;
import com.tiles.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author suger
 * @date 2018/11/16 23:32
 * 职业service 的实现
 */
@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    ProfessionDao professionDao;
    /**
     * 查询各个职业
     * @return
     */
    @Override
    public List<Profession> listProfession() {
        return professionDao.listProfession();
    }

    /**
     * 各个职业在学弟子人数
     *
     * @return
     */
    @Override
    public int getOnlineCount() {
        return professionDao.getCount();
    }

}