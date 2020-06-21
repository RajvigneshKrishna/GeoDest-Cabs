package com.transport.cab.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.transport.cab.dao.BookCabDao;
import com.transport.cab.model.BookCab;
import com.transport.cab.rowmapper.BookCabRowMapper;

@Transactional
@Repository
public class BookCabDaoImpl implements BookCabDao {

	@Autowired
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<BookCab> getAllBookingDetails() {
		String query = "SELECT * from customer";
		RowMapper<BookCab> rowMapper = new BookCabRowMapper();
		List<BookCab> list = namedParameterJdbcTemplate.query(query, rowMapper);
		return list;
	}

	@Override
	public BookCab findBookingById(String bookingId) {
		String query = "SELECT * FROM customer WHERE employee_id = ?";
		RowMapper<BookCab> rowMapper = new BeanPropertyRowMapper<BookCab>(BookCab.class);
		Map<String, String> queryParam = new HashMap<String, String>();
		queryParam.put("bookingId", bookingId);
		BookCab bookCab = namedParameterJdbcTemplate.queryForObject(query, queryParam, rowMapper);
		return bookCab;
	}

	@Override
	public void newBooking(BookCab bookCab) {
		String query = "INSERT INTO customer(employee_id, first_name, last_name, email, phone, job_title) VALUES(?, ?, ?, ?, ?, ?)";
		Map<String, String> queryParam = new HashMap<String, String>();
		queryParam.put("bookingId", bookCab.getBookingId());
		namedParameterJdbcTemplate.update(query, queryParam);

	}

	@Override
	public void updateBooking(BookCab bookCab) {
		String query = "UPDATE customer SET first_name=?, last_name=?, email=?, phone=?, job_title=? WHERE employee_id=?";
		Map<String, String> queryParam = new HashMap<String, String>();
		queryParam.put("bookingId", bookCab.getBookingId());
		namedParameterJdbcTemplate.update(query, queryParam);

	}

	@Override
	public void deleteBooking(String bookingId) {
		String query = "DELETE FROM customer WHERE employee_id=?";
		Map<String, String> queryParam = new HashMap<String, String>();
		queryParam.put("bookingId", bookingId);
		namedParameterJdbcTemplate.update(query, queryParam);
	}

}
