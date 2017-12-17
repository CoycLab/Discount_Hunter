package com.github.coyclab.discounthunter.parser;

import com.github.coyclab.discounthunter.model.product.Product;
import com.github.coyclab.discounthunter.model.product.ProductList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ProductListParser implements IProductListParser {

    private final InputStream mInputStream;

    public ProductListParser(final InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public ProductList parse() throws Exception {
        final Reader reader = new InputStreamReader(mInputStream);
        final Gson gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {

                    @Override
                    public Date deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {
                        return json == null ? null : new Date(json.getAsJsonPrimitive().getAsLong());
                    }
                }).create();

        final Product[] products = gson.fromJson(reader, Product[].class);

        return new ProductList(Arrays.asList(products));
    }
}

