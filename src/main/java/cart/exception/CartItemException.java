package cart.exception;

import cart.domain.Member;
import cart.entity.CartItemEntity;

public class CartItemException extends RuntimeException {

    public CartItemException(String message) {
        super(message);
    }

    public static class IllegalMember extends CartItemException {
        public IllegalMember(CartItemEntity cartItemEntity, Member member) {
            super("Illegal member attempts to cart; cartItemId=" + cartItemEntity.getId() + ", memberId=" + member.getId());
        }
    }
}
