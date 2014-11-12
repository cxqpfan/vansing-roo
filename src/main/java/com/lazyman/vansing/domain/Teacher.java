package com.lazyman.vansing.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Teacher {

    /**
     */
    @NotNull
    @Size(max = 20)
    private String name;

    /**
     */
    @Size(max = 20)
    private String phoneNumber;

    /**
     */
    @Size(max = 60)
    private String memo;
}
