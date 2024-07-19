package com.socialMedia.SocialMediaApp.Repository;

import com.socialMedia.SocialMediaApp.models.PostModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SocialMediaRepo extends MongoRepository<PostModel, ObjectId> {}
