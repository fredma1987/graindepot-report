package com.zhoubi.graindepot.mapper;

import com.zhoubi.graindepot.bean.UreportFileEntity;

import java.util.List;

/**
 * Created by Administrator on 2019/3/12/012.
 */
public interface UreportFileMapper {
    /**
     *  根据报表名称检查报表是否存在
     * @param ureportname 报表名称
     * @return
     */
    int checkExistByName(String ureportname);

    /**
     *  根据报表名称查询报表
     * @param ureportname 报表名称
     * @return
     */
    UreportFileEntity queryUreportFileEntityByName(String ureportname);

    /**
     * 查询全部报表
     * @return
     */
    List<UreportFileEntity> queryReportFileList();

    /**
     * 根据报表名称删除报表
     * @param ureportname
     * @return
     */
    int deleteReportFileByName(String ureportname);


    /**
     *  保存报表
     */
    int insertReportFile(UreportFileEntity entity);

    /**
     *  更新报表
     * @param entity
     * @return
     */
    int updateReportFile(UreportFileEntity entity);
}
