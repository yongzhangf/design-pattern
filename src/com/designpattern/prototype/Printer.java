package com.designpattern.prototype;

import com.designpattern.prototype.entity.PrintedMatter;

import java.util.Hashtable;

public class Printer {

    private static Hashtable<String, PrintedMatter> originalCache = new Hashtable<>();

    // 提供一个获取新实例的方法
    public static PrintedMatter copy(Class clazz) {

        // 提供一个找出正确实例原型的方法
        PrintedMatter printedMatter = originalCache.get(clazz.getName());

        // 委托复制实例的方法生成新实例。
        return printedMatter.clone();
    }

    // 提供一个创建原实例的方法
    public static void scan(PrintedMatter original) {

        String keyName = original.getClass().getName();
        if (!originalCache.containsKey(keyName)) {
            originalCache.put(keyName, original);
        }
    }
}
