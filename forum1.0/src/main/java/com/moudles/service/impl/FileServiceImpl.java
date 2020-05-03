package com.moudles.service.impl;

import com.moudles.entity.File;
import com.moudles.mapper.FileMapper;
import com.moudles.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 上传文件表 服务实现类
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
