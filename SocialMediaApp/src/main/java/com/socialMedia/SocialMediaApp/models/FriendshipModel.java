package com.socialMedia.SocialMediaApp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "friendships")
public class FriendshipModel {

    @Id
    private String id;
    private String userId;
    private String friendId;
    private LocalDateTime createdAt;

}
