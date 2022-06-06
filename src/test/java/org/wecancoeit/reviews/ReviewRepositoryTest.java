package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {
    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "Model name", "Review");
    private Review reviewTwo = new Review(2L, "Model name", "Review");

    @Test
    public void shouldFindAllReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review findReviewOne = underTest.findOne(1L);
        assertEquals(reviewOne, findReviewOne);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}
