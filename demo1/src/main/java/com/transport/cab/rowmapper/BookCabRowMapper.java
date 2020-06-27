package com.transport.cab.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.transport.cab.model.BookCab;

public class BookCabRowMapper implements RowMapper<BookCab>{

	@Override
	public BookCab mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookCab bookCab = new BookCab();
		bookCab.setBookingId(rs.getString("BookingId"));
		bookCab.setName(rs.getString("PassengerName"));
		bookCab.setFrom(rs.getString("FromLocation"));
		bookCab.setTo(rs.getString("ToLocation"));
		bookCab.setDate(rs.getString("MobileNumber"));
		bookCab.setDate(rs.getString("TravelDate"));
		bookCab.setOptionalMessage(rs.getString("OptionalMessage"));
		return bookCab;
	}

}
