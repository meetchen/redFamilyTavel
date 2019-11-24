package top.xust17.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.xust17.domain.Result;
/**
 * @Description
 * @Author Chen JiaChao
 * @Date 2019-11-23 11:37:09
 **/
@ControllerAdvice
public class BaseExceptionHandler {

    /**
     * @Description
     * @Param:
     * @Return:
     * @Author: Chen JiaChao
     * @Date: 2019/11/23 11:36
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        System.out.println("调用了公共异常处理类");
        return new Result(1,e.getMessage());
    }

}
