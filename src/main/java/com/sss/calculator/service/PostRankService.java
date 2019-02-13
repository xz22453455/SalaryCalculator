package com.sss.calculator.service;

import com.sss.calculator.model.PostRank;
import com.sss.calculator.model.PostRankExample;

import java.util.List;

/**
 * 〈说明〉<br>
 * 〈〉
 *
 * @author mao
 * @Date: 2019/1/26 0026
 * @Description:
 * @since 1.0.0
 */
public interface PostRankService {
    List<PostRank> selectByPostRankExample(PostRankExample example);
}
