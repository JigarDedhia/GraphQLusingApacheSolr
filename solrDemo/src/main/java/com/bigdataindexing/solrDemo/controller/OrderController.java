package com.bigdataindexing.solrDemo.controller;

import com.bigdataindexing.solrDemo.pojo.Order;
import com.bigdataindexing.solrDemo.repository.SolrOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    SolrOrderRepository solrOrderRepository;

    @PostMapping("/order")
    public String createOrder(@RequestBody Order order) {
        String description = "Order Created";
        solrOrderRepository.save(order);
        return description;
    }

    @GetMapping("/order/{orderid}")
    public Order readOrder(@PathVariable Long orderid) {
        return solrOrderRepository.findByOrderid(orderid);
    }

    @PutMapping("/order")
    public String updateOrder(@RequestBody Order order) {
        String description = "Order Updated";
        solrOrderRepository.save(order);
        return description;
    }
    @DeleteMapping("/order/{orderid}")
    public String deleteOrder(@PathVariable Long orderid) {
        String description = "Order Deleted";
        solrOrderRepository.delete(solrOrderRepository.findByOrderid(orderid));
        return description;
    }
    @GetMapping("/order/desc/{orderDesc}/{page}")
    public List<Order> findOrder(@PathVariable String orderDesc, @PathVariable int page) {
        return solrOrderRepository.findByOrderDescription(orderDesc, PageRequest.of(page, 2)).getContent();
    }
    @GetMapping("/order/search/{searchTerm}/{page}")
    public List<Order> findOrderBySearchTerm(@PathVariable String searchTerm, @PathVariable int page) {
        return solrOrderRepository.findByCustomerQuery(searchTerm, PageRequest.of(page, 2)).getContent();
    }

}
