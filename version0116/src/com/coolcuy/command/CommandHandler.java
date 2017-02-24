package com.coolcuy.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coolcuy.dto.QnADto;

public interface CommandHandler {

	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception;

}


