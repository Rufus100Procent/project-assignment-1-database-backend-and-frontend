package se.JensenYH.Java.SaltMerch.backendProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.JensenYH.Java.SaltMerch.backendProject.Model.CartItem;
import se.JensenYH.Java.SaltMerch.backendProject.service.CartService;

import java.util.List;

@CrossOrigin("http://localhost:3010")
@RestController
@RequestMapping("/api/v1")
public class CartController {

    @Autowired
    CartService cartService;

    //working

    @GetMapping("/carts/{id}")
    public List<CartItem> getCartContents(@PathVariable int id) {
         return  cartService.selectAllItems(id);
    }

    //Almost done
    @PatchMapping("/carts/{id}")
    ///problem /Cannot convert value of type 'java.lang.String' to required type
    public ResponseEntity<Integer> removeOrAdd(@PathVariable ("id") int id,
                                               @RequestParam("action") String action,
                                               @RequestBody CartItem item) {
        //cartService.removeIteam(id, action , item);
        //if (true) return null;
        /// The column index is out of range: 1, number of columns: 0.] with root cause
        if ("remove".equals(action)) {
            return ResponseEntity.ok(cartService.removeIteam(id, action , item));

        } else if (action.equals("add")) {
            return ResponseEntity.ok(cartService.addIteam(id, action, item));
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    //working
    @DeleteMapping("/carts/{id}{buyout}")
    //DELETE /api/v1/carts/{id}?buyout=true
    public void reStockIteam(@PathVariable int id,
                             @RequestParam("buyout") boolean buyout) {

        if (buyout) {
            cartService.clearCart(true);
            System.out.println("completed");
        } else {
            cartService.restock(id);
            System.out.println("retock");
        }
    }
}
