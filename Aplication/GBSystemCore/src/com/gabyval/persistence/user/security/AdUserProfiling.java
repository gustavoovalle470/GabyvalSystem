package com.gabyval.persistence.user.security;
// Generated Jul 29, 2017 4:02:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AdUserProfiling generated by hbm2java
 */
@Entity
@Table(name="AD_USER_PROFILING"
    ,schema="GABYVAL"
)
public class AdUserProfiling  implements java.io.Serializable {


     private AdUserProfilingId id;
     private String gbUserCreate;
     private String gbLastUserUp;
     private Date gbLastUpDt;
     private Date createDt;
     private int rowversion;

    public AdUserProfiling() {
    }

    public AdUserProfiling(AdUserProfilingId id, String gbUserCreate, String gbLastUserUp, Date gbLastUpDt, Date createDt, int rowversion) {
       this.id = id;
       this.gbUserCreate = gbUserCreate;
       this.gbLastUserUp = gbLastUserUp;
       this.gbLastUpDt = gbLastUpDt;
       this.createDt = createDt;
       this.rowversion = rowversion;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="gbProfileName", column=@Column(name="GB_PROFILE_NAME", nullable=false, length=100) ), 
        @AttributeOverride(name="gbUsername", column=@Column(name="GB_USERNAME", nullable=false, length=20) ) } )
    public AdUserProfilingId getId() {
        return this.id;
    }
    
    public void setId(AdUserProfilingId id) {
        this.id = id;
    }

    
    @Column(name="GB_USER_CREATE", nullable=false, length=20)
    public String getGbUserCreate() {
        return this.gbUserCreate;
    }
    
    public void setGbUserCreate(String gbUserCreate) {
        this.gbUserCreate = gbUserCreate;
    }

    
    @Column(name="GB_LAST_USER_UP", nullable=false, length=20)
    public String getGbLastUserUp() {
        return this.gbLastUserUp;
    }
    
    public void setGbLastUserUp(String gbLastUserUp) {
        this.gbLastUserUp = gbLastUserUp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="GB_LAST_UP_DT", nullable=false)
    public Date getGbLastUpDt() {
        return this.gbLastUpDt;
    }
    
    public void setGbLastUpDt(Date gbLastUpDt) {
        this.gbLastUpDt = gbLastUpDt;
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

