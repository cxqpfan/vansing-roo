package com.lazyman.vansing.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findPaymentsByCourse" })
public class Payment {

    /**
     */
    @NotNull
    @ManyToOne
    private Student student;

    /**
     */
    @NotNull
    @ManyToOne
    private Course course;

    /**
     */
    @NotNull
    private int fee;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date payDate;

    /**
     */
    @Size(max = 60)
    private String memo;
}
