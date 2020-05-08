package com.commons.task;

import com.commons.utils.date.DateUtils;
import com.moudles.article.service.impl.ArticleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 月定时任务
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-08
 */
@Component
@EnableScheduling
public class MonthTask {

    private Logger log = LoggerFactory.getLogger(MonthTask.class);

    @Autowired
    ArticleServiceImpl articleService;

    //每月最后一日的23:59触发此调度
    @Scheduled(cron = "0 59 23 L * ?")
    public void deleteArticles() {
        articleService.deleteByFlags();
        log.info("delete articles on {}", DateUtils.getCurrentDateTime());
    }
}
