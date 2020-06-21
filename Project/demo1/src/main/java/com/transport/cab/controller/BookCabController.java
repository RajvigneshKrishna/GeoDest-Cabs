package com.transport.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.transport.cab.model.BookCab;
import com.transport.cab.service.BookCabService;

@RequestMapping(value = { "/bookCab" })
@Controller
public class BookCabController {

	@Autowired
	BookCabService bookCabService;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public ModelAndView getAllBookingDetails() {
		ModelAndView modelAndView = new ModelAndView();
		List<BookCab> cabBookingList = bookCabService.getAllBookingDetails();

		modelAndView.addObject("cabBookingList", cabBookingList);
		modelAndView.setViewName("cabBookingList");
		return modelAndView;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView editBooking(@PathVariable String id) {
		ModelAndView modelAndView = new ModelAndView();

		BookCab bookCab = bookCabService.findBookingById(id);
		modelAndView.addObject("cabBookingForm", bookCab);
		modelAndView.setViewName("cabBookingForm");
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView newBooking() {
		ModelAndView modelAndView = new ModelAndView();

		BookCab bookCab = new BookCab();
		modelAndView.addObject("cabBookingForm", bookCab);
		modelAndView.setViewName("cabBookingForm");
		return modelAndView;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView updateBooking(@ModelAttribute("cabBookingForm") BookCab bookCab) {
		ModelAndView modelAndView = new ModelAndView();
		if (bookCab.getBookingId() != null) {
			bookCabService.updateBooking(bookCab);
		} else {
			bookCabService.newBooking(bookCab);
		}
		return modelAndView;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteBooking(@PathVariable("bookingId") String bookingId) {
		bookCabService.deleteBooking(bookingId);
		return new ModelAndView("redirect:/bookCab/list");
	}
}
