package com.lazyman.vansing.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Value;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Course {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 60)
    private String name;

    /**
     */
    @NotNull
    private int classNumber;

    /**
     */
    @Value("1000")
    private Integer price;

    /**
     */
    @NotNull
    @ManyToOne
    private Teacher teacher;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date startDate;

    /**
     */
    @Size(max = 60)
    private String memo;
}
