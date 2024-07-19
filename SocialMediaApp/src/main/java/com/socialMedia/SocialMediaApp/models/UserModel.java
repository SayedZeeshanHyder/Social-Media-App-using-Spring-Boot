package com.socialMedia.SocialMediaApp.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class UserModel{

        @Id
        private ObjectId id;
        private String username;
        private String email;
        private String password;
        private String bio;
        private String profilePictureUrl;
        private List<PostModel> posts = new ArrayList<>();
        private List<FriendshipModel> friendships = new ArrayList<>();

}