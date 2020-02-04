package org.mongodb.sbws.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document( collection = "masterClaimsCollection")
public final class HighClaimSourceModel {

    private String _id;
    private String operationType;
    private FullDocument fullDocument;
    private NS ns;
    private DocumentKey documentKey;
    private String route;
    private java.util.Date routeProcessDate;

    // insert and modified time fields added
    private java.util.Date _modifiedTS;
    private java.util.Date _insertedTS;


    public HighClaimSourceModel() {

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public FullDocument getFullDocument() {
        return fullDocument;
    }

    public void setFullDocument(FullDocument fullDocument) {
        this.fullDocument = fullDocument;
    }

    public NS getNs() {
        return ns;
    }

    public void setNs(NS ns) {
        this.ns = ns;
    }

    public DocumentKey getDocumentKey() {
        return documentKey;
    }

    public void setDocumentKey(DocumentKey documentKey) {
        this.documentKey = documentKey;
    }

    public Date getRouteProcessDate() {
        return routeProcessDate;
    }

    public void setRouteProcessDate(Date routeProcessDate) {
        this.routeProcessDate = routeProcessDate;
    }

    public Date get_modifiedTS() {
        return _modifiedTS;
    }

    public void set_modifiedTS(Date _modifiedTS) {
        this._modifiedTS = _modifiedTS;
    }

    public Date get_insertedTS() {
        return _insertedTS;
    }

    public void set_insertedTS(Date _insertedTS) {
        this._insertedTS = _insertedTS;
    }

    @Override
    public String toString() {
        return "HighClaimSourceModel{" +
                "_id='" + _id + '\'' +
                ", operationType='" + operationType + '\'' +
                ", fullDocument=" + fullDocument +
                ", ns=" + ns +
                ", documentKey=" + documentKey +
                ", route='" + route + '\'' +
                ", routeProcessDate=" + routeProcessDate +
                ", _modifiedTS=" + _modifiedTS +
                ", _insertedTS=" + _insertedTS +
                '}';
    }
}
