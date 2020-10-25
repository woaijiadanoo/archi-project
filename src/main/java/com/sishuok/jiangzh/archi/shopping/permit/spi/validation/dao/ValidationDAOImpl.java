package com.sishuok.jiangzh.archi.shopping.permit.spi.validation.dao;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.vo.*;
import com.sishuok.jiangzh.archi.shopping.permit.spi.SpiAbstrctFactory;
import com.sishuok.jiangzh.archi.shopping.permit.spi.dispatcher.dao.DispatcherDAO;

import java.util.List;

public class ValidationDAOImpl implements ValidationDAO{

    private DispatcherDAO dao = SpiAbstrctFactory.getInstance().createDispatcherDAO();

    @Override
    public String getResourceIdByPath(String resourcePath) {
        ResourceModel rm = new ResourceModel();
        rm.setResourcePath(resourcePath);

        List<ResourceModel> rms = dao.getByCondition(rm, false, 0, 0);
        if(rms!=null && rms.size()>0){
            ResourceModel resourceModel = rms.get(0);
            return resourceModel.getUuid();
        }

        return null;
    }

    @Override
    public String getPermitIdByName(String name) {
        PermitModel permitModel = new PermitModel();
        permitModel.setPermitStr(name);
        List<PermitModel> rms = dao.getByCondition(permitModel, false, 0, 0);
        if(rms!=null && rms.size()>0){
            PermitModel permitModel1 = rms.get(0);
            return permitModel1.getUuid();
        }
        return null;
    }

    @Override
    public String getRPermitIdByResIdAndPerId(String resourceId, String permitId) {
        ResourcePermitModel model = new ResourcePermitModel();
        model.setResourceId(resourceId);
        model.setPermitId(permitId);

        List<ResourcePermitModel> rms = dao.getByCondition(model, false, 0, 0);
        if(rms!=null && rms.size()>0){
            ResourcePermitModel resultModel = rms.get(0);
            return resultModel.getUuid();
        }

        return null;
    }

    @Override
    public boolean hasPermit(String userId, String resourcePermitId) {
        ResourceDispatcherModel model = new ResourceDispatcherModel();
        model.setOwnerId(userId);
        model.setResourcePermitId(resourcePermitId);

        List<ResourceDispatcherModel> rms = dao.getByCondition(model, false, 0, 0);
        if(rms!=null && rms.size()>0){
            return true;
        }
        return false;
    }

    @Override
    public String getRoleByTrueName(String trueName) {
        RoleModel model = new RoleModel();
        model.setShowName(trueName);

        List<RoleModel> rms = dao.getByCondition(model, false, 0, 0);
        if(rms!=null && rms.size()>0){
            RoleModel resultModel = rms.get(0);
            return resultModel.getUuid();
        }

        return null;
    }

    @Override
    public boolean isRole(String userId, String roleId) {
        UserRoleModel model = new UserRoleModel();
        model.setUserId(userId);
        model.setRoleId(roleId);

        List<UserRoleModel> rms = dao.getByCondition(model, false, 0, 0);
        if(rms!=null && rms.size()>0){
            return true;
        }
        return false;
    }
}
