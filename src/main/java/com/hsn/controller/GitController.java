/**
 * 
 */
package com.hsn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsn.dto.Order;

/**
 * @author hussain
 *
 */

@RestController
@RequestMapping("/getOrder")
public class GitController {

	@PostMapping("/purchase/{userName}/{amount}/{productName}")
	public String purchase(@RequestBody Order order) {

		return "Hi " + order.getUserName() + "Order for" + order.getProductName() + "with amount" + order.getAmount()
				+ "Stored Successfully";

	}

}
