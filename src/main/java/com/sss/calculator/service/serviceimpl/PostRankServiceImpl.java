/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PostRankServiceImpl
 * Author:   Administrator
 * Date:     2019/1/26 0026 10:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.calculator.service.serviceimpl;

import com.sss.calculator.dao.PostRankDao;
import com.sss.calculator.model.PostRank;
import com.sss.calculator.model.PostRankExample;
import com.sss.calculator.service.PostRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/26 0026
 * @since 1.0.0
 */
@Service
public class PostRankServiceImpl implements PostRankService {
    @Autowired
    PostRankDao postRankDao;

    @Override
    public List<PostRank> selectByPostRankExample(PostRankExample example) {
        return postRankDao.selectByExample(example);
    }
}
