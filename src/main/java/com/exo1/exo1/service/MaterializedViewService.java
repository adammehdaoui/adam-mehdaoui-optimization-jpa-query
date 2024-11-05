package com.exo1.exo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MaterializedViewService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void refreshMaterializedView() {
        jdbcTemplate.execute("REFRESH MATERIALIZED VIEW adresse_par_ville");
    }
}
