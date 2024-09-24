package org.kele.aggregatecloud.admin.exception;

import lombok.extern.slf4j.Slf4j;
import org.kele.aggregatecloudcommon.Result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
public class GlobeEception {
    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        log.error("全局异常捕获", e);
        return Result.error(e.getMessage());
    }
}
