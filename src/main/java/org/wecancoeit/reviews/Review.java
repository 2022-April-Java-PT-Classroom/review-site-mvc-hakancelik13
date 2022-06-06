package org.wecancoeit.reviews;


public class Review {
    private Long id;
    private String name;
    private String description;

    //setter
    public Review(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //getter
    public Long getId() {
        return id;
    }

    //getter
    public String getName() {
        return name;
    }

    //getter
    public String getDescription() {
        return description;
    }
}
