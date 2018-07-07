package com.sastry.spring.batch;

import com.sastry.spring.batch.model.Member;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;



public class MemberFieldSetMapper implements FieldSetMapper<Member> {

    @Override
    public Member mapFieldSet(FieldSet fieldSet) throws BindException {
        Member result = new Member();
        result.setFirstName(fieldSet.readString(0));
        result.setLastName(fieldSet.readString(1));
        return result;
    }
}
