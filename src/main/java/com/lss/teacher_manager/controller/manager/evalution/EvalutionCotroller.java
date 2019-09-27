package com.lss.teacher_manager.controller.manager.evalution;

import com.lss.teacher_manager.controller.BaseController;
import com.lss.teacher_manager.pojo.evaluation.EvaluationDto;
import com.lss.teacher_manager.service.evalution.EvalutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/e")
public class EvalutionCotroller extends BaseController {
    @Autowired
    private EvalutionService evalutionService;
//    查看自己的评教的结果
    @PostMapping("/f")
    public List<EvaluationDto> findevaluationbyid(@RequestParam String id){
        return evalutionService.findEvaluationbyuid(id);
    }
//    将评教结果保存入数据库返回结果为0时表示已经评教过了，返回结果为1时表示成功，结果为2时表示失败
    @PostMapping("/i")
    public int insertEvluation(@RequestBody EvaluationDto evaluationDto){
        if(evalutionService.findEvaluationbyuidandtid(evaluationDto)!=null){
            return 0;
        }else{


        evalutionService.insertevalution(evaluationDto);
        if (evalutionService.findEvaluationbyuidandtid(evaluationDto)!=null){
            return 1;
        }else
        {
            return 2;
        }
        }
    }
//    查看教师自己被评教的结果
    @PostMapping("/t")
    public List<EvaluationDto> findEvaluationbytid(String id){
        return evalutionService.findEvaluationbytid(id);
    }
}
