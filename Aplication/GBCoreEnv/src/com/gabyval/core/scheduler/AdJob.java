package com.gabyval.core.scheduler;
// Generated May 28, 2017 11:12:36 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * AdJob generated by hbm2java
 */
@Entity
@Table(name="AD_JOB"
    ,schema="GABYVAL"
    , uniqueConstraints = @UniqueConstraint(columnNames={"GB_JOB_NAME", "GB_JOB_CLASS"}) 
)
public class AdJob  implements java.io.Serializable {


     private int gbJobId;
     private String gbJobName;
     private String gbJobClass;
     private String gbJobDesc;
     private String gbExpCron;
     private String gbAutoRun;
     private Date createDt;
     private int rowversion;

    public AdJob() {
    }

    public AdJob(int gbJobId, String gbJobName, String gbJobClass, String gbJobDesc, String gbExpCron, String gbAutoRun, Date createDt, int rowversion) {
       this.gbJobId = gbJobId;
       this.gbJobName = gbJobName;
       this.gbJobClass = gbJobClass;
       this.gbJobDesc = gbJobDesc;
       this.gbExpCron = gbExpCron;
       this.gbAutoRun = gbAutoRun;
       this.createDt = createDt;
       this.rowversion = rowversion;
    }
   
     @Id 

    
    @Column(name="GB_JOB_ID", unique=true, nullable=false, precision=22, scale=0)
    public int getGbJobId() {
        return this.gbJobId;
    }
    
    public void setGbJobId(int gbJobId) {
        this.gbJobId = gbJobId;
    }

    
    @Column(name="GB_JOB_NAME", nullable=false, length=50)
    public String getGbJobName() {
        return this.gbJobName;
    }
    
    public void setGbJobName(String gbJobName) {
        this.gbJobName = gbJobName;
    }

    
    @Column(name="GB_JOB_CLASS", nullable=false, length=200)
    public String getGbJobClass() {
        return this.gbJobClass;
    }
    
    public void setGbJobClass(String gbJobClass) {
        this.gbJobClass = gbJobClass;
    }

    
    @Column(name="GB_JOB_DESC", nullable=false, length=200)
    public String getGbJobDesc() {
        return this.gbJobDesc;
    }
    
    public void setGbJobDesc(String gbJobDesc) {
        this.gbJobDesc = gbJobDesc;
    }

    
    @Column(name="GB_EXP_CRON", nullable=false, length=50)
    public String getGbExpCron() {
        return this.gbExpCron;
    }
    
    public void setGbExpCron(String gbExpCron) {
        this.gbExpCron = gbExpCron;
    }

    
    @Column(name="GB_AUTO_RUN", nullable=false, length=1)
    public String getGbAutoRun() {
        return this.gbAutoRun;
    }
    
    public void setGbAutoRun(String gbAutoRun) {
        this.gbAutoRun = gbAutoRun;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATE_DT", nullable=false, length=7)
    public Date getCreateDt() {
        return this.createDt;
    }
    
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    
    @Column(name="ROWVERSION", nullable=false, precision=22, scale=0)
    public int getRowversion() {
        return this.rowversion;
    }
    
    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }




}

