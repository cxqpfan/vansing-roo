// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.lazyman.vansing.domain;

import com.lazyman.vansing.domain.Teacher;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Teacher_Roo_Jpa_Entity {
    
    declare @type: Teacher: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Teacher.id;
    
    @Version
    @Column(name = "version")
    private Integer Teacher.version;
    
    public Long Teacher.getId() {
        return this.id;
    }
    
    public void Teacher.setId(Long id) {
        this.id = id;
    }
    
    public Integer Teacher.getVersion() {
        return this.version;
    }
    
    public void Teacher.setVersion(Integer version) {
        this.version = version;
    }
    
}
