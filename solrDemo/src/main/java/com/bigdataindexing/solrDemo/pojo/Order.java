package com.bigdataindexing.solrDemo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;


@SolrDocument(collection = "Order")
public class Order {
    @Id
    @Indexed(name = "orderid", type = "long")
    private Long orderid;

    @Indexed(name = "orderName", type = "string")
    private String orderName;

    @Indexed(name = "orderDescription", type = "string")
    private String orderDescription;

    @Indexed(name = "productName", type = "string")
    private String productName;

    @Indexed(name = "customerName", type = "string")
    private String customerName;

    @Indexed(name = "customerMobile", type = "string")
    private String customerMobile;

    public Long getOrderid() {
        return orderid;
    }
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }
    public String getOrderName() {
        return orderName;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerMobile() {
        return customerMobile;
    }
    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }
    public String getOrderDescription() {
        return orderDescription;
    }
    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }
}