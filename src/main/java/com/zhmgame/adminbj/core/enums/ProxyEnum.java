package com.zhmgame.adminbj.core.enums;

/**
 * 数据常量字典，0.1.2表示用户的等级
 */
public enum ProxyEnum {
    TWO_LEVEL(0,"普通用户"),ONE_LEVEL(1,"一级代理"),ZERO_LEVEL(0,"普通用户");
    private int state;
    private String stateInfo;
    private ProxyEnum(int state, String  stateInfo) {
        this.state=state;
        this.stateInfo=stateInfo;
    }
    public int getState() {
        return state;
    }
    public String getStateInfo() {
        return stateInfo;
    }
    /**
     * 返回用户数据的数量
     * @param index 对应的是0、1、2用户的等级，
     *              0是普通用户
     *              1是一级代理
     *              2是二级代理
     * @return
     */
    public static ProxyEnum stateOfIndex(int index) {
        for (ProxyEnum state:
                ProxyEnum.values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(ProxyEnum.stateOfIndex(1));
    }
}
