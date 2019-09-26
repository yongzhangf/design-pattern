package com.effective.item2;

/**
 * 半圆形烤乳酪馅饼
 */
public class Calzone extends Pizza {

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false; // Default

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        String toppings = super.toString();
        return "@CALZONE@ " + toppings + " / Sauce: " + (this.sauceInside ? "YES" : "NO");
    }
}
