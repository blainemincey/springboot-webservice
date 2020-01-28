package org.mongodb.sbws.model;

public class NS {

    private String db;
    private String coll;

    public NS() {

    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getColl() {
        return coll;
    }

    public void setColl(String coll) {
        this.coll = coll;
    }

    @Override
    public String toString() {
        return "NS{" +
                "db='" + db + '\'' +
                ", coll='" + coll + '\'' +
                '}';
    }
}
