package springMVCSearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView processSearch(@RequestParam("querybox") String q,Model model) {

		System.out.println("inside /search....");
		String url = null;
		RedirectView redirectView = new RedirectView();

		if (q.isEmpty()) {
			url = "home";
			
		} else {
			url = "https://www.google.com/search?q=" + q;
		}
		
		redirectView.setUrl(url);
		return redirectView;
	}
}
