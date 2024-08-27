package com.feiniaojin.gracefulresponse.advice.lifecycle.response;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;

/**
 * 异常处理后的回调
 *
 * @author qinyujie
 */
public interface AfterResponseBodyAdviceProcess {
    void call(Object body,
              MethodParameter returnType,
              MediaType selectedContentType,
              Class<? extends HttpMessageConverter<?>> selectedConverterType,
              ServerHttpRequest request,
              ServerHttpResponse response);
}
