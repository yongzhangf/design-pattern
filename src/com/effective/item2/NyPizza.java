package com.effective.item2;

import java.util.Objects;

/**
 * 纽约风味的pizza
 */
public class NyPizza extends Pizza {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size  = builder.size;
    }

    @Override
    public String toString() {
        String toppings = super.toString();
        return "@NY PIZZA@ " + toppings + " / Size: " + this.size.toString();
    }
}
