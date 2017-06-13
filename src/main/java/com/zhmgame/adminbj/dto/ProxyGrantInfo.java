package com.zhmgame.adminbj.dto;

/**
 * 代理发放钻石的信息中间层
 */
public class ProxyGrantInfo {
    private String username;
    private int diamondTotal;

    public ProxyGrantInfo() {
    }
    public ProxyGrantInfo(String username, int diamondTotal) {
        this.username = username;
        this.diamondTotal = diamondTotal;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getDiamondTotal() {
        return diamondTotal;
    }
    public void setDiamondTotal(int diamondTotal) {
        this.diamondTotal = diamondTotal;
    }
}
