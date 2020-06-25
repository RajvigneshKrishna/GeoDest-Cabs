package com.transport.cab.dao;

import java.util.List;

import com.transport.cab.model.BookCab;

public interface BookCabDao {

	public List<BookCab> getAllBookingDetails();

	public BookCab findBookingById(String bookingId);

	public void newBooking(BookCab bookCab);

	public void updateBooking(BookCab bookCab);

	public void deleteBooking(String bookingId);
}