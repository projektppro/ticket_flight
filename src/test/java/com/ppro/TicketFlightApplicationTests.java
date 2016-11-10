package com.ppro;

import com.ppro.config.TicketFlightApplication;
import com.ppro.model.Airplane;
import com.ppro.persistence.AirplaneServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TicketFlightApplication.class,loader = AnnotationConfigContextLoader.class)
//@TestPropertySource(locations = "applicationTest.properties")
@TestPropertySource(properties ="/applicationTest.properties" )
public class TicketFlightApplicationTests {


	@Autowired
	private AirplaneServiceImpl airplaneService;

	@Test
	public void contextLoads() {
		Airplane airplane = new Airplane();
		airplane.setId(2);
		airplane.setName("Jumbo");
		airplaneService.saveAirplane(airplane);
		List<Airplane> all = airplaneService.findAll();
		System.out.println(all.get(0));
		Assert.assertTrue(all.size()>1);
	}

}
