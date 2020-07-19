package com.transport.cab.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.transport.cab.model.BookCab;

public class BookCabRowMapper implements RowMapper<BookCab>{

	@Override
	public BookCab mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookCab bookCab = new BookCab();
		bookCab.setBookingId(rs.getString("booking_id"));
		bookCab.setName(rs.getString("passenger_name"));
		bookCab.setFrom(rs.getString("from_location"));
		bookCab.setTo(rs.getString("to_location"));
		bookCab.setDate(rs.getString("mobile_number"));
		bookCab.setDate(rs.getString("travel_date"));
		bookCab.setOptionalMessage(rs.getString("optional_message"));
		return bookCab;
	}

}
