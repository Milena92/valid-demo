package com.milena.validdemo;

import com.mongodb.client.MongoCollection;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final MongoTemplate mongoTemplate;


    @Override
    public User createUser(User user) {
        return mongoTemplate.save(user);
    }

    @Override
    public User updateUser(User user)  {
        return mongoTemplate.save(user);
    }

    @Override
    public List<User> findAllByPostcode(String postcode) {
        return mongoTemplate.find(query(where("address.postcode").is(postcode)), User.class);
    }
}
