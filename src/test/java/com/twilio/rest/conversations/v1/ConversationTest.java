/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class ConversationTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Conversations");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conversation.creator().create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"messaging_service_sid\": \"MGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"attributes\": \"{ \\\"topic\\\": \\\"feedback\\\" }\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"state\": \"inactive\",\"url\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"messages\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"webhooks\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Conversation.creator().create();
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Conversations/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conversation.updater("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"messaging_service_sid\": \"MGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"friendly_name\": \"friendly_name\",\"attributes\": \"{ \\\"topic\\\": \\\"feedback\\\" }\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"state\": \"inactive\",\"url\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"messages\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"webhooks\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Conversation.updater("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Conversations/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conversation.deleter("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testDeleteResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Conversation.deleter("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Conversations/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conversation.fetcher("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"messaging_service_sid\": \"MGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"My First Conversation\",\"attributes\": \"{ \\\"topic\\\": \\\"feedback\\\" }\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"state\": \"active\",\"url\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"messages\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"webhooks\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conversation.fetcher("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Conversations");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conversation.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conversations\": [{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"messaging_service_sid\": \"MGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"Home Repair Visit\",\"attributes\": \"{ \\\"topic\\\": \\\"feedback\\\" }\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"state\": \"active\",\"url\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"messages\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"webhooks\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\"}}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://conversations.twilio.com/v1/Conversations?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://conversations.twilio.com/v1/Conversations?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"conversations\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conversation.reader().read());
    }
}