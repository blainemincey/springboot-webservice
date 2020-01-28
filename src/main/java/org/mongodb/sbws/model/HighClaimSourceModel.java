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
                '}';
    }
}
