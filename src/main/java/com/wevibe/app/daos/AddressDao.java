package com.wevibe.app.daos;

import com.wevibe.app.dtos.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressDao {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public AddressDao(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
     * List for data from database
     */
    public List<Address> list() {
        String sql = "SELECT * FROM ADRESSES";
        List<Address> listAddresses = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Address.class));
        return listAddresses;
    }

    /* (C)reate - Insert new record */
    public void save(Address address) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        simpleJdbcInsert.withTableName("Addresses").usingColumns();
    }
}
