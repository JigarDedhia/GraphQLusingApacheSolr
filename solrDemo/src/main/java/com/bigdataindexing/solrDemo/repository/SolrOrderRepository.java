package com.bigdataindexing.solrDemo.repository;

import com.bigdataindexing.solrDemo.pojo.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface SolrOrderRepository extends SolrCrudRepository<Order, Long> {

    @Query("orderDescription:*?0:*")
    Page<Order> findByOrderDescription(String search, Pageable pageable);

    @Query("orderDescription:*?0* OR orderName:*?0* OR productName:*?0*")
    Page <Order> findByCustomerQuery(String searchTerm, Pageable pageable);

    Order findByOrderid(Long orderid);
}

