package com.effective.item2;

/**
 * 第2条：遇到多个构造器参数时，考虑用构建者
 *
 * 在这种模式下，客户端并不直接创建一个目标对象，而是先调用一个包含了所有必要参数的构造器（或静态工厂）进而得到一个builder对象。
 * 接着，客户端调用builder对象提供的类似于setter的方法，并根据喜好开始设置各个想可选参数。
 * 最后，客户端通过调用没有参数的build方法生成了目标对象，这个对象通常是不可变的。
 * 通常来说，这个builder是它构建的类的一个静态内部类。
 */
public class PizzaDemo {

    /**
     * Pizza.Builder是一个带有递归类型参数的泛型类型（条目30）。
     * 它与抽象的self方法一起使得方法链在子类里能很好地运作，而且不用强转类型。Java缺乏一个self类型，
     * 而这种变通可谓是模仿self类型了的惯用方法了。以下是Pizza的两个具体的子类，一个表示纽约风味的pizza，
     * 一个是半圆形烤乳酪馅饼。纽约风味的pizza要求要有一个大小的参数，而半圆形烤乳酪馅饼则需要你指定酱汁是否要在里面
     */
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.LARGE)
                .addTopping(NyPizza.Topping.MUSHROOM)
                .addTopping(NyPizza.Topping.ONINO)
                .build();

        System.out.println(nyPizza.toString());

        Calzone calzone = new Calzone.Builder()
                .addTopping(NyPizza.Topping.HAM)
                .sauceInside().build();

        System.out.println(calzone.toString());

        calzone = new Calzone.Builder()
                .addTopping(NyPizza.Topping.HAM)
                .addTopping(NyPizza.Topping.PEPPER)
                .addTopping(NyPizza.Topping.SAUSAG)
                .build();

        System.out.println(calzone.toString());
    }
}
