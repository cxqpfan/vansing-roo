// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.lazyman.vansing.domain;

import com.lazyman.vansing.domain.School;
import com.lazyman.vansing.domain.SchoolDataOnDemand;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Component;

privileged aspect SchoolDataOnDemand_Roo_DataOnDemand {
    
    declare @type: SchoolDataOnDemand: @Component;
    
    private Random SchoolDataOnDemand.rnd = new SecureRandom();
    
    private List<School> SchoolDataOnDemand.data;
    
    public School SchoolDataOnDemand.getNewTransientSchool(int index) {
        School obj = new School();
        setName(obj, index);
        return obj;
    }
    
    public void SchoolDataOnDemand.setName(School obj, int index) {
        String name = "name_" + index;
        if (name.length() > 60) {
            name = name.substring(0, 60);
        }
        obj.setName(name);
    }
    
    public School SchoolDataOnDemand.getSpecificSchool(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        School obj = data.get(index);
        Long id = obj.getId();
        return School.findSchool(id);
    }
    
    public School SchoolDataOnDemand.getRandomSchool() {
        init();
        School obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return School.findSchool(id);
    }
    
    public boolean SchoolDataOnDemand.modifySchool(School obj) {
        return false;
    }
    
    public void SchoolDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = School.findSchoolEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'School' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<School>();
        for (int i = 0; i < 10; i++) {
            School obj = getNewTransientSchool(i);
            try {
                obj.persist();
            } catch (final ConstraintViolationException e) {
                final StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    final ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getRootBean().getClass().getName()).append(".").append(cv.getPropertyPath()).append(": ").append(cv.getMessage()).append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
                }
                throw new IllegalStateException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
