package com.steven.cns.ddd.interfaces.facade;

import com.steven.cns.infra.common.resp.Resp;
import com.steven.cns.log.annotation.ReqLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author steven.cao
 */
@RestController
@Slf4j
@Api(tags = "用户")
public class UserFacade {

    @ApiOperation("根据用户Id查询用户")
    @GetMapping("/user/{id}")
    @ReqLog(printHeader = true)
    public Resp<String> getUserInfo(@PathVariable("id") Long id) {
        log.info("id is:{}", id);
        return Resp.success("hello,world~~");
    }
}
