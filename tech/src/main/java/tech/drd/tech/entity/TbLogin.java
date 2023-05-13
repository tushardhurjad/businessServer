/*
 * Created on 2023-05-09 ( 22:55:28 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package tech.drd.tech.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;




/**
 * JPA entity class for "TbLogin"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="tb_login", catalog="innovation_admin_root" )
public class TbLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private Integer    id ;

    //--- ENTITY DATA FIELDS 
    @Column(name="userName", length=45)
    private String     username ;

    @Column(name="userId", length=45)
    private String     userid ;

    @Column(name="password", length=45)
    private String     password ;

    @Column(name="enable")
    private Boolean    enable ;

    @Column(name="createdBy", length=45)
    private String     createdby ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdOn")
    private Date       createdon ;

    @Column(name="updatedBy", length=45)
    private String     updatedby ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updatedOn")
    private Date       updatedon ;


    //--- ENTITY LINKS ( RELATIONSHIP )

    /**
     * Constructor
     */
    public TbLogin() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    public void setUsername( String username ) {
        this.username = username ;
    }
    public String getUsername() {
        return this.username;
    }

    public void setUserid( String userid ) {
        this.userid = userid ;
    }
    public String getUserid() {
        return this.userid;
    }

    public void setPassword( String password ) {
        this.password = password ;
    }
    public String getPassword() {
        return this.password;
    }

    public void setEnable( Boolean enable ) {
        this.enable = enable ;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public void setCreatedby( String createdby ) {
        this.createdby = createdby ;
    }
    public String getCreatedby() {
        return this.createdby;
    }

    public void setCreatedon( Date createdon ) {
        this.createdon = createdon ;
    }
    public Date getCreatedon() {
        return this.createdon;
    }

    public void setUpdatedby( String updatedby ) {
        this.updatedby = updatedby ;
    }
    public String getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedon( Date updatedon ) {
        this.updatedon = updatedon ;
    }
    public Date getUpdatedon() {
        return this.updatedon;
    }

    //--- GETTERS FOR LINKS
    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(username);
        sb.append("|");
        sb.append(userid);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(enable);
        sb.append("|");
        sb.append(createdby);
        sb.append("|");
        sb.append(createdon);
        sb.append("|");
        sb.append(updatedby);
        sb.append("|");
        sb.append(updatedon);
        return sb.toString(); 
    } 

}