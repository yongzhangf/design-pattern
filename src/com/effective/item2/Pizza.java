package com.effective.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 第2条：遇到多个构造器参数时，考虑用构建者
 *
 * Builder模式很适合于类的层级结构。对于多个平行类，可以平行使用每个类对应的builder。
 * 抽象的类拥有抽象的builder；非抽象的类拥有非抽象的builder。
 *
 * Builder pattern for class hierarchies
 */
public abstract class Pizza {

    public enum Topping {
        // 火腿、蘑菇、洋葱、胡椒、香肠
        HAM, MUSHROOM, ONINO, PEPPER, SAUSAG
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {

            toppings.add(Objects.requireNonNull(topping));

            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {

        // See Item 50
        toppings = builder.toppings.clone();
    }

    @Override
    public String toString() {
        return "Toppings: " + this.toppings.toString();
    }
}
