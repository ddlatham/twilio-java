/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class FleetCreator extends Creator<Fleet> {
    private String uniqueName;
    private Boolean dataEnabled;
    private Boolean commandsEnabled;
    private URI commandsUrl;
    private HttpMethod commandsMethod;

    /**
     * An application-defined string that uniquely identifies the resource. It can
     * be used in place of the resource's `sid` in the URL to address the resource..
     *
     * @param uniqueName An application-defined string that uniquely identifies the
     *                   resource
     * @return this
     */
    public FleetCreator setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * Defines whether SIMs in the Fleet are capable of using
     * 2G/3G/4G/LTE/CAT-M/NB-IoT data connectivity.
     *
     * @param dataEnabled Defines whether SIMs in the Fleet are capable of using
     *                    data connectivity
     * @return this
     */
    public FleetCreator setDataEnabled(final Boolean dataEnabled) {
        this.dataEnabled = dataEnabled;
        return this;
    }

    /**
     * Defines whether SIMs in the Fleet are capable of sending and receiving
     * Commands via SMS..
     *
     * @param commandsEnabled Defines whether SIMs in the Fleet are capable of
     *                        sending and receiving Commands via SMS
     * @return this
     */
    public FleetCreator setCommandsEnabled(final Boolean commandsEnabled) {
        this.commandsEnabled = commandsEnabled;
        return this;
    }

    /**
     * The URL that will receive a webhook when a SIM in the Fleet originates a
     * machine-to-machine Command. Your server should respond with an HTTP status
     * code in the 200 range; any response body will be ignored..
     *
     * @param commandsUrl The URL that will receive a webhook when a SIM in the
     *                    Fleet originates a machine-to-machine Command
     * @return this
     */
    public FleetCreator setCommandsUrl(final URI commandsUrl) {
        this.commandsUrl = commandsUrl;
        return this;
    }

    /**
     * The URL that will receive a webhook when a SIM in the Fleet originates a
     * machine-to-machine Command. Your server should respond with an HTTP status
     * code in the 200 range; any response body will be ignored..
     *
     * @param commandsUrl The URL that will receive a webhook when a SIM in the
     *                    Fleet originates a machine-to-machine Command
     * @return this
     */
    public FleetCreator setCommandsUrl(final String commandsUrl) {
        return setCommandsUrl(Promoter.uriFromString(commandsUrl));
    }

    /**
     * A string representing the HTTP method to use when making a request to
     * `commands_url`. Can be one of POST or GET. Defaults to POST..
     *
     * @param commandsMethod A string representing the HTTP method to use when
     *                       making a request to `commands_url`
     * @return this
     */
    public FleetCreator setCommandsMethod(final HttpMethod commandsMethod) {
        this.commandsMethod = commandsMethod;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Fleet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Fleet create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.SUPERSIM.toString(),
            "/v1/Fleets",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Fleet creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Fleet.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }

        if (dataEnabled != null) {
            request.addPostParam("DataEnabled", dataEnabled.toString());
        }

        if (commandsEnabled != null) {
            request.addPostParam("CommandsEnabled", commandsEnabled.toString());
        }

        if (commandsUrl != null) {
            request.addPostParam("CommandsUrl", commandsUrl.toString());
        }

        if (commandsMethod != null) {
            request.addPostParam("CommandsMethod", commandsMethod.toString());
        }
    }
}