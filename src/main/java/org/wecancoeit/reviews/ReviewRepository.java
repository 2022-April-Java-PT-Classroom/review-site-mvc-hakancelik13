package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {
    Map<Long, Review> reviewsList=new HashMap<>();

    //constructor to handle our database
    public ReviewRepository() {
        Review review1 = new Review(1L, "BMW X5", "It's a best SUV I have driven so far.");
        Review review2 = new Review(2L, "Mercedes GLE", " I like the car so far.");
        Review review3 = new Review(3L, "Toyota Highlander", "The best car ever i driven!");
        reviewsList.put(review1.getId(), review1);
        reviewsList.put(review2.getId(), review2);
        reviewsList.put(review3.getId(), review3);
    }

    //constructor for testing purposes only ... uses varArgs to add none or as many objects as we want
    public ReviewRepository(Review ...reviewsToAdd){
        for(Review review:reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }

    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
