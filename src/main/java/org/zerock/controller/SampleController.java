package org.zerock.controller;





import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;
import org.zerock.domain.Ticket;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/sample")
@Slf4j
public class SampleController {
	
	@GetMapping(value = "/getText",produces = "text/plain; charset=UTF-8")
	public String getTest() {
		log.info("MIME TYPE: " +MediaType.TEXT_PLAIN_VALUE);
		
		return "안녕하세요";
	}
	
	
	@GetMapping(value = "/getSample",
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_XML_VALUE})
	public SampleVO getSample() {
		
	
	return new SampleVO(112,"스타","로드");
	
	}
			
	
	@GetMapping("/product/{cat}/{pid}")
	public String[] getPath(
			@PathVariable("cat") String cat,
			@PathVariable("pid") Integer pid){
			
		
		return new String[] {"category: "  + cat , "productid: " + pid};
		
				
				
				
			}
			
			
	
	
	
	
	
	@PostMapping("/ticket")
	public Ticket convert(@RequestBody Ticket ticket) {
		
		log.info("convert..........................ticket");
		
		return ticket;
		
	}
	
	
	

}
