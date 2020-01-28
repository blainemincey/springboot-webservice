package org.mongodb.sbws.service;

import org.mongodb.sbws.db.MyMongoOperations;
import org.mongodb.sbws.model.HighClaimSourceModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class HighClaimAmountService {

    @Autowired
    private MyMongoOperations myMongoOperations;

    // Logger component
    private static final Logger log = LoggerFactory.getLogger(HighClaimAmountService.class);

    public String process(HighClaimSourceModel model){
        log.info("Process high claim amount.");

        // add additional fields for route and routeProcessDate
        model.setRoute("kafka-http");
        model.setRouteProcessDate(new java.util.Date());

        MongoOperations mongoOps = myMongoOperations.getMongoOperations();

        HighClaimSourceModel insertedClaimModel =
                mongoOps.insert(model);

        String message = "Inserted high claim model in masterClaimsCollection with _id: " + insertedClaimModel.get_id();

        log.info(message);

        return message;
    }
}
