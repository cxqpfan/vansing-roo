package com.lazyman.vansing.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Student {

    /**
     */
    @NotNull
    @Size(max = 20)
    private String name;

    /**
     */
    @ManyToOne
    private Grade grade;

    /**
     */
    @ManyToOne
    private School school;

    /**
     */
    @Size(max = 30)
    private String email;

    /**
     */
    @Size(max = 20)
    private String phoneNumber;

    /**
     */
    @Size(max = 40)
    private String address;

    /**
     */
    @Size(max = 60)
    private String memo;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date enrollDate;
}
