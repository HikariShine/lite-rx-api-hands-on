package io.pivotal;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.core.test.TestSubscriber;

/**
 * Learn how to create Mono instances
 * @see <a href="http://next.projectreactor.io/core/docs/api/reactor/core/publisher/Mono.html>Mono Javadoc</a>
 * @see <a href="http://next.projectreactor.io/core/docs/api/reactor/core/test/TestSubscriber.html>TestSubscriber Javadoc</a>
 */
public class Part02CreateMono {

//========================================================================================

	@Test
	public void empty() {
		Mono<String> mono = emptyMono();
		TestSubscriber<String> ts = new TestSubscriber<>();
		ts.bindTo(mono).assertValueCount(0).assertComplete();
	}

	// TODO Return an empty Mono
	Mono<String> emptyMono() {
		return Mono.empty(); // TO BE REMOVED
	}

//========================================================================================

	@Test
	public void fromValue() {
		Mono<String> mono = fooMono();
		TestSubscriber<String> ts = new TestSubscriber<>();
		ts.bindTo(mono).assertValues("foo").assertComplete();
	}

	// TODO Return a Mono that contains a "foo" value
	Mono<String> fooMono() {
		return Mono.just("foo"); // TO BE REMOVED
	}

//========================================================================================

	@Test
	public void error() {
		Mono<String> mono = errorMono();
		TestSubscriber<String> ts = new TestSubscriber<>();
		ts.bindTo(mono).assertError(IllegalStateException.class).assertNotComplete();
	}

	// TODO Create a Mono that emits an IllegalStateException
	Mono<String> errorMono() {
		return Mono.error(new IllegalStateException()); // TO BE REMOVED
	}

}
