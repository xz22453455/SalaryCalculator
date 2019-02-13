package com.sss.calculator.dao;

import java.util.List;

import com.sss.calculator.model.PostRank;
import com.sss.calculator.model.PostRankExample;
import org.apache.ibatis.annotations.Param;

public interface PostRankDao {
    int countByExample(PostRankExample example);

    int deleteByExample(PostRankExample example);

    int insert(PostRank record);

    int insertSelective(PostRank record);

    List<PostRank> selectByExample(PostRankExample example);

    int updateByExampleSelective(@Param("record") PostRank record, @Param("example") PostRankExample example);

    int updateByExample(@Param("record") PostRank record, @Param("example") PostRankExample example);
}