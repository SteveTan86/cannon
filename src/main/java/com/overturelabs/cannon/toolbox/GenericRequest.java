package com.overturelabs.cannon.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.overturelabs.Cannon;

import java.util.HashMap;
import java.util.Map;

public class GenericRequest<T> extends Request<T> {
    private Map<String, String> mHeaders;
    private Map<String, String> mParams;
    private String mOAuth2Token = null;
    private ResponseParser<T> mResponseParser;
    private Response.Listener<T> mListener;

    /**
     * Construct a {@link com.overturelabs.cannon.toolbox.GenericRequest}.
     *
     * @param method            HTTP request method. Refer to {@link com.android.volley.Request.Method}.
     * @param url               Request URL.
     * @param responseParser    {@link com.overturelabs.cannon.toolbox.ResponseParser} for parsing response.
     * @param successListener   Success {@link com.android.volley.Response.Listener}.
     * @param errorListener     {@link com.android.volley.Response.ErrorListener}.
     */
    public GenericRequest(int method, String url, ResponseParser<T> responseParser,
                          Response.Listener<T> successListener,
                          Response.ErrorListener errorListener) {
        super(method, url, errorListener);

        this.mListener = successListener;
        this.mResponseParser = responseParser;
    }

    /**
     * Construct a {@link com.overturelabs.cannon.toolbox.GenericRequest}.
     *
     * @param method            HTTP request method. Refer to {@link com.android.volley.Request.Method}.
     * @param url               Request URL.
     * @param params            Parameters to be inserted into request body.
     * @param responseParser    {@link com.overturelabs.cannon.toolbox.ResponseParser} for parsing response.
     * @param successListener   Success {@link com.android.volley.Response.Listener}.
     * @param errorListener     {@link com.android.volley.Response.ErrorListener}.
     */
    public GenericRequest(int method, String url, ResponseParser<T> responseParser,
                          final Map<String, String> params,
                          Response.Listener<T> successListener,
                          Response.ErrorListener errorListener) {
        super(method, url, errorListener);

        this.mParams = params;
        this.mResponseParser = responseParser;
        this.mListener = successListener;
    }

    /**
     * Construct a {@link com.overturelabs.cannon.toolbox.GenericRequest}.
     *
     * @param method            HTTP request method. Refer to {@link com.android.volley.Request.Method}.
     * @param url               Request URL.
     * @param headers           Headers to be inserted into request header.
     * @param params            Parameters to be inserted into request body
     * @param responseParser    {@link com.overturelabs.cannon.toolbox.ResponseParser} for parsing response.
     * @param successListener   Success {@link com.android.volley.Response.Listener}.
     * @param errorListener     {@link com.android.volley.Response.ErrorListener}.
     */
    public GenericRequest(int method, String url, ResponseParser<T> responseParser,
                          final Map<String, String> headers, final Map<String, String> params,
                          Response.Listener<T> successListener,
                          Response.ErrorListener errorListener) {
        super(method, url, errorListener);

        this.mHeaders = headers;
        this.mParams = params;
        this.mResponseParser = responseParser;
        this.mListener = successListener;
    }

    /**
     * Construct a {@link com.overturelabs.cannon.toolbox.GenericRequest}.
     *
     * @param method            HTTP request method. Refer to {@link com.android.volley.Request.Method}.
     * @param url               Request URL.
     * @param oAuth2Token       OAuth 2.0 token to be inserted into the request header.
     * @param responseParser    {@link com.overturelabs.cannon.toolbox.ResponseParser} for parsing response.
     * @param successListener   Success {@link com.android.volley.Response.Listener}.
     * @param errorListener     {@link com.android.volley.Response.ErrorListener}.
     */
    public GenericRequest(int method, String url, String oAuth2Token,
                          ResponseParser<T> responseParser,
                          Response.Listener<T> successListener,
                          Response.ErrorListener errorListener) {
        super(method, url, errorListener);

        this.mOAuth2Token = oAuth2Token;
        this.mResponseParser = responseParser;
        this.mListener = successListener;
    }

