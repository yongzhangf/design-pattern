package com.designpattern.prototype.entity;

// 1.（抽象类或者接口）实现 java.lang.Cloneable 接口
public abstract class PrintedMatter implements Cloneable {

    protected String type;
    protected String name;
    protected String content;

    public PrintedMatter() {
        this.type = "ORIGINAL";
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getContent() {
        return this.content;
    }

    // 2.定义复制现有实例来生成新实例的方法
    public PrintedMatter clone() {
        PrintedMatter clone = null;
        try {
            clone = (PrintedMatter)super.clone();
            clone.type = "COPY";
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
