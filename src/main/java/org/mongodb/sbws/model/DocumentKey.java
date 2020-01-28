package org.mongodb.sbws.model;

import org.bson.types.ObjectId;

public class DocumentKey {

    private ObjectId _id;

    public DocumentKey() {

    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "DocumentKey{" +
                "_id=" + _id +
                '}';
    }
}