    /**
     * Construct a {@link com.overturelabs.cannon.toolbox.GenericRequest}.
     *
     * @param method            HTTP request method. Refer to {@link com.android.volley.Request.Method}.
     * @param url               Request URL.
     * @param headers           Headers to be inserted into request header.
     * @param oAuth2Token       OAuth 2.0 token to be inserted into the request header.
     * @param responseParser    {@link com.overturelabs.cannon.toolbox.ResponseParser} for parsing response.
     * @param successListener   Success {@link com.android.volley.Response.Listener}.
     * @param errorListener     {@link com.android.volley.Response.ErrorListener}.
     */
    public GenericRequest(int method, String url,
                          final Map<String, String> headers, String oAuth2Token,
                          ResponseParser<T> responseParser,
                          Response.Listener<T> successListener,
                          Response.ErrorListener errorListener) {
        super(method, url, errorListener);

        this.mHeaders = headers;
        this.mOAuth2Token = oAuth2Token;
        this.mResponseParser = responseParser;
        this.mListener = successListener;
    }

    /**
     * Construct a {@link com.overturelabs.cannon.toolbox.GenericRequest}.
     *
     * @param method            HTTP request method. Refer to {@link com.android.volley.Request.Method}.
     * @param url               Request URL.
     * @param oAuth2Token       OAuth 2.0 token to be inserted into the request header.
     * @param params            Parameters to be inserted into request body.
     * @param responseParser    {@link com.overturelabs.cannon.toolbox.ResponseParser} for parsing response.
     * @param successListener   Success {@link com.android.volley.Response.Listener}.
     * @param errorListener     {@link com.android.volley.Response.ErrorListener}.
     */
    public GenericRequest(int method, String url, String oAuth2Token, final Map<String, String> params,
                          ResponseParser<T> responseParser,
                          Response.Listener<T> successListener,
                          Response.ErrorListener errorListener) {
        super(method, url, errorListener);

        this.mOAuth2Token = oAuth2Token;
        this.mParams = params;
        this.mResponseParser = responseParser;
        this.mListener = successListener;
    }

    /**
     * Construct a {@link com.overturelabs.cannon.toolbox.GenericRequest}.
     *
     * @param method            HTTP request method. Refer to {@link com.android.volley.Request.Method}.
     * @param url               Request URL.
     * @param headers           Headers to be inserted into request header.
     * @param oAuth2Token       OAuth 2.0 token to be inserted into the request header.
     * @param params            Parameters to be inserted into request body.
     * @param responseParser    {@link com.overturelabs.cannon.toolbox.ResponseParser} for parsing response.
     * @param successListener   Success {@link com.android.volley.Response.Listener}.
     * @param errorListener     {@link com.android.volley.Response.ErrorListener}.
     */
    public GenericRequest(int method, String url,
                          final Map<String, String> headers, String oAuth2Token,
                          final Map<String, String> params,
                          ResponseParser<T> responseParser,
                          Response.Listener<T> successListener,
                          Response.ErrorListener errorListener) {
        super(method, url, errorListener);

        this.mHeaders = headers;
        this.mOAuth2Token = oAuth2Token;
        this.mParams = params;
        this.mResponseParser = responseParser;
        this.mListener = successListener;
    }

    @Override
    protected Map<String, String> getParams() {
        return mParams;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        return mResponseParser.parseNetworkResponse(response);
    }

    @Override
    protected void deliverResponse(T response) {
        mListener.onResponse(response);
    }

    @Override
    public Map<String, String> getHeaders() {
        if (mHeaders == null) {
            mHeaders = new HashMap<>();
        }

        if (mOAuth2Token != null && mOAuth2Token.length() > 0) {
            mHeaders.put("Authorization", "Bearer " + mOAuth2Token);
        }

        // Set User Agent header to a special user agent string.
        mHeaders.put("User-Agent", Cannon.getUserAgent());

        return mHeaders;
    }
}
