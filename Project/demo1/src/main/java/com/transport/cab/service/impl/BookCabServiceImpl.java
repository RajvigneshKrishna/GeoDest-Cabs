package com.transport.cab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.cab.dao.BookCabDao;
import com.transport.cab.model.BookCab;
import com.transport.cab.service.BookCabService;

@Service
public class BookCabServiceImpl implements BookCabService {

	@Autowired
	BookCabDao bookCabDao;
	
	@Override
	public List<BookCab> getAllBookingDetails() {
		return bookCabDao.getAllBookingDetails();
	}

	@Override
	public BookCab findBookingById(String bookingId) {
		return bookCabDao.findBookingById(bookingId);
	}

	@Override
	public void newBooking(BookCab bookCab) {
		bookCabDao.newBooking(bookCab);
	}

	@Override
	public void updateBooking(BookCab bookCab) {
		bookCabDao.updateBooking(bookCab);
	}

	@Override
	public void deleteBooking(String bookingId) {
		bookCabDao.deleteBooking(bookingId);
	}

}
