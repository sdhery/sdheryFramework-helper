package com.sdhery.module.helper;

import com.sdhery.module.core.service.ISysObjectKeyService;
import com.sdhery.module.user.service.ISysUserService;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-6-8
 * Time: 下午2:59
 * To change this template use File | Settings | File Templates.
 */
public class ServiceManager implements InitializingBean {
    public static ISysObjectKeyService sysObjectKeyService;
    public static ISysUserService sysUserService;


    public void setSysUserService(ISysUserService sysUserService) {
        ServiceManager.sysUserService = sysUserService;
    }

    public void setSysObjectKeyService(ISysObjectKeyService sysObjectKeyService) {
        ServiceManager.sysObjectKeyService = sysObjectKeyService;
    }

    public void afterPropertiesSet() throws Exception {

    }
}
