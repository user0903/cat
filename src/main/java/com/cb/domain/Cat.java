package com.cb.domain;


public class Cat {

    /** 汽车编号 */
    private String cid;

    /** 汽车品牌 */
    private String cname;

    /** 汽车价格 */
    private Double cprice;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getCprice() {
        return cprice;
    }

    public void setCprice(Double cprice) {
        this.cprice = cprice;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", cprice=" + cprice +
                '}';
    }
}
