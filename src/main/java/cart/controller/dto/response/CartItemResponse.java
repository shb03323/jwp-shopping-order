package cart.controller.dto.response;

import cart.domain.CartItem;

public class CartItemResponse {

    private final long id;
    private final int quantity;
    private final ProductResponse product;

    private CartItemResponse(final long id, final int quantity, final ProductResponse product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

    public static CartItemResponse of(final CartItem cartItem) {
        return new CartItemResponse(
                cartItem.getId(),
                cartItem.getQuantity().getValue(),
                ProductResponse.of(cartItem.getProduct())
        );
    }

    public Long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductResponse getProduct() {
        return product;
    }
}
