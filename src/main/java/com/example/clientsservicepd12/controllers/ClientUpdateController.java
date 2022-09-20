package com.example.clientsservicepd12.controllers;

import com.example.clientsservicepd12.models.Client;
import com.example.clientsservicepd12.services.data.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientUpdateController {
	@Autowired
	private ClientService clientService;

	@GetMapping("clientUpdate")
	public String clientUpdateLoad(Model model, @RequestParam("id") Integer id) {
		Client client = clientService.findBiId(id);
		model.addAttribute("client", client);
		String line = "<option value=\"%s\" %s>%s</option>\n";
		StringBuilder sb = new StringBuilder();
		for (Client.Gender gender : Client.Gender.values()) {
			sb.append(String.format(line,gender.name(),
				gender == client.getGender() ? "selected" : "",gender.name()));
		}
		model.addAttribute("select", sb.toString());
		return "clientUpdate";
	}
}
