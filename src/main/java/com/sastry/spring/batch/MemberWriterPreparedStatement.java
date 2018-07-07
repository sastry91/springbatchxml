package com.sastry.spring.batch;

import com.sastry.spring.batch.model.Member;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberWriterPreparedStatement implements ItemPreparedStatementSetter<Member> {
    @Override
    public void setValues(Member member, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, member.getFirstName());
        preparedStatement.setString(2, member.getLastName());
    }
}
