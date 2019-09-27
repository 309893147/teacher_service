package com.lss.teacher_manager.service.evalution;

import com.lss.teacher_manager.mapper.evalution.EvalutionMapper;
import com.lss.teacher_manager.pojo.evaluation.EvaluationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvalutionService implements EvalutionMapper {
    @Autowired
    private EvalutionMapper evalutionMapper;

    @Override
    public List<EvaluationDto> findEvaluationbyuid(String id) {
        return evalutionMapper.findEvaluationbyuid(id);
    }

    @Override
    public EvaluationDto findEvaluationbyuidandtid(EvaluationDto evaluationDto) {
        return evalutionMapper.findEvaluationbyuidandtid(evaluationDto);
    }

    @Override
    public void insertevalution(EvaluationDto evaluationDto) {
        evalutionMapper.insertevalution(evaluationDto);

    }

    @Override
    public List<EvaluationDto> findEvaluationbytid(String id) {
        return evalutionMapper.findEvaluationbytid(id);
    }
}
