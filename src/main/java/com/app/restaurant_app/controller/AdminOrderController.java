//package com.app.restaurant_app.controller;
//
//import com.app.restaurant_app.Exception.OrderException;
//import com.app.restaurant_app.Exception.RestaurantException;
//import com.app.restaurant_app.model.Order;
//import com.app.restaurant_app.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/admin")
//@RequiredArgsConstructor
//public class AdminOrderController {//OK
//
//
//    private final OrderService orderService;
//    private final UserService userService;
//
//
//    @DeleteMapping("/order/{orderId}")
//    public ResponseEntity<String> deleteOrder(@PathVariable Long orderId) throws OrderException {
//        if (orderId != null) {
//            orderService.cancelOrder(orderId);
//            return ResponseEntity.ok("Order deleted with id)" + orderId);
//        } else {
//			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
//		}
//    }
//
//
//    @GetMapping("/order/restaurant/{restaurantId}")
//    public ResponseEntity<List<Order>> getAllRestaurantOrders(
//            @PathVariable Long restaurantId,
//            @RequestParam(required = false) String order_status) throws OrderException, RestaurantException {
//
//        List<Order> orders = orderService.
//                getOrdersOfRestaurant(restaurantId, order_status);
//
////    		System.out.println("ORDER STATUS----- "+orderStatus);
//        return ResponseEntity.ok(orders);
//
//
//    }
//
//    @PutMapping("/orders/{orderId}/{orderStatus}")
//    public ResponseEntity<Order> updateOrders(@PathVariable Long orderId, @PathVariable String orderStatus) throws OrderException, RestaurantException {
//
//        Order orders = orderService.updateOrder(orderId, orderStatus);
//        return ResponseEntity.ok(orders);
//
//    }
//
//}
