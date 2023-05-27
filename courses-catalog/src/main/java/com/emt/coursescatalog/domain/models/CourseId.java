package com.emt.coursescatalog.domain.models;

import com.emt.sharedkernel.domain.base.DomainObjectId;
import org.springframework.lang.NonNull;

public class CourseId extends DomainObjectId {
    private CourseId(){
        super(CourseId.randomId(CourseId.class).getId());
    }

    public CourseId(@NonNull String uuid) {
        super(uuid);
    }


    public static CourseId of(String uuid){
        CourseId id = new CourseId(uuid);
        return id;
    }

}
