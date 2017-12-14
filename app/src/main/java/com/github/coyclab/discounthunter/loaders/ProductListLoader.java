package com.github.coyclab.discounthunter.loaders;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.github.coyclab.discounthunter.backend.productApi.ProductApi;
import com.github.coyclab.discounthunter.backend.productApi.model.Product;
import com.github.coyclab.discounthunter.utils.Constants;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;
import java.util.List;

public class ProductListLoader extends AsyncTask<Context, Void, String> {

    private static final String NO_DATA_AVAILABLE = "Database is empty";
    private Context mContext;
    private static ProductApi myApiService;

    @Override
    protected String doInBackground(final Context... params) {

        if (myApiService == null) {  // Only do this once
            final ProductApi.Builder builder = new ProductApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl(Constants.LOCAL_URL)
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {

                        @Override
                        public void initialize(final AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });

            myApiService = builder.build();
        }

        mContext = params[0];

        try {
            final List<Product> products = myApiService.list().execute().getItems();
            if (products == null || products.isEmpty()) {
                return NO_DATA_AVAILABLE;
            }
            return products.toString();
        } catch (final IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(final String result) {
        Log.i("Loader", "onPostExecute: " + result);
    }
}
