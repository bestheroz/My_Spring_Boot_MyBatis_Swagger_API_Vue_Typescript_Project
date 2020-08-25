package com.github.bestheroz.sample.api.menu;

import com.github.bestheroz.standard.common.response.ApiResult;
import com.github.bestheroz.standard.common.response.Result;
import com.github.bestheroz.standard.common.util.AuthenticationUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/menus")
public class MenuController {
    @Resource private MenuService menuService;

    @GetMapping(value = "drawer")
    ResponseEntity<ApiResult> getDrawerList() {
        return Result.ok(this.menuService.getDrawerList(AuthenticationUtils.getLoginVO().getAuthority()));
    }
}
