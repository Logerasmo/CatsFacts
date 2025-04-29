package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Cat {
    public String id;
    public String text;
    public String type;
    public String user;
    public Integer upvotes;

    public Cat(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public Integer getUpvotes(){
        return upvotes;
    }

    @Override
    public String toString() {
        return "Cat" +
                "\n id=" + id +
                "\n text=" + text +
                "\n type=" + type +
                "\n user=" + user +
                "\n upvotes=" + upvotes;
    }
}
