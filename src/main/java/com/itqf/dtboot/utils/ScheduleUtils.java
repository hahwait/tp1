package com.itqf.dtboot.utils;

import com.alibaba.fastjson.JSON;
import com.itqf.dtboot.entity.ScheduleJob;
import com.itqf.dtboot.exception.RRExcetion;
import com.itqf.dtboot.job.MyJob;
import org.quartz.*;

/**
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                            O\ = /O
 * //                        ____/`---'\____
 * //                      .   ' \\| |// `.
 * //                       / \\||| : |||// \
 * //                     / _||||| -:- |||||- \
 * //                       | | \\\ - /// | |
 * //                     | \_| ''\---/'' | |
 * //                      \ .-\__ `-` ___/-. /
 * //                   ___`. .' /--.--\ `. . __
 * //                ."" '< `.___\_<|>_/___.' >'"".
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /
 * //         ======`-.____`-.___\_____/___.-`____.-'======
 * //                            `=---='
 * //
 * //         .............................................
 * //                  佛祖镇楼                  BUG辟易
 * //          佛曰:
 * //                  写字楼里写字间，写字间里程序员；
 * //                  程序人员写程序，又拿程序换酒钱。
 * //                  酒醒只在网上坐，酒醉还来网下眠；
 * //                  酒醉酒醒日复日，网上网下年复年。
 * //                  但愿老死电脑间，不愿鞠躬老板前；
 * //                  奔驰宝马贵者趣，公交自行程序员。
 * //                  别人笑我忒疯癫，我笑自己命太贱；
 * //                  不见满街漂亮妹，哪个归得程序员？
 *
 * @Description: 定时任务的工具类
 * 真正的任务的新增，删除，修改，暂停，恢复，执行等功能
 * @Company: 千锋互联
 * @Author: 李丽婷
 * @Date: 2019/1/14
 * @Time: 上午11:21
 */
public class ScheduleUtils {


    public static void createSchedule(ScheduleJob scheduleJob, Scheduler scheduler){

        //scheduleJob  beanName(任务类)  methodName(定时任务执行的方法)

        try {
            //1,创建JobDetail
            //job的名称是唯一的，如何保证唯一？
            JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity(SysConstant.JOB_NAME_PREFIX+scheduleJob.getJobId()).build();

            //在MyJob类需要知道该调用哪个beanName的什么方法??
            //传递参数?
            //how??
            String json = JSON.toJSONString(scheduleJob);
            jobDetail.getJobDataMap().put(SysConstant.SCHEDULE_JOB_KEY,json);

            //2,创建触发器
            Trigger trigger = TriggerBuilder.newTrigger().
                    withSchedule(CronScheduleBuilder.cronSchedule
                            (scheduleJob.getCronExpression())).withIdentity(SysConstant.TRIGGER_NAME_PREFIX+scheduleJob.getJobId()).build();
            //3,创建Schedule对象
            //在QuartzConfig中已经创建了
            //4,注册触发器和JobDetail
            scheduler.scheduleJob(jobDetail,trigger);
            //5,启动任务
            //  schedulerFactoryBean.setAutoStartup(true);//定时任务是否自动启动 自动启动
            //scheduler.start();

        } catch (SchedulerException e) {
            throw  new RRExcetion("创建任务失败，请联系管理员");
        }

    }


    /**
     * 只运行一次
     * @param scheduler
     * @param jobId
     */
    public  static  void  runTask(Scheduler scheduler,long jobId){

        try {
            scheduler.triggerJob(JobKey.jobKey(SysConstant.JOB_NAME_PREFIX+jobId));
            //scheduler.start();

        } catch (SchedulerException e) {
           throw  new RRExcetion("运行任务失败，请联系管理员");
        }
    }

    public  static  void  pauseTask(Scheduler scheduler,long jobId){

        try {
            scheduler.pauseJob(JobKey.jobKey(SysConstant.JOB_NAME_PREFIX+jobId));

        } catch (SchedulerException e) {
            throw  new RRExcetion("暂停任务失败，请联系管理员");
        }
    }


    public static void resumeTask(Scheduler scheduler,long jobId){


        try {
            scheduler.resumeJob(JobKey.jobKey(SysConstant.JOB_NAME_PREFIX+jobId));
            //scheduler.start();

        } catch (SchedulerException e) {
            throw  new RRExcetion("运行任务失败，请联系管理员");
        }

    }
    public static void deleteTask(Scheduler scheduler,long jobId){


        try {
            scheduler.deleteJob(JobKey.jobKey(SysConstant.JOB_NAME_PREFIX+jobId));

        } catch (SchedulerException e) {
            throw  new RRExcetion("运行任务失败，请联系管理员");
        }

    }


    /**
     * 修改
     * @param scheduler
     * @param scheduleJob
     */
    public static void updateTask(Scheduler scheduler,ScheduleJob scheduleJob){
        try {
            //得到触发器的key
            TriggerKey triggerKey = TriggerKey.triggerKey(SysConstant.TRIGGER_NAME_PREFIX+scheduleJob.getJobId());

            //得到原来的触发器对象
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);

            //替换触发器的表达式
            trigger = trigger.getTriggerBuilder().withSchedule
                    (CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression())).build();

            //重置触发器
            scheduler.rescheduleJob(triggerKey,trigger);


        } catch (SchedulerException e) {
            throw  new RRExcetion("修改任务失败，请联系管理员");
        }

    }








}
