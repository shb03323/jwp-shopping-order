package cart.controller.api;

import cart.auth.Auth;
import cart.controller.dto.request.OrderRequest;
import cart.domain.Member;
import cart.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@Auth final Member member, @RequestBody final OrderRequest request) {
        final long id = orderService.save(member, request);
        return ResponseEntity.created(URI.create("/orders/" + id)).build();
    }
}