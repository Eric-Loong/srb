package com.eric.srb.common.exception;

import com.eric.srb.common.result.R;
import com.eric.srb.common.result.ResponseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 */
@RestControllerAdvice
@Slf4j
public class UnifiedExceptionHandler {
    @ExceptionHandler(value = BusinessException.class)
    public R handleException(BusinessException e) {//自定义统一异常处理函数
        log.error(e.getMessage(), e);
        return R.error().code(e.getCode()).message(e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public R handleException(Exception e) {//通用异常处理函数
        log.error(e.getMessage(), e);
        return R.error();
    }

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public R hanleException(BadSqlGrammarException e) {//sql语法异常处理
        log.error(e.getMessage(), e);
        return R.setResult(ResponseEnum.BAD_SQL_GRAMMAR_ERROR);
    }
}
