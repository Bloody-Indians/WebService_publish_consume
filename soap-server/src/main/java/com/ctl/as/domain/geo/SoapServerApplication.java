package com.ctl.as.domain.geo;

import com.ctl.as.domain.geo.v2.CivicAddressValidation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;


@SpringBootApplication
public class SoapServerApplication implements CommandLineRunner {

/*	@Value("${service.port}")
	private String servicePort;*/

	@Override
	public void run(String... args) throws Exception {
		Endpoint.publish("http://localhost:9999/AddressService/CivicAddressValidation", new CivicAddressValidation());
	}




	public static void main(String[] args) {
		SpringApplication.run(SoapServerApplication.class, args);
	}
}
