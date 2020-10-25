package com.sishuok.jiangzh.archi.shopping.permit.dispatcher.factory;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.*;
import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.impl.permit.PermitServiceImpl;
import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.impl.resource.ResourceServiceImpl;
import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.impl.resourcedispatcher.ResourceDispatcherServiceImpl;
import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.impl.resourcepermit.ResourcePermitServiceImpl;
import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.impl.role.RoleServiceImpl;
import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.impl.user.UserServiceImpl;
import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.impl.userrole.UserRoleServiceImpl;

public class PermitFactory {

    public static UserServiceAPI createUserService(){
        return new UserServiceImpl();
    }

    public static RoleServiceAPI createRoleService(){
        return new RoleServiceImpl();
    }

    public static UserRoleServiceAPI createUserRoleService(){
        return new UserRoleServiceImpl();
    }

    public static ResourceServiceAPI createResourceService(){
        return new ResourceServiceImpl();
    }

    public static PermitServiceAPI createPermitService(){
        return new PermitServiceImpl();
    }

    public static ResourcePermitServiceAPI createResourcePermitService(){
        return new ResourcePermitServiceImpl();
    }

    public static ResourceDispatcherServiceAPI createResourceDispatcherService(){
        return new ResourceDispatcherServiceImpl();
    }

}
