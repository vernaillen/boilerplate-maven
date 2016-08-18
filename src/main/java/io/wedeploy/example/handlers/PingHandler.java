package io.wedeploy.example.handlers;

import com.wedeploy.api.sdk.Response;

public class PingHandler {

	public void handler(Response res) {
		res.end("PONG");
	}
}
