package com.example.satokenquickdemo;

/**
 * created by on 2021/9/16
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-09-16-23:47
 */

import cn.dev33.satoken.util.SaTokenConsts;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试专用Controller
 */
@RestController
public class TestController {
    // 浏览器访问测试： http://localhost:8081
    @RequestMapping({"/", "/index"})
    public String index() {
        String str = "<br />"
                + "<h1 style='text-align: center;'>资源页 （登录后才可进入本页面） </h1>"
                + "<hr/>"
                + "<p style='text-align: center;'> Sa-Token " + SaTokenConsts.VERSION_NO + " </p>";
        return str;
    }
}

