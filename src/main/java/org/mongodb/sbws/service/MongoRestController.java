package org.mongodb.sbws.service;

import org.mongodb.sbws.model.HighClaimSourceModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/processHighClaimAmount")
public class MongoRestController {

    @Autowired
    private HighClaimAmountService highClaimAmountService;

    // Logger component
    private static final Logger log = LoggerFactory.getLogger(MongoRestController.class);

    @PostMapping(value = "/over75", consumes = "application/json", produces = "application/json")
    public String postHighClaim(@RequestBody HighClaimSourceModel highClaimSourceModel) {
        log.info("Received Post message.");
        log.info(highClaimSourceModel.toString());

        return highClaimAmountService.process(highClaimSourceModel);
    }
}
