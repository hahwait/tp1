package com.itqf.dtboot.utils;

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
 * @Description:系统常量
 * @Company: 千锋互联
 * @Author: 李丽婷
 * @Date: 2019/1/10
 * @Time: 下午12:00
 */
public class SysConstant {

    public static final String CAPTCHA_KEY="KAPTCHA";

    public static final String JOB_NAME_PREFIX="myJob_";
    public static final String TRIGGER_NAME_PREFIX="myTrigger_";

    public static final String SCHEDULE_JOB_KEY="schedule_job_key";


    //枚举
    public enum ScheduleStatus{

        //定义两个常量 分别代表定时任务的两个状态  正常和暂停状态
        NOMAL((byte)0),//正常
        PAUSE((byte)1);//暂停

        private  byte value;

        ScheduleStatus(byte value){
            this.value = value;
        }

        public byte getValue() {
            return value;
        }
    }

}
