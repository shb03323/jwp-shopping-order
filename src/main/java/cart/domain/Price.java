package cart.domain;

import java.util.Objects;

public final class Price {

    private static final int BOUNDARY_AMOUNT = 0;

    private final int amount;

    public Price(final int amount) {
        validateNotNegative(amount);
        this.amount = amount;
    }

    public Price add(final Price price) {
        return new Price(amount + price.amount);
    }

    public Price subtract(final Price price) {
        return new Price(amount - price.amount);
    }

    public Price multiply(final int count) {
        return new Price(amount * count);
    }

    public boolean isGreaterThanOrEqualTo(final Price price) {
        return amount >= price.amount;
    }

    private void validateNotNegative(final int amount) {
        if (amount < BOUNDARY_AMOUNT) {
            throw new RuntimeException("금액은 음수일 수 없습니다.");
        }
    }

    public static Price getBigger(final Price price1, final Price price2) {
        if (price1.isGreaterThanOrEqualTo(price2)) {
            return price1;
        }
        return price2;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Price)) return false;
        Price price = (Price) o;
        return amount == price.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "Price{" +
                "amount=" + amount +
                '}';
    }
}
