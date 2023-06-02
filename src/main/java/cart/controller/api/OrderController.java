package cart.controller.api;

import cart.auth.Auth;
import cart.controller.dto.request.OrderRequest;
import cart.controller.dto.response.OrderResponse;
import cart.controller.dto.response.OrderThumbnailResponse;
import cart.domain.Member;
import cart.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@Auth final Member member, @RequestBody @Valid final OrderRequest request) {
        final long id = orderService.save(member, request);
        return ResponseEntity.created(URI.create("/orders/" + id)).build();
    }

    @GetMapping
    public ResponseEntity<List<OrderThumbnailResponse>> getAll(@Auth final Member member) {
        final List<OrderThumbnailResponse> response = orderService.findByMember(member);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> get(@Auth final Member member, @PathVariable final long id) {
        final OrderResponse response = orderService.findById(member, id);
        return ResponseEntity.ok(response);
    }
}
