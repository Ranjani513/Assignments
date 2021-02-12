package com.nisum.Springwebflux.monoAndFluxTest;



import org.junit.Test;

import reactor.core.publisher.Flux;

public class FluxAndMonoTest {
@Test
public void fluxTest()
{
	Flux<String> stringflux=Flux.just("raga","ranjani","Busim").concatWith(Flux.error(new RuntimeException("Exception Occured"))).log();
	stringflux.subscribe(System.out::println,(e)->System.err.println(e));
}
}
