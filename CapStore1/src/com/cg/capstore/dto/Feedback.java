package com.cg.capstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
    
    @Id
    @Column(name="feedback_id", length=10)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer feedbackId;
    
    @Column(name="user_id", length=10)
    private String userId;
    
    @Column(name="order_id", length=10)
    private String orderId;
    
    @Column(name="prod_id", length=10)
    private String productId;
    
    @Column(name="comments", length=50)
    private String reviews;
    
    @Column(name="rating", length=1)
    private Integer rating; 

    

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
    
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Feedback() {
        super();
    }

    public Feedback(Integer feedbackId, String userId, String orderId,
            String productId, String reviews, Integer rating) {
        super();
        this.feedbackId = feedbackId;
        this.userId = userId;
        this.orderId = orderId;
        this.productId = productId;
        this.reviews = reviews;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Feedback [feedbackId=" + feedbackId + ", userId=" + userId
                + ", orderId=" + orderId + ", productId=" + productId
                + ", reviews=" + reviews + ", rating=" + rating + "]";
    }

    
    

}
