package com.socialMedia.SocialMediaApp.Repository;

import com.socialMedia.SocialMediaApp.models.UserModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, ObjectId> {

    UserModel findByEmail(String email);

}
