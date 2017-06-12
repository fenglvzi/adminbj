package com.zhmgame.adminbj.core.enums;

/**
 * Created by 张译文 on 2017/6/10.
 * 用枚举表示常量数据字典
 */
public enum AppointStateEnum {
    SUCCESS(1,"成功预约"),NO_NUMBER(0,"库存不足"),REPEAT_APPOINT(-1,"重复预约"), INNER_ERROR(-2, "内部错误");

    private int state;
    private String stateInfo;
    private AppointStateEnum(int state, String  stateInfo) {
        this.state=state;
        this.stateInfo=stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static AppointStateEnum stateOfIndex(int index) {
        for (AppointStateEnum state:
                AppointStateEnum.values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AppointStateEnum appointStateEnum = AppointStateEnum.stateOfIndex(-2);
        System.out.println(appointStateEnum);
    }
}
