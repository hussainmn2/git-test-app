/**
 * 
 */
package com.hsn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hussa
 *
 */

@RestController
public class GitController {

	@PostMapping("/purchase/{userName}/{amount}/{productName}")
	public String purchase(@PathVariable String userName, @PathVariable double amount,
			@PathVariable String productName) {

		return "Hi " + userName + "Order for" +productName + "with amount" + amount+ "Stored Successfully" ;

	}

}
