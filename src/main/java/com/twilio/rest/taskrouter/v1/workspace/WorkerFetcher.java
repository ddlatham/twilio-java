/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class WorkerFetcher extends Fetcher<Worker> {
    private final String pathWorkspaceSid;
    private final String pathSid;

    /**
     * Construct a new WorkerFetcher.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Worker to fetch
     * @param pathSid The SID of the resource to fetch
     */
    public WorkerFetcher(final String pathWorkspaceSid,
                         final String pathSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched Worker
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Worker fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/Workers/" + this.pathSid + "",
            client.getRegion()
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Worker fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Worker.fromJson(response.getStream(), client.getObjectMapper());
    }
}