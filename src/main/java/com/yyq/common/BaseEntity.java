package com.yyq.common;

import java.io.Serializable;
import java.rmi.server.UID;
import java.util.Date;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 788655783807701381L;
    //版本号
    private Long objectVersionNumber;
    //创建时间
    private Date creationDate;
    //创建人ID
    private Long createdBy;
    //最后更新时间
    private Date lastUpdateDate;
    //最后更新人ID
    private Long lastUpdatedBy;

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "objectVersionNumber=" + objectVersionNumber +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lastUpdatedBy=" + lastUpdatedBy +
                '}';
    }
}
