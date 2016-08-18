package io.wedeploy.example.handlers;

import com.wedeploy.api.sdk.Response;

public class PingHandler {

	public void handle(Response res) {
		res.end("PONG");
	}
}
