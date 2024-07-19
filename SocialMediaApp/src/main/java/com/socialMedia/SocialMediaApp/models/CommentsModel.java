package com.socialMedia.SocialMediaApp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "comments")
public class CommentsModel {
    @Id
    private ObjectId id;
    private String content;
    private LocalDateTime createdAt;
    private String postId;
    private String userId;

}
