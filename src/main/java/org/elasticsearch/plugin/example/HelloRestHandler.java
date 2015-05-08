package org.elasticsearch.plugin.example;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.rest.BytesRestResponse;
import org.elasticsearch.rest.RestChannel;
import org.elasticsearch.rest.RestController;
import org.elasticsearch.rest.RestHandler;
import org.elasticsearch.rest.RestRequest;

import static org.elasticsearch.rest.RestRequest.Method.GET;
import static org.elasticsearch.rest.RestStatus.OK;

/**
 * @author ZuoYe
 * @date 2015年5月7日
 */
public class HelloRestHandler implements RestHandler {
	
	@Inject
	public HelloRestHandler(RestController restController) {
		restController.registerHandler(GET, "/_hello", this);
	}

	public void handleRequest(final RestRequest request, RestChannel channel)
			throws Exception {
		String who = request.param("who");
		String whoSafe = (who!=null) ? who : "world";
		 channel.sendResponse(new BytesRestResponse(OK, "Hello, " + whoSafe + "!"));
	}

}
