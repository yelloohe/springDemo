package com.test.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
* @author huanghe E-mail:huanghe929@163.com
* @version 创建时间：2018年1月13日 下午11:06:16
* 类说明:
*/
@Configuration
@EnableScheduling
public class SchedulingConfig {
	
	
    public final static long ONE_Minute =  60 * 1000;//一分钟
    
	//@Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
	public void scheduler() {
	System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
	}

    
    //@Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
        System.out.println("fixedDelay是当任务执行完毕后1分钟在执行");
    }
    
   // @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
        System.out.println("fixedRate就是每多次分钟一次，不论你业务执行花费了多少时间。我都是1分钟执行1次");
    }

    

}
