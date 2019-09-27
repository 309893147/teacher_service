package com.lss.teacher_manager.mapper.evalution;

import com.lss.teacher_manager.mapper.BaseMapper;
import com.lss.teacher_manager.pojo.evaluation.EvaluationDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EvalutionMapper {
    @Select("select * from evaluation where uid=#{0}")
    List<EvaluationDto> findEvaluationbyuid(String id);

    @Select("select * from evaluation where uid=#{uid} and tid=#{tid}")
    EvaluationDto findEvaluationbyuidandtid(EvaluationDto evaluationDto);

    @Insert("insert INTO evaluation(tid,uid,point,qid1,qid2,qid3,qid4,qid5,qpoint1,qpoint2,qpoint3,qpoint4,qpoint5)values(#{tid},#{uid},#{point},#{qid1},#{qid2},#{qid3},#{qid4},#{qid5},#{qpoint1},#{qpoint2},#{qpoint3},#{qpoint4},#{qpoint5})")
    void insertevalution(EvaluationDto evaluationDto);

    @Select("select * from evaluation where tid=#{0}")
    List<EvaluationDto> findEvaluationbytid(String id);

}
