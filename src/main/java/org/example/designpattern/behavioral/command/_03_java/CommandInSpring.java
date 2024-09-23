package org.example.designpattern.behavioral.command._03_java;

import org.example.designpattern.behavioral.command._02_after.Command;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CommandInSpring {
    private DataSource dataSource;

    public CommandInSpring(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void add(Command command) {
        SimpleJdbcInsert insert = new SimpleJdbcInsert(dataSource)
                .withTableName("commands")
                .usingGeneratedKeyColumns("id");
        Map<String, Object> data = new HashMap<>();
        data.put("command", command.getClass().getSimpleName());
        data.put("when", LocalDateTime.now());
        insert.execute(data);

    }
}
